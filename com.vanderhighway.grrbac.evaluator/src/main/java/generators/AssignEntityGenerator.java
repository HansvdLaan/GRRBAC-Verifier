package generators;

import com.fasterxml.jackson.databind.ObjectMapper;
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

public class AssignEntityGenerator {

    public static void main(String[] args) throws ParseException, ModelManipulationException, InterruptedException, IOException {

        GRRBACPackage.eINSTANCE.getName();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("trbac", new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

        URI performanceTestCase = URI.createFileURI(args[0]);
        ResourceSet set = new ResourceSetImpl();
        Resource resource = set.getResource(performanceTestCase, true);
        SiteAccessControlSystem system = (SiteAccessControlSystem) resource.getContents().get(0);

        TestSuiteCollection collection = new TestSuiteCollection("AssignEntitiesTestSuiteCollection");
        TestSuiteCollectionCounter counter = new TestSuiteCollectionCounter("AssignEntitiesTestSuiteCollection");

        TestSuite assignURSuite = new TestSuite("AssignURSuite", "./AssignURSuite/");
        TestSuite assignDPSuite = new TestSuite("AssignDPSuite", "./AssignDPSuite/");

        int seed = 10;
        int n =  10;
        Random rangen = new Random(seed);

        Map<Role, Set<Demarcation>> connectedRD = new LinkedHashMap<>();
        for (TemporalGrantRule rule: system.getAuthorizationPolicy().getTemporalGrantRules()) {
            connectedRD.putIfAbsent(rule.getRole(), new LinkedHashSet<>());
            connectedRD.get(rule.getRole()).add(rule.getDemarcation());
        }

        int actionCounter = 0;
        for(User user: system.getAuthorizationPolicy().getUsers()) {
            List<Role> allNamedRoles = system.getAuthorizationPolicy().getRoles().stream()
                    .filter(role -> !role.getName().contains("Proxy")).collect(Collectors.toList());
            List<Role> notAssignedRoles = allNamedRoles.stream().filter(role -> !user.getUR().contains(role))
                    .collect(Collectors.toList());
            for (int i = 1; i <= n; i++) {
                Role assignRole = GeneratorUtils.getRandom(notAssignedRoles, rangen);
                notAssignedRoles.remove(assignRole);
                CompoundAction urAction = new CompoundAction(new Action(ActionType.ASSIGN_ROLE_TO_USER,
                        Arrays.asList(user.getName(), assignRole.getName())));
                TestCase urTestCase = new TestCase("ASSIGN_USER_ROLE_TEST_" + actionCounter, urAction);
                assignURSuite.addCase(urTestCase);
                actionCounter++;
            }
        }

        actionCounter = 0;
        List<Demarcation> allNamedDemarcations = system.getAuthorizationPolicy().getDemarcations().stream()
                .filter(demarcation -> !demarcation.getName().contains("Proxy"))
                .collect(Collectors.toList());
        for(Demarcation demarcation: allNamedDemarcations) {
            List<Permission> allPermissions = system.getAuthorizationPolicy().getPermissions();
            List<Permission> notAssignedPermissions = allPermissions.stream()
                    .filter(permission -> !demarcation.getDP().contains(permission))
                    .collect(Collectors.toList());
            for (int i = 1; i <= n; i++) {
                Permission assignPermission = GeneratorUtils.getRandom(notAssignedPermissions, rangen);
                notAssignedPermissions.remove(assignPermission);
                CompoundAction dpAction = new CompoundAction(new Action(ActionType.ASSIGN_PERMISSION_TO_DEMARCATION,
                        Arrays.asList(demarcation.getName(), assignPermission.getName())));
                TestCase dpTestCase = new TestCase("ASSIGN_DEMARCATION_PERMISSION_TEST_" + actionCounter, dpAction);
                assignDPSuite.addCase(dpTestCase);
                actionCounter++;
            }
        }

//        List<TestCase> assignURTestCasesCopy = new LinkedList<>(assignURSuite.getCases());
//        assignURSuite.addCases(assignURTestCasesCopy);
//        assignURSuite.addCases(assignURTestCasesCopy);
//
//        List<TestCase> assignDPTestCasesCopy = new LinkedList<>(assignDPSuite.getCases());
//        assignDPSuite.addCases(assignDPTestCasesCopy);
//        assignDPSuite.addCases(assignDPTestCasesCopy);

        assignURSuite.setCases(GeneratorUtils.randomSublist(assignURSuite.getCases(), 500, rangen));

        collection.addSuites(assignURSuite, assignDPSuite);

        new File("./evaluation/AssignEntities/data").mkdirs();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(Paths.get("./evaluation/AssignEntities/data/tsc.json").toFile(), collection);
        mapper.writeValue(Paths.get("./evaluation/AssignEntities/data/tsc_counter.json").toFile(), counter);

        File caseFile = new File(args[0]);
        Files.copy(caseFile.toPath(), new File("./evaluation/AssignEntities/data/model.trbac").toPath());
    }


}
