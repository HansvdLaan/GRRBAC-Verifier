//package evaluator;
//
//import com.brein.time.timeintervals.intervals.IntegerInterval;
//import com.fasterxml.jackson.core.type.TypeReference;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.vanderhighway.grrbac.core.CoreUtils;
//import com.vanderhighway.grrbac.core.modifier.PolicyAutomaticModifier;
//import com.vanderhighway.grrbac.core.modifier.PolicyModifier;
//import com.vanderhighway.grrbac.model.grrbac.model.*;
//import com.vanderhighway.grrbac.patterns.PolicySmells;
//import generators.datatypes.Action;
//import generators.datatypes.ActionType;
//import generators.datatypes.TestSuiteCollection;
//import org.apache.log4j.Level;
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
//import org.eclipse.viatra.query.runtime.api.ViatraQueryEngineOptions;
//import org.eclipse.viatra.query.runtime.emf.EMFScope;
//import org.eclipse.viatra.query.runtime.localsearch.matcher.integration.LocalSearchEMFBackendFactory;
//import org.eclipse.viatra.query.runtime.rete.matcher.DRedReteBackendFactory;
//import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
//import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
//
//import java.io.File;
//import java.io.IOException;
//import java.lang.reflect.InvocationTargetException;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//import java.util.concurrent.atomic.AtomicLong;
//import java.util.stream.Collectors;
//
//import static java.lang.Thread.sleep;
//
//public class EvaluatorBackup {
//
//    public static List<String> allWeekDays = Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
//    public static List<String> allMonthDays;
//    public static List<String> allWeekMonthDays;
//    public static List<String> allYearDays;
//
//    public static void main(String[] args) throws ParseException, ModelManipulationException, InterruptedException, IOException, InvocationTargetException {
//
//        GRRBACPackage.eINSTANCE.getName();
//        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("trbac", new XMIResourceFactoryImpl());
//        Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());
//
//        EvaluatorBackup.allMonthDays = new LinkedList<>();
//        EvaluatorBackup.allWeekMonthDays = new LinkedList<>();
//        EvaluatorBackup.allYearDays = new LinkedList<>();
//
//        List<String> months = Arrays.asList("January", "February", "March", "April", "May", "June", "July", "August",
//                "September", "October", "November", "December");
//        List<Integer> monthDays = Arrays.asList(31,29,31,30,31,30,31,31,30,31,30,31);
//        for (int monthIndex = 0; monthIndex < months.size(); monthIndex++) {
//            for (int dayIndex = 0; dayIndex < monthDays.get(monthIndex); dayIndex++) {
//                allMonthDays.add(dayIndex + "_" + months.get(monthIndex));
//            }
//        }
//
//        for(String weekDay: allWeekDays) {
//            for(String monthDay: allMonthDays) {
//                allWeekMonthDays.add(weekDay + "_" + monthDay);
//            }
//        }
//
//        for (int yearIndex = 2020; yearIndex <= 2030; yearIndex++) {
//            for (String monthDay: allMonthDays) {
//                allYearDays.add(addDayToDateString(monthDay + "_" + yearIndex));
//            }
//        }
//
//        URI performanceTestCase = URI.createFileURI("./performance_case.trbac");
//        ResourceSet set = new ResourceSetImpl();
//        Resource resource = set.getResource(performanceTestCase, true);
//        CoreUtils utils = new CoreUtils();
//        utils.addMissingDaySchedules(resource, (SiteAccessControlSystem) resource.getContents().get(0));
//
//        ViatraQueryEngineOptions options = ViatraQueryEngineOptions.defineOptions()
//                .withDefaultBackend(DRedReteBackendFactory.INSTANCE)
//                .withDefaultCachingBackend(DRedReteBackendFactory.INSTANCE)
//                .withDefaultSearchBackend(LocalSearchEMFBackendFactory.INSTANCE)
//                .build();
//        final AdvancedViatraQueryEngine engine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(set), options);
//        ViatraQueryLoggingUtil.getDefaultLogger().setLevel(Level.OFF);
//
//        PolicyModifier modifier = new PolicyModifier(engine, (SiteAccessControlSystem) resource.getContents().get(0), resource);
//        modifier.setInstanceIDCounter(utils.getInstanceIDCounter());
//        PolicyAutomaticModifier automaticModifier = new PolicyAutomaticModifier(engine, modifier,
//                (SiteAccessControlSystem) resource.getContents().get(0));
//
//        automaticModifier.initialize();
//        automaticModifier.execute();
//
//        System.out.println("Modifiers Loaded!");
//        modifier.getEngine().prepareGroup(PolicyRelations.instance(), null);
//        modifier.getEngine().prepareGroup(PolicyConstraints.instance(), null);
//        modifier.getEngine().prepareGroup(PolicySmells.instance(), null);
//
//        System.out.println("Groups prepared!");
//
//        //System.out.println("Model Loaded!");
//        sleep(15000);
//        //Scanner in = new Scanner(System.in);
//        int seed = 10;
//        int n =  50;
//        Random rangen = new Random(seed);
//
//        //PolicyValidator validator = new PolicyValidator(engine);
//        //validator.addChangeListeners(engine, false);
//
//        System.out.println("Seed:" + seed);
//        System.out.println("N:" + n);
//        List<Action> history = new LinkedList();
//        List<Measurement> measurements = new LinkedList<>();
//        Map<String, AtomicLong> counterMap = prepareCounterMap();
//
//        File testSuiteCollectionFile = new File("testsuitecollection.json");
//        ObjectMapper mapper = new ObjectMapper();
//        TestSuiteCollection testSuiteCollection = mapper.readValue(testSuiteCollectionFile, new TypeReference<TestSuiteCollection>() {});
//
//        for (int i = 0; i < n; i++) {
//            Action action = generateAction(rangen, history, (SiteAccessControlSystem) resource.getContents().get(0), counterMap);
//            try {
//                Measurement measurement = performAction(action, modifier);
//                history.add(action);
//                measurements.add(measurement);
//                System.out.println(action.toString() + ":" + measurement.toString() );
//            } catch (Exception e) {
//                System.out.println("Error: " + e.getMessage());
//                System.out.println("The following action caused an error: " + action.toString());
//                e.printStackTrace();
//                System.out.println("History (" + history.size() + "): " + history.toString());
//                return;
//            }
//        }
//    }
//
//    private static Map<String, AtomicLong> prepareCounterMap() {
//        Map<String, AtomicLong> counterMap = new HashMap<>();
//        counterMap.put("User", new AtomicLong(0));
//        counterMap.put("Role", new AtomicLong(0));
//        counterMap.put("Demarcation", new AtomicLong(0));
//        counterMap.put("Permission", new AtomicLong(0));
//        counterMap.put("TC", new AtomicLong(0));
//        counterMap.put("TGR", new AtomicLong(0));
//        counterMap.put("TAR", new AtomicLong(0));
//        counterMap.put("SZ", new AtomicLong(0));
//        return counterMap;
//    }
//
//    private static Action generateAction(Random rangen, List<Action> history, SiteAccessControlSystem system, Map<String, AtomicLong> counterMap) {
//        int actionIndex = rangen.nextInt(100);
//
//        // ADD BASIC ENTITIES
//        if(actionIndex < 20) {
//            actionIndex = rangen.nextInt(100);
//
//            // ADD User
//            if(actionIndex < 25) {
//                return new Action(ActionType.ADD_USER, Arrays.asList("TEST_USER_" + counterMap.get("User").getAndIncrement()));
//            }
//
//            // ADD Role
//            else if(actionIndex < 50) {
//                return new Action(ActionType.ADD_ROLE, Arrays.asList("TEST_ROLE_" + counterMap.get("Role").getAndIncrement()));
//            }
//
//            // ADD Demarcation
//            else if(actionIndex < 75) {
//                return new Action(ActionType.ADD_DEMARCATION, Arrays.asList("TEST_DEMARCATION_" + counterMap.get("Demarcation").getAndIncrement()));
//            }
//
//            // ADD Permission
//            else  {
//                return new Action(ActionType.ADD_PERMISSION, Arrays.asList("TEST_PERMISSION_" + counterMap.get("Permission").getAndIncrement()));
//            }
//
//        }
//
//        // REMOVE BASIC ENTITIES
//        else if(actionIndex < 40) {
//            actionIndex = rangen.nextInt(100);
//
//            // REMOVE User
//            if(actionIndex < 25) {
//                User user = getRandom(system.getAuthorizationPolicy().getUsers(), rangen);
//                return new Action(ActionType.REMOVE_USER, Arrays.asList(user.getName()));
//            }
//
//            // REMOVE Role
//            else if(actionIndex < 50) {
//                Role role = getRandom(system.getAuthorizationPolicy().getRoles(), rangen);
//                return new Action(ActionType.REMOVE_ROLE, Arrays.asList(role.getName()));
//            }
//
//            // REMOVE Demarcation
//            else if(actionIndex < 75) {
//                Demarcation demarcation = getRandom(system.getAuthorizationPolicy().getDemarcations(), rangen);
//                return new Action(ActionType.REMOVE_DEMARCATION, Arrays.asList(demarcation.getName()));
//            }
//
//            // REMOVE Permission
//            else  {
//                Permission permission = getRandom(system.getAuthorizationPolicy().getPermissions(), rangen);
//                return new Action(ActionType.REMOVE_PERMISSION, Arrays.asList(permission.getName()));
//            }
//        }
//
//        // ASSIGN BASIC ENTITIES
//        else if(actionIndex < 60) {
//            actionIndex = rangen.nextInt(100);
//
//            // ASSIGN Role to User
//            if(actionIndex < 50) {
//                User user = getRandom(system.getAuthorizationPolicy().getUsers(), rangen);
//                Role role = getRandom(system.getAuthorizationPolicy().getRoles(), rangen);
//                return new Action(ActionType.ASSIGN_ROLE_TO_USER, Arrays.asList(
//                        user.getName(),
//                        role.getName()
//                        ));
//            }
//
//            // ASSIGN Permission to Demarcation
//            else {
//                Demarcation demarcation = getRandom(system.getAuthorizationPolicy().getDemarcations(), rangen);
//                Permission permission = getRandom(system.getAuthorizationPolicy().getPermissions(), rangen);
//                return new Action(ActionType.ASSIGN_PERMISSION_TO_DEMARCATION, Arrays.asList(
//                        demarcation.getName(),
//                        permission.getName()
//                ));
//            }
//        }
//
//        //REMOVE BASIC ENTITIES
//        else if(actionIndex < 80)  {
//            actionIndex = rangen.nextInt(100);
//
//            // DEASSIGN Role from User
//            if(actionIndex < 50) {
//                List<User> usersWithAnAssignedRole = system.getAuthorizationPolicy().getUsers()
//                        .stream().filter(u -> u.getUR().size() > 0).collect(Collectors.toList());
//                system.getAuthorizationPolicy().getUsers().get(0).getUR();
//                User user = getRandom(usersWithAnAssignedRole, rangen);
//                Role role = getRandom(user.getUR(), rangen);
//                return new Action(ActionType.DEASSIGN_ROLE_FROM_USER, Arrays.asList(
//                        user.getName(),
//                        role.getName()
//                ));
//            }
//
//            // DEASSIGN Permission from Demarcation
//            else {
//                List<Demarcation> demarcationsWithAnAssignedPermision = system.getAuthorizationPolicy().getDemarcations()
//                        .stream().filter(d -> d.getDP().size() > 0).collect(Collectors.toList());
//                Demarcation demarcation = getRandom(demarcationsWithAnAssignedPermision, rangen);
//                Permission permission = getRandom(demarcation.getDP(), rangen);
//                return new Action(ActionType.DEASSIGN_PERMISSION_FROM_DEMARCATION, Arrays.asList(
//                        demarcation.getName(),
//                        permission.getName()
//                ));
//            }
//        }
//
//        if(actionIndex < 100) {
//            actionIndex = rangen.nextInt(240);
//
//            // ADD TemporalContext
//            if(actionIndex < 20) {
//                return new Action(ActionType.ADD_TEMPORALCONTEXT, Arrays.asList("TEST_TC_" + counterMap.get("TC").getAndIncrement()));
//            }
//
//            // REMOVE TemporalContext
//            if(actionIndex < 40) {
//                TemporalContext context = getRandom(system.getSchedule().getTemporalContexts(), rangen);
//                return new Action(ActionType.REMOVE_TEMPORALCONTEXT, Arrays.asList(context.getName()));
//            }
//
//            // ADD TemporalContextInstance
//            if(actionIndex < 60) {
//                TemporalContext context = getRandom(system.getSchedule().getTemporalContexts(), rangen);
//                String daySchedule = "";
//                switch (rangen.nextInt(3)) {
//                    case 0:
//                        daySchedule = getRandom(allWeekDays, rangen);
//                        break;
//                    case 1:
//                        daySchedule = getRandom(allMonthDays, rangen);
//                        break;
//                    case 2:
//                        daySchedule = getRandom(allWeekMonthDays, rangen);
//                        break;
//                    case 3:
//                        daySchedule = getRandom(allYearDays, rangen); //TODO: fix this!
//                        break;
//                    default:
//                        throw new RuntimeException();
//                }
//                int lowerBound = 0;
//                int upperBound = 0;
//                switch (rangen.nextInt(2)) {
//                    case 0: //create new temporal context instance
//                        lowerBound = rangen.nextInt(1439); //thus, max is 1438
//                        upperBound = lowerBound + rangen.nextInt(1440 - lowerBound);
//                        break;
//                    case 1: //reuse existing temporal context instance
//                        List<TemporalContext> reuseContexts = new LinkedList<>(system.getSchedule().getTemporalContexts());
//                        reuseContexts.remove(rangen.nextInt(reuseContexts.size()));
//                        TemporalContext reuseContext = getRandom(reuseContexts, rangen);
//                        TimeRange reuseTimeRange = getRandom(reuseContext.getInstances(), rangen);
//                        lowerBound = reuseTimeRange.getStart();
//                        upperBound = reuseTimeRange.getEnd();
//                        break;
//                    default:
//                        throw new RuntimeException();
//                }
//                return new Action(ActionType.ADD_TEMPORALCONTEXTINSTANCE, Arrays.asList(context.getName(), daySchedule,
//                        Integer.toString(lowerBound), Integer.toString(upperBound)));
//            }
//
//            // REMOVE TemporalContextInstance
//            if(actionIndex < 80) {
//                TemporalContext context = getRandom(system.getSchedule().getTemporalContexts(), rangen);
//                TimeRange instance = getRandom(context.getInstances(), rangen);
//                return new Action(ActionType.REMOVE_TEMPORALCONTEXTINSTANCE, Arrays.asList(instance.getName()));
//            }
//
//            // ADD TemporalGrantRule
//            else if(actionIndex < 100) {
//                TemporalContext context = getRandom(system.getSchedule().getTemporalContexts(), rangen);
//                String name = "TEST_TGR" + counterMap.get("TGR").getAndIncrement();
//                Role role = getRandom(system.getAuthorizationPolicy().getRoles(), rangen);
//                Demarcation demarcation = getRandom(system.getAuthorizationPolicy().getDemarcations(), rangen);
//                boolean enable = rangen.nextBoolean();
//                int priority = 1 + rangen.nextInt(5);
//                return new Action(ActionType.ADD_TEMPORALGRANTRULE, Arrays.asList(name, context.getName(), role.getName(), demarcation.getName(),
//                        Boolean.toString(enable), Integer.toString(priority)));
//            }
//
//            // REMOVE TemporalGrantRule
//            else if(actionIndex < 120) {
//                TemporalGrantRule context = getRandom(system.getSchedule().getTemporalGrantRules(), rangen);
//                return new Action(ActionType.REMOVE_TEMPORALGRANTRULE, Arrays.asList(context.getName()));
//            }
//
//            // ADD TemporalAuthenticationRule
//            else if(actionIndex < 140) {
//                TemporalContext context = getRandom(system.getSchedule().getTemporalContexts(), rangen);
//                String name = "TEST_TAR" + counterMap.get("TAR").getAndIncrement();
//                SecurityZone zone = getRandom(system.getSecurityZones(), rangen);
//                int status = rangen.nextInt(3);
//                int priority = 1 + rangen.nextInt(5);
//                return new Action(ActionType.ADD_TEMPORALAUTHENTICATIONRULE,
//                        Arrays.asList(name, context.getName(), zone.getName(),
//                        Integer.toString(status), Integer.toString(priority)));
//            }
//
//            // REMOVE TemporalAuthenticationRule
//            else if(actionIndex < 160) {
//                TemporalAuthenticationRule rule = getRandom(system.getAuthenticationPolicy().getTemporalAuthenticationRules(), rangen);
//                return new Action(ActionType.REMOVE_TEMPORALAUTHENTICATIONRULE, Arrays.asList(rule.getName()));
//            }
//
//            // ADD SecurityZone
//            else if(actionIndex < 180) {
//                String name = "TEST_ZONE_" + counterMap.get("SZ").incrementAndGet();
//                boolean isPublic = rangen.nextInt(10) == 0; // 10% of the zone being public
//                return new Action(ActionType.ADD_SECURITYZONE, Arrays.asList(name, Boolean.toString(isPublic)));
//            }
//
//            // REMOVE SecurityZone
//            else if(actionIndex < 200) {
//                SecurityZone zone = getRandom(system.getSecurityZones(), rangen);
//                return new Action(ActionType.REMOVE_SECURITYZONE, Arrays.asList(zone.getName()));
//            }
//
//            // ADD UNIDIRECTIONAL REACHABILITY,
//            else if(actionIndex < 220) {
//                SecurityZone from = getRandom(system.getSecurityZones(), rangen);
//                SecurityZone to = getRandom(system.getSecurityZones(), rangen);
//                return new Action(ActionType.ADD_UNIDIRECTIONAL_REACHABILITY, Arrays.asList(from.getName(), to.getName()));
//            }
//
//            // REMOVE UNIDIRECTIONAL REACHABILITY,
//            else if(actionIndex < 240) {
//                SecurityZone from = getRandom(system.getSecurityZones(), rangen);
//                SecurityZone to = getRandom(from.getReachable(), rangen);
//                return new Action(ActionType.REMOVE_UNIDIRECTIONAL_REACHABILITY, Arrays.asList(from.getName(), to.getName()));
//            }
//        }
//        return null;
//    }
//
//    private static Measurement performAction(Action action, PolicyModifier modifier) throws Exception {
//        long timeElapsed;
//        long memoryUsed;
//        long start;
//        long finish;
//        switch (action.getType()) {
//            case ADD_USER: {
//                String name = action.getParameters().get(0);
//                start = System.nanoTime();
//                modifier.addUser(name);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case ADD_ROLE: {
//                String name = action.getParameters().get(0);
//                start = System.nanoTime();
//                modifier.addRole(name);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case ADD_DEMARCATION: {
//                String name = action.getParameters().get(0);
//                start = System.nanoTime();
//                modifier.addUser(name);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case ADD_PERMISSION: {
//                String name = action.getParameters().get(0);
//                start = System.nanoTime();
//                modifier.addPermission(name);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case ADD_TEMPORALCONTEXT: {
//                String name = action.getParameters().get(0);
//                start = System.nanoTime();
//                modifier.addTemporalContext(name);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case ADD_TEMPORALCONTEXTINSTANCE: {
//                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(0));
//                DaySchedule daySchedule = (DaySchedule) modifier.getResource().getEObject(action.getParameters().get(1));
//                int lowerBound = Integer.parseInt(action.getParameters().get(2));
//                int upperBound = Integer.parseInt(action.getParameters().get(3));
//                start = System.nanoTime();
//                modifier.addTemporalContextInstance(context, daySchedule, new IntegerInterval(lowerBound, upperBound));
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case ADD_TEMPORALGRANTRULE: {
//                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(1));
//                String name = action.getParameters().get(0);
//                Role role = (Role) modifier.getResource().getEObject(action.getParameters().get(2));
//                Demarcation demarcation = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(3));
//                boolean enable = Boolean.parseBoolean(action.getParameters().get(4));
//                int priority = Integer.parseInt(action.getParameters().get(5));
//                start = System.nanoTime();
//                modifier.addTemporalGrantRule(context, name, role, demarcation, enable, priority);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case ADD_TEMPORALAUTHENTICATIONRULE: {
//                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(1));
//                String name = action.getParameters().get(0);
//                SecurityZone zone = (SecurityZone) modifier.getResource().getEObject(action.getParameters().get(2));
//                int status = Integer.parseInt(action.getParameters().get(3));
//                int priority = Integer.parseInt(action.getParameters().get(4));
//                start = System.nanoTime();
//                modifier.addTemporalAuthenticationRule(context, name, zone, status, priority);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case ADD_SECURITYZONE: {
//                String name = action.getParameters().get(0);
//                boolean isPublic = Boolean.parseBoolean(action.getParameters().get(1));
//                start = System.nanoTime();
//                modifier.addSecurityZone(name, isPublic);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case ADD_UNIDIRECTIONAL_REACHABILITY: {
//                SecurityZone fromZone = (SecurityZone) modifier.getResource().getEObject(action.getParameters().get(0));
//                SecurityZone toZone = (SecurityZone) modifier.getResource().getEObject(action.getParameters().get(1));
//                start = System.nanoTime();
//                modifier.setReachability(fromZone, toZone);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case REMOVE_USER: {
//                User user = (User) modifier.getResource().getEObject(action.getParameters().get(0));
//                start = System.nanoTime();
//                modifier.removeUser(user);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case REMOVE_ROLE: {
//                Role role = (Role) modifier.getResource().getEObject(action.getParameters().get(0));
//                start = System.nanoTime();
//                modifier.removeRole(role);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case REMOVE_DEMARCATION: {
//                Demarcation demarcation = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(0));
//                start = System.nanoTime();
//                modifier.removeDemarcation(demarcation);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case REMOVE_PERMISSION: {
//                Permission permission = (Permission) modifier.getResource().getEObject(action.getParameters().get(0));
//                start = System.nanoTime();
//                modifier.removePermission(permission);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case REMOVE_TEMPORALCONTEXT: {
//                TemporalContext context = (TemporalContext) modifier.getResource().getEObject(action.getParameters().get(0));
//                start = System.nanoTime();
//                modifier.removeTemporalContext(context);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case REMOVE_TEMPORALCONTEXTINSTANCE:
//                TimeRange timeRange = (TimeRange) modifier.getResource().getEObject(action.getParameters().get(0));
//                start = System.nanoTime();
//                modifier.removeTemporalContextInstance(timeRange);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            case REMOVE_TEMPORALGRANTRULE: {
//                TemporalGrantRule rule = (TemporalGrantRule) modifier.getResource().getEObject(action.getParameters().get(0));
//                start = System.nanoTime();
//                modifier.removeTemporalGrantRule(rule);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case REMOVE_TEMPORALAUTHENTICATIONRULE: {
//                TemporalAuthenticationRule rule = (TemporalAuthenticationRule) modifier.getResource().getEObject(action.getParameters().get(0));
//                start = System.nanoTime();
//                modifier.removeTemporalAuthenticationRule(rule);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case REMOVE_SECURITYZONE: {
//                SecurityZone zone = (SecurityZone) modifier.getResource().getEObject(action.getParameters().get(0));
//                start = System.nanoTime();
//                modifier.removeSecurityZone(zone);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case REMOVE_UNIDIRECTIONAL_REACHABILITY: {
//                SecurityZone fromZone = (SecurityZone) modifier.getResource().getEObject(action.getParameters().get(0));
//                SecurityZone toZone = (SecurityZone) modifier.getResource().getEObject(action.getParameters().get(1));
//                start = System.nanoTime();
//                modifier.removeReachability(fromZone, toZone);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case ASSIGN_ROLE_TO_USER: {
//                User user = (User) modifier.getResource().getEObject(action.getParameters().get(0));
//                Role role = (Role) modifier.getResource().getEObject(action.getParameters().get(1));
//                start = System.nanoTime();
//                modifier.assignRoleToUser(user, role);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case ASSIGN_PERMISSION_TO_DEMARCATION: {
//                Demarcation demarcation = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(0));
//                Permission permission = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
//                start = System.nanoTime();
//                modifier.assignPermissionToDemarcation(demarcation, permission);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case DEASSIGN_ROLE_FROM_USER: {
//                User user = (User) modifier.getResource().getEObject(action.getParameters().get(0));
//                Role role = (Role) modifier.getResource().getEObject(action.getParameters().get(1));
//                start = System.nanoTime();
//                modifier.assignRoleToUser(user, role);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            }
//            case DEASSIGN_PERMISSION_FROM_DEMARCATION:
//                Demarcation demarcation = (Demarcation) modifier.getResource().getEObject(action.getParameters().get(0));
//                Permission permission = (Permission) modifier.getResource().getEObject(action.getParameters().get(1));
//                start = System.nanoTime();
//                modifier.assignPermissionToDemarcation(demarcation, permission);
//                finish = System.nanoTime();
//                timeElapsed = finish - start;
//                break;
//            default:
//                throw new IllegalArgumentException("Unkown action type: " + action.getType());
//        }
//
//        Runtime runtime = Runtime.getRuntime();
//        //runtime.gc();
//        long memory = (runtime.totalMemory() - runtime.freeMemory()) / (1024L * 1024L);
//        return new Measurement(timeElapsed / 1_000_000.0, memory);
//    }
//
//    public static <T> T getRandom(List<T> list, Random seed) {
//        int objectIndex = seed.nextInt(list.size());
//        return list.get(objectIndex);
//    }
//
//    //TODO: place this somewhere as a core utility!
//    public static String addDayToDateString(String dateString) throws ParseException {
//        Calendar cal = Calendar.getInstance();
//        DateFormat format = new SimpleDateFormat("d_MMMM_yyyy", Locale.ENGLISH);
//        cal.setTime(format.parse(dateString));
//        int day = cal.get(Calendar.DAY_OF_WEEK);
//        String newDateString = Arrays.asList("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday").get(day - 1);
//        newDateString = newDateString + "_" + dateString;
//        return newDateString;
//    }
//}
