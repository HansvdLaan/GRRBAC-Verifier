package generators;

import com.vanderhighway.grrbac.model.grrbac.model.TemporalAuthenticationRule;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;

public class TestCaseGenerator {

    public static void main(String... args) throws InterruptedException, ModelManipulationException, ParseException, IOException, InvocationTargetException {

        new Thread(() -> {
            try {
                AddBasicEntityGenerator.main(args);
                System.out.println("AddBasicEntityGenerator Done!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();


        new Thread(() -> {
            try {
                AddComplexEntityGenerator.main(args);
                System.out.println("AddComplexEntityGenerator Done!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                ConstraintModificationsGenerator.main(args);
                System.out.println("ConstraintModificationsGenerator Done!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                AssignEntityGenerator.main(args);
                System.out.println("AssignEntityGenerator Done!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                DeassignEntityGenerator.main(args);
                System.out.println("DeassignEntityGenerator Done!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                RemoveBasicEntityGenerator.main(args);
                System.out.println("RemoveBasicEntityGenerator Done!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                RemoveComplexEntityGenerator.main(args);
                System.out.println("RemoveComplexEntityGenerator Done!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                TemporalContextModificationsGenerator.main(args);
                System.out.println("TemporalContextModificationsGenerator Done!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }
}
