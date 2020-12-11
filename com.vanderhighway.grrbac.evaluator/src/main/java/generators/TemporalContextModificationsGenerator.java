package generators;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vanderhighway.grrbac.core.modifier.GeneratorUtil;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import generators.datatypes.*;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

public class TemporalContextModificationsGenerator {

    public static void main(String[] args) throws ParseException, ModelManipulationException, InterruptedException, IOException {

        GRRBACPackage.eINSTANCE.getName();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("trbac", new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

        URI performanceTestCase = URI.createFileURI(args[0]);
        ResourceSet set = new ResourceSetImpl();
        Resource resource = set.getResource(performanceTestCase, true);
        SiteAccessControlSystem system = (SiteAccessControlSystem) resource.getContents().get(0);

        TestSuiteCollection collection = new TestSuiteCollection("ContextsTestSuiteCollection");
        TestSuiteCollectionCounter counter = new TestSuiteCollectionCounter("ContextsTestSuiteCollection");

        // Add new scenario without any attached rules by creating a new temporal context with one instance
        TestSuite addTemporalContext = new TestSuite("AddTemporalContextSuite", "./AddTemporalContextSuite/");

        // Remove all temporal contexts
        TestSuite removeTemporalContext = new TestSuite("RemoveTemporalContextSuite", "./RemoveTemporalContextSuite/");

        int actionCounter = 0;
        // Create one scenario with anomized test data!

        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Monday_12_September", Integer.toString(GeneratorUtils.toMinutes("01:48")), Integer.toString(GeneratorUtils.toMinutes("01:58")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Monday_30_May", Integer.toString(GeneratorUtils.toMinutes("01:37")), Integer.toString(GeneratorUtils.toMinutes("01:47")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Tuesday_28_April", Integer.toString(GeneratorUtils.toMinutes("01:26")), Integer.toString(GeneratorUtils.toMinutes("01:36")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Wednesday_15_June", Integer.toString(GeneratorUtils.toMinutes("03:24")), Integer.toString(GeneratorUtils.toMinutes("03:24")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Wednesday_23_November", Integer.toString(GeneratorUtils.toMinutes("03:25")), Integer.toString(GeneratorUtils.toMinutes("03:34")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Monday_12_October", Integer.toString(GeneratorUtils.toMinutes("01:59")), Integer.toString(GeneratorUtils.toMinutes("02:09")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Friday_2_December", Integer.toString(GeneratorUtils.toMinutes("02:19")), Integer.toString(GeneratorUtils.toMinutes("02:29")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Tuesday_16_August", Integer.toString(GeneratorUtils.toMinutes("02:10")), Integer.toString(GeneratorUtils.toMinutes("02:51")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Thursday_6_February", Integer.toString(GeneratorUtils.toMinutes("03:03")), Integer.toString(GeneratorUtils.toMinutes("03:03")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Tuesday_3_January", Integer.toString(GeneratorUtils.toMinutes("03:04")), Integer.toString(GeneratorUtils.toMinutes("03:13")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Wednesday_29_May", Integer.toString(GeneratorUtils.toMinutes("03:14")), Integer.toString(GeneratorUtils.toMinutes("03:23")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Friday_12_June", Integer.toString(GeneratorUtils.toMinutes("02:41")), Integer.toString(GeneratorUtils.toMinutes("02:51")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Thursday_1_February", Integer.toString(GeneratorUtils.toMinutes("02:52")), Integer.toString(GeneratorUtils.toMinutes("03:02")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Thursday_24_August", Integer.toString(GeneratorUtils.toMinutes("03:35")), Integer.toString(GeneratorUtils.toMinutes("03:35")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Thursday_13_January", Integer.toString(GeneratorUtils.toMinutes("03:36")), Integer.toString(GeneratorUtils.toMinutes("03:45")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Wednesday_10_May", Integer.toString(GeneratorUtils.toMinutes("01:04")), Integer.toString(GeneratorUtils.toMinutes("01:14")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Wednesday_1_January", Integer.toString(GeneratorUtils.toMinutes("00:54")), Integer.toString(GeneratorUtils.toMinutes("01:03")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Monday_25_January", Integer.toString(GeneratorUtils.toMinutes("03:46")), Integer.toString(GeneratorUtils.toMinutes("03:55")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Wednesday_9_May", Integer.toString(GeneratorUtils.toMinutes("00:43")), Integer.toString(GeneratorUtils.toMinutes("00:53")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Wednesday_2_February", Integer.toString(GeneratorUtils.toMinutes("03:56")), Integer.toString(GeneratorUtils.toMinutes("03:56")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Thursday_26_August", Integer.toString(GeneratorUtils.toMinutes("03:57")), Integer.toString(GeneratorUtils.toMinutes("04:06")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Thursday_8_January", Integer.toString(GeneratorUtils.toMinutes("04:07")), Integer.toString(GeneratorUtils.toMinutes("04:16")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Thursday_8_December", Integer.toString(GeneratorUtils.toMinutes("01:15")), Integer.toString(GeneratorUtils.toMinutes("01:25")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Friday_14_March", Integer.toString(GeneratorUtils.toMinutes("02:52")), Integer.toString(GeneratorUtils.toMinutes("03:03")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Friday_13_September", Integer.toString(GeneratorUtils.toMinutes("03:04")), Integer.toString(GeneratorUtils.toMinutes("03:13")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Friday_27_March", Integer.toString(GeneratorUtils.toMinutes("03:14")), Integer.toString(GeneratorUtils.toMinutes("03:24")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Friday_21_August", Integer.toString(GeneratorUtils.toMinutes("03:25")), Integer.toString(GeneratorUtils.toMinutes("03:34")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Saturday_7_February", Integer.toString(GeneratorUtils.toMinutes("00:54")), Integer.toString(GeneratorUtils.toMinutes("02:52")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Thursday_20_August", Integer.toString(GeneratorUtils.toMinutes("00:10")), Integer.toString(GeneratorUtils.toMinutes("00:20")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Monday_17_January", Integer.toString(GeneratorUtils.toMinutes("04:38")), Integer.toString(GeneratorUtils.toMinutes("04:38")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Monday_3_February", Integer.toString(GeneratorUtils.toMinutes("04:39")), Integer.toString(GeneratorUtils.toMinutes("23:59")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Friday_3_April", Integer.toString(GeneratorUtils.toMinutes("03:35")), Integer.toString(GeneratorUtils.toMinutes("03:35")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Friday_17_January", Integer.toString(GeneratorUtils.toMinutes("03:36")), Integer.toString(GeneratorUtils.toMinutes("03:45")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Friday_28_January", Integer.toString(GeneratorUtils.toMinutes("03:46")), Integer.toString(GeneratorUtils.toMinutes("03:55")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Wednesday_10_August", Integer.toString(GeneratorUtils.toMinutes("00:32")), Integer.toString(GeneratorUtils.toMinutes("00:42")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Friday_13_April", Integer.toString(GeneratorUtils.toMinutes("03:56")), Integer.toString(GeneratorUtils.toMinutes("03:56")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Friday_7_March", Integer.toString(GeneratorUtils.toMinutes("00:21")), Integer.toString(GeneratorUtils.toMinutes("00:31")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Friday_16_January", Integer.toString(GeneratorUtils.toMinutes("03:57")), Integer.toString(GeneratorUtils.toMinutes("04:06")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Monday_4_August", Integer.toString(GeneratorUtils.toMinutes("04:17")), Integer.toString(GeneratorUtils.toMinutes("04:27")))))));
        addTemporalContext.addCase( new TestCase( "TEST_ADD_TC_" + actionCounter++, new CompoundAction( new Action( ActionType.ADD_TEMPORALCONTEXTINSTANCE,
                Arrays.asList( "Test_Context", "Friday_28_April", Integer.toString(GeneratorUtils.toMinutes("04:28")), Integer.toString(GeneratorUtils.toMinutes("04:37")))))));

        //Add the creation of a temporal context to each test case
        for(TestCase testCase: addTemporalContext.getCases()) {
            testCase.getCompoundActions().get(0).setActions(Arrays.asList(
                    new Action(ActionType.ADD_TEMPORALCONTEXT, Arrays.asList("Test_Context")),
                    testCase.getCompoundActions().get(0).getActions().get(0)));
        }

        actionCounter = 0;
        for(TemporalContext context: system.getContextContainer().getTemporalContexts()) {
            CompoundAction ca = new CompoundAction(new Action(ActionType.REMOVE_TEMPORALCONTEXT, Arrays.asList(context.getName())));
            TestCase tc = new TestCase("REMOVE_TEMPORALCONTEXT_" + actionCounter, ca);
            removeTemporalContext.addCase(tc);
            actionCounter++;
        }

        int seed = 10;
        int n =  10;
        Random rangen = new Random(seed);

        List<TestCase> addTemporalContextTestCasesCopy = new LinkedList<>(addTemporalContext.getCases());
        addTemporalContext.addCases(addTemporalContextTestCasesCopy);
        addTemporalContext.addCases(addTemporalContextTestCasesCopy);

        List<TestCase> removeTemporalContextTestCasesCopy = new LinkedList<>(removeTemporalContext.getCases());
        removeTemporalContext.addCases(removeTemporalContextTestCasesCopy);
        removeTemporalContext.addCases(removeTemporalContextTestCasesCopy);

        collection.addSuites(addTemporalContext, removeTemporalContext);

        new File("./evaluation/Contexts/data").mkdirs();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(Paths.get("./evaluation/Contexts/data/tsc.json").toFile(), collection);
        mapper.writeValue(Paths.get("./evaluation/Contexts/data/tsc_counter.json").toFile(), counter);

        File caseFile = new File(args[0]);
        Files.copy(caseFile.toPath(), new File("./evaluation/Contexts/data/model.trbac").toPath());
    }


}
