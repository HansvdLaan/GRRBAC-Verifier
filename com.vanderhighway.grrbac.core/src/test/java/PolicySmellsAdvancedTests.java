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
import org.eclipse.viatra.query.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchEMFBackendFactory;
import org.eclipse.viatra.query.runtime.rete.matcher.DRedReteBackendFactory;
import org.eclipse.viatra.query.runtime.rete.matcher.TimelyConfiguration;
import org.eclipse.viatra.query.runtime.rete.matcher.TimelyReteBackendFactory;
import org.eclipse.viatra.query.runtime.rete.util.ReteHintOptions;
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

public class PolicySmellsAdvancedTests {

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

    /*
    TGR1 priority="3" enable="true" role="Employee" demarcation="Green" temporalContext="WorkingHours"
    TGR2 priority="3" enable="true" role="Employee" demarcation="Amber" temporalContext="WorkingHours"
    TGR3 priority="3" enable="true" role="Employee" demarcation="Brown" temporalContext="WorkingHours"
    TGR4 priority="3" role="Employee" demarcation="Green" temporalContext="Holidays"
    TGR5 priority="3" role="Employee" demarcation="Amber" temporalContext="Holidays"
    TGR6 priority="3" role="Employee" demarcation="Brown" temporalContext="Holidays"
    TGR7 priority="3" enable="true" role="Manager" demarcation="Red" temporalContext="WorkingHours"
    TGR8 priority="3" enable="true" role="Manager" demarcation="Brown" temporalContext="WorkingHours"
    TGR9 priority="3" enable="true" role="Manager" demarcation="Amber" temporalContext="WorkingHours"
    Amber -> {OpenOffice,BreakRoom}, Brown -> {Kitchen}
    Red -> {Safe}, Green -> {Lobby}
    scenarios = {  }
    Lobby <-> OpenOffice <-> BreakRoom <-> Kitchen
    BreakRoom <-> Safe
    */
    @Test
    public void contextualSmellsTest() throws InvocationTargetException, ModelManipulationException {
        automaticModifier.initialize();
        automaticModifier.execute();

        Scenario scenA = new Scenario(Arrays.asList(always));
        Scenario scenWA = new Scenario(Arrays.asList(workingHours, always));
        Scenario scenWLA = new Scenario(Arrays.asList(workingHours, lunchBreaks, always));
        Scenario scenWLAH = new Scenario(Arrays.asList(workingHours, lunchBreaks, always, holidays));

        assertNumberOfMatches(UninvocablePermission.instance(), 0);
        assertNumberOfMatches(UserCanGetTrapped.instance(), 0);

        TemporalAuthenticationRule tar1 = modifier.addTemporalAuthenticationRule(always, "TAR1", lobbySZ, AuthenticationStatus.PROTECTED.getStatusCode(), 2);

        assertNumberOfMatches(UninvocablePermission.instance(), 0);
        assertNumberOfMatches(UserCanGetTrapped.instance(), 0);

        TemporalAuthenticationRule tar2 = modifier.addTemporalAuthenticationRule(always, "TAR2", lobbySZ, AuthenticationStatus.LOCKED.getStatusCode(), 2);

        assertNumberOfMatches(UninvocablePermission.instance(), 22); // |USP| == 28
        assertNumberOfMatches(UserCanGetTrapped.instance(), 0);

        TemporalAuthenticationRule tar3 = modifier.addTemporalAuthenticationRule(always, "TAR3", openOfficeSZ, AuthenticationStatus.LOCKED.getStatusCode(), 2);
        TemporalAuthenticationRule tar4 = modifier.addTemporalAuthenticationRule(always, "TAR4", breakRoomSZ, AuthenticationStatus.LOCKED.getStatusCode(), 2);
        TemporalAuthenticationRule tar5 = modifier.addTemporalAuthenticationRule(always, "TAR5", kitchenSZ, AuthenticationStatus.LOCKED.getStatusCode(), 2);

        assertNumberOfMatches(UninvocablePermission.instance(), 4); // There are 4 scenarios in which the manager can access the safe!
        assertNumberOfMatches(UserCanGetTrapped.instance(), 0);

        TemporalAuthenticationRule tar6 = modifier.addTemporalAuthenticationRule(workingHours, "TAR6", openOfficeSZ, AuthenticationStatus.PROTECTED.getStatusCode(), 3);
        TemporalAuthenticationRule tar7 = modifier.addTemporalAuthenticationRule(workingHours, "TAR7", breakRoomSZ, AuthenticationStatus.PROTECTED.getStatusCode(), 3);
        TemporalAuthenticationRule tar8 = modifier.addTemporalAuthenticationRule(workingHours, "TAR8", kitchenSZ, AuthenticationStatus.PROTECTED.getStatusCode(), 3);

        assertNumberOfMatches(UninvocablePermission.instance(), 22);
        assertNumberOfMatches(UserCanGetTrapped.instance(), 0);

        TemporalAuthenticationRule tar9 = modifier.addTemporalAuthenticationRule(lunchBreaks, "TAR9", safeSZ, AuthenticationStatus.LOCKED.getStatusCode(), 3);

        assertNumberOfMatches(UninvocablePermission.instance(), 20);
        assertNumberOfMatches(UserCanGetTrapped.instance(), 0);

        TemporalAuthenticationRule tar10 = modifier.addTemporalAuthenticationRule(workingHours, "TAR10", lobbySZ, AuthenticationStatus.UNLOCKED.getStatusCode(), 3);

        assertNumberOfMatches(UninvocablePermission.instance(), 0);
        assertNumberOfMatches(UserCanGetTrapped.instance(), 0);

        TemporalAuthenticationRule tar11 = modifier.addTemporalAuthenticationRule(holidays, "TAR11", lobbySZ, AuthenticationStatus.PROTECTED.getStatusCode(), 3);
        TemporalAuthenticationRule tar12 = modifier.addTemporalAuthenticationRule(workingHours, "TAR12", safeSZ, AuthenticationStatus.PROTECTED.getStatusCode(), 4);

        assertNumberOfMatches(UninvocablePermission.instance(), 0);
        assertNumberOfMatches(UserCanGetTrapped.instance(), 0);

        lobbySZ.setPublic(false);

        assertNumberOfMatches(UninvocablePermission.instance(), 28);
        assertNumberOfMatches(UserCanGetTrapped.instance(), 0);

        lobbySZ.setPublic(true);

        assertNumberOfMatches(UninvocablePermission.instance(), 0);
        assertNumberOfMatches(UserCanGetTrapped.instance(), 0);

        modifier.removeReachability(openOfficeSZ, lobbySZ);

        assertNumberOfMatches(UninvocablePermission.instance(), 0);
        assertNumberOfMatches(UserCanGetTrapped.instance(), 22); //22 and not 28 since users can not get stuck in the lobby!

        openOfficeSZ.setPublic(true);

        assertNumberOfMatches(UninvocablePermission.instance(), 0);
        assertNumberOfMatches(UserCanGetTrapped.instance(), 0);

        modifier.setReachability(openOfficeSZ, lobbySZ);
        lobbySZ.setPublic(true);
        openOfficeSZ.setPublic(false);

        modifier.removeDemarcationInheritance(demAmber, demRed);
        modifier.removeRoleInheritance(employee, manager);
        modifier.addTemporalGrantRule(always, "TGR10", manager, demAmber, false, 10);

        assertNumberOfMatches(UninvocablePermission.instance(), 4); // kitchen and safe unaccessible during scenarios containing holidays
        assertNumberOfMatches(UserCanGetTrapped.instance(), 0);

        modifier.deassignRoleFromUser(user1, employee);

        assertNumberOfMatches(UninvocablePermission.instance(), 8);
        assertNumberOfMatches(UserCanGetTrapped.instance(), 0);

        modifier.addTemporalGrantRule(always, "TGR11", manager, demAmber, true, 11);

        assertNumberOfMatches(UninvocablePermission.instance(), 0);
        assertNumberOfMatches(UserCanGetTrapped.instance(), 0);
    }

    public void assertNumberOfMatches(BaseGeneratedEMFQuerySpecification pattern, int expectedCount) {
        assertEquals(expectedCount, pattern.getMatcher(modifier.getEngine()).getAllMatches().stream().count());
    }

}
