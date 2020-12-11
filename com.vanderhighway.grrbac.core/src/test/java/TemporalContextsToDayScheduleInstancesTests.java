import com.brein.time.timeintervals.intervals.IntegerInterval;
import com.vanderhighway.grrbac.core.CoreUtils;
import com.vanderhighway.grrbac.core.modifier.GeneratorUtil;
import com.vanderhighway.grrbac.core.modifier.PolicyAutomaticModifier;
import com.vanderhighway.grrbac.core.modifier.PolicyModifier;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.*;
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

public class TemporalContextsToDayScheduleInstancesTests {

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
    public void emptyPolicy() throws InvocationTargetException {
        automaticModifier.initialize();
        automaticModifier.execute();
    }

    @Test
    public void basicAddRanges1() throws InvocationTargetException, ModelManipulationException {
        automaticModifier.initialize();
        automaticModifier.execute();

        ValidDayOfWeek monday = (ValidDayOfWeek) emptyScheduleResource.getEObject("Monday");
        TemporalContext context = modifier.addTemporalContext("TestContext") ;

        modifier.addTemporalContextInstance(context, monday , new IntegerInterval(10,20));
        modifier.addTemporalContextInstance(context, monday, new IntegerInterval(20,30));
        modifier.addTemporalContextInstance(context, monday, new IntegerInterval(30,40));
        modifier.addTemporalContextInstance(context, monday, new IntegerInterval(35,35));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        List<ValidDayTimeRange> timeRanges = monday.getInstances().stream().
                sorted(Comparator.comparingInt(TimeRange::getStart)).collect(Collectors.toList());
        assertEqualsDSTR(0,9, Arrays.asList("Always"), timeRanges.get(0));
        assertEqualsDSTR(10,19, Arrays.asList("Always","TestContext"), timeRanges.get(1));
        assertEqualsDSTR(20,20, Arrays.asList("Always","TestContext"), timeRanges.get(2));
        assertEqualsDSTR(21,29, Arrays.asList("Always","TestContext"), timeRanges.get(3));
        assertEqualsDSTR(30,30, Arrays.asList("Always","TestContext"), timeRanges.get(4));
        assertEqualsDSTR(31,34, Arrays.asList("Always","TestContext"), timeRanges.get(5));
        assertEqualsDSTR(35,35, Arrays.asList("Always","TestContext"), timeRanges.get(6));
        assertEqualsDSTR(36,40, Arrays.asList("Always","TestContext"), timeRanges.get(7));
        assertEqualsDSTR(41,1439, Arrays.asList("Always"), timeRanges.get(8));
    }

    @Test
    public void basicAddRanges2() throws InvocationTargetException, ModelManipulationException {
        automaticModifier.initialize();
        automaticModifier.execute();

        ValidDayOfWeek monday = (ValidDayOfWeek) emptyScheduleResource.getEObject("Monday");
        TemporalContext context1 = modifier.addTemporalContext("TestContext1") ;
        TemporalContext context2 = modifier.addTemporalContext("TestContext2") ;
        TemporalContext context3 = modifier.addTemporalContext("TestContext3") ;
        TemporalContext context4 = modifier.addTemporalContext("TestContext4") ;

        modifier.addTemporalContextInstance(context1, monday , new IntegerInterval(10,20));
        modifier.addTemporalContextInstance(context2, monday, new IntegerInterval(20,30));
        modifier.addTemporalContextInstance(context3, monday, new IntegerInterval(30,40));
        modifier.addTemporalContextInstance(context4, monday, new IntegerInterval(35,35));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        List<ValidDayTimeRange> timeRanges = monday.getInstances().stream().
                sorted(Comparator.comparingInt(TimeRange::getStart)).collect(Collectors.toList());
        assertEqualsDSTR(0,9, Arrays.asList("Always"), timeRanges.get(0));
        assertEqualsDSTR(10,19, Arrays.asList("Always","TestContext1"), timeRanges.get(1));
        assertEqualsDSTR(20,20, Arrays.asList("Always","TestContext1","TestContext2"), timeRanges.get(2));
        assertEqualsDSTR(21,29, Arrays.asList("Always","TestContext2"), timeRanges.get(3));
        assertEqualsDSTR(30,30, Arrays.asList("Always","TestContext2","TestContext3"), timeRanges.get(4));
        assertEqualsDSTR(31,34, Arrays.asList("Always","TestContext3"), timeRanges.get(5));
        assertEqualsDSTR(35,35, Arrays.asList("Always","TestContext3","TestContext4"), timeRanges.get(6));
        assertEqualsDSTR(36,40, Arrays.asList("Always","TestContext3"), timeRanges.get(7));
        assertEqualsDSTR(41,1439, Arrays.asList("Always"), timeRanges.get(8));
    }

