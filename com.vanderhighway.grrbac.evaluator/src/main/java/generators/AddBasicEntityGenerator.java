package generators;

import com.fasterxml.jackson.databind.ObjectMapper;
import generators.datatypes.*;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.*;

import static java.lang.Thread.sleep;

public class AddBasicEntityGenerator {

    public static void main(String[] args) throws ParseException, ModelManipulationException, InterruptedException, IOException {

        TestSuiteCollection collection = new TestSuiteCollection("AddBasicEntityTestSuiteCollection");
        TestSuiteCollectionCounter counter = new TestSuiteCollectionCounter("AddBasicEntityTestSuiteCollection");

        TestSuite addUserSuite = new TestSuite("AddUserSuite", "./AddUserSuite/");
        TestSuite addRoleSuite = new TestSuite("AddRoleSuite", "./AddRoleSuite/");
        TestSuite addDemarcationSuite = new TestSuite("AddDemarcationSuite", "./AddDemarcationSuite/");
        TestSuite addPermissionSuite = new TestSuite("AddPermissionSuite", "./AddPermissionSuite/");

        int seed = 10;
        Random rangen = new Random(seed);

        for(int i=1; i<=80; i++) {
            CompoundAction userAction = new CompoundAction(new Action(ActionType.ADD_USER, Arrays.asList("TEST_USER_" + i)));
            TestCase userTestCase = new TestCase("ADD_USER_TEST_" + i, userAction);
            addUserSuite.addCase(userTestCase);

            CompoundAction roleAction = new CompoundAction(new Action(ActionType.ADD_ROLE, Arrays.asList("TEST_ROLE_" + i)));
            TestCase roleTestCase = new TestCase("ADD_ROLE_TEST_" + i, roleAction);
            addRoleSuite.addCase(roleTestCase);

            CompoundAction demarcationAction = new CompoundAction(new Action(ActionType.ADD_DEMARCATION,
                    Arrays.asList("TEST_DEMARCATION_" + i)));
            TestCase demarcationTestCase = new TestCase("ADD_DEMARCATION_TEST_" + i, demarcationAction);
            addDemarcationSuite.addCase(demarcationTestCase);

            CompoundAction permissionAction = new CompoundAction(
                    new Action(ActionType.ADD_PERMISSION, Arrays.asList("TEST_PERMISSION_" + i)),
                    new Action(ActionType.ADD_SECURITYZONE, Arrays.asList("TEST_ZONE_" + i, Boolean.toString(false))),
                    new Action(ActionType.ASSIGN_OBJECT_TO_PERMISSION, Arrays.asList("TEST_PERMISSION_" + i, "TEST_ZONE_" + i))
            );
            TestCase permissionTestCase = new TestCase("ADD_PERMISSION_TEST_" + i, permissionAction);
            addPermissionSuite.addCase(permissionTestCase);
        }

        // Duplicate all testcases times 3
        List<TestCase> addUserTestCasesCopy = new LinkedList<>(addUserSuite.getCases());
        addUserSuite.addCases(addUserTestCasesCopy);
        addUserSuite.addCases(addUserTestCasesCopy);

        List<TestCase> addRoleTestCasesCopy = new LinkedList<>(addRoleSuite.getCases());
        addRoleSuite.addCases(addRoleTestCasesCopy);
        addRoleSuite.addCases(addRoleTestCasesCopy);

        List<TestCase> addDemarcationTestCasesCopy = new LinkedList<>(addDemarcationSuite.getCases());
        addDemarcationSuite.addCases(addDemarcationTestCasesCopy);
        addDemarcationSuite.addCases(addDemarcationTestCasesCopy);

        List<TestCase> addPermissionTestCaseCopy = new LinkedList<>(addPermissionSuite.getCases());
        addPermissionSuite.addCases(addPermissionTestCaseCopy);
        addPermissionSuite.addCases(addPermissionTestCaseCopy);

        collection.addSuites(addUserSuite, addRoleSuite, addDemarcationSuite, addPermissionSuite);

        new File("./evaluation/AddEntities/data").mkdirs();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(Paths.get("./evaluation/AddEntities/data/tsc.json").toFile(), collection);
        mapper.writeValue(Paths.get("./evaluation/AddEntities/data/tsc_counter.json").toFile(), counter);

        File caseFile = new File(args[0]);
        Files.copy(caseFile.toPath(), new File("./evaluation/AddEntities/data/model.trbac").toPath());
    }
}
