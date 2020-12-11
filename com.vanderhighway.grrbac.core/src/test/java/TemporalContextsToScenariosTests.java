import com.brein.time.timeintervals.intervals.IntegerInterval;
import com.vanderhighway.grrbac.aggregators.Scenario;
import com.vanderhighway.grrbac.core.CoreUtils;
import com.vanderhighway.grrbac.core.modifier.GeneratorUtil;
import com.vanderhighway.grrbac.core.modifier.PolicyAutomaticModifier;
import com.vanderhighway.grrbac.core.modifier.PolicyModifier;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import com.vanderhighway.grrbac.patterns.Scenarios;
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
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TemporalContextsToScenariosTests {

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

        uriEmptySchedules = URI.createFileURI("./src/test/resources/models/shared/empty_policy.grrbac");
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
                //.withDefaultBackend(DRedReteBackendFactory.INSTANCE)
                //.withDefaultCachingBackend(DRedReteBackendFactory.INSTANCE)
                //.withDefaultSearchBackend(LocalSearchEMFBackendFactory.INSTANCE)
                .build();
        engine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(emptyScheduleResource), options);
        modifier = new PolicyModifier(engine, (SiteAccessControlSystem) emptyScheduleResource.getContents().get(0), emptyScheduleResource);
        modifier.setInstanceIDCounter(utils.getInstanceIDCounter());
        automaticModifier = new PolicyAutomaticModifier(engine, modifier, (SiteAccessControlSystem) emptyScheduleResource.getContents().get(0));
    }

    @Test
    public void basicValidDayOfWeeks() throws InvocationTargetException, ModelManipulationException {
        automaticModifier.initialize();
        automaticModifier.execute();

        ValidDayOfWeek monday = (ValidDayOfWeek) emptyScheduleResource.getEObject("Monday");
        TemporalContext always = (TemporalContext) modifier.getResource().getEObject("Always");
        TemporalContext tc1 = modifier.addTemporalContext("tc1");
        TemporalContext tc2 = modifier.addTemporalContext("tc2");
        TemporalContext tc3 = modifier.addTemporalContext("tc3");
        TemporalContext tc4 = modifier.addTemporalContext("tc4");

        modifier.addTemporalContextInstance(tc1, monday, new IntegerInterval(10,20));
        modifier.addTemporalContextInstance(tc2, monday, new IntegerInterval(20,30));
        modifier.addTemporalContextInstance(tc3, monday, new IntegerInterval(30,40));
        modifier.addTemporalContextInstance(tc4, monday, new IntegerInterval(35,35));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        Set<Scenario> expectedScenarios = new HashSet<>();
        expectedScenarios.add(new Scenario(Arrays.asList(always)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc1)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc1, tc2)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc2)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc2, tc3)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc3)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc3, tc4)));

        Set<Scenario> scenarios = Scenarios.instance().getMatcher(modifier.getEngine()).getAllMatches()
                .stream().map(x -> x.getScenario()).collect(Collectors.toSet());
        assertEqualsScenario(expectedScenarios, scenarios);

        TemporalContext tc5 = modifier.addTemporalContext("tc5");
        modifier.addTemporalContextInstance(tc5, monday , new IntegerInterval(19,21));
        expectedScenarios.remove(new Scenario(Arrays.asList(always, tc1, tc2)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc1, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc1, tc2, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc2, tc5)));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        scenarios = Scenarios.instance().getMatcher(modifier.getEngine()).getAllMatches()
                .stream().map(x -> x.getScenario()).collect(Collectors.toSet());
        assertEqualsScenario(expectedScenarios, scenarios);

        modifier.removeTemporalContext(tc2);
        modifier.removeTemporalContext(tc4);
        expectedScenarios = new HashSet<>();
        expectedScenarios.add(new Scenario(Arrays.asList(always)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc1)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc1, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc3)));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        scenarios = Scenarios.instance().getMatcher(modifier.getEngine()).getAllMatches()
                .stream().map(x -> x.getScenario()).collect(Collectors.toSet());
        assertEqualsScenario(expectedScenarios, scenarios);
    }

    @Test
    public void basicValidDayOfWeekMonths() throws InvocationTargetException, ModelManipulationException {
        automaticModifier.initialize();
        automaticModifier.execute();

        ValidDayOfWeek monday = (ValidDayOfWeek) emptyScheduleResource.getEObject("Monday");
        ValidDayOfMonth fJan = (ValidDayOfMonth) emptyScheduleResource.getEObject("1_January");
        ValidDayOfMonth sJan = (ValidDayOfMonth) emptyScheduleResource.getEObject("2_January");
        ValidDayOfMonth fMarch = (ValidDayOfMonth) emptyScheduleResource.getEObject("1_March");
        ValidDayOfWeekMonth TufJan = (ValidDayOfWeekMonth) emptyScheduleResource.getEObject("Tuesday_1_January");
        ValidDayOfWeekMonth ThusJan = (ValidDayOfWeekMonth) emptyScheduleResource.getEObject("Thursday_2_January");
        TemporalContext always = (TemporalContext) modifier.getResource().getEObject("Always");

        TemporalContext tc1 = modifier.addTemporalContext("tc1");
        TemporalContext tc2 = modifier.addTemporalContext("tc2");
        TemporalContext tc3 = modifier.addTemporalContext("tc3");
        TemporalContext tc4 = modifier.addTemporalContext("tc4");
        TemporalContext tc5 = modifier.addTemporalContext("tc5");

        modifier.addTemporalContextInstance(tc1, monday, new IntegerInterval(10,20));
        modifier.addTemporalContextInstance(tc2, monday, new IntegerInterval(20,30));
        modifier.addTemporalContextInstance(tc3, monday, new IntegerInterval(30,40));
        modifier.addTemporalContextInstance(tc4, monday, new IntegerInterval(35,35));
        modifier.addTemporalContextInstance(tc5, fJan, new IntegerInterval(15,50));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        Set<Scenario> expectedScenarios = new HashSet<>();
        expectedScenarios.add(new Scenario(Arrays.asList(always)));

        // On a Monday, not 1st of January
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc1)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc1, tc2)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc2)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc2, tc3)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc3)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc3, tc4)));

        // On the 1st of January, not a Monday
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc5)));

        // On Monday the first of January
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc1, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc1, tc2, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc2, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc2, tc3, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc3, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc3, tc4, tc5)));

        Set<Scenario> scenarios = Scenarios.instance().getMatcher(modifier.getEngine()).getAllMatches()
                .stream().map(x -> x.getScenario()).collect(Collectors.toSet());
        assertEqualsScenario(expectedScenarios, scenarios);

        TemporalContext tc6 = modifier.addTemporalContext("tc6");
        TemporalContext tc7 = modifier.addTemporalContext("tc7");
        TemporalContext tc8 = modifier.addTemporalContext("tc8");
        modifier.addTemporalContextInstance(tc6, sJan, new IntegerInterval(21,29));
        modifier.addTemporalContextInstance(tc7, sJan, new IntegerInterval(21,29));
        modifier.addTemporalContextInstance(tc8, fMarch, new IntegerInterval(90,100));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        // On the 2nd of January, not a Monday
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc6, tc7)));

        // On Monday the 2nd of January
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc2, tc6, tc7)));

        // On the 3rd of March, no matter if it's a Monday or not
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc8)));

        scenarios = Scenarios.instance().getMatcher(modifier.getEngine()).getAllMatches()
                .stream().map(x -> x.getScenario()).collect(Collectors.toSet());
        assertEqualsScenario(expectedScenarios, scenarios);

        TemporalContext tc9 = modifier.addTemporalContext("tc9");
        TemporalContext tc10 = modifier.addTemporalContext("tc10");
        modifier.addTemporalContextInstance(tc9, TufJan, new IntegerInterval(0,100));
        modifier.addTemporalContextInstance(tc10, ThusJan, new IntegerInterval(21,29));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc9)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc5, tc9)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc6, tc7, tc10)));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        scenarios = Scenarios.instance().getMatcher(modifier.getEngine()).getAllMatches()
                .stream().map(x -> x.getScenario()).collect(Collectors.toSet());
        assertEqualsScenario(expectedScenarios, scenarios);

        modifier.removeTemporalContext(tc6);
        expectedScenarios.remove(new Scenario(Arrays.asList(always, tc6, tc7, tc10)));
        expectedScenarios.remove(new Scenario(Arrays.asList(always, tc6, tc7)));
        expectedScenarios.remove(new Scenario(Arrays.asList(always, tc2, tc6, tc7)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc7, tc10)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc7)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc2, tc7)));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        scenarios = Scenarios.instance().getMatcher(modifier.getEngine()).getAllMatches()
                .stream().map(x -> x.getScenario()).collect(Collectors.toSet());
        assertEqualsScenario(expectedScenarios, scenarios);

        modifier.removeTemporalContext(tc10);
        expectedScenarios.remove(new Scenario(Arrays.asList(always, tc7, tc10)));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        scenarios = Scenarios.instance().getMatcher(modifier.getEngine()).getAllMatches()
                .stream().map(x -> x.getScenario()).collect(Collectors.toSet());
        assertEqualsScenario(expectedScenarios, scenarios);
    }

    @Test
    public void basicDateSchedules() throws InvocationTargetException, ModelManipulationException {
        automaticModifier.initialize();
        automaticModifier.execute();

        ValidDayOfWeek monday = (ValidDayOfWeek) emptyScheduleResource.getEObject("Monday");
        ValidDayOfMonth jan1 = (ValidDayOfMonth) emptyScheduleResource.getEObject("1_January");
        ValidDayOfMonth jan2 = (ValidDayOfMonth) emptyScheduleResource.getEObject("2_January");
        ValidDayOfMonth march1 = (ValidDayOfMonth) emptyScheduleResource.getEObject("1_March");
        ValidDayOfWeekMonth tu1Jan = (ValidDayOfWeekMonth) emptyScheduleResource.getEObject("Tuesday_1_January");
        ValidDayOfWeekMonth thus2Jan = (ValidDayOfWeekMonth) emptyScheduleResource.getEObject("Thursday_2_January");

        modifier.addValidDayOfYear(tu1Jan, "Tuesday_1_January_2019");
        modifier.addValidDayOfYear(thus2Jan, "Thursday_2_January_2020");
        ValidDayOfYear tu1Jan2019 = (ValidDayOfYear) emptyScheduleResource.getEObject("Tuesday_1_January_2019");
        modifier.addDayScheduleTimeRange(tu1Jan2019, new IntegerInterval(0, 1439));
        ValidDayOfYear thus2Jan2020 = (ValidDayOfYear) emptyScheduleResource.getEObject("Thursday_2_January_2020");
        modifier.addDayScheduleTimeRange(thus2Jan2020, new IntegerInterval(0, 1439));
        TemporalContext always = (TemporalContext) modifier.getResource().getEObject("Always");

        TemporalContext tc1 = modifier.addTemporalContext("tc1");
        TemporalContext tc2 = modifier.addTemporalContext("tc2");
        TemporalContext tc3 = modifier.addTemporalContext("tc3");
        TemporalContext tc4 = modifier.addTemporalContext("tc4");
        TemporalContext tc5 = modifier.addTemporalContext("tc5");
        TemporalContext tc6 = modifier.addTemporalContext("tc6");
        TemporalContext tc7 = modifier.addTemporalContext("tc7");
        TemporalContext tc8 = modifier.addTemporalContext("tc8");
        TemporalContext tc9 = modifier.addTemporalContext("tc9");
        TemporalContext tc10 = modifier.addTemporalContext("tc10");
        TemporalContext tc11 = modifier.addTemporalContext("tc11");
        TemporalContext tc12 = modifier.addTemporalContext("tc12");

        modifier.addTemporalContextInstance(tc1, monday, new IntegerInterval(10,20));
        modifier.addTemporalContextInstance(tc2, monday, new IntegerInterval(20,30));
        modifier.addTemporalContextInstance(tc3, monday, new IntegerInterval(30,40));
        modifier.addTemporalContextInstance(tc4, monday, new IntegerInterval(35,35));
        modifier.addTemporalContextInstance(tc5, jan1, new IntegerInterval(15,50));
        modifier.addTemporalContextInstance(tc6, jan2, new IntegerInterval(21,29));
        modifier.addTemporalContextInstance(tc7, jan2, new IntegerInterval(21,29));
        modifier.addTemporalContextInstance(tc8, march1, new IntegerInterval(90,100));
        modifier.addTemporalContextInstance(tc9, tu1Jan, new IntegerInterval(0,100));
        modifier.addTemporalContextInstance(tc10, thus2Jan, new IntegerInterval(21,29));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        Set<Scenario> expectedScenarios = new HashSet<>();
        expectedScenarios.add(new Scenario(Arrays.asList(always)));

        expectedScenarios.add(new Scenario(Arrays.asList(always, tc1)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc1, tc2)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc2)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc2, tc3)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc3)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc3, tc4)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc1, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc1, tc2, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc2, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc2, tc3, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc3, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc3, tc4, tc5)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc6, tc7)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc2, tc6, tc7)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc8)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc9)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc5, tc9)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc6, tc7, tc10)));

        Set<Scenario> scenarios = Scenarios.instance().getMatcher(modifier.getEngine()).getAllMatches()
                .stream().map(x -> x.getScenario()).collect(Collectors.toSet());
        assertEqualsScenario(expectedScenarios, scenarios);

        modifier.addTemporalContextInstance(tc11, tu1Jan2019, new IntegerInterval(0,120));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc9, tc11)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc5, tc9, tc11)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc11)));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        scenarios = Scenarios.instance().getMatcher(modifier.getEngine()).getAllMatches()
                .stream().map(x -> x.getScenario()).collect(Collectors.toSet());
        assertEqualsScenario(expectedScenarios, scenarios);

        modifier.addTemporalContextInstance(tc12, thus2Jan2020, new IntegerInterval(21,29));
        modifier.addTemporalContextInstance(tc12, thus2Jan2020, new IntegerInterval(90,100));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc6, tc7, tc10, tc12)));
        expectedScenarios.add(new Scenario(Arrays.asList(always, tc12)));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        scenarios = Scenarios.instance().getMatcher(modifier.getEngine()).getAllMatches()
                .stream().map(x -> x.getScenario()).collect(Collectors.toSet());
        assertEqualsScenario(expectedScenarios, scenarios);
    }


    public static void assertEqualsScenario(Set<Scenario> expectedScenarios, Set<Scenario> actualScenarios) {
        for(Scenario actualScenario: actualScenarios) {
            assertTrue(expectedScenarios.contains(actualScenario), "expected scenarios does not contain actual scenario: " + actualScenario.toString());
        }
        for (Scenario expectedScenario: expectedScenarios) {
            assertTrue(actualScenarios.contains(expectedScenario), "actual scenarios does not contain expected scenario: " + expectedScenario.toString());
        }
    }
}