    @Test
    public void basicAddRangesTrebla() throws InvocationTargetException, ModelManipulationException {
        automaticModifier.initialize();
        automaticModifier.execute();

        ValidDayOfWeek monday = (ValidDayOfWeek) emptyScheduleResource.getEObject("Monday");
        ValidDayOfWeek friday = (ValidDayOfWeek) emptyScheduleResource.getEObject("Friday");
        ValidDayOfWeek saturday = (ValidDayOfWeek) emptyScheduleResource.getEObject("Saturday");
        ValidDayOfMonth december5 = (ValidDayOfMonth) emptyScheduleResource.getEObject("5_December");

        TemporalContext always = modifier.addTemporalContext("Always");
        TemporalContext guardShifts = modifier.addTemporalContext("GuardShifts");
        TemporalContext workingHours = modifier.addTemporalContext("WorkingHours");
        TemporalContext visitingHours = modifier.addTemporalContext("VisitingHours");
        TemporalContext lunchBreaks = modifier.addTemporalContext("LunchBreaks");
        TemporalContext overtime = modifier.addTemporalContext("Overtime");
        TemporalContext cleaningShifts = modifier.addTemporalContext("CleaningShifts");
        TemporalContext workshops = modifier.addTemporalContext("HolidayWorkshops");

        List<String> allDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        List<String> weekDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");

        GeneratorUtil.addManyTemporalContextInstances(modifier, guardShifts, allDays, Arrays.asList(new IntegerInterval(0, 449),
                new IntegerInterval(1170, 1439)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, workingHours, weekDays, Arrays.asList(new IntegerInterval(480, 1019)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, visitingHours, weekDays, Arrays.asList(new IntegerInterval(600, 959)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, overtime, weekDays, Arrays.asList(new IntegerInterval(1020, 1169)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, lunchBreaks, weekDays, Arrays.asList(new IntegerInterval(720, 779)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, cleaningShifts, Arrays.asList("Tuesday","Friday"), Arrays.asList(new IntegerInterval(1170, 1260)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, workshops, Arrays.asList("5_December"),
                Arrays.asList(new IntegerInterval(480, 1019)));

        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        List<ValidDayTimeRange> timeRangesMonday = monday.getInstances().stream().
                sorted(Comparator.comparingInt(TimeRange::getStart)).collect(Collectors.toList());
        assertEqualsDSTR(0,449, Arrays.asList("Always", "GuardShifts"), timeRangesMonday.get(0));
        assertEqualsDSTR(450,479, Arrays.asList("Always"), timeRangesMonday.get(1));
        assertEqualsDSTR(480,599, Arrays.asList("Always","WorkingHours"), timeRangesMonday.get(2));
        assertEqualsDSTR(600,719, Arrays.asList("Always","WorkingHours","VisitingHours"), timeRangesMonday.get(3));
        assertEqualsDSTR(720,779, Arrays.asList("Always","WorkingHours","VisitingHours","LunchBreaks"), timeRangesMonday.get(4));
        assertEqualsDSTR(780,959, Arrays.asList("Always","WorkingHours","VisitingHours"), timeRangesMonday.get(5));
        assertEqualsDSTR(960,1019, Arrays.asList("Always","WorkingHours"), timeRangesMonday.get(6));
        assertEqualsDSTR(1020,1169, Arrays.asList("Always","Overtime"), timeRangesMonday.get(7));
        assertEqualsDSTR(1170,1439, Arrays.asList("Always","GuardShifts"), timeRangesMonday.get(8));

        List<ValidDayTimeRange> timeRangesFriday = friday.getInstances().stream().
                sorted(Comparator.comparingInt(TimeRange::getStart)).collect(Collectors.toList());
        assertEqualsDSTR(0,449, Arrays.asList("Always", "GuardShifts"), timeRangesFriday.get(0));
        assertEqualsDSTR(450,479, Arrays.asList("Always"), timeRangesFriday.get(1));
        assertEqualsDSTR(480,599, Arrays.asList("Always","WorkingHours"), timeRangesFriday.get(2));
        assertEqualsDSTR(600,719, Arrays.asList("Always","WorkingHours","VisitingHours"), timeRangesFriday.get(3));
        assertEqualsDSTR(720,779, Arrays.asList("Always","WorkingHours","VisitingHours","LunchBreaks"), timeRangesFriday.get(4));
        assertEqualsDSTR(780,959, Arrays.asList("Always","WorkingHours","VisitingHours"), timeRangesFriday.get(5));
        assertEqualsDSTR(960,1019, Arrays.asList("Always","WorkingHours"), timeRangesFriday.get(6));
        assertEqualsDSTR(1020,1169, Arrays.asList("Always","Overtime"), timeRangesFriday.get(7));
        assertEqualsDSTR(1170,1260, Arrays.asList("Always","GuardShifts","CleaningShifts"), timeRangesFriday.get(8));
        assertEqualsDSTR(1261,1439, Arrays.asList("Always","GuardShifts"), timeRangesFriday.get(9));

        List<ValidDayTimeRange> timeRangesSaturday = saturday.getInstances().stream().
                sorted(Comparator.comparingInt(TimeRange::getStart)).collect(Collectors.toList());
        assertEqualsDSTR(0,449, Arrays.asList("Always", "GuardShifts"), timeRangesSaturday.get(0));
        assertEqualsDSTR(450,1169, Arrays.asList("Always"), timeRangesSaturday.get(1));
        assertEqualsDSTR(1170,1439, Arrays.asList("Always", "GuardShifts"), timeRangesSaturday.get(2));

        List<ValidDayTimeRange> timeRangesDecember5 = december5.getInstances().stream().
                sorted(Comparator.comparingInt(TimeRange::getStart)).collect(Collectors.toList());
        assertEqualsDSTR(0,479, Arrays.asList("Always"), timeRangesDecember5.get(0));
        assertEqualsDSTR(480,1019, Arrays.asList("Always", "HolidayWorkshops"), timeRangesDecember5.get(1));
        assertEqualsDSTR(1020,1439, Arrays.asList("Always"), timeRangesDecember5.get(2));
    }

    @Test
    public void basicRemoveRanges1() throws InvocationTargetException, ModelManipulationException {
        automaticModifier.initialize();
        automaticModifier.execute();

        ValidDayOfWeek monday = (ValidDayOfWeek) emptyScheduleResource.getEObject("Monday");
        TemporalContext context = modifier.addTemporalContext("TestContext") ;

        TimeRange t1 = modifier.addTemporalContextInstance(context, monday , new IntegerInterval(10,20));
        TimeRange t2 = modifier.addTemporalContextInstance(context, monday, new IntegerInterval(20,30));
        TimeRange t3 = modifier.addTemporalContextInstance(context, monday, new IntegerInterval(30,40));
        TimeRange t4 = modifier.addTemporalContextInstance(context, monday, new IntegerInterval(35,35));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
        modifier.removeTemporalContextInstance(t1);
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
        modifier.removeTemporalContextInstance(t4);
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
        modifier.removeTemporalContextInstance(t3);
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
        modifier.removeTemporalContextInstance(t2);
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        List<ValidDayTimeRange> timeRanges = monday.getInstances().stream().
                sorted(Comparator.comparingInt(TimeRange::getStart)).collect(Collectors.toList());
        assertEqualsDSTR(0,1439, Arrays.asList("Always"), timeRanges.get(0));
    }

    @Test
    public void basicRemoveRanges2() throws InvocationTargetException, ModelManipulationException {
        automaticModifier.initialize();
        automaticModifier.execute();

        ValidDayOfWeek monday = (ValidDayOfWeek) emptyScheduleResource.getEObject("Monday");
        TemporalContext context1 = modifier.addTemporalContext("TestContext1") ;
        TemporalContext context2 = modifier.addTemporalContext("TestContext2") ;
        TemporalContext context3 = modifier.addTemporalContext("TestContext3") ;
        TemporalContext context4 = modifier.addTemporalContext("TestContext4") ;

        TimeRange t1 = modifier.addTemporalContextInstance(context1, monday , new IntegerInterval(10,20));
        TimeRange t2 = modifier.addTemporalContextInstance(context2, monday, new IntegerInterval(20,30));
        TimeRange t3 = modifier.addTemporalContextInstance(context3, monday, new IntegerInterval(30,40));
        TimeRange t4 = modifier.addTemporalContextInstance(context4, monday, new IntegerInterval(35,35));
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
        modifier.removeTemporalContextInstance(t4);
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
        modifier.removeTemporalContextInstance(t2);
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
        modifier.removeTemporalContextInstance(t3);
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
        modifier.removeTemporalContextInstance(t1);
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        List<ValidDayTimeRange> timeRanges = monday.getInstances().stream().
                sorted(Comparator.comparingInt(TimeRange::getStart)).collect(Collectors.toList());
        assertEqualsDSTR(0,1439, Arrays.asList("Always"), timeRanges.get(0));
    }

    @Test
    public void basicRemoveRangesTrebla() throws InvocationTargetException, ModelManipulationException {
        automaticModifier.initialize();
        automaticModifier.execute();

        ValidDayOfWeek monday = (ValidDayOfWeek) emptyScheduleResource.getEObject("Monday");
        ValidDayOfWeek friday = (ValidDayOfWeek) emptyScheduleResource.getEObject("Friday");
        ValidDayOfWeek saturday = (ValidDayOfWeek) emptyScheduleResource.getEObject("Saturday");
        ValidDayOfMonth december5 = (ValidDayOfMonth) emptyScheduleResource.getEObject("5_December");

        TemporalContext always = modifier.addTemporalContext("Always");
        TemporalContext guardShifts = modifier.addTemporalContext("GuardShifts");
        TemporalContext workingHours = modifier.addTemporalContext("WorkingHours");
        TemporalContext visitingHours = modifier.addTemporalContext("VisitingHours");
        TemporalContext lunchBreaks = modifier.addTemporalContext("LunchBreaks");
        TemporalContext overtime = modifier.addTemporalContext("Overtime");
        TemporalContext cleaningShifts = modifier.addTemporalContext("CleaningShifts");
        TemporalContext workshops = modifier.addTemporalContext("HolidayWorkshops");

        List<String> allDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        List<String> weekDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday");

        GeneratorUtil.addManyTemporalContextInstances(modifier, guardShifts, allDays, Arrays.asList(new IntegerInterval(0, 449),
                new IntegerInterval(1170, 1439)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, workingHours, weekDays, Arrays.asList(new IntegerInterval(480, 1019)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, visitingHours, weekDays, Arrays.asList(new IntegerInterval(600, 959)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, overtime, weekDays, Arrays.asList(new IntegerInterval(1020, 1169)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, lunchBreaks, weekDays, Arrays.asList(new IntegerInterval(720, 779)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, cleaningShifts, Arrays.asList("Tuesday","Friday"), Arrays.asList(new IntegerInterval(1170, 1260)));
        GeneratorUtil.addManyTemporalContextInstances(modifier, workshops, Arrays.asList("5_December"),
                Arrays.asList(new IntegerInterval(480, 1019)));

        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        TimeRange workingHoursMonday = workingHours.getInstances().get(0);
        modifier.removeTemporalContextInstance(workingHoursMonday);
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();

        List<ValidDayTimeRange> timeRangesMonday = monday.getInstances().stream().
                sorted(Comparator.comparingInt(TimeRange::getStart)).collect(Collectors.toList());
        assertEqualsDSTR(0,449, Arrays.asList("Always", "GuardShifts"), timeRangesMonday.get(0));
        assertEqualsDSTR(450,599, Arrays.asList("Always"), timeRangesMonday.get(1));
        assertEqualsDSTR(600,719, Arrays.asList("Always","VisitingHours"), timeRangesMonday.get(2));
        assertEqualsDSTR(720,779, Arrays.asList("Always","VisitingHours","LunchBreaks"), timeRangesMonday.get(3));
        assertEqualsDSTR(780,959, Arrays.asList("Always","VisitingHours"), timeRangesMonday.get(4));
        assertEqualsDSTR(960,1019, Arrays.asList("Always"), timeRangesMonday.get(5));
        assertEqualsDSTR(1020,1169, Arrays.asList("Always","Overtime"), timeRangesMonday.get(6));
        assertEqualsDSTR(1170,1439, Arrays.asList("Always","GuardShifts"), timeRangesMonday.get(7));

        modifier.removeTemporalContext(guardShifts);
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
        List<ValidDayTimeRange> timeRangesSaturday = saturday.getInstances().stream().
                sorted(Comparator.comparingInt(TimeRange::getStart)).collect(Collectors.toList());
        assertEqualsDSTR(0,1439, Arrays.asList("Always"), timeRangesSaturday.get(0));

        modifier.removeTemporalContext(workingHours);
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
        List<ValidDayTimeRange> timeRangesFriday = friday.getInstances().stream().
                sorted(Comparator.comparingInt(TimeRange::getStart)).collect(Collectors.toList());
        assertEqualsDSTR(0,599, Arrays.asList("Always"), timeRangesFriday.get(0));
        assertEqualsDSTR(600,719, Arrays.asList("Always","VisitingHours"), timeRangesFriday.get(1));
        assertEqualsDSTR(720,779, Arrays.asList("Always","VisitingHours","LunchBreaks"), timeRangesFriday.get(2));
        assertEqualsDSTR(780,959, Arrays.asList("Always","VisitingHours"), timeRangesFriday.get(3));
        assertEqualsDSTR(960,1019, Arrays.asList("Always"), timeRangesFriday.get(4));
        assertEqualsDSTR(1020,1169, Arrays.asList("Always","Overtime"), timeRangesFriday.get(5));
        assertEqualsDSTR(1170,1260, Arrays.asList("Always","CleaningShifts"), timeRangesFriday.get(6));
        assertEqualsDSTR(1261,1439, Arrays.asList("Always"), timeRangesFriday.get(7));

        modifier.removeTemporalContext(workshops);
        automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
        List<ValidDayTimeRange> timeRangesDecember5 = december5.getInstances().stream().
                sorted(Comparator.comparingInt(TimeRange::getStart)).collect(Collectors.toList());
        assertEqualsDSTR(0,1439, Arrays.asList("Always"), timeRangesDecember5.get(0));
    }

    public static void assertEqualsDSTR(int expectedStartTime, int expectedEndTime, List<String> expectedTemporalContexts, ValidDayTimeRange actualTimeRange) {
        assertEquals(expectedStartTime, actualTimeRange.getStart(), "Expected startTime and actual startTime are different");
        assertEquals(expectedEndTime, actualTimeRange.getEnd(), "Expected endTime and actual endTime are different");
        Set<String> actualTemporalContexts = actualTimeRange.getTemporalContextTimeRanges().stream().map(ctx -> (TemporalContext) ctx.eContainer())
                .map(TemporalContext::getName).collect(Collectors.toSet());
        for (String expectedTC: expectedTemporalContexts) {
            assertTrue(actualTemporalContexts.contains(expectedTC), "No reference to expected temporalcontext " + expectedTC + " is present. ");
        }
        for (String actualTC: actualTemporalContexts) {
            assertTrue(expectedTemporalContexts.contains(actualTC), "Reference to actual temporalcontext " + actualTC + " was not expected. ");
        }
    }
}
