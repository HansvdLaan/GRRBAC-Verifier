import com.vanderhighway.grrbac.aggregators.Scenario;
import com.vanderhighway.grrbac.core.CoreUtils;
import com.vanderhighway.grrbac.core.modifier.PolicyAutomaticModifier;
import com.vanderhighway.grrbac.core.modifier.PolicyModifier;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import com.vanderhighway.grrbac.patterns.*;
import org.apache.log4j.Level;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchEMFBackendFactory;
import org.eclipse.viatra.query.runtime.rete.matcher.DRedReteBackendFactory;
import org.eclipse.viatra.query.runtime.rete.matcher.TimelyReteBackendFactory;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TemporalAuthenticationTests {

    static URI uriEmptySchedules;
    private static Resource emptyScheduleResourceMaster; //loaded version, make a copy for test cases!
    private static Resource emptyScheduleResource; //copied version of emptyScheduleResourceMaster for test cases.

    @Extension
    private GRRBACPackage ePackage = GRRBACPackage.eINSTANCE;

    private static CoreUtils utils;
    private static AdvancedViatraQueryEngine engine;
    private static PolicyModifier modifier;
    private static PolicyAutomaticModifier automaticModifier;

    // Test Data
    User user1,user2,user3,user4;
    Role employee,manager;
    Demarcation demRed, demBrown, demAmber, demGreen;
    Permission openOffice,breakRoom,kitchen,safe,lobby;
    SecurityZone lobbySZ,openOfficeSZ,breakRoomSZ,kitchenSZ,safeSZ;
    TemporalContext always,lunchBreaks,holidays,workingHours;

    @BeforeAll
    static void setup() throws ParseException, ModelManipulationException {
        GRRBACPackage.eINSTANCE.getName();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("trbac", new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

        uriEmptySchedules = URI.createFileURI("./src/test/resources/models/shared/simple_company2.grrbac");
        ResourceSet set = new ResourceSetImpl();
        emptyScheduleResourceMaster = set.getResource(uriEmptySchedules, true);
        utils = new CoreUtils();
        utils.addMissingDaySchedules(emptyScheduleResourceMaster, (SiteAccessControlSystem) emptyScheduleResourceMaster.getContents().get(0));
    }

    @BeforeEach
    void init() throws ParseException, ModelManipulationException, InvocationTargetException {
        emptyScheduleResource = new ResourceSetImpl().createResource( URI.createFileURI("test.trbac"));
        emptyScheduleResource.getContents().add(EcoreUtil.copy(emptyScheduleResourceMaster.getContents().get(0)));
        System.out.println(emptyScheduleResource);

        ViatraQueryEngineOptions options = ViatraQueryEngineOptions.defineOptions()
                .withDefaultBackend(DRedReteBackendFactory.INSTANCE)
                //.withDefaultBackend(DRedReteBackendFactory.INSTANCE)
                //.withDefaultCachingBackend(DRedReteBackendFactory.INSTANCE)
                //.withDefaultSearchBackend(LocalSearchEMFBackendFactory.INSTANCE)
                .build();
        engine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(emptyScheduleResource), options);
        ViatraQueryLoggingUtil.getDefaultLogger().setLevel(Level.OFF);
        modifier = new PolicyModifier(engine, (SiteAccessControlSystem) emptyScheduleResource.getContents().get(0), emptyScheduleResource);
        modifier.setInstanceIDCounter(utils.getInstanceIDCounter());
        automaticModifier = new PolicyAutomaticModifier(engine, modifier, (SiteAccessControlSystem) emptyScheduleResource.getContents().get(0));

        automaticModifier.initialize();
        automaticModifier.execute();

        user1 = (User) modifier.getResource().getEObject("User1");
        user2 = (User) modifier.getResource().getEObject("User2");
        user3 = (User) modifier.getResource().getEObject("User3");
        user4 = (User) modifier.getResource().getEObject("User4");

        employee = (Role) modifier.getResource().getEObject("Employee");
        manager = (Role) modifier.getResource().getEObject("Manager");

        demRed = (Demarcation) modifier.getResource().getEObject("Red");
        demBrown = (Demarcation) modifier.getResource().getEObject("Brown");
        demAmber = (Demarcation) modifier.getResource().getEObject("Amber");
        demGreen = (Demarcation) modifier.getResource().getEObject("Green");

        openOffice = (Permission) modifier.getResource().getEObject("OpenOffice");
        breakRoom = (Permission) modifier.getResource().getEObject("BreakRoom");
        kitchen = (Permission) modifier.getResource().getEObject("Kitchen");
        safe = (Permission) modifier.getResource().getEObject("Safe");
        lobby = (Permission) modifier.getResource().getEObject("Lobby");

        openOfficeSZ = (SecurityZone) modifier.getResource().getEObject("ZoneOpenOffice");
        breakRoomSZ = (SecurityZone) modifier.getResource().getEObject("ZoneBreakRoom");
        kitchenSZ = (SecurityZone) modifier.getResource().getEObject("ZoneKitchen");
        safeSZ = (SecurityZone) modifier.getResource().getEObject("ZoneSafe");
        lobbySZ = (SecurityZone) modifier.getResource().getEObject("ZoneLobby");

        always = (TemporalContext) modifier.getResource().getEObject("Always");
        lunchBreaks = (TemporalContext) modifier.getResource().getEObject("LunchBreaks");
        holidays = (TemporalContext) modifier.getResource().getEObject("Holidays");
        workingHours = (TemporalContext) modifier.getResource().getEObject("WorkingHours");
    }

    @Test
    public void emptyPolicy() {

    }

    @Test
    public void basicPolicyAccessStatusTest() throws InvocationTargetException, ModelManipulationException {

        assertAccessStatus(workingHours, lobbySZ, AuthenticationStatus.UNLOCKED.getStatusCode());
        assertAccessStatus(workingHours, openOfficeSZ, AuthenticationStatus.PROTECTED.getStatusCode());
        assertAccessStatus(workingHours, breakRoomSZ, AuthenticationStatus.PROTECTED.getStatusCode());
        assertAccessStatus(workingHours, kitchenSZ, AuthenticationStatus.PROTECTED.getStatusCode());
        assertAccessStatus(workingHours, safeSZ, AuthenticationStatus.PROTECTED.getStatusCode());
        
        TemporalAuthenticationRule tar1 = modifier.addTemporalAuthenticationRule(always, "TAR1", lobbySZ, AuthenticationStatus.PROTECTED.getStatusCode(), 2);
        assertAccessStatus(always, AuthenticationStatus.PROTECTED.getStatusCode()); //Everything should be protected now!

        TemporalAuthenticationRule tar2 = modifier.addTemporalAuthenticationRule(always, "TAR2", lobbySZ, AuthenticationStatus.LOCKED.getStatusCode(), 2);
        assertAccessStatus(always, lobbySZ, AuthenticationStatus.LOCKED.getStatusCode());

        TemporalAuthenticationRule tar3 = modifier.addTemporalAuthenticationRule(always, "TAR3", openOfficeSZ, AuthenticationStatus.LOCKED.getStatusCode(), 2);
        TemporalAuthenticationRule tar4 = modifier.addTemporalAuthenticationRule(always, "TAR4", breakRoomSZ, AuthenticationStatus.LOCKED.getStatusCode(), 2);
        TemporalAuthenticationRule tar5 = modifier.addTemporalAuthenticationRule(always, "TAR5", kitchenSZ, AuthenticationStatus.LOCKED.getStatusCode(), 2);

        assertAccessStatus(always, lobbySZ, AuthenticationStatus.LOCKED.getStatusCode());
        assertAccessStatus(always, openOfficeSZ, AuthenticationStatus.LOCKED.getStatusCode());
        assertAccessStatus(always, breakRoomSZ, AuthenticationStatus.LOCKED.getStatusCode());
        assertAccessStatus(always, kitchenSZ, AuthenticationStatus.LOCKED.getStatusCode());
        assertAccessStatus(workingHours, safeSZ, AuthenticationStatus.PROTECTED.getStatusCode());

        TemporalAuthenticationRule tar6 = modifier.addTemporalAuthenticationRule(workingHours, "TAR6", openOfficeSZ, AuthenticationStatus.PROTECTED.getStatusCode(), 3);
        TemporalAuthenticationRule tar7 = modifier.addTemporalAuthenticationRule(workingHours, "TAR7", breakRoomSZ, AuthenticationStatus.PROTECTED.getStatusCode(), 3);
        TemporalAuthenticationRule tar8 = modifier.addTemporalAuthenticationRule(workingHours, "TAR8", kitchenSZ, AuthenticationStatus.PROTECTED.getStatusCode(), 3);
        TemporalAuthenticationRule tar9 = modifier.addTemporalAuthenticationRule(workingHours, "TAR9", lobbySZ, AuthenticationStatus.UNLOCKED.getStatusCode(), 3);
        TemporalAuthenticationRule tar10 = modifier.addTemporalAuthenticationRule(workingHours, "TAR10", safeSZ, AuthenticationStatus.LOCKED.getStatusCode(), 3);


        assertAccessStatus(workingHours, lobbySZ, AuthenticationStatus.UNLOCKED.getStatusCode());
        assertAccessStatus(workingHours, openOfficeSZ, AuthenticationStatus.PROTECTED.getStatusCode());
        assertAccessStatus(workingHours, breakRoomSZ, AuthenticationStatus.PROTECTED.getStatusCode());
        assertAccessStatus(workingHours, kitchenSZ, AuthenticationStatus.PROTECTED.getStatusCode());
        assertAccessStatus(workingHours, safeSZ, AuthenticationStatus.LOCKED.getStatusCode());

        TemporalAuthenticationRule tar11 = modifier.addTemporalAuthenticationRule(holidays, "TAR11", lobbySZ, AuthenticationStatus.PROTECTED.getStatusCode(), 3);
        assertAccessStatus(holidays, lobbySZ, AuthenticationStatus.PROTECTED.getStatusCode());
    }

    @Test
    public void basicPolicyReachabilityTest() throws InvocationTargetException, ModelManipulationException {
        automaticModifier.initialize();
        automaticModifier.execute();

        Scenario scenA = new Scenario(Arrays.asList(always));
        Scenario scenWA = new Scenario(Arrays.asList(workingHours, always));
        Scenario scenWLA = new Scenario(Arrays.asList(workingHours, lunchBreaks, always));
        Scenario scenWLAH = new Scenario(Arrays.asList(workingHours, lunchBreaks, always, holidays));

        assertReachability(scenA, user1, new HashSet<>(Arrays.asList(lobbySZ)));
        assertReachability(scenWLA, user1, new HashSet<>(Arrays.asList(lobbySZ, openOfficeSZ, breakRoomSZ, kitchenSZ, safeSZ)));
        assertReachability(scenWLAH, user1, new HashSet<>(Arrays.asList(lobbySZ, openOfficeSZ, breakRoomSZ, kitchenSZ, safeSZ)));
        assertReachability(scenWLA, user2, new HashSet<>(Arrays.asList(lobbySZ, openOfficeSZ, breakRoomSZ, kitchenSZ)));
        assertReachability(scenWLAH, user2, new HashSet<>(Arrays.asList(lobbySZ)));
        assertReachability(scenWLA, user3, new HashSet<>(Arrays.asList(lobbySZ)));
        assertReachability(scenWLAH, user3, new HashSet<>(Arrays.asList(lobbySZ)));

        TemporalAuthenticationRule tar1 = modifier.addTemporalAuthenticationRule(always, "TAR1", lobbySZ, AuthenticationStatus.PROTECTED.getStatusCode(), 2);

        assertReachability(scenA, user1, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLA, user1, new HashSet<>(Arrays.asList(lobbySZ, openOfficeSZ, breakRoomSZ, kitchenSZ, safeSZ)));
        assertReachability(scenWLAH, user1, new HashSet<>(Arrays.asList(lobbySZ, openOfficeSZ, breakRoomSZ, kitchenSZ, safeSZ)));
        assertReachability(scenWLA, user2, new HashSet<>(Arrays.asList(lobbySZ, openOfficeSZ, breakRoomSZ, kitchenSZ)));
        assertReachability(scenWLAH, user2, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLA, user3, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLAH, user3, new HashSet<>(Arrays.asList()));

        TemporalAuthenticationRule tar3 = modifier.addTemporalAuthenticationRule(always, "TAR2", lobbySZ, AuthenticationStatus.LOCKED.getStatusCode(), 2);

        assertReachability(scenA, user1, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLA, user1, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLAH, user1, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLA, user2, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLAH, user2, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLA, user3, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLAH, user3, new HashSet<>(Arrays.asList()));

        TemporalAuthenticationRule tar4 = modifier.addTemporalAuthenticationRule(always, "TAR3", openOfficeSZ, AuthenticationStatus.LOCKED.getStatusCode(), 2);
        TemporalAuthenticationRule tar5 = modifier.addTemporalAuthenticationRule(always, "TAR4", breakRoomSZ, AuthenticationStatus.LOCKED.getStatusCode(), 2);
        TemporalAuthenticationRule tar6 = modifier.addTemporalAuthenticationRule(always, "TAR5", kitchenSZ, AuthenticationStatus.LOCKED.getStatusCode(), 2);

        assertReachability(scenA, user1, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLA, user1, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLAH, user1, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLA, user2, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLAH, user2, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLA, user3, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLAH, user3, new HashSet<>(Arrays.asList()));

        TemporalAuthenticationRule tar7 = modifier.addTemporalAuthenticationRule(workingHours, "TAR6", openOfficeSZ, AuthenticationStatus.PROTECTED.getStatusCode(), 3);
        TemporalAuthenticationRule tar8 = modifier.addTemporalAuthenticationRule(workingHours, "TAR7", breakRoomSZ, AuthenticationStatus.PROTECTED.getStatusCode(), 3);
        TemporalAuthenticationRule tar9 = modifier.addTemporalAuthenticationRule(workingHours, "TAR8", kitchenSZ, AuthenticationStatus.PROTECTED.getStatusCode(), 3);

        assertReachability(scenA, user1, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLA, user1, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLAH, user1, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLA, user2, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLAH, user2, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLA, user3, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLAH, user3, new HashSet<>(Arrays.asList()));

        TemporalAuthenticationRule tar10 = modifier.addTemporalAuthenticationRule(workingHours, "TAR9", lobbySZ, AuthenticationStatus.UNLOCKED.getStatusCode(), 3);

        assertReachability(scenA, user1, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLA, user1, new HashSet<>(Arrays.asList(lobbySZ, openOfficeSZ, breakRoomSZ, kitchenSZ, safeSZ)));
        assertReachability(scenWLAH, user1, new HashSet<>(Arrays.asList(lobbySZ, openOfficeSZ, breakRoomSZ, kitchenSZ, safeSZ)));
        assertReachability(scenWLA, user2, new HashSet<>(Arrays.asList(lobbySZ, openOfficeSZ, breakRoomSZ, kitchenSZ)));
        assertReachability(scenWLAH, user2, new HashSet<>(Arrays.asList(lobbySZ)));
        assertReachability(scenWLA, user3, new HashSet<>(Arrays.asList(lobbySZ)));
        assertReachability(scenWLAH, user3, new HashSet<>(Arrays.asList(lobbySZ)));

        TemporalAuthenticationRule tar11 = modifier.addTemporalAuthenticationRule(holidays, "TAR10", lobbySZ, AuthenticationStatus.PROTECTED.getStatusCode(), 3);

        assertReachability(scenA, user1, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLA, user1, new HashSet<>(Arrays.asList(lobbySZ, openOfficeSZ, breakRoomSZ, kitchenSZ, safeSZ)));
        assertReachability(scenWLAH, user1, new HashSet<>(Arrays.asList(lobbySZ, openOfficeSZ, breakRoomSZ, kitchenSZ, safeSZ)));
        assertReachability(scenWLA, user2, new HashSet<>(Arrays.asList(lobbySZ, openOfficeSZ, breakRoomSZ, kitchenSZ)));
        assertReachability(scenWLAH, user2, new HashSet<>(Arrays.asList()));
        assertReachability(scenWLA, user3, new HashSet<>(Arrays.asList(lobbySZ)));
        assertReachability(scenWLAH, user3, new HashSet<>(Arrays.asList()));
    }

    public void assertAccessStatus(TemporalContext context, int expectedStatus) {
        assertAccessStatus(context, null, expectedStatus);
    }

    public void assertAccessStatus(TemporalContext context, SecurityZone zone, int expectedStatus) {
        Set<Scenario> scenarios = ScenarioTemporalContext.instance().getMatcher(engine).getAllMatches(
                ScenarioTemporalContext.Match.newMatch(null, context))
                .stream().map(m -> m.getScenario()).collect(Collectors.toSet());
        for (Scenario scenario: scenarios) {
           assertAccessStatus(scenario, zone, expectedStatus);
        }
    }

    public void assertAccessStatus(Scenario scenario, SecurityZone zone, int expectedStatus) {
        SecurityZoneAccessStatus.instance().getMatcher(engine).getAllMatches(scenario, zone, null).forEach(
                m -> assertEquals(expectedStatus, m.getStatus(), "unexpected status for scenario " + scenario.toString() + " and zone " + m.getZone())
        );
    }

    public void assertReachability(Scenario scenario, User user, Set<SecurityZone> expectedReachableSet) {
        Set<SecurityZone> actualReachableSet = SecurityZoneAccessible.instance().getMatcher(engine).getAllValuesOfzone(user, scenario);
        for (SecurityZone zone: expectedReachableSet) {
            assertTrue(actualReachableSet.contains(zone), "Zone " + zone + " is not reachable by user " + user.getName() + " during scenario " + scenario.toString());
        }
        for (SecurityZone zone: actualReachableSet) {
            assertTrue(expectedReachableSet.contains(zone), "Zone " + zone + " is reachable by user " + user.getName() + " during scenario " + scenario.toString());
        }
    }

}
