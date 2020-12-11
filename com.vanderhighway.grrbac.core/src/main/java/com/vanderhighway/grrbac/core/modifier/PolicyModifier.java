package com.vanderhighway.grrbac.core.modifier;

import com.brein.time.timeintervals.intervals.IntegerInterval;
import com.google.common.base.Objects;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.IModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.SimpleModelManipulations;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRule;
import org.eclipse.viatra.transformation.runtime.emf.rules.batch.BatchTransformationRuleFactory;
import org.eclipse.viatra.transformation.runtime.emf.transformation.batch.BatchTransformation;
import org.eclipse.xtext.xbase.lib.Extension;

import javax.naming.Context;
import java.lang.reflect.InvocationTargetException;
import java.time.Period;
import java.util.*;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

public class PolicyModifier {

	/**
	 * Transformation-related extensions
	 */

	@Extension
	public IModelManipulations manipulation;

	@Extension
	private BatchTransformationRuleFactory batchFactory = new BatchTransformationRuleFactory();

	@Extension
	private BatchTransformation transformation;

	@Extension
	private final GRRBACPackage ePackage = GRRBACPackage.eINSTANCE;

	private final AdvancedViatraQueryEngine engine;

	private final SiteAccessControlSystem system;
	private final Resource resource;

	// Map used to give a unique ID to instances;
	private HashMap<String, Integer> instanceIDCounter;

	public PolicyModifier(final AdvancedViatraQueryEngine engine, SiteAccessControlSystem system, Resource resource) {
		this.engine = engine;
		this.manipulation = new SimpleModelManipulations(this.engine);
		this.system = system;
		this.resource = resource;
		this.instanceIDCounter = new HashMap<>();
	}

	// ---------- Add / Remove Authorization Model Entities ----------

	public User addUser(String name) throws ModelManipulationException, InvocationTargetException {
		User user = (User) manipulation.createChild(system.getAuthorizationPolicy(),
				ePackage.getAuthorizationPolicy_Users(), ePackage.getUser());
		manipulation.set(user, ePackage.getUser_Name(), name);
		return user;
	}

	public void removeUser(User user) throws ModelManipulationException, InvocationTargetException {
		for (Role role : new LinkedList<>(user.getUR())) {
			deassignRoleFromUser(user, role);
		}
		manipulation.remove(user);
	}

	public Role addRole(String name) throws ModelManipulationException, InvocationTargetException {
		Role role = (Role) manipulation.createChild(system.getAuthorizationPolicy(),
				ePackage.getAuthorizationPolicy_Roles(), ePackage.getRole());
		manipulation.set(role, ePackage.getRole_Name(), name);
		return role;
	}

	public void removeRole(Role role) throws ModelManipulationException, InvocationTargetException {
		for (User user : new ArrayList<>(role.getRU())) {
			deassignRoleFromUser(user, role);
		}
		for (TemporalGrantRule temporalGrantRule : new ArrayList<>(role.getConstrainedBy())) {
			removeTemporalGrantRule(temporalGrantRule);
		}
		manipulation.remove(role);
	}

	public Demarcation addDemarcation(String name) throws ModelManipulationException {
		Demarcation demarcation = (Demarcation) manipulation.createChild(system.getAuthorizationPolicy(),
				ePackage.getAuthorizationPolicy_Demarcations(), ePackage.getDemarcation());
		manipulation.set(demarcation, ePackage.getDemarcation_Name(), name);
		return demarcation;
	}

	public void removeDemarcation(Demarcation demarcation) throws ModelManipulationException, InvocationTargetException {
		for (Permission permission : new LinkedList<>(demarcation.getDP())) {
			deassignPermissionFromDemarcation(demarcation, permission);
		}
		for (TemporalGrantRule temporalGrantRule : new LinkedList<>(demarcation.getConstrainedBy())) {
			removeTemporalGrantRule(temporalGrantRule);
		}
		manipulation.remove(demarcation);
	}

	public Permission addPermission(String name) throws ModelManipulationException, InvocationTargetException {
		Permission permission = (Permission) manipulation.createChild(system.getAuthorizationPolicy(),
				ePackage.getAuthorizationPolicy_Permissions(), ePackage.getPermission());
		manipulation.set(permission, ePackage.getPermission_Name(), name);
		return permission;
	}

