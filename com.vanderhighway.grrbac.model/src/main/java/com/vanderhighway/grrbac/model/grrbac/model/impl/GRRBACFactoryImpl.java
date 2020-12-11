/**
 */
package com.vanderhighway.grrbac.model.grrbac.model.impl;

import com.vanderhighway.grrbac.model.grrbac.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GRRBACFactoryImpl extends EFactoryImpl implements GRRBACFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GRRBACFactory init() {
		try {
			GRRBACFactory theGRRBACFactory = (GRRBACFactory)EPackage.Registry.INSTANCE.getEFactory(GRRBACPackage.eNS_URI);
			if (theGRRBACFactory != null) {
				return theGRRBACFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GRRBACFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRRBACFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GRRBACPackage.USER: return createUser();
			case GRRBACPackage.ROLE: return createRole();
			case GRRBACPackage.DEMARCATION: return createDemarcation();
			case GRRBACPackage.PERMISSION: return createPermission();
			case GRRBACPackage.TIME_RANGE: return createTimeRange();
			case GRRBACPackage.VALID_DAY_OF_WEEK: return createValidDayOfWeek();
			case GRRBACPackage.VALID_DAY_OF_MONTH: return createValidDayOfMonth();
			case GRRBACPackage.TEMPORAL_CONTEXT: return createTemporalContext();
			case GRRBACPackage.VALID_DAY_TIME_RANGE: return createValidDayTimeRange();
			case GRRBACPackage.VALID_DAY_OF_WEEK_MONTH: return createValidDayOfWeekMonth();
			case GRRBACPackage.TEMPORAL_GRANT_RULE: return createTemporalGrantRule();
			case GRRBACPackage.SACS_OBJECT: return createSACSObject();
			case GRRBACPackage.SITE_ACCESS_CONTROL_SYSTEM: return createSiteAccessControlSystem();
			case GRRBACPackage.SECURITY_ZONE: return createSecurityZone();
			case GRRBACPackage.SO_DUR_CONSTRAINT: return createSoDURConstraint();
			case GRRBACPackage.SO_DUD_CONSTRAINT: return createSoDUDConstraint();
			case GRRBACPackage.SO_DUP_CONSTRAINT: return createSoDUPConstraint();
			case GRRBACPackage.SO_DRD_CONSTRAINT: return createSoDRDConstraint();
			case GRRBACPackage.SO_DDP_CONSTRAINT: return createSoDDPConstraint();
			case GRRBACPackage.AUTHORIZATION_POLICY: return createAuthorizationPolicy();
			case GRRBACPackage.PREREQUISITE_UR_CONSTRAINT: return createPrerequisiteURConstraint();
			case GRRBACPackage.PREREQUISITE_UD_CONSTRAINT: return createPrerequisiteUDConstraint();
			case GRRBACPackage.PREREQUISITE_UP_CONSTRAINT: return createPrerequisiteUPConstraint();
			case GRRBACPackage.PREREQUISITE_RD_CONSTRAINT: return createPrerequisiteRDConstraint();
			case GRRBACPackage.PREREQUISITE_RP_CONSTRAINT: return createPrerequisiteRPConstraint();
			case GRRBACPackage.PREREQUISITE_DP_CONSTRAINT: return createPrerequisiteDPConstraint();
			case GRRBACPackage.BO_DUR_CONSTRAINT: return createBoDURConstraint();
			case GRRBACPackage.BO_DUD_CONSTRAINT: return createBoDUDConstraint();
			case GRRBACPackage.BO_DRD_CONSTRAINT: return createBoDRDConstraint();
			case GRRBACPackage.BO_DUP_CONSTRAINT: return createBoDUPConstraint();
			case GRRBACPackage.BO_DRP_CONSTRAINT: return createBoDRPConstraint();
			case GRRBACPackage.BO_DDP_CONSTRAINT: return createBoDDPConstraint();
			case GRRBACPackage.CARDINALITY_UR_CONSTRAINT: return createCardinalityURConstraint();
			case GRRBACPackage.CARDINALITY_UD_CONSTRAINT: return createCardinalityUDConstraint();
			case GRRBACPackage.CARDINALITY_RD_CONSTRAINT: return createCardinalityRDConstraint();
			case GRRBACPackage.CARDINALITY_UP_CONSTRAINT: return createCardinalityUPConstraint();
			case GRRBACPackage.CARDINALITY_RP_CONSTRAINT: return createCardinalityRPConstraint();
			case GRRBACPackage.CARDINALITY_DP_CONSTRAINT: return createCardinalityDPConstraint();
			case GRRBACPackage.CONTEXT_CONTAINER: return createContextContainer();
			case GRRBACPackage.VALID_DAY_OF_YEAR: return createValidDayOfYear();
			case GRRBACPackage.AUTHENTICATION_POLICY: return createAuthenticationPolicy();
			case GRRBACPackage.TEMPORAL_AUTHENTICATION_RULE: return createTemporalAuthenticationRule();
			case GRRBACPackage.MY_SCENARIO: return createMyScenario();
			case GRRBACPackage.ACCESS_CONTROL_SYSTEM_TOPOLOGY: return createAccessControlSystemTopology();
			case GRRBACPackage.SO_DRP_CONSTRAINT: return createSoDRPConstraint();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public User createUser() {
		UserImpl user = new UserImpl();
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Role createRole() {
		RoleImpl role = new RoleImpl();
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Demarcation createDemarcation() {
		DemarcationImpl demarcation = new DemarcationImpl();
		return demarcation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permission createPermission() {
		PermissionImpl permission = new PermissionImpl();
		return permission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimeRange createTimeRange() {
		TimeRangeImpl timeRange = new TimeRangeImpl();
		return timeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidDayOfWeek createValidDayOfWeek() {
		ValidDayOfWeekImpl validDayOfWeek = new ValidDayOfWeekImpl();
		return validDayOfWeek;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidDayOfMonth createValidDayOfMonth() {
		ValidDayOfMonthImpl validDayOfMonth = new ValidDayOfMonthImpl();
		return validDayOfMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalContext createTemporalContext() {
		TemporalContextImpl temporalContext = new TemporalContextImpl();
		return temporalContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidDayTimeRange createValidDayTimeRange() {
		ValidDayTimeRangeImpl validDayTimeRange = new ValidDayTimeRangeImpl();
		return validDayTimeRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidDayOfWeekMonth createValidDayOfWeekMonth() {
		ValidDayOfWeekMonthImpl validDayOfWeekMonth = new ValidDayOfWeekMonthImpl();
		return validDayOfWeekMonth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalGrantRule createTemporalGrantRule() {
		TemporalGrantRuleImpl temporalGrantRule = new TemporalGrantRuleImpl();
		return temporalGrantRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SACSObject createSACSObject() {
		SACSObjectImpl sacsObject = new SACSObjectImpl();
		return sacsObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SiteAccessControlSystem createSiteAccessControlSystem() {
		SiteAccessControlSystemImpl siteAccessControlSystem = new SiteAccessControlSystemImpl();
		return siteAccessControlSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityZone createSecurityZone() {
		SecurityZoneImpl securityZone = new SecurityZoneImpl();
		return securityZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoDURConstraint createSoDURConstraint() {
		SoDURConstraintImpl soDURConstraint = new SoDURConstraintImpl();
		return soDURConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoDUDConstraint createSoDUDConstraint() {
		SoDUDConstraintImpl soDUDConstraint = new SoDUDConstraintImpl();
		return soDUDConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoDUPConstraint createSoDUPConstraint() {
		SoDUPConstraintImpl soDUPConstraint = new SoDUPConstraintImpl();
		return soDUPConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoDRDConstraint createSoDRDConstraint() {
		SoDRDConstraintImpl soDRDConstraint = new SoDRDConstraintImpl();
		return soDRDConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoDDPConstraint createSoDDPConstraint() {
		SoDDPConstraintImpl soDDPConstraint = new SoDDPConstraintImpl();
		return soDDPConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthorizationPolicy createAuthorizationPolicy() {
		AuthorizationPolicyImpl authorizationPolicy = new AuthorizationPolicyImpl();
		return authorizationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrerequisiteURConstraint createPrerequisiteURConstraint() {
		PrerequisiteURConstraintImpl prerequisiteURConstraint = new PrerequisiteURConstraintImpl();
		return prerequisiteURConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrerequisiteUDConstraint createPrerequisiteUDConstraint() {
		PrerequisiteUDConstraintImpl prerequisiteUDConstraint = new PrerequisiteUDConstraintImpl();
		return prerequisiteUDConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrerequisiteUPConstraint createPrerequisiteUPConstraint() {
		PrerequisiteUPConstraintImpl prerequisiteUPConstraint = new PrerequisiteUPConstraintImpl();
		return prerequisiteUPConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrerequisiteRDConstraint createPrerequisiteRDConstraint() {
		PrerequisiteRDConstraintImpl prerequisiteRDConstraint = new PrerequisiteRDConstraintImpl();
		return prerequisiteRDConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrerequisiteRPConstraint createPrerequisiteRPConstraint() {
		PrerequisiteRPConstraintImpl prerequisiteRPConstraint = new PrerequisiteRPConstraintImpl();
		return prerequisiteRPConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrerequisiteDPConstraint createPrerequisiteDPConstraint() {
		PrerequisiteDPConstraintImpl prerequisiteDPConstraint = new PrerequisiteDPConstraintImpl();
		return prerequisiteDPConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoDURConstraint createBoDURConstraint() {
		BoDURConstraintImpl boDURConstraint = new BoDURConstraintImpl();
		return boDURConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoDUDConstraint createBoDUDConstraint() {
		BoDUDConstraintImpl boDUDConstraint = new BoDUDConstraintImpl();
		return boDUDConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoDRDConstraint createBoDRDConstraint() {
		BoDRDConstraintImpl boDRDConstraint = new BoDRDConstraintImpl();
		return boDRDConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoDUPConstraint createBoDUPConstraint() {
		BoDUPConstraintImpl boDUPConstraint = new BoDUPConstraintImpl();
		return boDUPConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoDRPConstraint createBoDRPConstraint() {
		BoDRPConstraintImpl boDRPConstraint = new BoDRPConstraintImpl();
		return boDRPConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoDDPConstraint createBoDDPConstraint() {
		BoDDPConstraintImpl boDDPConstraint = new BoDDPConstraintImpl();
		return boDDPConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardinalityURConstraint createCardinalityURConstraint() {
		CardinalityURConstraintImpl cardinalityURConstraint = new CardinalityURConstraintImpl();
		return cardinalityURConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardinalityUDConstraint createCardinalityUDConstraint() {
		CardinalityUDConstraintImpl cardinalityUDConstraint = new CardinalityUDConstraintImpl();
		return cardinalityUDConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardinalityRDConstraint createCardinalityRDConstraint() {
		CardinalityRDConstraintImpl cardinalityRDConstraint = new CardinalityRDConstraintImpl();
		return cardinalityRDConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardinalityUPConstraint createCardinalityUPConstraint() {
		CardinalityUPConstraintImpl cardinalityUPConstraint = new CardinalityUPConstraintImpl();
		return cardinalityUPConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardinalityRPConstraint createCardinalityRPConstraint() {
		CardinalityRPConstraintImpl cardinalityRPConstraint = new CardinalityRPConstraintImpl();
		return cardinalityRPConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CardinalityDPConstraint createCardinalityDPConstraint() {
		CardinalityDPConstraintImpl cardinalityDPConstraint = new CardinalityDPConstraintImpl();
		return cardinalityDPConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextContainer createContextContainer() {
		ContextContainerImpl contextContainer = new ContextContainerImpl();
		return contextContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ValidDayOfYear createValidDayOfYear() {
		ValidDayOfYearImpl validDayOfYear = new ValidDayOfYearImpl();
		return validDayOfYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AuthenticationPolicy createAuthenticationPolicy() {
		AuthenticationPolicyImpl authenticationPolicy = new AuthenticationPolicyImpl();
		return authenticationPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TemporalAuthenticationRule createTemporalAuthenticationRule() {
		TemporalAuthenticationRuleImpl temporalAuthenticationRule = new TemporalAuthenticationRuleImpl();
		return temporalAuthenticationRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MyScenario createMyScenario() {
		MyScenarioImpl myScenario = new MyScenarioImpl();
		return myScenario;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessControlSystemTopology createAccessControlSystemTopology() {
		AccessControlSystemTopologyImpl accessControlSystemTopology = new AccessControlSystemTopologyImpl();
		return accessControlSystemTopology;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SoDRPConstraint createSoDRPConstraint() {
		SoDRPConstraintImpl soDRPConstraint = new SoDRPConstraintImpl();
		return soDRPConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GRRBACPackage getGRRBACPackage() {
		return (GRRBACPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GRRBACPackage getPackage() {
		return GRRBACPackage.eINSTANCE;
	}

} //GRRBACFactoryImpl
