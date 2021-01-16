import com.brein.time.timeintervals.intervals.IntegerInterval;
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
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchHints;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.rete.matcher.DRedReteBackendFactory;
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

public class AuthorizationConstraintsTests {

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
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("grrbac", new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

        uriEmptySchedules = URI.createFileURI("./src/test/resources/models/shared/simple_company.grrbac");
        ResourceSet set = new ResourceSetImpl();
        emptyScheduleResourceMaster = set.getResource(uriEmptySchedules, true);
        utils = new CoreUtils();
        utils.addMissingDaySchedules(emptyScheduleResourceMaster, (SiteAccessControlSystem) emptyScheduleResourceMaster.getContents().get(0));
    }

    @BeforeEach
    void init() throws ParseException, ModelManipulationException {
        emptyScheduleResource = new ResourceSetImpl().createResource( URI.createFileURI("test.grrbac"));
        emptyScheduleResource.getContents().add(EcoreUtil.copy(emptyScheduleResourceMaster.getContents().get(0)));
        System.out.println(emptyScheduleResource);

        QueryEvaluationHint localSearchHint = LocalSearchHints.getDefault().build();
        ViatraQueryEngineOptions options = ViatraQueryEngineOptions.defineOptions()
                //.withDefaultHint(localSearchHint)
                //.withDefaultBackend(LocalSearchEMFBackendFactory.INSTANCE)
                .withDefaultCachingBackend(DRedReteBackendFactory.INSTANCE)
                .withDefaultBackend(DRedReteBackendFactory.INSTANCE)
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
    public void basicAuthorizationConstraintTest() throws InvocationTargetException, ModelManipulationException {
        automaticModifier.initialize();
        automaticModifier.execute();

        User user1 = (User) modifier.getResource().getEObject("User1");
        User user2 = (User) modifier.getResource().getEObject("User2");
        User user3 = (User) modifier.getResource().getEObject("User3");
        User user4 = (User) modifier.getResource().getEObject("User4");

        Role employee = (Role) modifier.getResource().getEObject("Employee");
        Role manager = (Role) modifier.getResource().getEObject("Manager");
        Role dummyRole = (Role) modifier.addRole("DummyRole");

        Demarcation canteen = (Demarcation) modifier.getResource().getEObject("Canteen");
        Demarcation office = (Demarcation) modifier.getResource().getEObject("Office");
        Demarcation dummyDemarcation = modifier.addDemarcation("DummyDemarcation");

        Permission openOffice = (Permission) modifier.getResource().getEObject("OpenOffice");
        Permission breakRoom = (Permission) modifier.getResource().getEObject("BreakRoom");
        Permission kitchen = (Permission) modifier.getResource().getEObject("Kitchen");
        Permission dummyPermission = modifier.addPermission("DummyPermission");

        TemporalContext always = (TemporalContext) modifier.getResource().getEObject("Always");
        TemporalContext holidays = (TemporalContext) modifier.getResource().getEObject("Holidays");
        TemporalContext workingHours = (TemporalContext) modifier.getResource().getEObject("WorkingHours");

        modifier.addSoDURConstraint("SoDUR1", employee, manager);
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
        assertNumberOfMatches(SoDURViolation.instance(), 1);

        modifier.addSoDUPConstraint("SoDUP1", openOffice, kitchen, always);

        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
        assertNumberOfMatches(SoDUPViolation.instance(), 3);

        modifier.addBoDURConstraint("BoDUR1", employee, manager);
        assertNumberOfMatches(BoDURViolation.instance(), 1);

        modifier.addBoDUPConstraint("BoDUP1", openOffice, dummyPermission, holidays);
        assertNumberOfMatches(BoDUPViolation.instance(), 1);
        modifier.addBoDUPConstraint("BoDUP2", openOffice, dummyPermission, workingHours);
        assertNumberOfMatches(BoDUPViolation.instance(), 4);

        modifier.addPrerequisiteURConstraint("PreReqUR1", manager, employee);
        assertNumberOfMatches(PrerequisiteURViolation.instance(), 0);
        modifier.addPrerequisiteURConstraint("PreReqUR2", employee, dummyRole);
        assertNumberOfMatches(PrerequisiteURViolation.instance(), 2);

        modifier.addPrerequisiteUDConstraint("PreReqUD1", canteen, office, always);
        assertNumberOfMatches(PrerequisiteUDViolation.instance(), 0);
        modifier.addPrerequisiteUDConstraint("PreReqUD1", canteen, dummyDemarcation, always);
        assertNumberOfMatches(PrerequisiteUDViolation.instance(), 3);

        modifier.addCardinalityURConstraint("CardUR1", employee, 1);
        assertNumberOfMatches(CardinalityURViolation.instance(), 1);

        modifier.addCardinalityRPConstraint("CardDP1", kitchen, 1, holidays);
        assertNumberOfMatches(CardinalityRPViolation.instance(), 0);
        modifier.addCardinalityRPConstraint("CardDP1", kitchen, 1, workingHours);
        assertNumberOfMatches(CardinalityRPViolation.instance(), 1);


        //Modifying a few things to change the number of violated constraints

        modifier.assignRoleToUser(user3, employee);
        modifier.assignRoleToUser(user3, manager);
        assertNumberOfMatches(SoDURViolation.instance(), 2);
        assertNumberOfMatches(SoDUPViolation.instance(), 5);
        assertNumberOfMatches(BoDURViolation.instance(), 1);
        assertNumberOfMatches(BoDUPViolation.instance(), 7);
        assertNumberOfMatches(PrerequisiteURViolation.instance(), 3);
        assertNumberOfMatches(PrerequisiteUDViolation.instance(), 5);
        assertNumberOfMatches(CardinalityURViolation.instance(), 1);
        assertNumberOfMatches(CardinalityRPViolation.instance(), 1);

        modifier.deassignRoleFromUser(user1, employee);
        modifier.deassignRoleFromUser(user2, employee);
        modifier.deassignRoleFromUser(user2, manager);
        assertNumberOfMatches(CardinalityURViolation.instance(), 0);

        modifier.addTemporalGrantRule(always, "rule_deny_everything1", employee, office, false, 10);
        modifier.addTemporalGrantRule(always, "rule_deny_everything2", employee, canteen, false, 10);
        modifier.addTemporalGrantRule(always, "rule_deny_everything3", manager, office, false, 10);
        modifier.addTemporalGrantRule(always, "rule_deny_everything4", manager, canteen, false, 10);

        assertNumberOfMatches(SoDUPViolation.instance(), 0);
        assertNumberOfMatches(CardinalityRPViolation.instance(), 0);
        assertNumberOfMatches(PrerequisiteUDViolation.instance(), 0);
    }

    public void assertNumberOfMatches(BaseGeneratedEMFQuerySpecification pattern, int expectedCount) {
        assertEquals(expectedCount, pattern.getMatcher(modifier.getEngine()).getAllMatches().stream().count());
    }

}