	public void removePermission(Permission permission) throws ModelManipulationException, InvocationTargetException {
		deassignObjectFromPermission(permission, permission.getPO());
		for (Demarcation demarcation : new LinkedList<>(permission.getPD())) {
			deassignPermissionFromDemarcation(demarcation, permission);
		}
		manipulation.remove(permission);
	}

	public TemporalContext addTemporalContext(String name) throws ModelManipulationException, InvocationTargetException {
		ContextContainer contextContainer = system.getContextContainer();
		TemporalContext context = (TemporalContext) this.manipulation.createChild(contextContainer,
				ePackage.getContextContainer_TemporalContexts(), ePackage.getTemporalContext());
		this.manipulation.set(context, ePackage.getTemporalContext_Name(), name);
		return context;
	}

	public void removeTemporalContext(TemporalContext group) throws ModelManipulationException, InvocationTargetException {
		manipulation.remove(group);
	}

	public TimeRange addTemporalContextInstance(TemporalContext context, ValidDay validDay, IntegerInterval interval)
			throws ModelManipulationException, InvocationTargetException {
		TimeRange timeRange = (TimeRange) this.manipulation.createChild(context,
				ePackage.getTemporalContext_Instances(), ePackage.getTimeRange());
		this.manipulation.set(timeRange, ePackage.getTimeRange_Name(), getUniqueID(context.getName() + "-" + validDay.getName()));
		this.manipulation.set(timeRange, ePackage.getTimeRange_Start(), interval.getStart());
		this.manipulation.set(timeRange, ePackage.getTimeRange_End(), interval.getEnd());
		this.manipulation.set(timeRange, ePackage.getTimeRange_ValidDay(), validDay);
		return timeRange;
	}

	public void removeTemporalContextInstance(TimeRange timeRange) throws ModelManipulationException, InvocationTargetException {
		manipulation.remove(timeRange);
	}

	public ValidDayTimeRange addDayScheduleTimeRange(ValidDay validDay, IntegerInterval interval)
			throws ModelManipulationException, InvocationTargetException {
		ValidDayTimeRange validDayTimeRange = (ValidDayTimeRange) manipulation.createChild(validDay,
				ePackage.getValidDay_Instances(), ePackage.getValidDayTimeRange());
		manipulation.set(validDayTimeRange, ePackage.getTimeRange_Name(), getUniqueID(validDay.getName()));
		manipulation.set(validDayTimeRange, ePackage.getTimeRange_Start(), interval.getStart());
		manipulation.set(validDayTimeRange, ePackage.getTimeRange_End(), interval.getEnd());
		return validDayTimeRange;
	}

	public void removeDayScheduleTimeRange(ValidDayTimeRange validDayTimeRange)
			throws ModelManipulationException, InvocationTargetException {
		manipulation.remove(validDayTimeRange);
	}

	public ValidDayOfWeek addValidDayOfWeek(String name) throws ModelManipulationException, InvocationTargetException {
		ContextContainer contextContainer = system.getContextContainer();
		ValidDayOfWeek weekdaySchedule = (ValidDayOfWeek) this.manipulation.createChild(contextContainer,
				ePackage.getContextContainer_ValidDays(), ePackage.getValidDayOfWeek());
		this.manipulation.set(weekdaySchedule, ePackage.getValidDay_Name(), name);
		return weekdaySchedule;

	}

	public void removeValidDayOfWeek(ValidDayOfWeek weekdaySchedule)
			throws ModelManipulationException, InvocationTargetException {
		manipulation.remove(weekdaySchedule);
	}

	public ValidDayOfMonth addValidDayOfMonth(String name) throws ModelManipulationException, InvocationTargetException {
		ContextContainer contextContainer = system.getContextContainer();
		ValidDayOfMonth yeardaySchedule = (ValidDayOfMonth) this.manipulation.createChild(contextContainer,
				ePackage.getContextContainer_ValidDays(), ePackage.getValidDayOfMonth());
		this.manipulation.set(yeardaySchedule, ePackage.getValidDay_Name(), name);
		return yeardaySchedule;
	}


