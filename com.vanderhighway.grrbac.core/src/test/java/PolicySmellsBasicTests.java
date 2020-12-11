import com.vanderhighway.grrbac.core.CoreUtils;
import com.vanderhighway.grrbac.core.modifier.PolicyAutomaticModifier;
import com.vanderhighway.grrbac.core.modifier.PolicyModifier;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import com.vanderhighway.grrbac.patterns.*;
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
import org.eclipse.viatra.query.runtime.rete.matcher.DRedReteBackendFactory;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PolicySmellsBasicTests {

    static URI uriEmptySchedules;
    private static Resource emptyScheduleResourceMaster; //loaded version, make a copy for test cases!
    private static Resource emptyScheduleResource; //copied version of emptyScheduleResourceMaster for test cases.

    @Extension
    private GRRBACPackage ePackage = GRRBACPackage.eINSTANCE;

    private static CoreUtils utils;
    private static AdvancedViatraQueryEngine engine;
    private static PolicyModifier modifier;
    private static PolicyAutomaticModifier automaticModifier;

    @BeforeAll
    static void setup() throws ParseException, ModelManipulationException {
        GRRBACPackage.eINSTANCE.getName();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("trbac", new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

        uriEmptySchedules = URI.createFileURI("./src/test/resources/models/shared/simple_company.grrbac");
        ResourceSet set = new ResourceSetImpl();
        emptyScheduleResourceMaster = set.getResource(uriEmptySchedules, true);
        utils = new CoreUtils();
        utils.addMissingDaySchedules(emptyScheduleResourceMaster, (SiteAccessControlSystem) emptyScheduleResourceMaster.getContents().get(0));
    }

    @BeforeEach
    void init() throws ParseException, ModelManipulationException {
        emptyScheduleResource = new ResourceSetImpl().createResource( URI.createFileURI("test.trbac"));
        emptyScheduleResource.getContents().add(EcoreUtil.copy(emptyScheduleResourceMaster.getContents().get(0)));
        System.out.println(emptyScheduleResource);

        ViatraQueryEngineOptions options = ViatraQueryEngineOptions.defineOptions()
                .withDefaultBackend(DRedReteBackendFactory.INSTANCE)
                //.withDefaultCachingBackend(DRedReteBackendFactory.INSTANCE)
                //.withDefaultSearchBackend(LocalSearchEMFBackendFactory.INSTANCE)
                .build();
        engine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(emptyScheduleResource), options);
        modifier = new PolicyModifier(engine, (SiteAccessControlSystem) emptyScheduleResource.getContents().get(0), emptyScheduleResource);
        modifier.setInstanceIDCounter(utils.getInstanceIDCounter());
        automaticModifier = new PolicyAutomaticModifier(engine, modifier, (SiteAccessControlSystem) emptyScheduleResource.getContents().get(0));
    }

    @Test
    public void emptyPolicy() throws InvocationTargetException {
        automaticModifier.initialize();
        automaticModifier.execute();
    }

    @Test
    public void basicPolicySmellsTest() throws InvocationTargetException, ModelManipulationException {
        automaticModifier.initialize();
        automaticModifier.execute();

        User user1 = (User) modifier.getResource().getEObject("User1");
        User user2 = (User) modifier.getResource().getEObject("User2");
        User user3 = (User) modifier.getResource().getEObject("User3");
        User user4 = (User) modifier.getResource().getEObject("User4");

        Role employee = (Role) modifier.getResource().getEObject("Employee");
        Role manager = (Role) modifier.getResource().getEObject("Manager");

        Demarcation canteen = (Demarcation) modifier.getResource().getEObject("Canteen");
        Demarcation office = (Demarcation) modifier.getResource().getEObject("Office");

        Permission openOffice = (Permission) modifier.getResource().getEObject("OpenOffice");
        Permission breakRoom = (Permission) modifier.getResource().getEObject("BreakRoom");
        Permission kitchen = (Permission) modifier.getResource().getEObject("Kitchen");

        TemporalContext always = (TemporalContext) modifier.getResource().getEObject("Always");
        TemporalContext holidays = (TemporalContext) modifier.getResource().getEObject("Holidays");
        TemporalContext workingHours = (TemporalContext) modifier.getResource().getEObject("WorkingHours");

        assertNumberOfMatches(UnusedRole.instance(), 0);
        assertNumberOfMatches(UnusedDemarcation.instance(), 0);
        assertNumberOfMatches(UnusedPermission.instance(), 0);
        assertNumberOfMatches(ZombieDemarcation.instance(), 0);
        assertNumberOfMatches(ZombiePermission.instance(), 0);
        assertNumberOfMatches(GodUser.instance(), 0);
        assertNumberOfMatches(GodRole.instance(), 0);
        assertNumberOfMatches(IgnoredRoleInheritance.instance(), 0);
        assertNumberOfMatches(IgnoredDemarcationInheritance.instance(), 0);

        modifier.addTemporalGrantRule(always, "grant_everything1", manager, office, true, 10);
        modifier.addTemporalGrantRule(always, "grant_everything1", manager, canteen, true, 10);

        assertNumberOfMatches(UnusedRole.instance(), 0);
        assertNumberOfMatches(UnusedDemarcation.instance(), 0);
        assertNumberOfMatches(UnusedPermission.instance(), 0);
        assertNumberOfMatches(ZombieDemarcation.instance(), 0);
        assertNumberOfMatches(ZombiePermission.instance(), 0);
        assertNumberOfMatches(GodUser.instance(), 1);
        assertNumberOfMatches(GodRole.instance(), 1);
        assertNumberOfMatches(IgnoredRoleInheritance.instance(), 0);
        assertNumberOfMatches(IgnoredDemarcationInheritance.instance(), 0);

        Role dummyRole = (Role) modifier.addRole("DummyRole");
        Demarcation dummyDemarcation = modifier.addDemarcation("DummyDemarcation");
        Permission dummyPermission = modifier.addPermission("DummyPermission");

        assertNumberOfMatches(UnusedRole.instance(), 1);
        assertNumberOfMatches(UnusedDemarcation.instance(), 1);
        assertNumberOfMatches(UnusedPermission.instance(), 1);
        assertNumberOfMatches(ZombieDemarcation.instance(), 0); // Unused != Zombie
        assertNumberOfMatches(ZombiePermission.instance(), 0);
        assertNumberOfMatches(GodUser.instance(), 0);
        assertNumberOfMatches(GodRole.instance(), 0);
        assertNumberOfMatches(IgnoredRoleInheritance.instance(), 0);
        assertNumberOfMatches(IgnoredDemarcationInheritance.instance(), 0);

        modifier.addRoleInheritance(dummyRole, employee);
        modifier.addDemarcationInheritance(dummyDemarcation, office);
        modifier.assignPermissionToDemarcation(dummyDemarcation, dummyPermission);

        assertNumberOfMatches(UnusedRole.instance(), 0);
        assertNumberOfMatches(UnusedDemarcation.instance(), 0);
        assertNumberOfMatches(UnusedPermission.instance(), 0);
        assertNumberOfMatches(ZombieDemarcation.instance(), 0);
        assertNumberOfMatches(ZombiePermission.instance(), 0);
        assertNumberOfMatches(IgnoredRoleInheritance.instance(), 0);
        assertNumberOfMatches(IgnoredDemarcationInheritance.instance(), 0);

        modifier.assignRoleToUser(user2, dummyRole);
        modifier.addTemporalGrantRule(workingHours, "grant_dummy_working_hours", employee, dummyDemarcation, true, 3);
        modifier.addTemporalGrantRule(holidays, "deny_dummy_holiday", employee, dummyDemarcation, false, 3);

        assertNumberOfMatches(UnusedRole.instance(), 0);
        assertNumberOfMatches(UnusedDemarcation.instance(), 0);
        assertNumberOfMatches(UnusedPermission.instance(), 0);
        assertNumberOfMatches(ZombieDemarcation.instance(), 0);
        assertNumberOfMatches(ZombiePermission.instance(), 0);
        assertNumberOfMatches(IgnoredRoleInheritance.instance(), 1);
        assertNumberOfMatches(IgnoredDemarcationInheritance.instance(), 1); //TODO; look at defintion of this. Is this really what we want?

        modifier.addTemporalGrantRule(always, "rule_deny_everything1", employee, office, false, 10);
        modifier.addTemporalGrantRule(always, "rule_deny_everything2", employee, canteen, false, 10);
        modifier.addTemporalGrantRule(always, "rule_deny_everything3", manager, office, false, 10);
        modifier.addTemporalGrantRule(always, "rule_deny_everything4", manager, canteen, false, 10);
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        assertNumberOfMatches(UnusedRole.instance(), 0);
        assertNumberOfMatches(UnusedDemarcation.instance(), 0);
        assertNumberOfMatches(UnusedPermission.instance(), 0);
        assertNumberOfMatches(ZombieDemarcation.instance(), 2);
        assertNumberOfMatches(ZombiePermission.instance(), 3);
        assertNumberOfMatches(IgnoredRoleInheritance.instance(), 1);
        assertNumberOfMatches(IgnoredDemarcationInheritance.instance(), 0);
    }

    public void assertNumberOfMatches(BaseGeneratedEMFQuerySpecification pattern, int expectedCount) {
        assertEquals(expectedCount, pattern.getMatcher(modifier.getEngine()).getAllMatches().stream().count());
    }

}
