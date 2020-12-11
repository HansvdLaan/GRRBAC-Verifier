package evaluator;

import com.brein.time.timeintervals.intervals.IntegerInterval;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import com.vanderhighway.grrbac.core.CoreUtils;
import com.vanderhighway.grrbac.core.modifier.PolicyAutomaticModifier;
import com.vanderhighway.grrbac.core.modifier.PolicyModifier;
import com.vanderhighway.grrbac.model.grrbac.model.GRRBACPackage;
import com.vanderhighway.grrbac.model.grrbac.model.SiteAccessControlSystem;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import com.vanderhighway.grrbac.patterns.*;
import generators.datatypes.*;
import org.apache.log4j.Level;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
import org.eclipse.viatra.query.runtime.emf.EMFScope;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchEMFBackendFactory;
import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchHints;
import org.eclipse.viatra.query.runtime.matchers.backend.QueryEvaluationHint;
import org.eclipse.viatra.query.runtime.rete.matcher.DRedReteBackendFactory;
import org.eclipse.viatra.query.runtime.rete.util.ReteHintOptions;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class Evaluator {

    private static DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

    public static void main(String[] args) throws ParseException, ModelManipulationException, InterruptedException, IOException, InvocationTargetException {

        // output all unexpected errors to the log file!
        System.setErr(new PrintStream(new FileOutputStream("errors.log", true), true));

        GRRBACPackage.eINSTANCE.getName();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("trbac", new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

        ObjectMapper mapper = new ObjectMapper();
        File testSuiteCollectionFile = new File(args[1]);
        TestSuiteCollection collection = mapper.readValue(testSuiteCollectionFile, new TypeReference<TestSuiteCollection>() {});

        File file = new File("evaluator.log");
        FileWriter fw = new FileWriter(file,true); //the true will append the new data
        fw.write("Evaluator Booted!\n");
        fw.close();
        long startTime = System.currentTimeMillis();

        URI performanceTestCase = URI.createFileURI(args[0]);
        ResourceSet set = new ResourceSetImpl();
        Resource resource = set.getResource(performanceTestCase, true);
        CoreUtils utils = new CoreUtils();
        utils.addMissingDaySchedules(resource, (SiteAccessControlSystem) resource.getContents().get(0));

        long t1 = System.currentTimeMillis();

        fw = new FileWriter(file,true); //the true will append the new data
        fw.write("Loaded Model! (~" + (t1 - startTime)/1000.0 + "s) \n");
        fw.close();

        //QueryEvaluationHint localSearchHint = LocalSearchHints.getDefault().build();
        ViatraQueryEngineOptions options = ViatraQueryEngineOptions.defineOptions()
                //.withDefaultHint(localSearchHint)
                .withDefaultBackend(DRedReteBackendFactory.INSTANCE)
                .withDefaultSearchBackend(LocalSearchEMFBackendFactory.INSTANCE)
                .withDefaultCachingBackend(DRedReteBackendFactory.INSTANCE)
                .build();
        final AdvancedViatraQueryEngine engine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(set), options);
        ViatraQueryLoggingUtil.getDefaultLogger().setLevel(Level.OFF);

        PolicyModifier modifier = new PolicyModifier(engine, (SiteAccessControlSystem) resource.getContents().get(0), resource);
        modifier.setInstanceIDCounter(utils.getInstanceIDCounter());
        PolicyAutomaticModifier automaticModifier = new PolicyAutomaticModifier(engine, modifier,
                (SiteAccessControlSystem) resource.getContents().get(0));

        automaticModifier.initialize();
        automaticModifier.execute();

        long t2 = System.currentTimeMillis();

        fw = new FileWriter(file,true); //the true will append the new data
        fw.write("Loaded Modifiers! (~" + (t2 - t1)/1000.0 + "s) \n");
        fw.close();

        // TODO: do proper parameter handling with JLine and PicoCLI
        boolean computeContextDependentAuthorizationConstriants = false;
        if(args.length == 2 && "-cdac".equals(args[1])) {
            computeContextDependentAuthorizationConstriants = true;
        }

        modifier.getEngine().prepareGroup(PolicyTemporalRelations.instance(), null);
        modifier.getEngine().prepareGroup(PolicyAuthorizationRelations.instance(), null);
        if(computeContextDependentAuthorizationConstriants) {
            modifier.getEngine().prepareGroup(PolicyAccessibilityRelations.instance(), null);
        }
        modifier.getEngine().prepareGroup(PolicyCDConstraints.instance(), null);
        modifier.getEngine().prepareGroup(PolicySmells.instance(), null);
        if(computeContextDependentAuthorizationConstriants) {
            modifier.getEngine().prepareGroup(PolicyCIConstraints.instance(), null);
        }

        long t3 = System.currentTimeMillis();

        fw = new FileWriter(file,true); //the true will append the new data
        fw.write("Loaded Query Groups! (~" + (t3 - t2)/1000.0 + "s) \n");
        fw.close();

        Runtime runtime = Runtime.getRuntime();
        // Run the garbage collector
        runtime.gc();
        // Calculate the used memory
        long memory = (runtime.totalMemory() - runtime.freeMemory()) / (1024L * 1024L);

        file = new File("evaluator.log");
        fw = new FileWriter(file,true); //the true will append the new data
        fw.write("Used memory: " + memory + " MB \n");
        fw.write("Loaded at !(" + df.format(new Date()) + ") \n");
        fw.close();


        boolean exists = false;
        int waitCounter = 0;
        while (!exists) {
            fw = new FileWriter(file,true); //the true will append the new data
            fw.write("waiting for counter file... (~" + waitCounter + "s) \n");
            fw.close();
            Thread.sleep(1000);
            File counterFile = new File(args[2]);
            exists = counterFile.exists();
            waitCounter++;
        }

        File counterFile = new File(args[2]);
        TestSuiteCollectionCounter counter = mapper.readValue(counterFile, new TypeReference<TestSuiteCollectionCounter>() {});

        List<Action> history = new LinkedList();
        List<CompoundMeasurement> measurements = new LinkedList<>();
        TestSuite testSuite = null;
        TestCase testCase = null;
        try {
            testSuite = collection.getSuites().get(counter.getSuiteCounter());
            testCase = testSuite.getCases().get(counter.getCaseCounter());
            for (CompoundAction compoundAction: testCase.getCompoundActions()) {
                CompoundMeasurement compoundMeasurement = new CompoundMeasurement(new LinkedList<>());
                for (Action action : compoundAction.getActions()) {
                    history.add(action);

                    Measurement measurement = new Measurement(-1, -1);
                    PerformActionCallable callable = new PerformActionCallable(action, modifier, automaticModifier);
                    FutureTask<Measurement> timeoutTask = null;

                    try {
                        timeoutTask = new FutureTask<Measurement>(callable);
                        new Thread(timeoutTask).start();
                        measurement = timeoutTask.get(5L, TimeUnit.MINUTES);
                    } catch (InterruptedException e) {
                        measurement = new Measurement(300000, -1);
                        file = new File("evaluator.log");
                        fw = new FileWriter(file,true); //the true will append the new data
                        fw.write("Collection: " + collection.getName() + " Suite:" + counter.getSuiteCounter()
                                + " Case:" + counter.getCaseCounter() + "\n");
                        fw.write("Test Case Interrupted! at: " + history.toString() + "\n");
                        fw.close();
                    } catch (ExecutionException e) {
                        measurement = new Measurement(300000, -1);
                        file = new File("evaluator.log");
                        fw = new FileWriter(file,true); //the true will append the new data
                        fw.write("Collection: " + collection.getName() + " Suite:" + counter.getSuiteCounter()
                                + " Case:" + counter.getCaseCounter() + "\n");
                        fw.write("Execution Exception! at: " + history.toString() + "\n");
                        fw.close();
                    } catch (TimeoutException e) {
                        measurement = new Measurement(300000, -1);
                        file = new File("evaluator.log");
                        fw = new FileWriter(file,true); //the true will append the new data
                        fw.write("Collection: " + collection.getName() + " Suite:" + counter.getSuiteCounter()
                                + " Case:" + counter.getCaseCounter() + "\n");
                        fw.write("Time out! at: " + history.toString() + "\n");
                        fw.close();
                    }
                    compoundMeasurement.addMeasurements(measurement);
                }
                measurements.add(compoundMeasurement);
            }
        } catch (Exception e) {
            file = new File("evaluator.log");
            fw = new FileWriter(file,true); //the true will append the new data
            fw.write("Collection: " + collection.getName() + " Suite:" + counter.getSuiteCounter()
                    + " Case:" + counter.getCaseCounter() + "\n");
            fw.write("The following action caused an error: " + history.toString() + "\n");
            fw.write("Error: " + e.getMessage() + "\n");
            fw.close();
            try(Writer w = new FileWriter(file, true)) {
                e.printStackTrace(new PrintWriter(new BufferedWriter(w)));
            }
            fw = new FileWriter(file,true);
            history = history.subList(0, history.size());
            fw.write("History (" + history.size() + "): " + history.toString() + "\n");
            fw.write("Measurements (" + measurements.size() + "): " + measurements.toString() + "\n");
            fw.close();
            return;
        }

        TestCaseResult result = new TestCaseResult(testCase.getName() + "_result", measurements);

        File directory = new File(testSuite.getOutputDirectory());
        if (! directory.exists()){
            directory.mkdir();
        }

        Double totalRunTime = measurements.stream().map(x -> x.getMeasurements()
                .stream().map(Measurement::getTime).reduce(Double.valueOf(0), Double::sum))
                .reduce((double) 0, Double::sum);
        totalRunTime = totalRunTime / 1000;
        fw = new FileWriter(file,true); //the true will append the new data
        fw.write("Test Suite " + testSuite.getName() + ", Test Case " + testCase.getName() + " (" + counter.getSuiteCounter() + "," +
                counter.getCaseCounter() + ") ran succesfully! (~" + String.format("%.2f", totalRunTime) + "s) \n");
        fw.close();

        mapper.writeValue(Paths.get(testSuite.getOutputDirectory() + "/result_" + counter.getCaseCounter() + ".json").toFile(), result);

        counterFile.delete();
        //increment the counters
        if(testSuite.getCases().size() > counter.getCaseCounter() + 1) {
            counter.setCaseCounter(counter.getCaseCounter() + 1);
        } else {
            if(collection.getSuites().size() > counter.getSuiteCounter() + 1) {
                counter.setSuiteCounter(counter.getSuiteCounter() + 1);
                counter.setCaseCounter(0);
                fw = new FileWriter(file,true); //the true will append the new data
                fw.write("Finished collection! (" + df.format(new Date()) + ")\n");
                fw.close();
            } else {
                fw = new FileWriter(file,true); //the true will append the new data
                fw.write("Finished all tests! (" + df.format(new Date()) + ")\n");
                fw.close();
                return;
            }
        }
        mapper.writeValue(Paths.get(args[2]).toFile(), counter);
    }

    private static Measurement performAction(Action action, PolicyModifier modifier, PolicyAutomaticModifier automaticModifier) throws Exception {
        long timeElapsed;
        long memoryUsed;
        long start;
        long finish;
        switch (action.getType()) {
            case ADD_USER: {
                String name = action.getParameters().get(0);
                start = System.nanoTime();
                modifier.addUser(name);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_ROLE: {
                String name = action.getParameters().get(0);
                start = System.nanoTime();
                modifier.addRole(name);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_DEMARCATION: {
                String name = action.getParameters().get(0);
                start = System.nanoTime();
                modifier.addUser(name);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_PERMISSION: {
                String name = action.getParameters().get(0);
                start = System.nanoTime();
                modifier.addPermission(name);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_TEMPORALCONTEXT: {
                String name = action.getParameters().get(0);
                start = System.nanoTime();
                modifier.addTemporalContext(name);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_TEMPORALCONTEXTINSTANCE: {
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(0));
                ValidDay validDay = (ValidDay) modifier.getResource().getEObject(action.getParameters().get(1));
                int lowerBound = Integer.parseInt(action.getParameters().get(2));
                int upperBound = Integer.parseInt(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addTemporalContextInstance(context, validDay, new IntegerInterval(lowerBound, upperBound));
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_TEMPORALGRANTRULE: {
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(1));
                String name = action.getParameters().get(0);
                Role role = (Role) modifier.getResource().getEObject(action.getParameters().get(2));
                Demarcation demarcation = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(3));
                boolean enable = Boolean.parseBoolean(action.getParameters().get(4));
                int priority = Integer.parseInt(action.getParameters().get(5));
                start = System.nanoTime();
                modifier.addTemporalGrantRule(context, name, role, demarcation, enable, priority);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_TEMPORALAUTHENTICATIONRULE: {
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(1));
                String name = action.getParameters().get(0);
                SecurityZone zone = (SecurityZone) modifier.getResource().getEObject(action.getParameters().get(2));
                int status = Integer.parseInt(action.getParameters().get(3));
                int priority = Integer.parseInt(action.getParameters().get(4));
                start = System.nanoTime();
                modifier.addTemporalAuthenticationRule(context, name, zone, status, priority);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_SECURITYZONE: {
                String name = action.getParameters().get(0);
                boolean isPublic = Boolean.parseBoolean(action.getParameters().get(1));
                start = System.nanoTime();
                modifier.addSecurityZone(name, isPublic);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_UNIDIRECTIONAL_REACHABILITY: {
                SecurityZone fromZone = (SecurityZone) modifier.getResource().getEObject(action.getParameters().get(0));
                SecurityZone toZone = (SecurityZone) modifier.getResource().getEObject(action.getParameters().get(1));
                start = System.nanoTime();
                modifier.setReachability(fromZone, toZone);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case REMOVE_USER: {
                User user = (User) modifier.getResource().getEObject(action.getParameters().get(0));
                start = System.nanoTime();
                modifier.removeUser(user);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case REMOVE_ROLE: {
                Role role = (Role) modifier.getResource().getEObject(action.getParameters().get(0));
                start = System.nanoTime();
                modifier.removeRole(role);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case REMOVE_DEMARCATION: {
                Demarcation demarcation = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(0));
                start = System.nanoTime();
                modifier.removeDemarcation(demarcation);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case REMOVE_PERMISSION: {
                Permission permission = (Permission) modifier.getResource().getEObject(action.getParameters().get(0));
                start = System.nanoTime();
                modifier.removePermission(permission);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case REMOVE_TEMPORALCONTEXT: {
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(0));
                start = System.nanoTime();
                modifier.removeTemporalContext(context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case REMOVE_TEMPORALCONTEXTINSTANCE:
                TimeRange timeRange = (TimeRange) modifier.getResource().getEObject(action.getParameters().get(0));
                start = System.nanoTime();
                modifier.removeTemporalContextInstance(timeRange);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            case REMOVE_TEMPORALGRANTRULE: {
                TemporalGrantRule rule = (TemporalGrantRule) modifier.getResource().getEObject(action.getParameters().get(0));
                start = System.nanoTime();
                modifier.removeTemporalGrantRule(rule);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case REMOVE_TEMPORALAUTHENTICATIONRULE: {
                TemporalAuthenticationRule rule = (TemporalAuthenticationRule) modifier.getResource().getEObject(action.getParameters().get(0));
                start = System.nanoTime();
                modifier.removeTemporalAuthenticationRule(rule);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case REMOVE_SECURITYZONE: {
                SecurityZone zone = (SecurityZone) modifier.getResource().getEObject(action.getParameters().get(0));
                start = System.nanoTime();
                modifier.removeSecurityZone(zone);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case REMOVE_UNIDIRECTIONAL_REACHABILITY: {
                SecurityZone fromZone = (SecurityZone) modifier.getResource().getEObject(action.getParameters().get(0));
                SecurityZone toZone = (SecurityZone) modifier.getResource().getEObject(action.getParameters().get(1));
                start = System.nanoTime();
                modifier.removeReachability(fromZone, toZone);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ASSIGN_ROLE_TO_USER: {
                User user = (User) modifier.getResource().getEObject(action.getParameters().get(0));
                Role role = (Role) modifier.getResource().getEObject(action.getParameters().get(1));
                start = System.nanoTime();
                modifier.assignRoleToUser(user, role);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ASSIGN_PERMISSION_TO_DEMARCATION: {
                Demarcation demarcation = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(0));
                Permission permission = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
                start = System.nanoTime();
                modifier.assignPermissionToDemarcation(demarcation, permission);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ASSIGN_OBJECT_TO_PERMISSION: {
                Permission permission = (Permission) modifier.getResource().getEObject(action.getParameters().get(0));
                SACSObject object = (SACSObject) modifier.getResource().getEObject(action.getParameters().get(1));
                start = System.nanoTime();
                modifier.assignObjectToPermission(permission, object);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case DEASSIGN_ROLE_FROM_USER: {
                User user = (User) modifier.getResource().getEObject(action.getParameters().get(0));
                Role role = (Role) modifier.getResource().getEObject(action.getParameters().get(1));
                start = System.nanoTime();
                modifier.deassignRoleFromUser(user, role);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case DEASSIGN_PERMISSION_FROM_DEMARCATION: {
                Demarcation demarcation = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(0));
                Permission permission = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
                start = System.nanoTime();
                modifier.deassignPermissionFromDemarcation(demarcation, permission);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case DEASSIGN_OBJECT_FROM_PERMISSION: {
                Permission permission = (Permission) modifier.getResource().getEObject(action.getParameters().get(0));
                SACSObject object = (SACSObject) modifier.getResource().getEObject(action.getParameters().get(1));
                start = System.nanoTime();
                modifier.deassignObjectFromPermission(permission, object);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_SODUR: {
                String name = action.getParameters().get(0);
                Role role1 = (Role) modifier.getResource().getEObject(action.getParameters().get(1));
                Role role2 = (Role) modifier.getResource().getEObject(action.getParameters().get(2));
                start = System.nanoTime();
                modifier.addSoDURConstraint(name, role1, role2);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_SODUD: {
                String name = action.getParameters().get(0);
                Demarcation demarcation1 = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(1));
                Demarcation demarcation2 = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addSoDUDConstraint(name, demarcation1, demarcation2, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_SODUP: {
                String name = action.getParameters().get(0);
                Permission permission1 = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
                Permission permission2 = (Permission) modifier.getResource().getEObject(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addSoDUPConstraint(name, permission1, permission2, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_SODRD: {
                String name = action.getParameters().get(0);
                Demarcation demarcation1 = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(1));
                Demarcation demarcation2 = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addSoDRDConstraint(name, demarcation1, demarcation2, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_SODRP: {
                String name = action.getParameters().get(0);
                Permission permission1 = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
                Permission permission2 = (Permission) modifier.getResource().getEObject(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addSoDRPConstraint(name, permission1, permission2, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_SODDP: {
                String name = action.getParameters().get(0);
                Permission permission1 = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
                Permission permission2 = (Permission) modifier.getResource().getEObject(action.getParameters().get(2));
                start = System.nanoTime();
                modifier.addSoDDPConstraint(name, permission1, permission2);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }

            case ADD_CONSTRAINT_BODUR: {
                String name = action.getParameters().get(0);
                Role role1 = (Role) modifier.getResource().getEObject(action.getParameters().get(1));
                Role role2 = (Role) modifier.getResource().getEObject(action.getParameters().get(2));
                start = System.nanoTime();
                modifier.addBoDURConstraint(name, role1, role2);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_BODUD: {
                String name = action.getParameters().get(0);
                Demarcation demarcation1 = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(1));
                Demarcation demarcation2 = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addBoDUDConstraint(name, demarcation1, demarcation2, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_BODUP: {
                String name = action.getParameters().get(0);
                Permission permission1 = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
                Permission permission2 = (Permission) modifier.getResource().getEObject(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addBoDUPConstraint(name, permission1, permission2, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_BODRD: {
                String name = action.getParameters().get(0);
                Demarcation demarcation1 = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(1));
                Demarcation demarcation2 = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addBoDRDConstraint(name, demarcation1, demarcation2, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_BODRP: {
                String name = action.getParameters().get(0);
                Permission permission1 = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
                Permission permission2 = (Permission) modifier.getResource().getEObject(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addBoDRPConstraint(name, permission1, permission2, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_BODDP: {
                String name = action.getParameters().get(0);
                Permission permission1 = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
                Permission permission2 = (Permission) modifier.getResource().getEObject(action.getParameters().get(2));
                start = System.nanoTime();
                modifier.addBoDDPConstraint(name, permission1, permission2);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_PREREQUR: {
                String name = action.getParameters().get(0);
                Role role1 = (Role) modifier.getResource().getEObject(action.getParameters().get(1));
                Role role2 = (Role) modifier.getResource().getEObject(action.getParameters().get(2));
                start = System.nanoTime();
                modifier.addPrerequisiteURConstraint(name, role1, role2);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_PREREQUD: {
                String name = action.getParameters().get(0);
                Demarcation demarcation1 = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(1));
                Demarcation demarcation2 = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addPrerequisiteUDConstraint(name, demarcation1, demarcation2, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_PREREQUP: {
                String name = action.getParameters().get(0);
                Permission permission1 = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
                Permission permission2 = (Permission) modifier.getResource().getEObject(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addPrerequisiteUPConstraint(name, permission1, permission2, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_PREREQRD: {
                String name = action.getParameters().get(0);
                Demarcation demarcation1 = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(1));
                Demarcation demarcation2 = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addPrerequisiteRDConstraint(name, demarcation1, demarcation2, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_PREREQRP: {
                String name = action.getParameters().get(0);
                Permission permission1 = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
                Permission permission2 = (Permission) modifier.getResource().getEObject(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addPrerequisiteRPConstraint(name, permission1, permission2, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_PREREQDP: {
                String name = action.getParameters().get(0);
                Permission permission1 = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
                Permission permission2 = (Permission) modifier.getResource().getEObject(action.getParameters().get(2));
                start = System.nanoTime();
                modifier.addPrerequisiteDPConstraint(name, permission1, permission2);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }

            case ADD_CONSTRAINT_CARDUR: {
                String name = action.getParameters().get(0);
                Role role = (Role) modifier.getResource().getEObject(action.getParameters().get(1));
                int bound = Integer.parseInt(action.getParameters().get(2));
                start = System.nanoTime();
                modifier.addCardinalityURConstraint(name, role, bound);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_CARDUD: {
                String name = action.getParameters().get(0);
                Demarcation demarcation = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(1));
                int bound = Integer.parseInt(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addCardinalityUDConstraint(name, demarcation, bound, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_CARDUP: {
                String name = action.getParameters().get(0);
                Permission permission = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
                int bound = Integer.parseInt(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addCardinalityUPConstraint(name, permission, bound, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_CARDRD: {
                String name = action.getParameters().get(0);
                Demarcation demarcation = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(1));
                int bound = Integer.parseInt(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addCardinalityRDConstraint(name, demarcation, bound, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_CARDRP: {
                String name = action.getParameters().get(0);
                Permission permission = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
                int bound = Integer.parseInt(action.getParameters().get(2));
                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(3));
                start = System.nanoTime();
                modifier.addCardinalityRPConstraint(name, permission, bound, context);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            case ADD_CONSTRAINT_CARDDP: {
                String name = action.getParameters().get(0);
                Permission permission = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
                int bound = Integer.parseInt(action.getParameters().get(2));
                start = System.nanoTime();
                modifier.addCardinalityDPConstraint(name, permission, bound);
                automaticModifier.getTransformation().getExecutionSchema().startUnscheduledExecution();
                finish = System.nanoTime();
                timeElapsed = finish - start;
                break;
            }
            default:
                throw new IllegalArgumentException("Unkown action type: " + action.getType());
        }

        Runtime runtime = Runtime.getRuntime();
        //runtime.gc();
        long memory = (runtime.totalMemory() - runtime.freeMemory()) / (1024L * 1024L);
        return new Measurement(timeElapsed / 1_000_000.0, memory);
    }

    public static class PerformActionCallable implements Callable<Measurement>{
        private Action action;
        private PolicyModifier modifier;
        private PolicyAutomaticModifier automaticModifier;

        public PerformActionCallable(Action action, PolicyModifier modifier, PolicyAutomaticModifier automaticModifier) {
            this.action = action;
            this.modifier = modifier;
            this.automaticModifier = automaticModifier;
        }

        public Measurement call() throws Exception {
            return performAction(action, modifier, automaticModifier);
        }
    }

    public static <T> T getRandom(List<T> list, Random seed) {
        int objectIndex = seed.nextInt(list.size());
        return list.get(objectIndex);
    }

    //TODO: place this somewhere as a core utility!
    public static String addDayToDateString(String dateString) throws ParseException {
        Calendar cal = Calendar.getInstance();
        DateFormat format = new SimpleDateFormat("d_MMMM_yyyy", Locale.ENGLISH);
        cal.setTime(format.parse(dateString));
        int day = cal.get(Calendar.DAY_OF_WEEK);
        String newDateString = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday").get(day - 1);
        newDateString = newDateString + "_" + dateString;
        return newDateString;
    }
}