	public void removeValidDayOfMonth(ValidDayOfMonth yeardaySchedule) throws ModelManipulationException, InvocationTargetException {
		manipulation.remove(yeardaySchedule);
	}

	public ValidDayOfWeekMonth addValidDayOfWeekMonth(ValidDayOfWeek weekSchedule, ValidDayOfMonth monthSchedule, String name)
			throws ModelManipulationException, InvocationTargetException {
		ContextContainer contextContainer = system.getContextContainer();
		ValidDayOfWeekMonth weekMonthSchedule = (ValidDayOfWeekMonth) manipulation.createChild(contextContainer,
				ePackage.getContextContainer_ValidDays(), ePackage.getValidDayOfWeekMonth());
		this.manipulation.set(weekMonthSchedule, ePackage.getValidDayOfWeekMonth_ValidDayOfWeek(), weekSchedule);
		this.manipulation.set(weekMonthSchedule, ePackage.getValidDayOfWeekMonth_ValidDayOfMonth(), monthSchedule);
		manipulation.set(weekMonthSchedule, ePackage.getValidDay_Name(), name);
		return weekMonthSchedule;
	}

	public void removeValidDayOfWeekMonth(ValidDayOfWeekMonth contextContainer)
			throws ModelManipulationException, InvocationTargetException {
		manipulation.remove(contextContainer);
	}

	public ValidDayOfYear addValidDayOfYear(ValidDayOfWeekMonth weekMonthSchedule, String name)
			throws ModelManipulationException, InvocationTargetException {
		ContextContainer contextContainer = system.getContextContainer();
		ValidDayOfYear yearSchedule = (ValidDayOfYear) manipulation.createChild(contextContainer,
				ePackage.getContextContainer_ValidDays(), ePackage.getValidDayOfYear());
		this.manipulation.set(yearSchedule, ePackage.getValidDayOfYear_ValidDayOfWeekMonth(), weekMonthSchedule);
		manipulation.set(yearSchedule, ePackage.getValidDay_Name(), name);
		return yearSchedule;

	}

	public void removeValidDayOfYear(ValidDayOfYear contextContainer)
			throws ModelManipulationException, InvocationTargetException {
		manipulation.remove(contextContainer);
	}

	public TemporalGrantRule addTemporalGrantRule(TemporalContext context, String name, Role role, Demarcation demarcation,
												  boolean enable, int priority) throws ModelManipulationException {
		AuthorizationPolicy authorizationPolicy = system.getAuthorizationPolicy();
		TemporalGrantRule rule = (TemporalGrantRule) manipulation.createChild(authorizationPolicy,
				ePackage.getAuthorizationPolicy_TemporalGrantRules(), ePackage.getTemporalGrantRule());
		manipulation.set(rule, ePackage.getTemporalGrantRule_TemporalContext(), context);
		manipulation.set(rule, ePackage.getTemporalGrantRule_Name(), name);
		manipulation.set(rule, ePackage.getTemporalGrantRule_Role(), role);
		manipulation.set(rule, ePackage.getTemporalGrantRule_Demarcation(), demarcation);
		manipulation.set(rule, ePackage.getTemporalGrantRule_IsGrant(), enable);
		manipulation.set(rule, ePackage.getTemporalGrantRule_Priority(), priority);
		return rule;

	}

	public void removeTemporalGrantRule(TemporalGrantRule rule) throws ModelManipulationException {
		manipulation.set(rule, ePackage.getTemporalGrantRule_Role(), null);
		manipulation.set(rule, ePackage.getTemporalGrantRule_Demarcation(), null);
		manipulation.set(rule, ePackage.getTemporalGrantRule_TemporalContext(), null);
		manipulation.remove(rule);
	}

