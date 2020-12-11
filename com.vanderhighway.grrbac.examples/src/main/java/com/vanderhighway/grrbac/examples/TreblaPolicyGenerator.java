
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

public class TreblaPolicyGenerator {

	@Extension
	private static GRRBACPackage ePackage = GRRBACPackage.eINSTANCE;

	public static void main(String[] args) throws IOException, InvocationTargetException, ModelManipulationException, ModelManipulationException, ParseException {

        Resource resource = GeneratorUtil.createAndSaveGRRBACModel("trebla");
		SiteAccessControlSystem system = GeneratorUtil.buildBasicSecurityPolicy(ePackage, resource, "DummySecurityPolicy",
				"DummyAuthorizationPolicy", "DummyAuthenticationPolicy",
				"DummyTopology","DummyContextContainer");

        final AdvancedViatraQueryEngine engine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(resource));
		PolicyModifier modifier = new PolicyModifier(engine, (SiteAccessControlSystem) resource.getContents().get(0), resource);

		TemporalContext always = modifier.addTemporalContext("Always");
        TemporalContext guardShifts = modifier.addTemporalContext("GuardShifts");
        TemporalContext workingHours = modifier.addTemporalContext("WorkingHours");
        TemporalContext visitingHours = modifier.addTemporalContext("VisitingHours");
        TemporalContext lunchBreaks = modifier.addTemporalContext("LunchBreaks");
        TemporalContext overtime = modifier.addTemporalContext("Overtime");
        TemporalContext cleaningShifts = modifier.addTemporalContext("CleaningShifts");
		TemporalContext workshops = modifier.addTemporalContext("HolidayWorkshops");
		TemporalContext familyDay = modifier.addTemporalContext("FamilyDay");
		TemporalContext firstMondayOfJanuary = modifier.addTemporalContext("FirstMondayOfJanuary");

		Map<String, ValidDayOfWeek> dayOfWeekScheduleMap = new HashMap<>();
		Map<String, Map<Integer, ValidDayOfMonth>> dayOfMonthScheduleMap = new HashMap();

		List<String> allDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
		List<String> weekDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
		List<String> weekEnd = Arrays.asList("Saturday", "Sunday");

        GeneratorUtil.addManyTemporalContextInstances(modifier, guardShifts, allDays, Arrays.asList(new IntegerInterval(0, 449),
                new IntegerInterval(1170, 1439)));

