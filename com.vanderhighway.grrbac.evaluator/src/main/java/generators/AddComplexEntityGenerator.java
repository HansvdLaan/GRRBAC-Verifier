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

public class AddComplexEntityGenerator {

    public static void main(String[] args) throws ParseException, ModelManipulationException, InterruptedException, IOException {

        GRRBACPackage.eINSTANCE.getName();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("trbac", new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

        URI performanceTestCase = URI.createFileURI(args[0]);
        ResourceSet set = new ResourceSetImpl();
        Resource resource = set.getResource(performanceTestCase, true);
        SiteAccessControlSystem system = (SiteAccessControlSystem) resource.getContents().get(0);

        TestSuiteCollection collection = new TestSuiteCollection("TemporalGrantRulesTestSuiteCollection");
        TestSuiteCollectionCounter counter = new TestSuiteCollectionCounter("TemporalGrantRulesTestSuiteCollection");

        TestSuite addGrantTGRSuite = new TestSuite("AddGrantTGRSuite", "./AddGrantTGRSuite/");
        TestSuite addRevokeTGRSuite = new TestSuite("AddRevokeTGRSuite", "./AddRevokeTGRSuite/");
        TestSuite addLockTARSuite = new TestSuite("AddLockTARSuite", "./AddLockTARSuite/");
        TestSuite addProtectTARSuite = new TestSuite("AddProtectTARSuite", "./AddProtectTARSuite/");
        TestSuite addUnlockTARSuite = new TestSuite("AddUnlockTARSuite", "./AddUnlockTARSuite/");

        int seed = 10;
        int n =  10;
        Random rangen = new Random(seed);

        int actionCounter = 0;
        List<Role> nonProxyRoles = system.getAuthorizationPolicy().getRoles().stream()
                .filter(role -> !role.getName().contains("Proxy")).collect(Collectors.toList());
        List<Demarcation> nonProxyDemarcations = system.getAuthorizationPolicy().getDemarcations().stream()
                .filter(demarcation -> !demarcation.getName().contains("Proxy")).collect(Collectors.toList());

        Map<Role, Set<Demarcation>> connectedRD = new LinkedHashMap<>();
        for (TemporalGrantRule rule: system.getAuthorizationPolicy().getTemporalGrantRules()) {
            connectedRD.putIfAbsent(rule.getRole(), new LinkedHashSet<>());
            connectedRD.get(rule.getRole()).add(rule.getDemarcation());
        }

        for(Role namedRole: nonProxyRoles) {
            if (connectedRD.get(namedRole) != null) {
                List<Demarcation> notAssignedNamedDemarcations = nonProxyDemarcations.stream()
                        .filter(demarcation -> !connectedRD.get(namedRole).contains(demarcation))
                        .collect(Collectors.toList());
                for (int i = 1; i <= n && notAssignedNamedDemarcations.size() > 0; i++) {
                    TemporalContext context = GeneratorUtils.getRandom(system.getContextContainer().getTemporalContexts(), rangen);
                    Demarcation assignDemarcation = GeneratorUtils.getRandom(notAssignedNamedDemarcations, rangen);
                    CompoundAction action = new CompoundAction(
                            new Action(ActionType.ADD_TEMPORALGRANTRULE,
                                    Arrays.asList("TEST_TGR", context.getName(), namedRole.getName(),
                                            assignDemarcation.getName(), "true", "4")));
                    TestCase testCase = new TestCase("ADD_GRANT_TGR_TEST_" + actionCounter, action);
                    addGrantTGRSuite.addCase(testCase);
                    notAssignedNamedDemarcations.remove(assignDemarcation);
                }
                actionCounter++;
            }
        }

        actionCounter = 0;
        for(TemporalGrantRule rule: system.getAuthorizationPolicy().getTemporalGrantRules()) {
            if(!rule.getRole().getName().contains("Proxy") && !rule.getDemarcation().getName().contains("Proxy")) {
                CompoundAction action = new CompoundAction(
                        new Action(ActionType.ADD_TEMPORALGRANTRULE,
                                Arrays.asList("TEST_TGR", rule.getTemporalContext().getName(),
                                        rule.getRole().getName(), rule.getDemarcation().getName(),
                                        Boolean.toString(!rule.isIsGrant()), Integer.toString(rule.getPriority() + 1))));
                TestCase testCase = new TestCase("ADD_REVOKE_TGR_TEST_" + actionCounter, action);
                addRevokeTGRSuite.addCase(testCase);
                actionCounter++;
            }
        }

        int actionCounter1 = 0;
        int actionCounter2 = 0;
        int actionCounter3 = 0;

        for(TemporalAuthenticationRule rule: system.getAuthenticationPolicy().getTemporalAuthenticationRules()) {
            int newRuleStatus = (rule.getStatus() + 1) % 3;
            CompoundAction action = new CompoundAction(
                    new Action(ActionType.ADD_TEMPORALAUTHENTICATIONRULE,
                    Arrays.asList("TEST_TAR", rule.getTemporalContext().getName(), rule.getSecurityZone().getName(),
                            Integer.toString(newRuleStatus), Integer.toString(rule.getPriority() + 1))));
            if(newRuleStatus == AuthenticationStatus.LOCKED.getStatusCode()) {
                TestCase testCase = new TestCase("ADD_TAR_LOCKED_TEST_" + actionCounter1++, action);
                addLockTARSuite.addCase(testCase);
            }
            else if(newRuleStatus == AuthenticationStatus.PROTECTED.getStatusCode()) {
                TestCase testCase = new TestCase("ADD_TAR_PROTECTED_TEST_" + actionCounter2++, action);
                addProtectTARSuite.addCase(testCase);
            } else {
                TestCase testCase = new TestCase("ADD_TAR_PROTECTED_TEST_" + actionCounter3++, action);
                addUnlockTARSuite.addCase(testCase);
            }
            actionCounter++;

            int newRuleStatus2 = (rule.getStatus() + 2) % 3;
            CompoundAction action2 = new CompoundAction(
                    new Action(ActionType.ADD_TEMPORALAUTHENTICATIONRULE,
                            Arrays.asList("TEST_TAR", rule.getTemporalContext().getName(), rule.getSecurityZone().getName(),
                                    Integer.toString(newRuleStatus2), Integer.toString(rule.getPriority() + 1))));
            if(newRuleStatus2 == AuthenticationStatus.LOCKED.getStatusCode()) {
                TestCase testCase2 = new TestCase("ADD_TAR_LOCKED_TEST_" + actionCounter1++, action2);
                addLockTARSuite.addCase(testCase2);
            }
            else if(newRuleStatus2 == AuthenticationStatus.PROTECTED.getStatusCode()) {
                TestCase testCase2 = new TestCase("ADD_TAR_PROTECTED_TEST_" + actionCounter2++, action2);
                addProtectTARSuite.addCase(testCase2);
            } else {
                TestCase testCase2 = new TestCase("ADD_TAR_PROTECTED_TEST_" + actionCounter3++, action2);
                addUnlockTARSuite.addCase(testCase2);
            }
            actionCounter++;
        }

        // Duplicate all testcases times 3

//        List<TestCase> addGrantTGRTestCasesCopy = new LinkedList<>(addGrantTGRSuite.getCases());
//        addGrantTGRSuite.addCases(addGrantTGRTestCasesCopy);
//        addGrantTGRSuite.addCases(addGrantTGRTestCasesCopy);
//
//        List<TestCase> addRevokeTGRTestCaseCopy = new LinkedList<>(addRevokeTGRSuite.getCases());
//        addRevokeTGRSuite.addCases(addRevokeTGRTestCaseCopy);
//        addRevokeTGRSuite.addCases(addRevokeTGRTestCaseCopy);
//
//        List<TestCase> addLockTARTestCaseCopy = new LinkedList<>(addLockTARSuite.getCases());
//        addLockTARSuite.addCases(addLockTARTestCaseCopy);
//        addLockTARSuite.addCases(addLockTARTestCaseCopy);
//
//        List<TestCase> addProtectTARTestCaseCopy = new LinkedList<>(addProtectTARSuite.getCases());
//        addProtectTARSuite.addCases(addProtectTARTestCaseCopy);
//        addProtectTARSuite.addCases(addProtectTARTestCaseCopy);
//
//        List<TestCase> addUnlockTestCaseCopy = new LinkedList<>(addUnlockTARSuite.getCases());
//        addUnlockTARSuite.addCases(addUnlockTestCaseCopy);
//        addUnlockTARSuite.addCases(addUnlockTestCaseCopy);

        addGrantTGRSuite.setCases(GeneratorUtils.randomSublist(addGrantTGRSuite.getCases(), 80, rangen));
        addRevokeTGRSuite.setCases(GeneratorUtils.randomSublist(addRevokeTGRSuite.getCases(), 80, rangen));
        addLockTARSuite.setCases(GeneratorUtils.randomSublist(addLockTARSuite.getCases(), 80, rangen));
        addProtectTARSuite.setCases(GeneratorUtils.randomSublist(addProtectTARSuite.getCases(), 80, rangen));
        addUnlockTARSuite.setCases(GeneratorUtils.randomSublist(addUnlockTARSuite.getCases(), 80, rangen));

        collection.addSuites(addGrantTGRSuite, addRevokeTGRSuite, addLockTARSuite, addUnlockTARSuite, addProtectTARSuite);

        new File("./evaluation/AddComplexEntities/data").mkdirs();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(Paths.get("./evaluation/AddComplexEntities/data/tsc.json").toFile(), collection);
        mapper.writeValue(Paths.get("./evaluation/AddComplexEntities/data/tsc_counter.json").toFile(), counter);

        File caseFile = new File(args[0]);
        Files.copy(caseFile.toPath(), new File("./evaluation/AddComplexEntities/data/model.trbac").toPath());
    }


}
