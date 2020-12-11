
package com.vanderhighway.grrbac.examples;

import com.brein.time.timeintervals.intervals.IntegerInterval;
import com.vanderhighway.grrbac.core.modifier.GeneratorUtil;
import com.vanderhighway.grrbac.core.modifier.PolicyModifier;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import com.vanderhighway.grrbac.patterns.AuthenticationStatus;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import org.eclipse.xtext.xbase.lib.Extension;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.*;

public class VerySimplePolicyGenerator {

	@Extension
	private static GRRBACPackage ePackage = GRRBACPackage.eINSTANCE;

	public static void main(String[] args) throws IOException, InvocationTargetException, ModelManipulationException, ModelManipulationException, ParseException {

		Resource resource = GeneratorUtil.createAndSaveGRRBACModel("simple_company");
		SiteAccessControlSystem system = GeneratorUtil.buildBasicSecurityPolicy(ePackage, resource, "DummySecurityPolicy",
				"DummyAuthorizationPolicy", "DummyAuthenticationPolicy",
				"DummyTopology","DummyContextContainer");

		final AdvancedViatraQueryEngine engine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(resource));
		PolicyModifier modifier = new PolicyModifier(engine, system, resource);

		TemporalContext always = modifier.addTemporalContext("Always");
		TemporalContext workingHours = modifier.addTemporalContext("WorkingHours");
		TemporalContext lunchBreaks = modifier.addTemporalContext("LunchBreaks");
		TemporalContext holidays = modifier.addTemporalContext("Holidays");

		Map<String, ValidDayOfWeek> dayOfWeekScheduleMap = new HashMap<>();
		Map<String, Map<Integer, ValidDayOfMonth>> dayOfMonthScheduleMap = new HashMap();

		List<String> allDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
		List<String> weekDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
		List<String> weekEnd = Arrays.asList("Saturday", "Sunday");

		GeneratorUtil.addManyTemporalContextInstances(modifier, workingHours, weekDays, Arrays.asList(new IntegerInterval(480,1019)));
		GeneratorUtil.addManyTemporalContextInstances(modifier, lunchBreaks, weekDays, Arrays.asList(new IntegerInterval(480,1019)));

		GeneratorUtil.addManyTemporalContextInstances(modifier, holidays, Arrays.asList("25_December"), Arrays.asList(new IntegerInterval(480, 1019)));

		// Add Users
		User user1 = modifier.addUser("User1");
		User user2 = modifier.addUser("User2");
		User user3 = modifier.addUser("User3");
		User user4 = modifier.addUser("User4");

		// Add Roles
		Role roleEmployee = modifier.addRole("Employee");
		Role roleManager = modifier.addRole("Manager");

		// Add Demarcations
		Demarcation demOffice = modifier.addDemarcation("Office");
		Demarcation demCanteen = modifier.addDemarcation("Canteen");

		// Add Permissions
		Permission permOpenOffice = modifier.addPermission("OpenOffice");
		Permission permBreakRoom = modifier.addPermission("BreakRoom");
		Permission permKitchen = modifier.addPermission("Kitchen");

		// Add Relations
		// Add User-Role relations
		modifier.assignRoleToUser(user1, roleEmployee);
		modifier.assignRoleToUser(user2, roleEmployee);
		modifier.assignRoleToUser(user2, roleManager);

		// Add Role-Demarcation relation
//		modifier.assignDemarcationToRole(roleEmployee, demOffice);
//		modifier.assignDemarcationToRole(roleManager, demCanteen);

		modifier.assignPermissionToDemarcation(demOffice, permOpenOffice);
		modifier.assignPermissionToDemarcation(demOffice, permBreakRoom);
		modifier.assignPermissionToDemarcation(demCanteen, permBreakRoom);
		modifier.assignPermissionToDemarcation(demCanteen, permKitchen);

		modifier.addTemporalGrantRule(workingHours, "R1", roleEmployee, demOffice, true, 3);;
		modifier.addTemporalGrantRule(lunchBreaks, "R2", roleEmployee, demCanteen, true, 3);
		modifier.addTemporalGrantRule(holidays, "R3", roleEmployee, demOffice, false, 4);
		modifier.addTemporalGrantRule(holidays, "R4", roleEmployee, demCanteen, false, 4);

		modifier.addTemporalGrantRule(workingHours, "R5", roleManager, demOffice, true, 3);;
		modifier.addTemporalGrantRule(lunchBreaks, "R6", roleManager, demCanteen, true, 3);
		modifier.addTemporalGrantRule(holidays, "R7", roleEmployee, demOffice, false, 4);

		// Add Simple Building
		SecurityZone szLobby = modifier.addSecurityZone("ZoneLobby", true);
		SecurityZone szOpenOffice = modifier.addSecurityZone("ZoneOpenOffice", false);
		SecurityZone szBreakRoom = modifier.addSecurityZone("ZoneBreakRoom", false);
		SecurityZone szKitchen = modifier.addSecurityZone("ZoneKitchen", false);

		modifier.assignObjectToPermission(permOpenOffice, szOpenOffice);
		modifier.assignObjectToPermission(permBreakRoom, szBreakRoom);
		modifier.assignObjectToPermission(permKitchen, szKitchen);

		modifier.setBidirectionalReachability(szLobby, szOpenOffice);
		modifier.setBidirectionalReachability(szOpenOffice, szBreakRoom);
		modifier.setBidirectionalReachability(szBreakRoom, szKitchen);

		modifier.addTemporalAuthenticationRule(always, "TAR1", szLobby, AuthenticationStatus.UNLOCKED.getStatusCode(), 1);

		resource.save(Collections.emptyMap());

		modifier.dispose();

		System.out.println("Done!");
	}
}
