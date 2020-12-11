package generators;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vanderhighway.grrbac.aggregators.Scenario;
import com.vanderhighway.grrbac.core.CoreUtils;
import com.vanderhighway.grrbac.core.modifier.GeneratorUtil;
import com.vanderhighway.grrbac.core.modifier.PolicyAutomaticModifier;
import com.vanderhighway.grrbac.core.modifier.PolicyModifier;
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
import org.eclipse.viatra.query.runtime.rete.matcher.DRedReteBackendFactory;
import org.eclipse.viatra.query.runtime.util.ViatraQueryLoggingUtil;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

public class ConstraintModificationsGenerator {

    public static void main(String[] args) throws ParseException, ModelManipulationException, InterruptedException, IOException, InvocationTargetException {

        GRRBACPackage.eINSTANCE.getName();
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("trbac", new XMIResourceFactoryImpl());
        Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

        URI performanceTestCase = URI.createFileURI(args[0]);
        ResourceSet set = new ResourceSetImpl();
        Resource resource = set.getResource(performanceTestCase, true);
        SiteAccessControlSystem system = (SiteAccessControlSystem) resource.getContents().get(0);

        TestSuiteCollection collection = new TestSuiteCollection("TemporalGrantRulesTestSuiteCollection");
        TestSuiteCollectionCounter counter = new TestSuiteCollectionCounter("TemporalGrantRulesTestSuiteCollection");

        TestSuite addSODURSuite = new TestSuite("AddSODURSuite", "./AddSODURSuite/");
        TestSuite addSODUDSuite = new TestSuite("AddSODUDSuite", "./AddSODUDSuite/");
        TestSuite addSODUPSuite = new TestSuite("AddSODUPSuite", "./AddSODUPSuite/");
        TestSuite addSODRDSuite = new TestSuite("AddSODRDSuite", "./AddSODRDSuite/");
        TestSuite addSODRPSuite = new TestSuite("AddSODRPSuite", "./AddSODRPSuite/");
        TestSuite addSODDPSuite = new TestSuite("AddSODDPSuite", "./AddSODDPSuite/");

        TestSuite addBODURSuite = new TestSuite("AddBODURSuite", "./AddBODURSuite/");
        TestSuite addBODUDSuite = new TestSuite("AddBODUDSuite", "./AddBODUDSuite/");
        TestSuite addBODUPSuite = new TestSuite("AddBODUPSuite", "./AddBODUPSuite/");
        TestSuite addBODRDSuite = new TestSuite("AddBODRDSuite", "./AddBODRDSuite/");
        TestSuite addBODRPSuite = new TestSuite("AddBODRPSuite", "./AddBODRPSuite/");
        TestSuite addBODDPSuite = new TestSuite("AddBODDPSuite", "./AddBODDPSuite/");

        TestSuite addPREREQURSuite = new TestSuite("AddPREREQURSuite", "./AddPREREQURSuite/");
        TestSuite addPREREQUDSuite = new TestSuite("AddPREREQUDSuite", "./AddPREREQUDSuite/");
        TestSuite addPREREQUPSuite = new TestSuite("AddPREREQUPSuite", "./AddPREREQUPSuite/");
        TestSuite addPREREQRDSuite = new TestSuite("AddPREREQRDSuite", "./AddPREREQRDSuite/");
        TestSuite addPREREQRPSuite = new TestSuite("AddPREREQRPSuite", "./AddPREREQRPSuite/");
        TestSuite addPREREQDPSuite = new TestSuite("AddPREREQDPSuite", "./AddPREREQDPSuite/");

        TestSuite addCARDURSuite = new TestSuite("AddCARDURSuite", "./AddCARDURSuite/");
        TestSuite addCARDUDSuite = new TestSuite("AddCARDUDSuite", "./AddCARDUDSuite/");
        TestSuite addCARDUPSuite = new TestSuite("AddCARDUPSuite", "./AddCARDUPSuite/");
        TestSuite addCARDRDSuite = new TestSuite("AddCARDRDSuite", "./AddCARDRDSuite/");
        TestSuite addCARDRPSuite = new TestSuite("AddCARDRPSuite", "./AddCARDRPSuite/");
        TestSuite addCARDDPSuite = new TestSuite("AddCARDDPSuite", "./AddCARDDPSuite/");

        int seed = 10;
        int n =  30;
        Random rangen = new Random(seed);

        //QueryEvaluationHint localSearchHint = LocalSearchHints.getDefault().build();
        ViatraQueryEngineOptions options = ViatraQueryEngineOptions.defineOptions()
                //.withDefaultHint(localSearchHint)
                .withDefaultBackend(DRedReteBackendFactory.INSTANCE)
                //.withDefaultSearchBackend(LocalSearchEMFBackendFactory.INSTANCE)
                .withDefaultCachingBackend(DRedReteBackendFactory.INSTANCE)
                .build();
        final AdvancedViatraQueryEngine engine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(set), options);
        ViatraQueryLoggingUtil.getDefaultLogger().setLevel(Level.OFF);