        GeneratorUtil.addManyTemporalContextInstances(modifier, workingHours, weekDays, Arrays.asList(new IntegerInterval(480, 1019)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, visitingHours, weekDays, Arrays.asList(new IntegerInterval(600, 959)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, overtime, weekDays, Arrays.asList(new IntegerInterval(1020, 1169)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, lunchBreaks, weekDays, Arrays.asList(new IntegerInterval(720, 779)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, cleaningShifts, Arrays.asList("Tuesday","Friday"), Arrays.asList(new IntegerInterval(1170, 1260)));
		GeneratorUtil.addManyTemporalContextInstances(modifier, workshops, Arrays.asList("5_December", "25_December"),
				Arrays.asList(new IntegerInterval(480, 1019)));
		GeneratorUtil.addManyTemporalContextInstances(modifier, familyDay, Arrays.asList("Saturday_10_April_2021"), Arrays.asList(new IntegerInterval(480, 1019)));
		GeneratorUtil.addManyTemporalContextInstances(modifier, firstMondayOfJanuary, Arrays.asList("Monday_1_January", "Monday_2_January", "Monday_3_January",
				"Monday_4_January", "Monday_5_January", "Monday_6_January", "Monday_7_January"),
				Arrays.asList(new IntegerInterval(480, 1019)));


		// Add Users
		User userAmy = modifier.addUser("Amy");
		User userBart = modifier.addUser("Bart");
		User userChristine = modifier.addUser("Christine");
		User userDave = modifier.addUser("Dave");
		User userEmily = modifier.addUser("Emily");
		User userFrank = modifier.addUser("Frank");
		User userGrace = modifier.addUser("Grace");
		User userHank = modifier.addUser("Hank");
		User userIsaac = modifier.addUser("Isaac");
		User userJulia = modifier.addUser("Julia");

		// Add Roles
		Role roleVisitor = modifier.addRole("Visitor");
		Role roleEmployee = modifier.addRole("Employee");
		Role roleContractor = modifier.addRole("Contractor");
		Role roleGuard = modifier.addRole("Guard");
		Role roleCleaner = modifier.addRole("Cleaner");
		Role roleOperations = modifier.addRole("Operations");
		Role roleOperationsManager = modifier.addRole("OperationsManager");
		Role roleDesigner = modifier.addRole("Designer");
		Role roleHeadDesigner = modifier.addRole("HeadDesigner");
		Role roleDirector = modifier.addRole("Director");

		// Add Demarcations
		Demarcation demarcationWorking = modifier.addDemarcation("Working");
		Demarcation demarcationDesigning = modifier.addDemarcation("Designing");
		Demarcation demarcationGuarding = modifier.addDemarcation("Guarding");
		Demarcation demarcationCleaning = modifier.addDemarcation("Cleaning");
		Demarcation demarcationVisiting = modifier.addDemarcation("Visiting");
		Demarcation demarcationManagingFinances = modifier.addDemarcation("ManagingFinances");
		Demarcation demarcationManagingPeople = modifier.addDemarcation("ManagingPeople");
		Demarcation demarcationManagingStock = modifier.addDemarcation("ManagingStock");
		Demarcation demarcationManaging = modifier.addDemarcation("Managing");
		Demarcation demarcationTakingABreak = modifier.addDemarcation("TakingABreak");

		// Add Permissions
		Permission permissionLobby = modifier.addPermission("Lobby");
		Permission permissionWorkshop = modifier.addPermission("Workshop");
		Permission permissionOpenOffice = modifier.addPermission("OpenOffice");
		Permission permissionRestaurant = modifier.addPermission("Restaurant");
		Permission permissionStorage = modifier.addPermission("Storage");
		Permission permissionMeetingRoom1 = modifier.addPermission("MeetingRoom1");
		Permission permissionMeetingRoom2 = modifier.addPermission("MeetingRoom2");
		Permission permissionOffice1 = modifier.addPermission("Office1");
		Permission permissionOffice2 = modifier.addPermission("Office2");
		Permission permissionVault = modifier.addPermission("Vault");
		Permission permissionToiletsWorkshop = modifier.addPermission("ToiletsWorkshop");
		Permission permissionToiletsOpenOffice = modifier.addPermission("ToiletsOpenOffice");

		// Add Role Hierarchies
		modifier.addRoleInheritance(roleContractor, roleCleaner);
		modifier.addRoleInheritance(roleContractor, roleGuard);
		modifier.addRoleInheritance(roleEmployee, roleDesigner);
		modifier.addRoleInheritance(roleEmployee, roleOperations);
		modifier.addRoleInheritance(roleDesigner, roleHeadDesigner);
		modifier.addRoleInheritance(roleOperations, roleOperationsManager);
		modifier.addRoleInheritance(roleHeadDesigner, roleDirector);
		modifier.addRoleInheritance(roleOperationsManager, roleDirector);

		// Add Demarcation Hierarchies
		modifier.addDemarcationInheritance(demarcationWorking, demarcationDesigning);
		modifier.addDemarcationInheritance(demarcationWorking, demarcationManagingFinances);
		modifier.addDemarcationInheritance(demarcationWorking, demarcationManagingPeople);
		modifier.addDemarcationInheritance(demarcationWorking, demarcationManagingStock);
		modifier.addDemarcationInheritance(demarcationWorking, demarcationGuarding);
		modifier.addDemarcationInheritance(demarcationWorking, demarcationCleaning);
		modifier.addDemarcationInheritance(demarcationManagingFinances, demarcationManaging);
		modifier.addDemarcationInheritance(demarcationManagingPeople, demarcationManaging);
		modifier.addDemarcationInheritance(demarcationManagingStock, demarcationManaging);

		// Add Relations
		// Add User-Role relations
		modifier.assignRoleToUser(userAmy, roleDirector);
		modifier.assignRoleToUser(userBart, roleHeadDesigner);
		modifier.assignRoleToUser(userChristine, roleOperationsManager);
		modifier.assignRoleToUser(userDave, roleDesigner);
		modifier.assignRoleToUser(userEmily, roleDesigner);
		modifier.assignRoleToUser(userFrank, roleOperations);
		modifier.assignRoleToUser(userGrace, roleGuard);
		modifier.assignRoleToUser(userHank, roleGuard);
		modifier.assignRoleToUser(userIsaac, roleCleaner);
		modifier.assignRoleToUser(userJulia, roleVisitor);

		// Add Role-Demarcation relation
//		modifier.assignDemarcationToRole(roleEmployee, demarcationWorking);
//		modifier.assignDemarcationToRole(roleDesigner, demarcationDesigning);
//		modifier.assignDemarcationToRole(roleHeadDesigner, demarcationManagingPeople);
//		modifier.assignDemarcationToRole(roleHeadDesigner, demarcationManagingStock);
//		modifier.assignDemarcationToRole(roleOperationsManager, demarcationManagingPeople);
//		modifier.assignDemarcationToRole(roleOperationsManager, demarcationManagingStock);
//		modifier.assignDemarcationToRole(roleDirector, demarcationManaging);
//		modifier.assignDemarcationToRole(roleGuard, demarcationGuarding);
//		modifier.assignDemarcationToRole(roleCleaner, demarcationCleaning);
//		modifier.assignDemarcationToRole(roleVisitor, demarcationVisiting);
//		modifier.assignDemarcationToRole(roleVisitor, demarcationTakingABreak);

		// Add Demarcation-Permission relation
		Arrays.asList(permissionLobby, permissionOpenOffice, permissionRestaurant, permissionMeetingRoom1, permissionMeetingRoom2, permissionToiletsOpenOffice).forEach(p -> {
					try {
						modifier.assignPermissionToDemarcation(demarcationWorking, p);
					} catch (ModelManipulationException e) {
						e.printStackTrace();
					}
				}
		);
		modifier.assignPermissionToDemarcation(demarcationDesigning, permissionWorkshop);
		modifier.assignPermissionToDemarcation(demarcationDesigning, permissionStorage);
		modifier.assignPermissionToDemarcation(demarcationDesigning, permissionToiletsWorkshop);

		Arrays.asList(permissionLobby,permissionOpenOffice,permissionRestaurant,permissionStorage,permissionMeetingRoom1,
				permissionMeetingRoom2,permissionOffice1,permissionOffice2,permissionToiletsOpenOffice, permissionWorkshop,
				permissionToiletsWorkshop)
				.forEach(p -> {
					try {
						modifier.assignPermissionToDemarcation(demarcationManagingPeople, p);
					} catch (ModelManipulationException e) {
						e.printStackTrace();
					}
				});

		modifier.assignPermissionToDemarcation(demarcationManagingFinances, permissionVault);
		modifier.assignPermissionToDemarcation(demarcationManagingStock, permissionStorage);

		modifier.assignPermissionToDemarcation(demarcationGuarding, permissionOffice1);
		modifier.assignPermissionToDemarcation(demarcationGuarding, permissionOffice2);
		modifier.assignPermissionToDemarcation(demarcationGuarding, permissionStorage);
		modifier.assignPermissionToDemarcation(demarcationGuarding, permissionWorkshop);
		modifier.assignPermissionToDemarcation(demarcationGuarding, permissionToiletsWorkshop);

		modifier.assignPermissionToDemarcation(demarcationCleaning, permissionOffice1);
		modifier.assignPermissionToDemarcation(demarcationCleaning, permissionOffice2);
		modifier.assignPermissionToDemarcation(demarcationCleaning, permissionStorage);
		modifier.assignPermissionToDemarcation(demarcationCleaning, permissionWorkshop);
		modifier.assignPermissionToDemarcation(demarcationCleaning, permissionToiletsWorkshop);

		modifier.assignPermissionToDemarcation(demarcationVisiting, permissionToiletsWorkshop);
		modifier.assignPermissionToDemarcation(demarcationVisiting, permissionLobby);
		modifier.assignPermissionToDemarcation(demarcationVisiting, permissionWorkshop);

		modifier.assignPermissionToDemarcation(demarcationTakingABreak, permissionRestaurant);

		modifier.addTemporalGrantRule(workingHours, "PE1", roleEmployee, demarcationWorking, true, 3);;
		modifier.addTemporalGrantRule(workingHours, "PE2", roleDesigner, demarcationDesigning, true, 3);
		modifier.addTemporalGrantRule(workingHours, "PE3", roleHeadDesigner, demarcationManagingPeople, true, 3);
		modifier.addTemporalGrantRule(workingHours, "PE4", roleHeadDesigner, demarcationManagingStock, true, 3);
		modifier.addTemporalGrantRule(workingHours, "PE5", roleOperationsManager, demarcationManagingPeople, true, 3);
		modifier.addTemporalGrantRule(workingHours, "PE6", roleOperationsManager, demarcationManagingStock, true, 3);
		modifier.addTemporalGrantRule(workingHours, "PE7", roleDirector, demarcationManaging, true, 3);
		modifier.addTemporalGrantRule(guardShifts, "PE8", roleGuard, demarcationGuarding, true, 3);
		modifier.addTemporalGrantRule(cleaningShifts, "PE9", roleCleaner, demarcationCleaning, true, 3);
		modifier.addTemporalGrantRule(visitingHours, "PE10", roleVisitor, demarcationVisiting, true, 3);
		modifier.addTemporalGrantRule(lunchBreaks, "PE11", roleVisitor, demarcationTakingABreak, true, 3);

		// Add Trebla Building
		SecurityZone szLobby = modifier.addSecurityZone("LobbyZone", true);
		modifier.assignObjectToPermission(permissionLobby, szLobby);

		SecurityZone szToiletsWorkshop = modifier.addSecurityZone("ToiletsWorkshopZone", false);
		SecurityZone szWorkshop = modifier.addSecurityZone("WorkshopZone", false);
		SecurityZone szStorage = modifier.addSecurityZone("StorageZone", false);
		modifier.assignObjectToPermission(permissionToiletsWorkshop, szToiletsWorkshop);
		modifier.assignObjectToPermission(permissionWorkshop, szWorkshop);
		modifier.assignObjectToPermission(permissionStorage, szStorage);

		SecurityZone szOpenOffice = modifier.addSecurityZone("OpenOfficeZone", false);
		SecurityZone szToiletsOpenOffice = modifier.addSecurityZone("ToiletsOpenOfficeZone", false);
		SecurityZone szVault = modifier.addSecurityZone("VaultZone", false);
		SecurityZone szOffice1 = modifier.addSecurityZone("Office1Zone", false);
		SecurityZone szOffice2 = modifier.addSecurityZone("Office2Zone", false);
		SecurityZone szMeetingRoom1 = modifier.addSecurityZone("MeetingRoom1Zone", false);
		SecurityZone szMeetingRoom2 = modifier.addSecurityZone("MeetingRoom2Zone", false);
		SecurityZone szRestaurantZone = modifier.addSecurityZone("RestaurantZone", false);

		modifier.assignObjectToPermission(permissionOpenOffice, szOpenOffice);
		modifier.assignObjectToPermission(permissionToiletsOpenOffice, szToiletsOpenOffice);
		modifier.assignObjectToPermission(permissionVault, szVault);
		modifier.assignObjectToPermission(permissionOffice1, szOffice1);
		modifier.assignObjectToPermission(permissionOffice2, szOffice2);
		modifier.assignObjectToPermission(permissionMeetingRoom1, szMeetingRoom1);
		modifier.assignObjectToPermission(permissionMeetingRoom2, szMeetingRoom2);
		modifier.assignObjectToPermission(permissionRestaurant, szRestaurantZone);

		modifier.setBidirectionalReachability(szLobby, szWorkshop);
		modifier.setBidirectionalReachability(szWorkshop, szToiletsWorkshop);
		modifier.setBidirectionalReachability(szWorkshop, szStorage);
		modifier.setBidirectionalReachability(szLobby, szOpenOffice);
		modifier.setBidirectionalReachability(szOpenOffice, szVault);
		modifier.setBidirectionalReachability(szOpenOffice, szMeetingRoom1);
		modifier.setBidirectionalReachability(szOpenOffice, szMeetingRoom2);
		modifier.setBidirectionalReachability(szOpenOffice, szOffice1);
		modifier.setBidirectionalReachability(szOpenOffice, szOffice2);
		modifier.setBidirectionalReachability(szOpenOffice, szRestaurantZone);
		modifier.setBidirectionalReachability(szOpenOffice, szToiletsOpenOffice);

		// Add Constraints
		modifier.addBoDUPConstraint("ToiletBreak1", permissionWorkshop, permissionToiletsWorkshop, always);
		modifier.addBoDUPConstraint("ToiletBreak2", permissionOpenOffice, permissionToiletsOpenOffice, always);

		resource.save(Collections.emptyMap());

		modifier.dispose();

		System.out.println("Done!");
	}
}
