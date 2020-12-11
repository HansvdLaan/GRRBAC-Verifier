package generators;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import com.vanderhighway.grrbac.patterns.AuthenticationStatus;
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

public class RemoveComplexEntityGenerator {

    public static void main(String[] args) throws ParseException, ModelManipulationException, InterruptedException, IOException {

        GRRBACPackage.eINSTANCE.getName();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("trbac", new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

        URI performanceTestCase = URI.createFileURI(args[0]);
        ResourceSet set = new ResourceSetImpl();
        Resource resource = set.getResource(performanceTestCase, true);
        SiteAccessControlSystem system = (SiteAccessControlSystem) resource.getContents().get(0);

        TestSuiteCollection collection = new TestSuiteCollection("TemporalRulesTestSuiteCollection");
        TestSuiteCollectionCounter counter = new TestSuiteCollectionCounter("TemporalRulesTestSuiteCollection");

        TestSuite removeTGRSuite = new TestSuite("RemoveTGRSuite", "./RemoveTGRSuite/");
        TestSuite removeLockTARSuite = new TestSuite("RemoveLockTARSuite", "./RemoveLockTARSuite/");
        TestSuite removeProtectTARSuite = new TestSuite("RemoveProtectTARSuite", "./RemoveProtectTARSuite/");
        TestSuite removeUnlockTARSuite = new TestSuite("RemoveUnlockTARSuite", "./RemoveUnlockTARSuite/");
        
        int seed = 10;
        int n =  10;
        Random rangen = new Random(seed);

        int actionCounter = 0;

        actionCounter = 0;
        for(TemporalGrantRule rule: system.getAuthorizationPolicy().getTemporalGrantRules()) {
            CompoundAction action = new CompoundAction(
                    new Action(ActionType.REMOVE_TEMPORALGRANTRULE,
                            Arrays.asList(rule.getName())));
            TestCase testCase = new TestCase("REMOVE_TGR_TEST_" + actionCounter, action);
            removeTGRSuite.addCase(testCase);
            actionCounter++;
        }

        int actionCounter1 = 0;
        int actionCounter2 = 0;
        int actionCounter3 = 0;
        for(TemporalAuthenticationRule rule: system.getAuthenticationPolicy().getTemporalAuthenticationRules()) {
            CompoundAction action = new CompoundAction(
                    new Action(ActionType.REMOVE_TEMPORALAUTHENTICATIONRULE,
                    Arrays.asList(rule.getName())));
            if(rule.getStatus() == AuthenticationStatus.LOCKED.getStatusCode()) {
                TestCase testCase = new TestCase("REMOVE_TAR_LOCKED_TEST_" + actionCounter1++, action);
                removeLockTARSuite.addCase(testCase);
            }
            else if(rule.getStatus() == AuthenticationStatus.PROTECTED.getStatusCode()) {
                TestCase testCase = new TestCase("REMOVE_TAR_PROTECTED_TEST_" + actionCounter2++, action);
                removeProtectTARSuite.addCase(testCase);
            } else {
                TestCase testCase = new TestCase("REMOVE_TAR_UNLOCKED_TEST_" + actionCounter3++, action);
                removeUnlockTARSuite.addCase(testCase);
            }
        }

//        List<TestCase> removeTGRTestCasesCopy = new LinkedList<>(removeTGRSuite.getCases());
//        removeTGRSuite.addCases(removeTGRTestCasesCopy);
//        removeTGRSuite.addCases(removeTGRTestCasesCopy);
//
//        List<TestCase> addLockTARTestCaseCopy = new LinkedList<>(removeLockTARSuite.getCases());
//        removeLockTARSuite.addCases(addLockTARTestCaseCopy);
//        removeLockTARSuite.addCases(addLockTARTestCaseCopy);
//
//        List<TestCase> removeProtectTARTestCaseCopy = new LinkedList<>(removeProtectTARSuite.getCases());
//        removeProtectTARSuite.addCases(removeProtectTARTestCaseCopy);
//        removeProtectTARSuite.addCases(removeProtectTARTestCaseCopy);
//
//        List<TestCase> addUnlockTestCaseCopy = new LinkedList<>(removeUnlockTARSuite.getCases());
//        removeUnlockTARSuite.addCases(addUnlockTestCaseCopy);
//        removeUnlockTARSuite.addCases(addUnlockTestCaseCopy);

        removeTGRSuite.setCases(GeneratorUtils.randomSublist(removeTGRSuite.getCases(), 80, rangen));
        removeLockTARSuite.setCases(GeneratorUtils.randomSublist(removeLockTARSuite.getCases(), 80, rangen));
        removeProtectTARSuite.setCases(GeneratorUtils.randomSublist(removeProtectTARSuite.getCases(), 80, rangen));
        removeUnlockTARSuite.setCases(GeneratorUtils.randomSublist(removeUnlockTARSuite.getCases(), 80, rangen));
//
        collection.addSuites(removeTGRSuite, removeLockTARSuite, removeProtectTARSuite, removeUnlockTARSuite);

        new File("./evaluation/RemoveComplexEntities/data").mkdirs();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(Paths.get("./evaluation/RemoveComplexEntities/data/tsc.json").toFile(), collection);
        mapper.writeValue(Paths.get("./evaluation/RemoveComplexEntities/data/tsc_counter.json").toFile(), counter);

        File caseFile = new File(args[0]);
        Files.copy(caseFile.toPath(), new File("./evaluation/RemoveComplexEntities/data/model.trbac").toPath());
    }


}