        CoreUtils utils = new CoreUtils();
        utils.addMissingDaySchedules(resource, (SiteAccessControlSystem) resource.getContents().get(0));

        PolicyModifier modifier = new PolicyModifier(engine, (SiteAccessControlSystem) resource.getContents().get(0), resource);
        modifier.setInstanceIDCounter(utils.getInstanceIDCounter());
        PolicyAutomaticModifier automaticModifier = new PolicyAutomaticModifier(engine, modifier,
                (SiteAccessControlSystem) resource.getContents().get(0));

        automaticModifier.initialize();
        automaticModifier.execute();

        TemporalContext always = (TemporalContext) modifier.getResource().getEObject("Always");

        modifier.getEngine().prepareGroup(PolicyTemporalRelations.instance(), null);
        modifier.getEngine().prepareGroup(PolicyAuthorizationRelations.instance(), null);
        modifier.getEngine().prepareGroup(PolicyCDConstraints.instance(), null);
        modifier.getEngine().prepareGroup(PolicySmells.instance(), null);

        int actionCounter = 0;
        while (addSODURSuite.getCases().size() < n) {
            User randomUser = GeneratorUtils.getRandom(system.getAuthorizationPolicy().getUsers().stream()
                    .filter(u -> u.getUR().size() >= 2).collect(Collectors.toList()), rangen);

            List<Role> roles = new LinkedList<>(randomUser.getUR());
            roles = roles.stream().filter(role -> !role.getName().contains("Proxy")).collect(Collectors.toList());

            if(roles.size() < 2) {
                continue;
            }

            Role role1 = GeneratorUtils.getRandom(roles, rangen);
            roles.remove(role1);
            Role role2 = GeneratorUtils.getRandom(roles, rangen);

            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_SODUR,
                    Arrays.asList("TEST_CONSTRAINT_SODUR" + actionCounter++, role1.getName(), role2.getName())));
            TestCase testCase = new TestCase("ADD_SODUR_TEST_" + actionCounter, ca);
            addSODURSuite.addCase(testCase);
        }

        actionCounter = 0;
        while (addSODUDSuite.getCases().size() < n) {
            User randomUser = GeneratorUtils.getRandom(system.getAuthorizationPolicy().getUsers(), rangen);
            Scenario randomScenario = GeneratorUtils.getRandom(engine.getMatcher(Scenarios.instance()).getAllMatches()
                    .stream().map(Scenarios.Match::getScenario).sorted(Comparator.comparing(Scenario::toString))
                    .collect(Collectors.toList()), rangen);
            LinkedList<Demarcation> demarcations = new LinkedList<>(engine.getMatcher(USD.instance()).getAllValuesOfdemarcation(randomUser, randomScenario));
            Collections.sort(demarcations, Comparator.comparing(Demarcation::getName));

            if(demarcations.size() < 2) {
                continue;
            }

            Demarcation dem1 = GeneratorUtils.getRandom(new LinkedList<Demarcation>(demarcations), rangen);
            demarcations.remove(dem1);
            Demarcation dem2 = GeneratorUtils.getRandom(new LinkedList<Demarcation>(demarcations), rangen);

            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_SODUD,
                        Arrays.asList("TEST_CONSTRAINT_SODUD" + actionCounter++, dem1.getName(), dem2.getName(), always.getName())));
            TestCase testCase = new TestCase("ADD_SODUD_TEST_" + actionCounter, ca);
            addSODUDSuite.addCase(testCase);
        }

        actionCounter = 0;
        while (addSODUPSuite.getCases().size() < n) {
            User randomUser = GeneratorUtils.getRandom(system.getAuthorizationPolicy().getUsers(), rangen);
            Scenario randomScenario = GeneratorUtils.getRandom(engine.getMatcher(Scenarios.instance()).getAllMatches()
                    .stream().map(Scenarios.Match::getScenario).sorted(Comparator.comparing(Scenario::toString))
                    .collect(Collectors.toList()), rangen);
            LinkedList<Permission> permissions = new LinkedList<>(engine.getMatcher(USP.instance()).getAllValuesOfpermission(randomUser, randomScenario));
            Collections.sort(permissions, Comparator.comparing(Permission::getName));

            if(permissions.size() < 2) {
                continue;
            }

            Permission perm1 = GeneratorUtils.getRandom(new LinkedList<Permission>(permissions), rangen);
            permissions.remove(perm1);
            Permission perm2 = GeneratorUtils.getRandom(new LinkedList<Permission>(permissions), rangen);

            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_SODUP,
                    Arrays.asList("TEST_CONSTRAINT_SODUP" + actionCounter++, perm1.getName(), perm2.getName(), always.getName())));
            TestCase testCase = new TestCase("ADD_SODUP_TEST_" + actionCounter, ca);
            addSODUPSuite.addCase(testCase);
        }

        actionCounter = 0;
        while (addSODRDSuite.getCases().size() < n) {

            Role randomRole = GeneratorUtils.getRandom(system.getAuthorizationPolicy().getRoles()
                            .stream().filter(x -> !x.getName().contains("Proxy")).collect(Collectors.toList())
                    , rangen);
            Scenario randomScenario = GeneratorUtils.getRandom(engine.getMatcher(Scenarios.instance()).getAllMatches()
                    .stream().map(Scenarios.Match::getScenario).sorted(Comparator.comparing(Scenario::toString))
                    .collect(Collectors.toList()), rangen);
            LinkedList<Demarcation> demarcations = new LinkedList<>(engine.getMatcher(RSD.instance()).getAllValuesOfdemarcation(randomRole, randomScenario));
            Collections.sort(demarcations, Comparator.comparing(Demarcation::getName));

            if(demarcations.size() < 2) {
                continue;
            }

            Demarcation dem1 = GeneratorUtils.getRandom(new LinkedList<Demarcation>(demarcations), rangen);
            demarcations.remove(dem1);
            Demarcation dem2 = GeneratorUtils.getRandom(new LinkedList<Demarcation>(demarcations), rangen);

            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_SODRD,
                    Arrays.asList("TEST_CONSTRAINT_SODRD" + actionCounter++, dem1.getName(), dem2.getName(), always.getName())));
            TestCase testCase = new TestCase("ADD_SODRD_TEST_" + actionCounter, ca);
            addSODRDSuite.addCase(testCase);
        }

        actionCounter = 0;
        while (addSODRPSuite.getCases().size() < 10) {
            Role randomRole = GeneratorUtils.getRandom(system.getAuthorizationPolicy().getRoles()
                    .stream().filter(x -> !x.getName().contains("Proxy")).collect(Collectors.toList())
                    , rangen);
            Scenario randomScenario = GeneratorUtils.getRandom(engine.getMatcher(Scenarios.instance()).getAllMatches()
                    .stream().map(Scenarios.Match::getScenario).sorted(Comparator.comparing(Scenario::toString))
                    .collect(Collectors.toList()), rangen);
            LinkedList<Permission> permissions = new LinkedList<>(engine.getMatcher(RSP.instance()).getAllValuesOfpermission(randomRole, randomScenario));
            Collections.sort(permissions, Comparator.comparing(Permission::getName));

            if(permissions.size() < 2) {
                continue;
            }

            Permission perm1 = GeneratorUtils.getRandom(new LinkedList<Permission>(permissions), rangen);
            permissions.remove(perm1);
            Permission perm2 = GeneratorUtils.getRandom(new LinkedList<Permission>(permissions), rangen);

            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_SODRP,
                    Arrays.asList("TEST_CONSTRAINT_SODRP" + actionCounter++, perm1.getName(), perm2.getName(), always.getName())));
            TestCase testCase = new TestCase("ADD_SODRP_TEST_" + actionCounter, ca);
            addSODRPSuite.addCase(testCase);
        }

        actionCounter = 0;
        while (addSODDPSuite.getCases().size() < n) {
            Demarcation randomDemarcation = GeneratorUtils.getRandom(system.getAuthorizationPolicy().getDemarcations().stream()
                    .filter(x -> !x.getName().contains("Proxy")).filter(d -> d.getDP().size() >= 2).collect(Collectors.toList()),
                    rangen);
            List<Permission> permissions = new LinkedList<>(randomDemarcation.getDP());
            Collections.sort(permissions, Comparator.comparing(Permission::getName));

            if(permissions.size() < 2) {
                continue;
            }

            Permission perm1 = GeneratorUtils.getRandom(permissions, rangen);
            permissions.remove(perm1);
            Permission perm2 = GeneratorUtils.getRandom(permissions, rangen);

            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_SODDP,
                    Arrays.asList("TEST_CONSTRAINT_SODDP" + actionCounter++, perm1.getName(), perm2.getName())));
            TestCase testCase = new TestCase("ADD_SODDP_TEST_" + actionCounter, ca);
            addSODDPSuite.addCase(testCase);
        }


        actionCounter = 0;
        while (addBODURSuite.getCases().size() < n) {
            User randomUser = GeneratorUtils.getRandom(system.getAuthorizationPolicy().getUsers().stream()
                    .filter(u -> u.getUR().size() >= 2).collect(Collectors.toList()), rangen);

            List<Role> roles = randomUser.getUR();
            roles = roles.stream().filter(x -> !x.getName().contains("Proxy")).collect(Collectors.toList());
            Collections.sort(roles, Comparator.comparing(Role::getName));
            List<Role> otherRoles = new LinkedList<>(system.getAuthorizationPolicy().getRoles());
            otherRoles = otherRoles.stream().filter(x -> !x.getName().contains("Proxy")).collect(Collectors.toList());
            otherRoles.removeAll(roles);
            Collections.sort(otherRoles, Comparator.comparing(Role::getName));

            if(roles.size() < 1  || otherRoles.size() < 1) {
                continue;
            }

            Role role1 = GeneratorUtils.getRandom(roles, rangen);
            roles.remove(role1);
            Role role2 = GeneratorUtils.getRandom(otherRoles, rangen);

            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_BODUR,
                    Arrays.asList("TEST_CONSTRAINT_BODUR" + actionCounter++, role1.getName(), role2.getName())));
            TestCase testCase = new TestCase("ADD_BODUR_TEST_" + actionCounter, ca);
            addBODURSuite.addCase(testCase);
        }

        actionCounter = 0;
        while (addBODUDSuite.getCases().size() < n) {
            User randomUser = GeneratorUtils.getRandom(system.getAuthorizationPolicy().getUsers(), rangen);
            Scenario randomScenario = GeneratorUtils.getRandom(engine.getMatcher(Scenarios.instance()).getAllMatches()
                    .stream().map(Scenarios.Match::getScenario).sorted(Comparator.comparing(Scenario::toString))
                    .collect(Collectors.toList()), rangen);
            LinkedList<Demarcation> demarcations = new LinkedList<>(engine.getMatcher(USD.instance()).getAllValuesOfdemarcation(randomUser, randomScenario));
            Collections.sort(demarcations, Comparator.comparing(Demarcation::getName));

            List<Demarcation> otherDemarcations = new LinkedList<>(system.getAuthorizationPolicy().getDemarcations());
            otherDemarcations = otherDemarcations.stream().filter(x -> !x.getName().contains("Proxy")).collect(Collectors.toList());
            Collections.sort(demarcations, Comparator.comparing(Demarcation::getName));
            otherDemarcations.removeAll(demarcations);

            if(demarcations.size() < 1  || otherDemarcations.size() < 1) {
                continue;
            }

            Demarcation dem1 = GeneratorUtils.getRandom(new LinkedList<Demarcation>(demarcations), rangen);
            demarcations.remove(dem1);
            Demarcation dem2 = GeneratorUtils.getRandom(otherDemarcations, rangen);

            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_BODUD,
                    Arrays.asList("TEST_CONSTRAINT_BODUD" + actionCounter++, dem1.getName(), dem2.getName(), always.getName())));
            TestCase testCase = new TestCase("ADD_BODUD_TEST_" + actionCounter, ca);
            addBODUDSuite.addCase(testCase);
        }

        actionCounter = 0;
        List<USP.Match> uspMatches = new LinkedList<>(engine.getMatcher(USP.instance()).getAllMatches());
        Collections.sort(uspMatches, Comparator.comparing(USP.Match::prettyPrint));
        while (addBODUPSuite.getCases().size() < n) {

            USP.Match match = GeneratorUtils.getRandom(uspMatches, rangen);
            uspMatches.remove(match);

            User randomUser = match.getUser();
            Scenario randomScenario = match.getScenario();
            LinkedList<Permission> permissions = new LinkedList<>(engine.getMatcher(USP.instance()).getAllValuesOfpermission(randomUser, randomScenario));
            Collections.sort(permissions, Comparator.comparing(Permission::getName));

            List<Permission> otherPermissions = new LinkedList<>(system.getAuthorizationPolicy().getPermissions());
            otherPermissions.removeAll(permissions);
            Collections.sort(otherPermissions, Comparator.comparing(Permission::getName));

            if(permissions.size() < 1  || otherPermissions.size() < 1) {
                continue;
            }

            Permission perm1 = GeneratorUtils.getRandom(new LinkedList<Permission>(permissions), rangen);
            permissions.remove(perm1);
            Permission perm2 = GeneratorUtils.getRandom(otherPermissions, rangen);

            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_BODUP,
                    Arrays.asList("TEST_CONSTRAINT_BODUP" + actionCounter++, perm1.getName(), perm2.getName(), always.getName())));
            TestCase testCase = new TestCase("ADD_BODUP_TEST_" + actionCounter, ca);
            addBODUPSuite.addCase(testCase);
        }

        actionCounter = 0;
        List<RSD.Match> rsdMatches = new LinkedList<>(engine.getMatcher(RSD.instance()).getAllMatches());
        Collections.sort(rsdMatches, Comparator.comparing(RSD.Match::prettyPrint));
        while (addBODRDSuite.getCases().size() < n) {

            RSD.Match match = GeneratorUtils.getRandom(rsdMatches, rangen);
            rsdMatches.remove(match);

            if(match.getRole().getName().contains("Proxy")) {
                continue;
            }

            Role randomRole = match.getRole();
            Scenario randomScenario = match.getScenario();
            LinkedList<Demarcation> demarcations = new LinkedList<>(engine.getMatcher(RSD.instance()).getAllValuesOfdemarcation(randomRole, randomScenario));
            Collections.sort(demarcations, Comparator.comparing(Demarcation::getName));

            List<Demarcation> otherDemarcations = new LinkedList<>(system.getAuthorizationPolicy().getDemarcations());
            otherDemarcations = otherDemarcations.stream().filter(x -> !x.getName().contains("Proxy")).collect(Collectors.toList());
            Collections.sort(otherDemarcations, Comparator.comparing(Demarcation::getName));
            otherDemarcations.removeAll(demarcations);

            if(demarcations.size() < 1  || otherDemarcations.size() < 1) {
                continue;
            }

            Demarcation dem1 = GeneratorUtils.getRandom(new LinkedList<Demarcation>(demarcations), rangen);
            demarcations.remove(dem1);
            Demarcation dem2 = GeneratorUtils.getRandom(otherDemarcations, rangen);

            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_BODRD,
                    Arrays.asList("TEST_CONSTRAINT_BODRD" + actionCounter++, dem1.getName(), dem2.getName(), always.getName())));
            TestCase testCase = new TestCase("ADD_BODRD_TEST_" + actionCounter, ca);
            addBODRDSuite.addCase(testCase);
        }

        actionCounter = 0;
        List<RSP.Match> rspMatches = new LinkedList<>(engine.getMatcher(RSP.instance()).getAllMatches());
        Collections.sort(rspMatches, Comparator.comparing(RSP.Match::prettyPrint));
        while (addBODRPSuite.getCases().size() < n) {

            RSP.Match match = GeneratorUtils.getRandom(rspMatches, rangen);
            rspMatches.remove(match);

            if(match.getRole().getName().contains("Proxy")) {
                continue;
            }


            Role randomRole = match.getRole();
            Scenario randomScenario = match.getScenario();
            LinkedList<Permission> permissions = new LinkedList<>(engine.getMatcher(RSP.instance()).getAllValuesOfpermission(randomRole, randomScenario));
            Collections.sort(permissions, Comparator.comparing(Permission::getName));

            List<Permission> otherPermissions = new LinkedList<>(system.getAuthorizationPolicy().getPermissions());
            Collections.sort(otherPermissions, Comparator.comparing(Permission::getName));
            otherPermissions.removeAll(permissions);

            if(permissions.size() < 1  || otherPermissions.size() < 1) {
                continue;
            }

            Permission perm1 = GeneratorUtils.getRandom(new LinkedList<Permission>(permissions), rangen);
            permissions.remove(perm1);
            Permission perm2 = GeneratorUtils.getRandom(otherPermissions, rangen);

            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_BODRP,
                    Arrays.asList("TEST_CONSTRAINT_BODRP" + actionCounter++, perm1.getName(), perm2.getName(), always.getName())));
            TestCase testCase = new TestCase("ADD_BODRP_TEST_" + actionCounter, ca);
            addBODRPSuite.addCase(testCase);
        }

        actionCounter = 0;
        while (addBODDPSuite.getCases().size() < n) {
            Demarcation randomDemarcation = GeneratorUtils.getRandom(system.getAuthorizationPolicy().getDemarcations().stream()
                    .filter(x -> !x.getName().contains("Proxy"))
                    .filter(d -> d.getDP().size() >= 2).collect(Collectors.toList()),
                    rangen);

            List<Permission> permissions = new LinkedList<>(randomDemarcation.getDP());
            Collections.sort(permissions, Comparator.comparing(Permission::getName));
            List<Permission> otherPermissions = new LinkedList<>(system.getAuthorizationPolicy().getPermissions());
            Collections.sort(otherPermissions, Comparator.comparing(Permission::getName));
            otherPermissions.removeAll(permissions);

            if(permissions.size() < 1  || otherPermissions.size() < 1) {
                continue;
            }

            Permission perm1 = GeneratorUtils.getRandom(new LinkedList<Permission>(permissions), rangen);
            permissions.remove(perm1);
            Permission perm2 = GeneratorUtils.getRandom(otherPermissions, rangen);

            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_BODDP,
                    Arrays.asList("TEST_CONSTRAINT_BODDP" + actionCounter++, perm1.getName(), perm2.getName())));
            TestCase testCase = new TestCase("ADD_BODDP_TEST_" + actionCounter, ca);
            addBODDPSuite.addCase(testCase);
        }

        for(TestCase testCase: addBODURSuite.getCases()) {
            Action prereqAction = testCase.getCompoundActions().get(0).getActions().get(0);
            prereqAction.setType(ActionType.ADD_CONSTRAINT_PREREQUR);
            prereqAction.getParameters().set(0, "TEST_CONSTRAINT_PREREQUR" + actionCounter++);
            CompoundAction ca = new CompoundAction(prereqAction);
            TestCase prCase = new TestCase("ADD_PREREQUR_TEST_" + actionCounter, ca);
            addPREREQURSuite.addCase(prCase);
        }

        for(TestCase testCase: addBODUDSuite.getCases()) {
            Action prereqAction = testCase.getCompoundActions().get(0).getActions().get(0);
            prereqAction.setType(ActionType.ADD_CONSTRAINT_PREREQUD);
            prereqAction.getParameters().set(0, "TEST_CONSTRAINT_PREREQUD" + actionCounter++);
            CompoundAction ca = new CompoundAction(prereqAction);
            TestCase prCase = new TestCase("ADD_PREREQUD_TEST_" + actionCounter, ca);
            addPREREQUDSuite.addCase(prCase);
        }

        for(TestCase testCase: addBODUPSuite.getCases()) {
            Action prereqAction = testCase.getCompoundActions().get(0).getActions().get(0);
            prereqAction.setType(ActionType.ADD_CONSTRAINT_PREREQUP);
            prereqAction.getParameters().set(0, "TEST_CONSTRAINT_PREREQUP" + actionCounter++);
            CompoundAction ca = new CompoundAction(prereqAction);
            TestCase prCase = new TestCase("ADD_PREREQUP_TEST_" + actionCounter, ca);
            addPREREQUPSuite.addCase(prCase);
        }

        for(TestCase testCase: addBODRDSuite.getCases()) {
            Action prereqAction = testCase.getCompoundActions().get(0).getActions().get(0);
            prereqAction.setType(ActionType.ADD_CONSTRAINT_PREREQRD);
            prereqAction.getParameters().set(0, "TEST_CONSTRAINT_PREREQRD" + actionCounter++);
            CompoundAction ca = new CompoundAction(prereqAction);
            TestCase prCase = new TestCase("ADD_PREREQRD_TEST_" + actionCounter, ca);
            addPREREQRDSuite.addCase(prCase);
        }

        for(TestCase testCase: addBODRPSuite.getCases()) {
            Action prereqAction = testCase.getCompoundActions().get(0).getActions().get(0);
            prereqAction.setType(ActionType.ADD_CONSTRAINT_PREREQRP);
            prereqAction.getParameters().set(0, "TEST_CONSTRAINT_PREREQRP" + actionCounter++);
            CompoundAction ca = new CompoundAction(prereqAction);
            TestCase prCase = new TestCase("ADD_PREREQRP_TEST_" + actionCounter, ca);
            addPREREQRPSuite.addCase(prCase);
        }

        for(TestCase testCase: addBODDPSuite.getCases()) {
            Action prereqAction = testCase.getCompoundActions().get(0).getActions().get(0);
            prereqAction.setType(ActionType.ADD_CONSTRAINT_PREREQDP);
            prereqAction.getParameters().set(0, "TEST_CONSTRAINT_PREREQDP" + actionCounter++);
            CompoundAction ca = new CompoundAction(prereqAction);
            TestCase prCase = new TestCase("ADD_PREREQDP_TEST_" + actionCounter, ca);
            addPREREQDPSuite.addCase(prCase);
        }

        List<Role> randomRolesUR = GeneratorUtils.randomSublist(system.getAuthorizationPolicy().getRoles()
                .stream().filter(x -> !x.getName().contains("Proxy")).collect(Collectors.toList()), n, rangen);
        for(Role role: randomRolesUR) {
            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_CARDUR,
                    Arrays.asList("TEST_CONSTRAINT_" + actionCounter++, role.getName(), "1")));
            TestCase testCase = new TestCase("ADD_CARD_TEST_" + actionCounter, ca);
            addCARDURSuite.addCase(testCase);
        }

        List<Demarcation> randomDemarcationsUD = GeneratorUtils.randomSublist(system.getAuthorizationPolicy().getDemarcations()
                .stream().filter(x -> !x.getName().contains("Proxy")).collect(Collectors.toList()), n, rangen);
        for(Demarcation demarcation: randomDemarcationsUD) {
            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_CARDUD,
                    Arrays.asList("TEST_CONSTRAINT_" + actionCounter++, demarcation.getName(), "1", always.getName())));
            TestCase testCase = new TestCase("ADD_CARD_TEST_" + actionCounter, ca);
            addCARDUDSuite.addCase(testCase);
        }

        List<Permission> randomPermissionsUP = GeneratorUtils.randomSublist(system.getAuthorizationPolicy().getPermissions(), n, rangen);
        for(Permission permission: randomPermissionsUP) {
            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_CARDUP,
                    Arrays.asList("TEST_CONSTRAINT_" + actionCounter++, permission.getName(), "1", always.getName())));
            TestCase testCase = new TestCase("ADD_CARD_TEST_" + actionCounter, ca);
            addCARDUPSuite.addCase(testCase);
        }

        List<Demarcation> randomDemarcationsRD = GeneratorUtils.randomSublist(system.getAuthorizationPolicy().getDemarcations()
                .stream().filter(x -> !x.getName().contains("Proxy")).collect(Collectors.toList()), n, rangen);
        for(Demarcation demarcation: randomDemarcationsRD) {
            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_CARDRD,
                    Arrays.asList("TEST_CONSTRAINT_" + actionCounter++, demarcation.getName(), "1", always.getName())));
            TestCase testCase = new TestCase("ADD_CARD_TEST_" + actionCounter, ca);
            addCARDRDSuite.addCase(testCase);
        }

        List<Permission> randomPermissionsRP = GeneratorUtils.randomSublist(system.getAuthorizationPolicy().getPermissions(), n, rangen);
        for(Permission permission: randomPermissionsRP) {
            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_CARDRP,
                    Arrays.asList("TEST_CONSTRAINT_" + actionCounter++, permission.getName(), "1", always.getName())));
            TestCase testCase = new TestCase("ADD_CARD_TEST_" + actionCounter, ca);
            addCARDRPSuite.addCase(testCase);
        }

        List<Permission> randomPermissionsDP = GeneratorUtils.randomSublist(system.getAuthorizationPolicy().getPermissions(), n, rangen);
        for(Permission permission: randomPermissionsDP) {
            CompoundAction ca = new CompoundAction(new Action(ActionType.ADD_CONSTRAINT_CARDDP,
                    Arrays.asList("TEST_CONSTRAINT_" + actionCounter++, permission.getName(), "1")));
            TestCase testCase = new TestCase("ADD_CARD_TEST_" + actionCounter, ca);
            addCARDDPSuite.addCase(testCase);
        }

        // Duplicate all test cases
