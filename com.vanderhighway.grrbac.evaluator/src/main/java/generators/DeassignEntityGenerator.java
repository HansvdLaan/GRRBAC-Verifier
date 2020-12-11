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
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class DeassignEntityGenerator {

    public static void main(String[] args) throws ParseException, ModelManipulationException, InterruptedException, IOException {

        GRRBACPackage.eINSTANCE.getName();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("trbac", new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

        URI performanceTestCase = URI.createFileURI(args[0]);
        ResourceSet set = new ResourceSetImpl();
        Resource resource = set.getResource(performanceTestCase, true);
        SiteAccessControlSystem system = (SiteAccessControlSystem) resource.getContents().get(0);

        TestSuiteCollection collection = new TestSuiteCollection("DeassignEntitiesTestSuiteCollection");
        TestSuiteCollectionCounter counter = new TestSuiteCollectionCounter("DeassignEntitiesTestSuiteCollection");

        TestSuite deassignURSuite = new TestSuite("DeassignURSuite", "./DeassignURSuite/");
        TestSuite deassignDPSuite = new TestSuite("DeassignDPSuite", "./DeassignDPSuite/");

        int seed = 10;
        int n =  10;
        Random rangen = new Random(seed);

        int actionCounter = 0;
        for(User user: system.getAuthorizationPolicy().getUsers()) {
            List<Role> assignedNonProxyRoles = new LinkedList<>(user.getUR());
            assignedNonProxyRoles = assignedNonProxyRoles.stream().filter(role -> !role.getName().contains("Proxy")).collect(Collectors.toList());
            for (int i = 1; i <= n && assignedNonProxyRoles.size() > 0; i++) {
                Role deassignRole = GeneratorUtils.getRandom(assignedNonProxyRoles, rangen);
                assignedNonProxyRoles.remove(deassignRole);
                CompoundAction urAction = new CompoundAction(new Action(ActionType.DEASSIGN_ROLE_FROM_USER,
                        Arrays.asList(user.getName(), deassignRole.getName())));
                TestCase urTestCase = new TestCase("DEASSIGN_USER_ROLE_TEST_" + actionCounter, urAction);
                deassignURSuite.addCase(urTestCase);
                actionCounter++;
            }
        }

        actionCounter = 0;
        List<Demarcation> nonProxyDemarcations = new LinkedList<>(system.getAuthorizationPolicy().getDemarcations());
        nonProxyDemarcations = nonProxyDemarcations.stream().filter(demarcation -> !demarcation.getName().contains("Proxy")).collect(Collectors.toList());
        for(Demarcation demarcation: nonProxyDemarcations) {
            List<Permission> assignedPermissions = demarcation.getDP();
            for (int i = 1; i <= n && assignedPermissions.size() > 0; i++) {
                Permission deassignPermission = GeneratorUtils.getRandom(assignedPermissions, rangen);
                assignedPermissions.remove(deassignPermission);
                CompoundAction dpAction = new CompoundAction(new Action(ActionType.DEASSIGN_PERMISSION_FROM_DEMARCATION,
                        Arrays.asList(demarcation.getName(), deassignPermission.getName())));
                TestCase dpTestCase = new TestCase("DEASSIGN_DEMARCATION_PERMISSION_TEST_" + actionCounter, dpAction);
                deassignDPSuite.addCase(dpTestCase);
                actionCounter++;
            }
        }

//        List<TestCase> assignURTestCasesCopy = new LinkedList<>(deassignURSuite.getCases());
//        deassignURSuite.addCases(assignURTestCasesCopy);
//        deassignURSuite.addCases(assignURTestCasesCopy);
//
//        List<TestCase> assignDPTestCasesCopy = new LinkedList<>(deassignDPSuite.getCases());
//        deassignDPSuite.addCases(assignDPTestCasesCopy);
//        deassignDPSuite.addCases(assignDPTestCasesCopy);

        collection.addSuites(deassignURSuite, deassignDPSuite);

        new File("./evaluation/DeassignEntities/data").mkdirs();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(Paths.get("./evaluation/DeassignEntities/data/tsc.json").toFile(), collection);
        mapper.writeValue(Paths.get("./evaluation/DeassignEntities/data/tsc_counter.json").toFile(), counter);

        File caseFile = new File(args[0]);
        Files.copy(caseFile.toPath(), new File("./evaluation/DeassignEntities/data/model.trbac").toPath());
    }


}