	public TemporalAuthenticationRule addTemporalAuthenticationRule(TemporalContext context, String name, SecurityZone zone, int status,
																	int priority) throws ModelManipulationException, InvocationTargetException {
		TemporalAuthenticationRule rule = (TemporalAuthenticationRule) manipulation.createChild(this.system.getAuthenticationPolicy(),
				ePackage.getAuthenticationPolicy_TemporalAuthenticationRules(), ePackage.getTemporalAuthenticationRule());
		manipulation.set(rule, ePackage.getTemporalAuthenticationRule_TemporalContext(), context);
		manipulation.set(rule, ePackage.getTemporalAuthenticationRule_Name(), name);
		manipulation.set(rule, ePackage.getTemporalAuthenticationRule_SecurityZone(), zone);
		manipulation.set(rule, ePackage.getTemporalAuthenticationRule_Status(), status);
		manipulation.set(rule, ePackage.getTemporalAuthenticationRule_Priority(), priority);
		return rule;
	}

	public void removeTemporalAuthenticationRule(TemporalAuthenticationRule rule) throws ModelManipulationException {
		manipulation.set(rule, ePackage.getTemporalAuthenticationRule_SecurityZone(), null);
		manipulation.set(rule, ePackage.getTemporalAuthenticationRule_TemporalContext(), null);
		manipulation.remove(rule);
	}

	public SecurityZone addSecurityZone(String name, boolean publicZone) throws ModelManipulationException {
		SecurityZone zone = (SecurityZone) manipulation.createChild(system.getTopology(),
				ePackage.getAccessControlSystemTopology_SecurityZones(),
				ePackage.getSecurityZone());
		manipulation.set(zone, ePackage.getSACSObject_Name(), name);
		manipulation.set(zone, ePackage.getSecurityZone_Public(), publicZone);
		return zone;
	}


	public void removeSecurityZone(SecurityZone securityZone) throws ModelManipulationException, InvocationTargetException {
		for (TemporalAuthenticationRule tar : new ArrayList<>(securityZone.getConstrainedBy())) {
			removeTemporalAuthenticationRule(tar);
		}
		if (securityZone.getOP() != null) {
			removePermission(securityZone.getOP());
		}
		manipulation.remove(securityZone);
	}

	// -----------------------------------------------


	// ---------- Add / Remove Authorization Model Relations ----------

	public void assignRoleToUser(User user, Role role) throws ModelManipulationException {
		manipulation.addTo(user, ePackage.getUser_UR(), role);
	}

	public void deassignRoleFromUser(User user, Role role) throws ModelManipulationException {
		manipulation.remove(user, ePackage.getUser_UR(), role);
	}

	public void assignPermissionToDemarcation(Demarcation demarcation, Permission permission) throws ModelManipulationException {
		manipulation.addTo(demarcation, ePackage.getDemarcation_DP(), permission);
	}

	public void deassignPermissionFromDemarcation(Demarcation demarcation, Permission permission) throws ModelManipulationException {
		manipulation.remove(demarcation, ePackage.getDemarcation_DP(), permission);
		manipulation.remove(permission, ePackage.getPermission_PD(), demarcation);
	}

	public void addRoleInheritance(Role juniorRole, Role seniorRole) throws ModelManipulationException {
		manipulation.addTo(juniorRole, ePackage.getRole_Seniors(), seniorRole);
	}

	public void removeRoleInheritance(Role juniorRole, Role seniorRole) throws ModelManipulationException {
		manipulation.remove(juniorRole, ePackage.getRole_Seniors(), seniorRole);
	}

	public void addDemarcationInheritance(Demarcation subdemarcation, Demarcation supdemarcation) throws ModelManipulationException {
		manipulation.addTo(subdemarcation, ePackage.getDemarcation_Superdemarcations(), supdemarcation);
	}

	public void removeDemarcationInheritance(Demarcation subdemarcation, Demarcation supdemarcation) throws ModelManipulationException {
		manipulation.remove(subdemarcation, ePackage.getDemarcation_Superdemarcations(), supdemarcation);
	}

	public void assignObjectToPermission(Permission permission, SACSObject object) throws ModelManipulationException {
		manipulation.set(permission, ePackage.getPermission_PO(), object);
	}

	public void deassignObjectFromPermission(Permission permission, SACSObject object) throws ModelManipulationException {
		manipulation.set(permission, ePackage.getPermission_PO(), null);
	}

	public void setReachability(SecurityZone from, SecurityZone to) throws ModelManipulationException {
		manipulation.addTo(from, ePackage.getSecurityZone_Reachable(), to);
	}

