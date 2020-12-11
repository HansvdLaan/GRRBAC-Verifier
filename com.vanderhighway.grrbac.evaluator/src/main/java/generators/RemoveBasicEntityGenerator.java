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

public class RemoveBasicEntityGenerator {

    public static void main(String[] args) throws ParseException, ModelManipulationException, InterruptedException, IOException {

        GRRBACPackage.eINSTANCE.getName();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("trbac", new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

        URI performanceTestCase = URI.createFileURI(args[0]);
        ResourceSet set = new ResourceSetImpl();
        Resource resource = set.getResource(performanceTestCase, true);
        SiteAccessControlSystem system = (SiteAccessControlSystem) resource.getContents().get(0);

        TestSuiteCollection collection = new TestSuiteCollection("RemoveBasicEntityTestSuiteCollection");
        TestSuiteCollectionCounter counter = new TestSuiteCollectionCounter("RemoveBasicEntityTestSuiteCollection");

        TestSuite removeUserSuite = new TestSuite("RemoveUserSuite", "./RemoveUserSuite/");
        TestSuite removeRoleSuite = new TestSuite("RemoveRoleSuite", "./RemoveRoleSuite/");
        TestSuite removeDemarcationSuite = new TestSuite("RemoveDemarcationSuite", "./RemoveDemarcationSuite/");
        TestSuite removePermissionSuite = new TestSuite("RemovePermissionSuite", "./RemovePermissionSuite/");

        int seed = 10;
        Random rangen = new Random(seed);

        int actionCounter = 0;
        for(User user: system.getAuthorizationPolicy().getUsers()) {
            CompoundAction userAction = new CompoundAction(new Action(ActionType.REMOVE_USER, Arrays.asList(user.getName())));
            TestCase userTestCase = new TestCase("REMOVE_USER_TEST_" + actionCounter, userAction);
            removeUserSuite.addCase(userTestCase);
            actionCounter++;
        }

        actionCounter = 0;
        for(Role role: system.getAuthorizationPolicy().getRoles().stream()
                        .filter(role -> !role.getName().contains("Proxy")).collect(Collectors.toList())) {
            CompoundAction roleAction = new CompoundAction(new Action(ActionType.REMOVE_ROLE, Arrays.asList(role.getName())));
            TestCase roleTestCase = new TestCase("REMOVE_ROLE_TEST_" + actionCounter, roleAction);
            removeRoleSuite.addCase(roleTestCase);
            actionCounter++;
        }

        actionCounter = 0;
        for(Demarcation demarcation: system.getAuthorizationPolicy().getDemarcations().stream()
                .filter(role -> !role.getName().contains("Proxy")).collect(Collectors.toList())) {
            CompoundAction demarcationAction = new CompoundAction(new Action(ActionType.REMOVE_DEMARCATION,
                    Arrays.asList(demarcation.getName())));
            TestCase demarcationTestCase = new TestCase("REMOVE_DEMARCATION_TEST_" + actionCounter, demarcationAction);
            removeDemarcationSuite.addCase(demarcationTestCase);
            actionCounter++;
        }

        actionCounter = 0;
        for(Permission permission: system.getAuthorizationPolicy().getPermissions()) {
                CompoundAction permissionAction = new CompoundAction(
                        new Action(ActionType.REMOVE_PERMISSION, Arrays.asList(permission.getName())),
                        new Action(ActionType.REMOVE_SECURITYZONE, Arrays.asList(permission.getPO().getName()))
                );
                TestCase permissionTestCase = new TestCase("REMOVE_PERMISSION_TEST_" + actionCounter, permissionAction);
                removePermissionSuite.addCase(permissionTestCase);
                actionCounter++;
        }

        //removeUserSuite.setCases(GeneratorUtils.randomSublist(removeUserSuite.getCases(), 50, rangen));
        //removeRoleSuite.setCases(GeneratorUtils.randomSublist(removeRoleSuite.getCases(), 50, rangen));
        //removeDemarcationSuite.setCases(GeneratorUtils.randomSublist(removeDemarcationSuite.getCases(), 50, rangen));
        //removePermissionSuite.setCases(GeneratorUtils.randomSublist(removePermissionSuite.getCases(), 50, rangen));

//        List<TestCase> removeUserTestCasesCopy = new LinkedList<>(removeUserSuite.getCases());
//        removeUserSuite.addCases(removeUserTestCasesCopy);
//        removeUserSuite.addCases(removeUserTestCasesCopy);
//
//        List<TestCase> removeRoleTestCasesCopy = new LinkedList<>(removeRoleSuite.getCases());
//        removeRoleSuite.addCases(removeRoleTestCasesCopy);
//        removeRoleSuite.addCases(removeRoleTestCasesCopy);
//
//        List<TestCase> removeDemarcationTestCasesCopy = new LinkedList<>(removeDemarcationSuite.getCases());
//        removeDemarcationSuite.addCases(removeDemarcationTestCasesCopy);
//        removeDemarcationSuite.addCases(removeDemarcationTestCasesCopy);
//
//        List<TestCase> removePermissionTestCaseCopy = new LinkedList<>(removePermissionSuite.getCases());
//        removePermissionSuite.addCases(removePermissionTestCaseCopy);
//        removePermissionSuite.addCases(removePermissionTestCaseCopy);

        collection.addSuites(removeUserSuite, removeRoleSuite, removeDemarcationSuite, removePermissionSuite);

        new File("./evaluation/RemoveEntities/data").mkdirs();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(Paths.get("./evaluation/RemoveEntities/data/tsc.json").toFile(), collection);
        mapper.writeValue(Paths.get("./evaluation/RemoveEntities/data/tsc_counter.json").toFile(), counter);

        File caseFile = new File(args[0]);
        Files.copy(caseFile.toPath(), new File("./evaluation/RemoveEntities/data/model.trbac").toPath());
    }
}
