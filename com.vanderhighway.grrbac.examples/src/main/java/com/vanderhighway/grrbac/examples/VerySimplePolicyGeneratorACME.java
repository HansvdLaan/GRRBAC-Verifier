
package com.vanderhighway.grrbac.examples;

import com.brein.time.timeintervals.intervals.IntegerInterval;
import com.vanderhighway.grrbac.core.modifier.GeneratorUtil;
import com.vanderhighway.grrbac.core.modifier.PolicyModifier;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import org.eclipse.xtext.xbase.lib.Extension;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.*;

public class VerySimplePolicyGeneratorACME {

	@Extension
	private static GRRBACPackage ePackage = GRRBACPackage.eINSTANCE;

	public static void main(String[] args) throws IOException, InvocationTargetException, ModelManipulationException, ModelManipulationException, ParseException {

		Resource resource = GeneratorUtil.createAndSaveGRRBACModel("acme");
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
		GeneratorUtil.addManyTemporalContextInstances(modifier, lunchBreaks, weekDays, Arrays.asList(new IntegerInterval(720,780)));

		GeneratorUtil.addManyTemporalContextInstances(modifier, holidays, Arrays.asList("25_December"), Arrays.asList(new IntegerInterval(0, 1439)));

		// Add Users
		User user1 = modifier.addUser("User1");
		User user2 = modifier.addUser("User2");

		// Add Roles
		Role roleEmployee = modifier.addRole("Employee");
		Role roleManager = modifier.addRole("Manager");
		modifier.addRoleInheritance(roleEmployee, roleManager);

		// Add Demarcations
		Demarcation demRed = modifier.addDemarcation("Red");
		Demarcation demPurple = modifier.addDemarcation("Purple");
		Demarcation demOrange = modifier.addDemarcation("Orange");
		Demarcation demGreen = modifier.addDemarcation("Green");
		modifier.addDemarcationInheritance(demOrange, demRed);
		modifier.addDemarcationInheritance(demGreen, demOrange);

		// Add Permissions
		Permission permOpenOffice = modifier.addPermission("OpenOffice");
		Permission permBreakRoom = modifier.addPermission("BreakRoom");
		Permission permKitchen = modifier.addPermission("Kitchen");
		Permission permSafe = modifier.addPermission("Safe");
		Permission permLobby = modifier.addPermission("Lobby");

		// Add Relations
		// Add User-Role relations
		modifier.assignRoleToUser(user1, roleManager);
		modifier.assignRoleToUser(user2, roleEmployee);

		modifier.assignPermissionToDemarcation(demGreen, permLobby);
		modifier.assignPermissionToDemarcation(demOrange, permOpenOffice);
		modifier.assignPermissionToDemarcation(demPurple, permBreakRoom);
		modifier.assignPermissionToDemarcation(demPurple, permKitchen);
		modifier.assignPermissionToDemarcation(demRed, permSafe);

		modifier.addTemporalGrantRule(workingHours, "TGR1", roleEmployee, demOrange, true, 3);
		modifier.addTemporalGrantRule(lunchBreaks, "TGR2", roleEmployee, demPurple, true, 3);
		modifier.addTemporalGrantRule(holidays, "TGR3", roleEmployee, demOrange, false, 4);
		modifier.addTemporalGrantRule(holidays, "TGR4", roleEmployee, demPurple, false, 4);
		modifier.addTemporalGrantRule(workingHours, "TGR5", roleManager, demRed, true, 3);

		// Add Simple Building
		SecurityZone szLobby = modifier.addSecurityZone("ZoneLobby", true);
		SecurityZone szOpenOffice = modifier.addSecurityZone("ZoneOpenOffice", false);
		SecurityZone szBreakRoom = modifier.addSecurityZone("ZoneBreakRoom", false);
		SecurityZone szKitchen = modifier.addSecurityZone("ZoneKitchen", false);
		SecurityZone szSafe = modifier.addSecurityZone("ZoneSafe", false);

		modifier.assignObjectToPermission(permLobby, szLobby);
		modifier.assignObjectToPermission(permOpenOffice, szOpenOffice);
		modifier.assignObjectToPermission(permBreakRoom, szBreakRoom);
		modifier.assignObjectToPermission(permKitchen, szKitchen);
		modifier.assignObjectToPermission(permSafe, szSafe);

		modifier.setBidirectionalReachability(szLobby, szOpenOffice);
		modifier.setBidirectionalReachability(szOpenOffice, szBreakRoom);
		modifier.setBidirectionalReachability(szBreakRoom, szKitchen);
		modifier.setBidirectionalReachability(szOpenOffice, szSafe);

		//modifier.addTemporalAuthenticationRule(always, "TAR1", szLobby, AuthenticationStatus.UNLOCKED.getStatusCode(), 1);

		resource.save(Collections.emptyMap());

		modifier.dispose();

		System.out.println("Done!");
	}
}