	public void setBidirectionalReachability(SecurityZone zone1, SecurityZone zone2) throws ModelManipulationException {
		manipulation.addTo(zone1, ePackage.getSecurityZone_Reachable(), zone2);
		manipulation.addTo(zone2, ePackage.getSecurityZone_Reachable(), zone1);
	}

	public void removeReachability(SecurityZone from, SecurityZone to) throws ModelManipulationException {
		manipulation.remove(from, ePackage.getSecurityZone_Reachable(), to);
	}

	public void removeBidirectionalReachability(SecurityZone zone1, SecurityZone zone2) throws ModelManipulationException {
		manipulation.remove(zone1, ePackage.getSecurityZone_Reachable(), zone2);
		manipulation.remove(zone2, ePackage.getSecurityZone_Reachable(), zone1);
	}
	// -------------------------------------------

	// ---------- Add / Remove SoD constraints ----------

	public SoDURConstraint addSoDURConstraint(String name, Role role1, Role role2) throws ModelManipulationException {
		SoDURConstraint constraint = (SoDURConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getSoDURConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryRoleConstraint_Left(), role1);
		manipulation.set(constraint, ePackage.getBinaryRoleConstraint_Right(), role2);
		return constraint;
	}

	public SoDUDConstraint addSoDUDConstraint(String name, Demarcation demarcation1, Demarcation demarcation2, TemporalContext context)
			throws ModelManipulationException, InvocationTargetException {
		SoDUDConstraint constraint = (SoDUDConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getSoDUDConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryDemarcationConstraint_Left(), demarcation1);
		manipulation.set(constraint, ePackage.getBinaryDemarcationConstraint_Right(), demarcation2);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public SoDUPConstraint addSoDUPConstraint(String name, Permission permission1, Permission permission2, TemporalContext context)
			throws ModelManipulationException {
		SoDUPConstraint constraint = (SoDUPConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getSoDUPConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Left(), permission1);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Right(), permission2);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public SoDRDConstraint addSoDRDConstraint(String name, Demarcation demarcation1, Demarcation demarcation2, TemporalContext context)
			throws ModelManipulationException {
		SoDRDConstraint constraint = (SoDRDConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getSoDRDConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryDemarcationConstraint_Left(), demarcation1);
		manipulation.set(constraint, ePackage.getBinaryDemarcationConstraint_Right(), demarcation2);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public SoDRPConstraint addSoDRPConstraint(String name, Permission permission1, Permission permission2, TemporalContext context)
			throws ModelManipulationException {
		SoDRPConstraint constraint = (SoDRPConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getSoDRPConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Left(), permission1);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Right(), permission2);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public SoDDPConstraint addSoDDPConstraint(String name, Permission permission1, Permission permission2)
			throws ModelManipulationException {
		SoDDPConstraint constraint = (SoDDPConstraint) manipulation.createChild(system, ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getSoDDPConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Left(), permission1);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Right(), permission2);
		return constraint;
	}

	// ---------- Add / Remove Prerequisite constraints ----------

	public PrerequisiteURConstraint addPrerequisiteURConstraint(String name, Role role1, Role role2) throws ModelManipulationException {
		PrerequisiteURConstraint constraint = (PrerequisiteURConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getPrerequisiteURConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryRoleConstraint_Left(), role1);
		manipulation.set(constraint, ePackage.getBinaryRoleConstraint_Right(), role2);
		return constraint;
	}

	public PrerequisiteUDConstraint addPrerequisiteUDConstraint(String name, Demarcation demarcation1, Demarcation demarcation2,
																TemporalContext context) throws ModelManipulationException {
		PrerequisiteUDConstraint constraint = (PrerequisiteUDConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getPrerequisiteUDConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryDemarcationConstraint_Left(), demarcation1);
		manipulation.set(constraint, ePackage.getBinaryDemarcationConstraint_Right(), demarcation2);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public PrerequisiteUPConstraint addPrerequisiteUPConstraint(String name, Permission permission1, Permission permission2,
																TemporalContext context) throws ModelManipulationException{
		PrerequisiteUPConstraint constraint = (PrerequisiteUPConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getPrerequisiteUPConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Left(), permission1);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Right(), permission2);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;

	}

	public PrerequisiteRDConstraint addPrerequisiteRDConstraint(String name, Demarcation demarcation1, Demarcation demarcation2,
																TemporalContext context) throws ModelManipulationException {
		PrerequisiteRDConstraint constraint = (PrerequisiteRDConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getPrerequisiteRDConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryDemarcationConstraint_Left(), demarcation1);
		manipulation.set(constraint, ePackage.getBinaryDemarcationConstraint_Right(), demarcation2);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public PrerequisiteRPConstraint addPrerequisiteRPConstraint(String name, Permission permission1, Permission permission2,
																TemporalContext context) throws ModelManipulationException {
		PrerequisiteRPConstraint constraint = (PrerequisiteRPConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getPrerequisiteRPConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Left(), permission1);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Right(), permission2);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public PrerequisiteDPConstraint addPrerequisiteDPConstraint(String name, Permission permission1, Permission permission2)
			throws ModelManipulationException {
		PrerequisiteDPConstraint constraint = (PrerequisiteDPConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getPrerequisiteDPConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Left(), permission1);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Right(), permission2);
		return constraint;
	}

	// ---------- Add / Remove BoD constraints ----------

	public BoDURConstraint addBoDURConstraint(String name, Role role1, Role role2) throws ModelManipulationException {
		BoDURConstraint constraint = (BoDURConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getBoDURConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryRoleConstraint_Left(), role1);
		manipulation.set(constraint, ePackage.getBinaryRoleConstraint_Right(), role2);
		return constraint;
	}

	public BoDUDConstraint addBoDUDConstraint(String name, Demarcation demarcation1, Demarcation demarcation2, TemporalContext context)
			throws ModelManipulationException {
		BoDUDConstraint constraint = (BoDUDConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getBoDUDConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryDemarcationConstraint_Left(), demarcation1);
		manipulation.set(constraint, ePackage.getBinaryDemarcationConstraint_Right(), demarcation2);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public BoDUPConstraint addBoDUPConstraint(String name, Permission permission1, Permission permission2, TemporalContext context)
			throws ModelManipulationException {
		BoDUPConstraint constraint = (BoDUPConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getBoDUPConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Left(), permission1);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Right(), permission2);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public BoDRDConstraint addBoDRDConstraint(String name, Demarcation demarcation1, Demarcation demarcation2, TemporalContext context)
			throws ModelManipulationException {
		BoDRDConstraint constraint = (BoDRDConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getBoDRDConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryDemarcationConstraint_Left(), demarcation1);
		manipulation.set(constraint, ePackage.getBinaryDemarcationConstraint_Right(), demarcation2);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public BoDRPConstraint addBoDRPConstraint(String name, Permission permission1, Permission permission2, TemporalContext context)
			throws ModelManipulationException, InvocationTargetException {
		BoDRPConstraint constraint = (BoDRPConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getBoDRPConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Left(), permission1);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Right(), permission2);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public BoDDPConstraint addBoDDPConstraint(String name, Permission permission1, Permission permission2)
			throws ModelManipulationException {
		BoDDPConstraint constraint = (BoDDPConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getBoDDPConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Left(), permission1);
		manipulation.set(constraint, ePackage.getBinaryPermissionConstraint_Right(), permission2);
		return constraint;
	}

	// ---------- Add / Remove Cardinality constraints ----------

	public CardinalityURConstraint addCardinalityURConstraint(String name, Role role, int bound) throws ModelManipulationException {
		CardinalityURConstraint constraint = (CardinalityURConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getCardinalityURConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getUnaryRoleConstraint_Role(), role);
		manipulation.set(constraint, ePackage.getCardinalityURConstraint_Bound(), bound);
		return constraint;
	}

	public CardinalityUDConstraint addCardinalityUDConstraint(String name, Demarcation demarcation, int bound, TemporalContext context)
			throws ModelManipulationException {
		CardinalityUDConstraint constraint = (CardinalityUDConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getCardinalityUDConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getUnaryDemarcationConstraint_Demarcation(), demarcation);
		manipulation.set(constraint, ePackage.getCardinalityUDConstraint_Bound(), bound);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public CardinalityUPConstraint addCardinalityUPConstraint(String name, Permission permission, int bound, TemporalContext context)
			throws ModelManipulationException {
		CardinalityUPConstraint constraint = (CardinalityUPConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getCardinalityUPConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getUnaryPermissionConstraint_Permission(), permission);
		manipulation.set(constraint, ePackage.getCardinalityUPConstraint_Bound(), bound);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public CardinalityRDConstraint addCardinalityRDConstraint(String name, Demarcation demarcation, int bound, TemporalContext context)
			throws ModelManipulationException {
		CardinalityRDConstraint constraint = (CardinalityRDConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getCardinalityRDConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getUnaryDemarcationConstraint_Demarcation(), demarcation);
		manipulation.set(constraint, ePackage.getCardinalityRDConstraint_Bound(), bound);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public CardinalityRPConstraint addCardinalityRPConstraint(String name, Permission permission, int bound, TemporalContext context) throws ModelManipulationException, InvocationTargetException {
		CardinalityRPConstraint constraint = (CardinalityRPConstraint) manipulation.createChild(system, ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getCardinalityRPConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getUnaryPermissionConstraint_Permission(), permission);
		manipulation.set(constraint, ePackage.getCardinalityRPConstraint_Bound(), bound);
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_TemporalContext(), context);
		return constraint;
	}

	public CardinalityDPConstraint addCardinalityDPConstraint(String name, Permission permission, int bound) throws ModelManipulationException {
		CardinalityDPConstraint constraint = (CardinalityDPConstraint) manipulation.createChild(system,
				ePackage.getSiteAccessControlSystem_AuthorizationConstraints(),
				ePackage.getCardinalityDPConstraint());
		manipulation.set(constraint, ePackage.getPolicyDependentAuthorizationConstraint_Name(), name);
		manipulation.set(constraint, ePackage.getUnaryPermissionConstraint_Permission(), permission);
		manipulation.set(constraint, ePackage.getCardinalityDPConstraint_Bound(), bound);
		return constraint;
	}

	public void removeAuthorizationConstraint(PolicyDependentAuthorizationConstraint constraint) throws ModelManipulationException {
		manipulation.remove(system, ePackage.getSiteAccessControlSystem_AuthorizationConstraints(), constraint);
	}

	public SiteAccessControlSystem getSystem() {
		return system;
	}

	public Resource getResource() {
		return resource;
	}

	public GRRBACPackage getEPackage() {
		return ePackage;
	}

	public AdvancedViatraQueryEngine getEngine() {
		return engine;
	}

	public String getUniqueID(String key) {
		this.instanceIDCounter.putIfAbsent(key, 0);
		this.instanceIDCounter.put(key, this.instanceIDCounter.get(key) + 1);
		return key + "-" + this.instanceIDCounter.get(key);
	}

	public HashMap<String, Integer> getInstanceIDCounter() {
		return instanceIDCounter;
	}

	public void setInstanceIDCounter(HashMap<String, Integer> instanceIDCounter) {
		this.instanceIDCounter = instanceIDCounter;
	}

	public void execute(BatchTransformationRule rule) {
		this.transformation.getTransformationStatements().fireOne(rule);
	}

	public void execute(BatchTransformationRule... rules) {
		for (int i = 0; i < rules.length; i++) {
			this.transformation.getTransformationStatements().fireOne(rules[i]);
		}

	}

	public IModelManipulations getManipulation() {
		return manipulation;
	}

	public void setManipulation(IModelManipulations manipulation) {
		this.manipulation = manipulation;
	}

	public BatchTransformationRuleFactory getBatchFactory() {
		return batchFactory;
	}

	public void setBatchFactory(BatchTransformationRuleFactory batchFactory) {
		this.batchFactory = batchFactory;
	}

	public void dispose() {
		if (!Objects.equal(this.transformation, null)) {
			this.transformation.dispose();
		}
		this.transformation = null;
		return;
	}


}