//        List<TestCase> addSODURTestCasesCopy = new LinkedList<>(addSODURSuite.getCases());
//        addSODURSuite.addCases(addSODURTestCasesCopy);
//        addSODURSuite.addCases(addSODURTestCasesCopy);
//
//        List<TestCase> addSODUDTestCasesCopy = new LinkedList<>(addSODUDSuite.getCases());
//        addSODUDSuite.addCases(addSODUDTestCasesCopy);
//        addSODUDSuite.addCases(addSODUDTestCasesCopy);
//
//        List<TestCase> addSODUPTestCasesCopy = new LinkedList<>(addSODUPSuite.getCases());
//        addSODUPSuite.addCases(addSODUPTestCasesCopy);
//        addSODUPSuite.addCases(addSODUPTestCasesCopy);
//
//        List<TestCase> addSODRDTestCasesCopy = new LinkedList<>(addSODRDSuite.getCases());
//        addSODRDSuite.addCases(addSODRDTestCasesCopy);
//        addSODRDSuite.addCases(addSODRDTestCasesCopy);
//
//        List<TestCase> addSODRPTestCasesCopy = new LinkedList<>(addSODRPSuite.getCases());
//        addSODRPSuite.addCases(addSODRPTestCasesCopy);
//        addSODRPSuite.addCases(addSODRPTestCasesCopy);
//
//        List<TestCase> addSODDPTestCasesCopy = new LinkedList<>(addSODDPSuite.getCases());
//        addSODDPSuite.addCases(addSODDPTestCasesCopy);
//        addSODDPSuite.addCases(addSODDPTestCasesCopy);
//
//        List<TestCase> addBODURTestCasesCopy = new LinkedList<>(addBODURSuite.getCases());
//        addBODURSuite.addCases(addBODURTestCasesCopy);
//        addBODURSuite.addCases(addBODURTestCasesCopy);
//
//        List<TestCase> addBODUDTestCasesCopy = new LinkedList<>(addBODUDSuite.getCases());
//        addBODUDSuite.addCases(addBODUDTestCasesCopy);
//        addBODUDSuite.addCases(addBODUDTestCasesCopy);
//
//        List<TestCase> addBODUPTestCasesCopy = new LinkedList<>(addBODUPSuite.getCases());
//        addBODUPSuite.addCases(addBODUPTestCasesCopy);
//        addBODUPSuite.addCases(addBODUPTestCasesCopy);
//
//        List<TestCase> addBODRDTestCasesCopy = new LinkedList<>(addBODRDSuite.getCases());
//        addBODRDSuite.addCases(addBODRDTestCasesCopy);
//        addBODRDSuite.addCases(addBODRDTestCasesCopy);
//
//        List<TestCase> addBODRPTestCasesCopy = new LinkedList<>(addBODRPSuite.getCases());
//        addBODRPSuite.addCases(addBODRPTestCasesCopy);
//        addBODRPSuite.addCases(addBODRPTestCasesCopy);
//
//        List<TestCase> addBODDPTestCasesCopy = new LinkedList<>(addBODDPSuite.getCases());
//        addBODDPSuite.addCases(addBODDPTestCasesCopy);
//        addBODDPSuite.addCases(addBODDPTestCasesCopy);
//
//        List<TestCase> addPREREQURTestCasesCopy = new LinkedList<>(addPREREQURSuite.getCases());
//        addPREREQURSuite.addCases(addPREREQURTestCasesCopy);
//        addPREREQURSuite.addCases(addPREREQURTestCasesCopy);
//
//        List<TestCase> addPREREQUDTestCasesCopy = new LinkedList<>(addPREREQUDSuite.getCases());
//        addPREREQUDSuite.addCases(addPREREQUDTestCasesCopy);
//        addPREREQUDSuite.addCases(addPREREQUDTestCasesCopy);
//
//        List<TestCase> addPREREQUPTestCasesCopy = new LinkedList<>(addPREREQUPSuite.getCases());
//        addPREREQUPSuite.addCases(addPREREQUPTestCasesCopy);
//        addPREREQUPSuite.addCases(addPREREQUPTestCasesCopy);
//
//        List<TestCase> addPREREQRDTestCasesCopy = new LinkedList<>(addPREREQRDSuite.getCases());
//        addPREREQRDSuite.addCases(addPREREQRDTestCasesCopy);
//        addPREREQRDSuite.addCases(addPREREQRDTestCasesCopy);
//
//        List<TestCase> addPREREQRPTestCasesCopy = new LinkedList<>(addPREREQRPSuite.getCases());
//        addPREREQRPSuite.addCases(addPREREQRPTestCasesCopy);
//        addPREREQRPSuite.addCases(addPREREQRPTestCasesCopy);
//
//        List<TestCase> addPREREQDPTestCasesCopy = new LinkedList<>(addPREREQDPSuite.getCases());
//        addPREREQDPSuite.addCases(addPREREQDPTestCasesCopy);
//        addPREREQDPSuite.addCases(addPREREQDPTestCasesCopy);
//
//        List<TestCase> addCARDURTestCasesCopy = new LinkedList<>(addCARDURSuite.getCases());
//        addCARDURSuite.addCases(addCARDURTestCasesCopy);
//        addCARDURSuite.addCases(addCARDURTestCasesCopy);
//
//        List<TestCase> addCARDUDTestCasesCopy = new LinkedList<>(addCARDUDSuite.getCases());
//        addCARDUDSuite.addCases(addCARDUDTestCasesCopy);
//        addCARDUDSuite.addCases(addCARDUDTestCasesCopy);
//
//        List<TestCase> addCARDUPTestCasesCopy = new LinkedList<>(addCARDUPSuite.getCases());
//        addCARDUPSuite.addCases(addCARDUPTestCasesCopy);
//        addCARDUPSuite.addCases(addCARDUPTestCasesCopy);
//
//        List<TestCase> addCARDRDTestCasesCopy = new LinkedList<>(addCARDRDSuite.getCases());
//        addCARDRDSuite.addCases(addCARDRDTestCasesCopy);
//        addCARDRDSuite.addCases(addCARDRDTestCasesCopy);
//
//        List<TestCase> addCARDRPTestCasesCopy = new LinkedList<>(addCARDRPSuite.getCases());
//        addCARDRPSuite.addCases(addCARDRPTestCasesCopy);
//        addCARDRPSuite.addCases(addCARDRPTestCasesCopy);
//
//        List<TestCase> addCARDDPTestCasesCopy = new LinkedList<>(addCARDDPSuite.getCases());
//        addCARDDPSuite.addCases(addCARDDPTestCasesCopy);
//        addCARDDPSuite.addCases(addCARDDPTestCasesCopy);
//
        collection.addSuites(addSODURSuite, addSODUDSuite, addSODUPSuite);
        collection.addSuites(addSODRDSuite, addSODRPSuite, addSODDPSuite);

        collection.addSuites(addBODURSuite, addBODUDSuite, addBODUPSuite);
        collection.addSuites(addBODRDSuite, addBODRPSuite, addBODDPSuite);

        collection.addSuites(addPREREQURSuite, addPREREQUDSuite, addPREREQUPSuite);
        collection.addSuites(addPREREQRDSuite, addPREREQRPSuite, addPREREQDPSuite);

        collection.addSuites(addCARDURSuite, addCARDUDSuite, addCARDUPSuite);
        collection.addSuites(addCARDRDSuite, addCARDRPSuite, addCARDDPSuite);

        new File("./evaluation/Constraints/data").mkdirs();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(Paths.get("./evaluation/Constraints/data/tsc.json").toFile(), collection);
        mapper.writeValue(Paths.get("./evaluation/Constraints/data/tsc_counter.json").toFile(), counter);

        File caseFile = new File(args[0]);
        Files.copy(caseFile.toPath(), new File("./evaluation/Constraints/data/model.trbac").toPath());
    }


}
