package cli.commands;

import cli.CLIContainer;
import cli.util.CLIUtil;
import com.brein.time.timeintervals.intervals.IntegerInterval;
import com.vanderhighway.grrbac.aggregators.Scenario;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import com.vanderhighway.grrbac.patterns.*;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import picocli.CommandLine;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static cli.util.CLIUtil.fromMinutesToHHmm;
import static cli.util.CLIUtil.getExampleDateScheduleTimeRange;

@CommandLine.Command(sortOptions = false, name = "show", mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
        description = "Show entities/relations and more")
public class ShowCommand implements Runnable {

    public void run() {

    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show all basic entities and relations (Users, Roles, Demarcations, Permissions, UR, DP)")
    public void basic() throws ModelManipulationException {

        System.out.println("Users:");
        CLIContainer.getInstance().increaseIndentation();
        users();
        CLIContainer.getInstance().decreaseIdentation();

        System.out.println("Roles:");
        CLIContainer.getInstance().increaseIndentation();
        roles();
        CLIContainer.getInstance().decreaseIdentation();

        System.out.println("UR:");
        CLIContainer.getInstance().increaseIndentation();
        UR(null);
        CLIContainer.getInstance().decreaseIdentation();

        System.out.println("Demarcations:");
        CLIContainer.getInstance().increaseIndentation();
        demarcations();
        CLIContainer.getInstance().decreaseIdentation();

        System.out.println("RSD:");
        CLIContainer.getInstance().increaseIndentation();
        RSD(null, null);
        CLIContainer.getInstance().decreaseIdentation();

        System.out.println("Permissions:");
        CLIContainer.getInstance().increaseIndentation();
        permissions();
        CLIContainer.getInstance().decreaseIdentation();

        System.out.println("DP:");
        CLIContainer.getInstance().increaseIndentation();
        DP(null);
        CLIContainer.getInstance().decreaseIdentation();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show all users")
    public void users() throws ModelManipulationException {
        SiteAccessControlSystem system = (SiteAccessControlSystem) CLIContainer.getInstance().getModel().getContents().get(0);
        List<String> users = system.getAuthorizationPolicy().getUsers().stream().map(x -> x.getName()).collect(Collectors.toList());
        Collections.sort(users);
        for (String user : users) {
            System.out.println(CLIContainer.getInstance().getIndentation() + user);
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show all roles")
    public void roles() throws ModelManipulationException {
        SiteAccessControlSystem system = (SiteAccessControlSystem) CLIContainer.getInstance().getModel().getContents().get(0);
        List<String> roles = system.getAuthorizationPolicy().getRoles().stream().map(CLIUtil::rolePrettyString).
                sorted().collect(Collectors.toList());
        for (String role : roles) {
            System.out.println(CLIContainer.getInstance().getIndentation() + role);
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show all demarcations")
    public void demarcations() throws ModelManipulationException {
        SiteAccessControlSystem system = (SiteAccessControlSystem) CLIContainer.getInstance().getModel().getContents().get(0);
        List<String> demarcations = system.getAuthorizationPolicy().getDemarcations().stream().map(CLIUtil::demarcationPrettyString)
                .collect(Collectors.toList());
        Collections.sort(demarcations);
        for (String demarcationName : demarcations) {
            System.out.println(CLIContainer.getInstance().getIndentation() + demarcationName);
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show all permissions")
    public void permissions() throws ModelManipulationException {
        SiteAccessControlSystem system = (SiteAccessControlSystem) CLIContainer.getInstance().getModel().getContents().get(0);
        List<String> permissions = system.getAuthorizationPolicy().getPermissions().stream().map(x -> x.getName()).collect(Collectors.toList());
        Collections.sort(permissions);
        for (String permission : permissions) {
            System.out.println(CLIContainer.getInstance().getIndentation() + permission);
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show the roles assigned to one or all users")
    public void UR(@CommandLine.Option(names = {"-user"}, required = false) String userName) throws ModelManipulationException {
        List<User> users = new LinkedList<>();
        if (userName == null) {
            users = CLIContainer.getInstance().getSystem().getAuthorizationPolicy().getUsers();
        } else {
            users.add((User) CLIContainer.getInstance().getElement(userName, User.class));
        }
        users = users.stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
        for (User user : users) {
            System.out.println(CLIContainer.getInstance().getIndentation() + user.getName() + "->" +
                    user.getUR().stream().map(Role::getName).sorted().collect(Collectors.toList()));
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show the users which are assigned to one or all roles")
    public void RU(@CommandLine.Option(names = {"-role"}, required = false) String roleName) throws ModelManipulationException {
        List<Role> roles = new LinkedList<>();
        if (roleName == null) {
            roles = CLIContainer.getInstance().getSystem().getAuthorizationPolicy().getRoles();
        } else {
            roles.add((Role) CLIContainer.getInstance().getElement(roleName, User.class));
        }
        roles = roles.stream().sorted(Comparator.comparing(Role::getName)).collect(Collectors.toList());
        for (Role role : roles) {
            System.out.println(CLIContainer.getInstance().getIndentation() + role.getName() + "->" +
                    role.getRU().stream().map(User::getName).sorted().collect(Collectors.toList()));
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show the demarcations granted to users")
    public void USD(@CommandLine.Option(names = {"-user"}, required = false) String userName,
                    @CommandLine.Option(names = {"-scenario"}, split = ",", splitSynopsisLabel = ",", paramLabel = "CONTEXT",
                            required = false) List<String> contextNames) throws ModelManipulationException {
        Map<User, Map<Scenario, Set<Demarcation>>> relation = new HashMap<>();
        User partialMatchUser = null;
        if (userName != null) {
            partialMatchUser = (User) CLIContainer.getInstance().getElement(userName, User.class);
        }

        Scenario partialMatchScenario = null;
        if(contextNames != null) {
            partialMatchScenario = CLIUtil.getScenario(contextNames);
            if (partialMatchScenario == null) {
                System.out.println(CLIContainer.getInstance().getIndentation() + "Given scenario: " + contextNames.toString() + " does not correspond to an one unique actual scenario!");
                return;
            }
        }

        USD.Match partialMatch = USD.Matcher.create().newMatch(partialMatchUser, partialMatchScenario, null);
        USD.Matcher matcher = CLIContainer.getInstance().getEngine().getMatcher(USD.instance());
        Set<USD.Match> matches = new HashSet<>(matcher.getAllMatches(partialMatch));
        for (USD.Match match : matches) {
            relation.putIfAbsent(match.getUser(), new HashMap<>());
            relation.get(match.getUser()).putIfAbsent(match.getScenario(), new HashSet<>());
            relation.get(match.getUser()).get(match.getScenario()).add(match.getDemarcation());
        }

        List<User> sortedUsers = relation.keySet().stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
        for (User user : sortedUsers) {
            if (sortedUsers.size() != 1) {
                System.out.println(CLIContainer.getInstance().getIndentation() + user.getName() + ":");
                CLIContainer.getInstance().increaseIndentation();
            }
            List<Scenario> sortedScenarios = relation.get(user).keySet().stream().sorted(Comparator.comparing(Scenario::toString)).collect(Collectors.toList());
            for (Scenario scenario : sortedScenarios) {
                List<String> sortedNames = relation.get(user).get(scenario).stream().map(x -> x.getName()).sorted().collect(Collectors.toList());
                System.out.println(CLIContainer.getInstance().getIndentation()
                        + scenario.toString() + " -> " + sortedNames.toString());
            }
            if (sortedUsers.size() != 1) {
                CLIContainer.getInstance().decreaseIdentation();
            }
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show the permissions granted to users")
    public void USP(@CommandLine.Option(names = {"-user"}, required = false) String userName,
                    @CommandLine.Option(names = {"-scenario"}, split = ",", splitSynopsisLabel = ",", paramLabel = "CONTEXT",
                            required = false) List<String> contextNames) throws ModelManipulationException {
        Map<User, Map<Scenario, Set<Permission>>> relation = new HashMap<>();
        User partialMatchUser = null;
        if (userName != null) {
            partialMatchUser = (User) CLIContainer.getInstance().getElement(userName, User.class);
        }


        Scenario partialMatchScenario = null;
        if(contextNames != null) {
            partialMatchScenario = CLIUtil.getScenario(contextNames);
            if (partialMatchScenario == null) {
                System.out.println(CLIContainer.getInstance().getIndentation() + "Given scenario: " + contextNames.toString() + " does not correspond to an one unique actual scenario!");
                return;
            }
        }

        USP.Match partialMatch = USP.Matcher.create().newMatch(partialMatchUser, partialMatchScenario, null);
        USP.Matcher matcher = CLIContainer.getInstance().getEngine().getMatcher(USP.instance());
        Set<USP.Match> matches = new HashSet<>(matcher.getAllMatches(partialMatch));
        for (USP.Match match : matches) {
            relation.putIfAbsent(match.getUser(), new HashMap<>());
            relation.get(match.getUser()).putIfAbsent(match.getScenario(), new HashSet<>());
            relation.get(match.getUser()).get(match.getScenario()).add(match.getPermission());
        }
        List<User> sortedUsers = relation.keySet().stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
        for (User user : sortedUsers) {
            if (sortedUsers.size() != 1) {
                System.out.println(CLIContainer.getInstance().getIndentation() + user.getName() + ":");
                CLIContainer.getInstance().increaseIndentation();
            }
            List<Scenario> sortedScenarios = relation.get(user).keySet().stream().sorted(Comparator.comparing(Scenario::toString)).collect(Collectors.toList());
            for (Scenario scenario : sortedScenarios) {
                List<String> sortedNames = relation.get(user).get(scenario).stream().map(x -> x.getName()).sorted().collect(Collectors.toList());
                System.out.println(CLIContainer.getInstance().getIndentation()
                        + scenario.toString() + " -> " + sortedNames.toString());
            }
            if (sortedUsers.size() != 1) {
                CLIContainer.getInstance().decreaseIdentation();
            }
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show the demarcations granted to roles")
    public void RSD(@CommandLine.Option(names = {"-role"}, required = false) String roleName,
                    @CommandLine.Option(names = {"-scenario"}, split = ",", splitSynopsisLabel = ",", paramLabel = "CONTEXT",
                            required = false) List<String> contextNames) throws ModelManipulationException {
        Map<Role, Map<Scenario, Set<Demarcation>>> relation = new HashMap<>();
        Role partialMatchRole = null;
        if (roleName != null) {
            partialMatchRole = (Role) CLIContainer.getInstance().getElement(roleName, Role.class);
        }


        Scenario partialMatchScenario = null;
        if(contextNames != null) {
            partialMatchScenario = CLIUtil.getScenario(contextNames);
            if (partialMatchScenario == null) {
                System.out.println(CLIContainer.getInstance().getIndentation() + "Given scenario: " + contextNames.toString() + " does not correspond to an one unique actual scenario!");
                return;
            }
        }

        RSD.Match partialMatch = RSD.Matcher.create().newMatch(partialMatchRole, partialMatchScenario, null);
        RSD.Matcher matcher = CLIContainer.getInstance().getEngine().getMatcher(RSD.instance());
        Set<RSD.Match> matches = new HashSet<>(matcher.getAllMatches(partialMatch));
        for (RSD.Match match : matches) {
            relation.putIfAbsent(match.getRole(), new HashMap<>());
            relation.get(match.getRole()).putIfAbsent(match.getScenario(), new HashSet<>());
            relation.get(match.getRole()).get(match.getScenario()).add(match.getDemarcation());
        }
        List<Role> sortedRoles = relation.keySet().stream().sorted(Comparator.comparing(Role::getName)).collect(Collectors.toList());
        for (Role role : sortedRoles) {
            if (sortedRoles.size() != 1) {
                System.out.println(CLIContainer.getInstance().getIndentation() + role.getName() + ":");
                CLIContainer.getInstance().increaseIndentation();
            }
            List<Scenario> sortedScenarios = relation.get(role).keySet().stream().sorted(Comparator.comparing(Scenario::toString)).collect(Collectors.toList());
            for (Scenario scenario : sortedScenarios) {
                List<String> sortedNames = relation.get(role).get(scenario).stream().map(x -> x.getName()).sorted().collect(Collectors.toList());
                System.out.println(CLIContainer.getInstance().getIndentation()
                        + scenario.toString() + " -> " + sortedNames.toString());
            }
            if (sortedRoles.size() != 1) {
                CLIContainer.getInstance().decreaseIdentation();
            }
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show the demarcations granted to roles")
    public void RHSDH(@CommandLine.Option(names = {"-role"}, required = false) String roleName,
                    @CommandLine.Option(names = {"-scenario"}, split = ",", splitSynopsisLabel = ",", paramLabel = "CONTEXT",
                            required = false) List<String> contextNames) throws ModelManipulationException {
        Map<Role, Map<Scenario, Set<Demarcation>>> relation = new HashMap<>();
        Role partialMatchRole = null;
        if (roleName != null) {
            partialMatchRole = (Role) CLIContainer.getInstance().getElement(roleName, Role.class);
        }


        Scenario partialMatchScenario = null;
        if(contextNames != null) {
            partialMatchScenario = CLIUtil.getScenario(contextNames);
            if (partialMatchScenario == null) {
                System.out.println(CLIContainer.getInstance().getIndentation() + "Given scenario: " + contextNames.toString() + " does not correspond to an one unique actual scenario!");
                return;
            }
        }

        RHSDH.Match partialMatch = RHSDH.Matcher.create().newMatch(partialMatchRole, partialMatchScenario, null);
        RHSDH.Matcher matcher = CLIContainer.getInstance().getEngine().getMatcher(RHSDH.instance());
        Set<RHSDH.Match> matches = new HashSet<>(matcher.getAllMatches(partialMatch));
        for (RHSDH.Match match : matches) {
            relation.putIfAbsent(match.getRole(), new HashMap<>());
            relation.get(match.getRole()).putIfAbsent(match.getScenario(), new HashSet<>());
            relation.get(match.getRole()).get(match.getScenario()).add(match.getDemarcation());
        }
        List<Role> sortedRoles = relation.keySet().stream().sorted(Comparator.comparing(Role::getName)).collect(Collectors.toList());
        for (Role role : sortedRoles) {
            if (sortedRoles.size() != 1) {
                System.out.println(CLIContainer.getInstance().getIndentation() + role.getName() + ":");
                CLIContainer.getInstance().increaseIndentation();
            }
            List<Scenario> sortedScenarios = relation.get(role).keySet().stream().sorted(Comparator.comparing(Scenario::toString)).collect(Collectors.toList());
            for (Scenario scenario : sortedScenarios) {
                List<String> sortedNames = relation.get(role).get(scenario).stream().map(x -> x.getName()).sorted().collect(Collectors.toList());
                System.out.println(CLIContainer.getInstance().getIndentation()
                        + scenario.toString() + " -> " + sortedNames.toString());
            }
            if (sortedRoles.size() != 1) {
                CLIContainer.getInstance().decreaseIdentation();
            }
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show the demarcations granted to roles")
    public void RSP(@CommandLine.Option(names = {"-role"}, required = false) String roleName,
                    @CommandLine.Option(names = {"-scenario"}, split = ",", splitSynopsisLabel = ",", paramLabel = "CONTEXT",
                            required = false) List<String> contextNames) throws ModelManipulationException {
        Map<Role, Map<Scenario, Set<Permission>>> relation = new HashMap<>();
        Role partialMatchRole = null;
        if (roleName != null) {
            partialMatchRole = (Role) CLIContainer.getInstance().getElement(roleName, Role.class);
        }


        Scenario partialMatchScenario = null;
        if(contextNames != null) {
            partialMatchScenario = CLIUtil.getScenario(contextNames);
            if (partialMatchScenario == null) {
                System.out.println(CLIContainer.getInstance().getIndentation() + "Given scenario: " + contextNames.toString() + " does not correspond to an one unique actual scenario!");
                return;
            }
        }

        RSP.Match partialMatch = RSP.Matcher.create().newMatch(partialMatchRole, partialMatchScenario, null);
        RSP.Matcher matcher = CLIContainer.getInstance().getEngine().getMatcher(RSP.instance());
        Set<RSP.Match> matches = new HashSet<>(matcher.getAllMatches(partialMatch));
        for (RSP.Match match : matches) {
            relation.putIfAbsent(match.getRole(), new HashMap<>());
            relation.get(match.getRole()).putIfAbsent(match.getScenario(), new HashSet<>());
            relation.get(match.getRole()).get(match.getScenario()).add(match.getPermission());
        }
        List<Role> sortedRoles = relation.keySet().stream().sorted(Comparator.comparing(Role::getName)).collect(Collectors.toList());
        for (Role role : sortedRoles) {
            if (sortedRoles.size() != 1) {
                System.out.println(CLIContainer.getInstance().getIndentation() + role.getName() + ":");
                CLIContainer.getInstance().increaseIndentation();
            }
            List<Scenario> sortedScenarios = relation.get(role).keySet().stream().sorted(Comparator.comparing(Scenario::toString)).collect(Collectors.toList());
            for (Scenario scenario : sortedScenarios) {
                List<String> sortedNames = relation.get(role).get(scenario).stream().map(x -> x.getName()).sorted().collect(Collectors.toList());
                System.out.println(CLIContainer.getInstance().getIndentation()
                        + scenario.toString() + " -> " + sortedNames.toString());
            }
            if (sortedRoles.size() != 1) {
                CLIContainer.getInstance().decreaseIdentation();
            }
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show the permissions assigned to one or all demarcations")
    public void DP(@CommandLine.Option(names = {"-dem"}, required = false) String demarcationName) throws ModelManipulationException {
        List<Demarcation> demarcations = new LinkedList<>();
        if (demarcationName == null) {
            demarcations = CLIContainer.getInstance().getSystem().getAuthorizationPolicy().getDemarcations();
        } else {
            demarcations.add((Demarcation) CLIContainer.getInstance().getElement(demarcationName, Demarcation.class));
        }
        demarcations = demarcations.stream().sorted(Comparator.comparing(Demarcation::getName)).collect(Collectors.toList());
        for (Demarcation demarcation : demarcations) {
            System.out.println(CLIContainer.getInstance().getIndentation() + demarcation.getName() + "->" +
                    demarcation.getDP().stream().map(Permission::getName).sorted().collect(Collectors.toList()));
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show the permissions which are assigned to one or all demaracations")
    public void PD(@CommandLine.Option(names = {"-perm"}, required = false) String permissionName) throws ModelManipulationException {
        List<Permission> permissions = new LinkedList<>();
        if (permissionName == null) {
            permissions = CLIContainer.getInstance().getSystem().getAuthorizationPolicy().getPermissions();
        } else {
            permissions.add((Permission) CLIContainer.getInstance().getElement(permissionName, Permission.class));
        }
        permissions = permissions.stream().sorted(Comparator.comparing(Permission::getName)).collect(Collectors.toList());
        for (Permission permission : permissions) {
            System.out.println(CLIContainer.getInstance().getIndentation() + permission.getName() + "->" +
                    permission.getPD().stream().map(Demarcation::getName).sorted().collect(Collectors.toList()));
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show security zones the user is allowed to access")
    public void USO(@CommandLine.Option(names = {"-user"}, required = false) String userName,
                    @CommandLine.Option(names = {"-scenario"}, split = ",", splitSynopsisLabel = ",", paramLabel = "CONTEXT",
                            required = false) List<String> contextNames) throws ModelManipulationException {
        Map<User, Map<Scenario, Set<SACSObject>>> relation = new HashMap<>();
        User partialMatchUser = null;
        if (userName != null) {
            partialMatchUser = (User) CLIContainer.getInstance().getElement(userName, User.class);
        }


        Scenario partialMatchScenario = null;
        if(contextNames != null) {
            partialMatchScenario = CLIUtil.getScenario(contextNames);
            if (partialMatchScenario == null) {
                System.out.println(CLIContainer.getInstance().getIndentation() + "Given scenario: " + contextNames.toString() + " does not correspond to an one unique actual scenario!");
                return;
            }
        }

        USO.Match partialMatch = USO.Matcher.create().newMatch(partialMatchUser, partialMatchScenario, null);
        USO.Matcher matcher = CLIContainer.getInstance().getEngine().getMatcher(USO.instance());
        Set<USO.Match> matches = new HashSet<>(matcher.getAllMatches(partialMatch));
        for (USO.Match match : matches) {
            relation.putIfAbsent(match.getUser(), new HashMap<>());
            relation.get(match.getUser()).putIfAbsent(match.getScenario(), new HashSet<>());
            relation.get(match.getUser()).get(match.getScenario()).add(match.getObject());
        }
        List<User> sortedUsers = relation.keySet().stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
        for (User user : sortedUsers) {
            if (sortedUsers.size() != 1) {
                System.out.println(CLIContainer.getInstance().getIndentation() + user.getName() + ":");
                CLIContainer.getInstance().increaseIndentation();
            }
            List<Scenario> sortedScenarios = relation.get(user).keySet().stream().sorted(Comparator.comparing(Scenario::toString)).collect(Collectors.toList());
            for (Scenario scenario : sortedScenarios) {
                List<String> sortedNames = relation.get(user).get(scenario).stream().map(x -> x.getName()).sorted().collect(Collectors.toList());
                System.out.println(CLIContainer.getInstance().getIndentation()
                        + scenario.toString() + " -> " + sortedNames.toString());
            }
            if (sortedUsers.size() != 1) {
                CLIContainer.getInstance().decreaseIdentation();
            }
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show security zones the user can access")
    public void access(@CommandLine.Option(names = {"-user"}, required = false) String userName,
                       @CommandLine.Option(names = {"-scenario"}, split = ",", splitSynopsisLabel = ",", paramLabel = "CONTEXT",
                               required = false) List<String> contextNames) throws ModelManipulationException {
        Map<User, Map<Scenario, Set<SACSObject>>> relation = new HashMap<>();
        User partialMatchUser = null;
        if (userName != null) {
            partialMatchUser = (User) CLIContainer.getInstance().getElement(userName, User.class);
        }

        Scenario partialMatchScenario = null;
        if(contextNames != null) {
            partialMatchScenario = CLIUtil.getScenario(contextNames);
            if (partialMatchScenario == null) {
                System.out.println(CLIContainer.getInstance().getIndentation() + "Given scenario: " + contextNames.toString() + " does not correspond to an one unique actual scenario!");
                return;
            }
        }

        SecurityZoneAccessible.Match partialMatch = SecurityZoneAccessible.Matcher.create().newMatch(partialMatchUser, partialMatchScenario, null);
        SecurityZoneAccessible.Matcher matcher = CLIContainer.getInstance().getEngine().getMatcher(SecurityZoneAccessible.instance());
        Set<SecurityZoneAccessible.Match> matches = new HashSet<>(matcher.getAllMatches(partialMatch));

        for (SecurityZoneAccessible.Match match : matches) {
            relation.putIfAbsent(match.getUser(), new HashMap<>());
            relation.get(match.getUser()).putIfAbsent(match.getScenario(), new HashSet<>());
            relation.get(match.getUser()).get(match.getScenario()).add(match.getZone());
        }

        List<User> sortedUsers = relation.keySet().stream().sorted(Comparator.comparing(User::getName)).collect(Collectors.toList());
        for (User user : sortedUsers) {
            if (sortedUsers.size() != 1) {
                System.out.println(CLIContainer.getInstance().getIndentation() + user.getName() + ":");
                CLIContainer.getInstance().increaseIndentation();
            }
            List<Scenario> sortedScenarios = relation.get(user).keySet().stream().sorted(Comparator.comparing(Scenario::toString)).collect(Collectors.toList());
            for (Scenario scenario : sortedScenarios) {
                List<String> sortedNames = relation.get(user).get(scenario).stream().map(x -> x.getName()).sorted().collect(Collectors.toList());
                System.out.println(CLIContainer.getInstance().getIndentation()
                        + scenario.toString() + " -> " + sortedNames.toString());
            }
            if (sortedUsers.size() != 1) {
                CLIContainer.getInstance().decreaseIdentation();
            }
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show all security zones")
    public void securityzones(@CommandLine.Option(names = {"-status"}, required = false) boolean showStatus) {
        SiteAccessControlSystem system = (SiteAccessControlSystem) CLIContainer.getInstance().getModel().getContents().get(0);
        List<SecurityZone> zones = system.getTopology().getSecurityZones().stream().
                sorted(Comparator.comparing(SecurityZone::getName)).collect(Collectors.toList());
        for (SecurityZone zone : zones) {
            System.out.println(CLIContainer.getInstance().getIndentation() + zone.getName());
            CLIContainer.getInstance().increaseIndentation();
            System.out.println(CLIContainer.getInstance().getIndentation() + "connected to outside: " +
                    zone.isPublic());
            System.out.println(CLIContainer.getInstance().getIndentation() + "connects to: " +
                    zone.getReachable().stream().map(x -> x.getName()).sorted().collect(Collectors.toList()));

            if (showStatus) {
                System.out.println(CLIContainer.getInstance().getIndentation() + "status: ");
                CLIContainer.getInstance().increaseIndentation();
                SecurityZoneAccessStatus.Match partialMatch = SecurityZoneAccessStatus.Matcher.create().
                        newMatch(null, zone, null);
                SecurityZoneAccessStatus.Matcher matcher = CLIContainer.getInstance().getEngine()
                        .getMatcher(SecurityZoneAccessStatus.instance());
                Set<SecurityZoneAccessStatus.Match> matches = new HashSet<>(matcher.getAllMatches(partialMatch));
                matches.stream().sorted(Comparator.comparing(m -> m.getScenario().toString())).
                        forEach(m -> System.out.println(CLIContainer.getInstance().getIndentation()
                                + m.getScenario().toString() + " -> " + AuthenticationStatus.toName(m.getStatus())));
                CLIContainer.getInstance().decreaseIdentation();
            }

            System.out.println(CLIContainer.getInstance().getIndentation() + "constrained by: " +
                    zone.getConstrainedBy().stream().map(x -> x.getName()).sorted().collect(Collectors.toList()));

            CLIContainer.getInstance().decreaseIdentation();
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show all computed scenarios")
    public void scenarios(@CommandLine.Option(names = {"-example"}, description = "Show an example instance.", required = false) boolean example) throws ParseException, ModelManipulationException {
        Set<Scenarios.Match> matches = CLIContainer.getInstance().getEngine().getMatcher(Scenarios.instance()).getAllMatches().stream().collect(Collectors.toSet());
        List<String> scenarioStrings = new LinkedList();
        for (Scenarios.Match match : matches) {
            String scenarioString = match.getScenario().toString();
            if (example) {
                scenarioString += " (ex: " + getExampleDateScheduleTimeRange(match.getScenario()) + ")";
            }
            scenarioStrings.add(scenarioString);
        }

        Collections.sort(scenarioStrings);
        for (int i = 0; i < scenarioStrings.size(); i++) {
            System.out.println(CLIContainer.getInstance().getIndentation() + i + ": " + scenarioStrings.get(i));
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show partitions")
    public void partialpartitions(
            @CommandLine.Option(names = {"-week"}, description = "Show all weekday partial partitions", required = false) boolean showWeek,
            @CommandLine.Option(names = {"-days"}, description = "Show all partial partitions for these days", split = ",", splitSynopsisLabel = ",", paramLabel = "ValidDays", required = false) List<String> validDayNames)
            throws ModelManipulationException, ParseException, InvocationTargetException {
        SiteAccessControlSystem system = (SiteAccessControlSystem) CLIContainer.getInstance().getModel().getContents().get(0);
        if(showWeek) {
            List<ValidDayOfWeek> dayOfWeekSchedules = new ArrayList();
            dayOfWeekSchedules.add((ValidDayOfWeek) CLIContainer.getInstance().getElement("Monday", ValidDayOfWeek.class));
            dayOfWeekSchedules.add((ValidDayOfWeek) CLIContainer.getInstance().getElement("Tuesday", ValidDayOfWeek.class));
            dayOfWeekSchedules.add((ValidDayOfWeek) CLIContainer.getInstance().getElement("Wednesday", ValidDayOfWeek.class));
            dayOfWeekSchedules.add((ValidDayOfWeek) CLIContainer.getInstance().getElement("Thursday", ValidDayOfWeek.class));
            dayOfWeekSchedules.add((ValidDayOfWeek) CLIContainer.getInstance().getElement("Friday", ValidDayOfWeek.class));
            dayOfWeekSchedules.add((ValidDayOfWeek) CLIContainer.getInstance().getElement("Saturday", ValidDayOfWeek.class));
            dayOfWeekSchedules.add((ValidDayOfWeek) CLIContainer.getInstance().getElement("Sunday", ValidDayOfWeek.class));
            for (ValidDayOfWeek dayOfWeekSchedule: dayOfWeekSchedules) {
                System.out.println(CLIContainer.getInstance().getIndentation() + dayOfWeekSchedule.getName());
                CLIContainer.getInstance().increaseIndentation();

                List<ValidDayTimeRange> instances = dayOfWeekSchedule.getInstances().stream().sorted(Comparator.comparingInt(TimeRange::getStart)).collect(Collectors.toList());
                for (ValidDayTimeRange instance: instances) {
                    Scenario scenario = new Scenario(instance.getTemporalContextTimeRanges().stream().map(x -> ((TimeRange) x).eContainer())
                            .map(x -> (TemporalContext) x).collect(Collectors.toSet()));

                    System.out.println(CLIContainer.getInstance().getIndentation() + CLIUtil.timeRangePrettyString(instance));
                    System.out.println(CLIContainer.getInstance().getIndentation() + "temporal contexts: " + scenario.toString());
                    System.out.println(CLIContainer.getInstance().getIndentation() + "temporal context instances: " + instance.getTemporalContextTimeRanges().stream().map(t -> "(" + t.getName() + ", "
                            + CLIUtil.timeRangePrettyString(t) + ")").sorted().collect(Collectors.toList()).toString());
                    System.out.println();
                }

                CLIContainer.getInstance().decreaseIdentation();
            }
        }

        if (validDayNames != null) {
            List<ValidDay> validDays = new ArrayList();
            for (String validDayName : validDayNames) {
                ValidDay validDay;
                if(validDayName.split("_").length == 3) {
                    DateFormat format = new SimpleDateFormat("EEEE_d_MMMM", Locale.ENGLISH);
                    try {
                        format.parse(validDayName);

                    } catch (ParseException pe) {
                        validDayName = CLIUtil.addDayToDateString(validDayName);
                        // Do nothing. Apparently, there is no cleaner way to check if the format is respected.
                    }
                }

                validDay = (ValidDay) CLIContainer.getInstance().getModel().getEObject(validDayName);
                if(validDay == null) {
                    if(validDayName.split("_").length == 4) {
                        ValidDayOfWeekMonth validDayOfWeekMonth = (ValidDayOfWeekMonth) CLIContainer.getInstance().getElement(
                                validDayName.split("_")[0]
                                        + "_" + validDayName.split("_")[1]
                                        + "_" + validDayName.split("_")[2],
                                ValidDayOfWeekMonth.class
                        );
                        validDay = CLIContainer.getInstance().getModifier().addValidDayOfYear(validDayOfWeekMonth, validDayName);
                        CLIContainer.getInstance().getModifier().addDayScheduleTimeRange(validDay, new IntegerInterval(0, 1439));
                        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
                    }
                }
                validDays.add(validDay);
            }

            for (ValidDay validDay: validDays) {
                System.out.println(CLIContainer.getInstance().getIndentation() + validDay.getName());
                CLIContainer.getInstance().increaseIndentation();

                List<ValidDayTimeRange> instances = validDay.getInstances().stream().sorted(Comparator.comparingInt(TimeRange::getStart)).collect(Collectors.toList());
                for (ValidDayTimeRange instance: instances) {
                    Scenario scenario = new Scenario(instance.getTemporalContextTimeRanges().stream().map(x -> ((TimeRange) x).eContainer())
                            .map(x -> (TemporalContext) x).collect(Collectors.toSet()));

                    System.out.println(CLIContainer.getInstance().getIndentation() + CLIUtil.timeRangePrettyString(instance));
                    System.out.println(CLIContainer.getInstance().getIndentation() + "temporal contexts: " + scenario.toString());
                    System.out.println(CLIContainer.getInstance().getIndentation() + "temporal context instances: " + instance.getTemporalContextTimeRanges().stream().map(t -> "(" + t.getName() + ", "
                            + CLIUtil.timeRangePrettyString(t) + ")").sorted().collect(Collectors.toList()).toString());
                    System.out.println();
                }
                CLIContainer.getInstance().decreaseIdentation();
            }
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show partitions")
    public void scenarioinstances(
            @CommandLine.Option(names = {"-days"}, description = "Show all scenario instances for these days", split = ",", splitSynopsisLabel = ",", paramLabel = "ValidDays", required = false) List<String> validDayNames)
            throws ModelManipulationException, ParseException, InvocationTargetException {

        if(validDayNames == null) {
            System.out.println("\"-days\" should be specified (e.g. -days=Monday_1_January,Monday_1_January_2024)");
        }
        else {
            List<ValidDay> validDays = new ArrayList();
            for (String validDayName : validDayNames) {
                ValidDay validDay;
                if(validDayName.split("_").length == 3) {
                    DateFormat format = new SimpleDateFormat("EEEE_d_MMMM", Locale.ENGLISH);
                    try {
                        format.parse(validDayName);

                    } catch (ParseException pe) {
                        validDayName = CLIUtil.addDayToDateString(validDayName);
                        // Do nothing. Apparently, there is no cleaner way to check if the format is respected.
                    }
                }

                validDay = (ValidDay) CLIContainer.getInstance().getModel().getEObject(validDayName);
                if(validDay == null) {
                    if(validDayName.split("_").length == 4) {
                        ValidDayOfWeekMonth validDayOfWeekMonth = (ValidDayOfWeekMonth) CLIContainer.getInstance().getElement(
                                validDayName.split("_")[0]
                                        + "_" + validDayName.split("_")[1]
                                        + "_" + validDayName.split("_")[2],
                                ValidDayOfWeekMonth.class
                        );
                        validDay = CLIContainer.getInstance().getModifier().addValidDayOfYear(validDayOfWeekMonth, validDayName);
                        CLIContainer.getInstance().getModifier().addDayScheduleTimeRange(validDay, new IntegerInterval(0, 1439));
                        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
                    }
                }
                validDays.add(validDay);
            }

            for (ValidDay validDay: validDays) {

                if (validDay instanceof ValidDayOfWeek || validDay instanceof ValidDayOfMonth) {
                    System.out.println("Scenario instances are computed on a day of the week concides with a day of the month or"
                        + "on the day of the year. Thus, " + validDay.getName() + " has no scenario instances (only partitions)");
                }

                System.out.println(CLIContainer.getInstance().getIndentation() + validDay.getName());
                CLIContainer.getInstance().increaseIndentation();

                if (validDay instanceof ValidDayOfYear) {
                    ValidDayOfYear validDayOfYear = (ValidDayOfYear) validDay;
                    AdvancedViatraQueryEngine engine = CLIContainer.getInstance().getEngine();
                    List<ValidDayOfYearAllCombinedInstance_To_Scenario.Match> matches = new ArrayList(engine.getMatcher(ValidDayOfYearAllCombinedInstance_To_Scenario.instance())
                            .getAllMatches(validDayOfYear, null, null, null));
                    if(matches.size() != 0) {
                        matches.sort(Comparator.comparing(ValidDayOfYearAllCombinedInstance_To_Scenario.Match::getStarttime));
                        for (ValidDayOfYearAllCombinedInstance_To_Scenario.Match match : matches) {
                            System.out.println(CLIContainer.getInstance().getIndentation() + fromMinutesToHHmm(match.getStarttime()) + "-" + fromMinutesToHHmm(match.getEndtime()));
                            System.out.println(CLIContainer.getInstance().getIndentation() + "scenario: " + match.getScenario());
                            System.out.println();
                        }
                    } else {
                        validDay = validDayOfYear.getValidDayOfWeekMonth();
                    }
                }
                if (validDay instanceof ValidDayOfWeekMonth) {
                    ValidDayOfWeekMonth validDayOfWeekMonth = (ValidDayOfWeekMonth) validDay;
                    AdvancedViatraQueryEngine engine = CLIContainer.getInstance().getEngine();
                    List<ValidDayOfWeekAndMonthAllCombinedInstance_To_Scenario.Match> matches = new ArrayList(engine.getMatcher(ValidDayOfWeekAndMonthAllCombinedInstance_To_Scenario.instance())
                            .getAllMatches(validDayOfWeekMonth, null, null, null));
                    matches.sort(Comparator.comparing(ValidDayOfWeekAndMonthAllCombinedInstance_To_Scenario.Match::getStarttime));
                    for (ValidDayOfWeekAndMonthAllCombinedInstance_To_Scenario.Match match : matches) {
                        System.out.println(CLIContainer.getInstance().getIndentation() + fromMinutesToHHmm(match.getStarttime()) + "-" + fromMinutesToHHmm(match.getEndtime()));
                        System.out.println(CLIContainer.getInstance().getIndentation() + "scenario: " + match.getScenario());
                        System.out.println();
                    }
                }
                CLIContainer.getInstance().decreaseIdentation();
            }
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show all temporal contexts")
    public void temporalcontexts() {
        SiteAccessControlSystem system = (SiteAccessControlSystem) CLIContainer.getInstance().getModel().getContents().get(0);
        ContextContainer contextContainer = system.getContextContainer();
        List<TemporalContext> temporalContexts = contextContainer.getTemporalContexts().stream().sorted(
                Comparator.comparing(TemporalContext::getName)
        ).collect(Collectors.toList());
        for(TemporalContext tc: temporalContexts) {
            System.out.println(CLIContainer.getInstance().getIndentation() + tc.getName());
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show n temporal context instances (default=5)")
    public void temporalcontextinstances(@CommandLine.Option(names = {"-n"}, required = false) int instanceCount,
        @CommandLine.Option(names = {"-showName"}, required = false) boolean showName) {

        SiteAccessControlSystem system = (SiteAccessControlSystem) CLIContainer.getInstance().getModel().getContents().get(0);
        ContextContainer contextContainer = system.getContextContainer();
        List<TemporalContext> temporalContexts = contextContainer.getTemporalContexts().stream().sorted(
                Comparator.comparing(TemporalContext::getName)
        ).collect(Collectors.toList());

        if(instanceCount == 0) {
            instanceCount = 5;
        }

        for(TemporalContext context: temporalContexts) {
            if(context.getInstances().size() == 0) {
                System.out.println(CLIContainer.getInstance().getIndentation() + context.getName() + "-> []");
            } else {
                if(!showName) {
                    System.out.println(context.getName() + "->" +
                            context.getInstances().stream().limit(instanceCount)
                                    .map(CLIUtil::timeRangePrettyString).collect(Collectors.toList())
                    );
                } else {
                    System.out.println(CLIContainer.getInstance().getIndentation() + context.getName() + "-> [ ");
                    CLIContainer.getInstance().increaseIndentation();
                    List<TimeRange> timeRanges = new LinkedList<>(context.getInstances());
                    for (TimeRange timeRange : timeRanges.subList(0, timeRanges.size() - 1)) {
                        System.out.println(CLIContainer.getInstance().getIndentation() + timeRange.getName() +
                                " : " + CLIUtil.timeRangePrettyString(timeRange) + ",");
                    }
                    System.out.println(CLIContainer.getInstance().getIndentation() + timeRanges.get(timeRanges.size()-1).getName() +
                            " : " + CLIUtil.timeRangePrettyString(timeRanges.get(timeRanges.size()-1)));
                    CLIContainer.getInstance().decreaseIdentation();
                    System.out.println(CLIContainer.getInstance().getIndentation() + "} ");
                }
            }
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show all temporal grant rules")
    public void temporalgrantrules(@CommandLine.Option(names = {"-role"}, required = false) String roleName,
                                   @CommandLine.Option(names = {"-context"}, required = false) String contextName,
                                   @CommandLine.Option(names = {"-dem"}, required = false) String demarcationName,
                                   @CommandLine.Option(names = {"-command"}, required = false) String commandName,
                                   @CommandLine.Option(names = {"-priority"}, required = false, defaultValue = "-1") int priority)
            throws ModelManipulationException {
        SiteAccessControlSystem system = (SiteAccessControlSystem) CLIContainer.getInstance().getModel().getContents().get(0);
        List<TemporalGrantRule> temporalGrantRules = system.getAuthorizationPolicy().getTemporalGrantRules().stream().sorted(
                Comparator.comparing(TemporalGrantRule::getName)
        ).collect(Collectors.toList());
        if(roleName != null) {
            Role role = (Role) CLIContainer.getInstance().getElement(roleName, Role.class);
            temporalGrantRules = temporalGrantRules.stream().filter(x -> role.equals(x.getRole())).collect(Collectors.toList());
        }
        if(demarcationName != null) {
            Demarcation demarcation = (Demarcation) CLIContainer.getInstance().getElement(demarcationName, Demarcation.class);
            temporalGrantRules = temporalGrantRules.stream().filter(x -> demarcation.equals(x.getDemarcation())).collect(Collectors.toList());
        }
        if(contextName != null) {
            TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
            temporalGrantRules = temporalGrantRules.stream().filter(x -> context.equals(x.getTemporalContext())).collect(Collectors.toList());
        }
        if(commandName != null) {
            if (!commandName.equals("grant") && !commandName.equals("revoke")) {
                System.out.println(CLIContainer.getInstance().getIndentation() + "unkown command: " + commandName + ", command should either be 'grant' or 'revoke'");
            }
            else if(commandName.equals("grant")) {
                temporalGrantRules = temporalGrantRules.stream().filter(x -> x.isIsGrant()).collect(Collectors.toList());
            }
            else {
                temporalGrantRules = temporalGrantRules.stream().filter(x -> !x.isIsGrant()).collect(Collectors.toList());
            }
            TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
            temporalGrantRules = temporalGrantRules.stream().filter(x -> context.equals(x.getTemporalContext())).collect(Collectors.toList());
        }
        if(priority != -1) {
            temporalGrantRules = temporalGrantRules.stream().filter(x -> x.getPriority() == priority).collect(Collectors.toList());
        }

        for (TemporalGrantRule rule: temporalGrantRules) {
            String command = rule.isIsGrant() ? "grant" : "revoke";
            System.out.println(CLIContainer.getInstance().getIndentation() + rule.getName() + " : " + command + " " + rule.getRole().getName() + " access to "
                    + rule.getDemarcation().getName() + " during " + rule.getTemporalContext().getName() + " with priority " + rule.getPriority());
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show all temporal authentication rules")
    public void temporalauthenticationrules( @CommandLine.Option(names = {"-zone"}, required = false) String zoneName,
                                             @CommandLine.Option(names = {"-context"}, required = false) String contextName,
                                             @CommandLine.Option(names = {"-command"}, required = false) String commandName,
                                             @CommandLine.Option(names = {"-priority"}, required = false, defaultValue = "-1") int priority)
            throws ModelManipulationException {
        SiteAccessControlSystem system = (SiteAccessControlSystem) CLIContainer.getInstance().getModel().getContents().get(0);
        List<TemporalAuthenticationRule> temporalAuthenticationRules = system.getAuthenticationPolicy().getTemporalAuthenticationRules()
                .stream().sorted(
                        Comparator.comparing(TemporalAuthenticationRule::getName)
                ).collect(Collectors.toList());

        if(zoneName != null) {
            SecurityZone zone = (SecurityZone) CLIContainer.getInstance().getElement(zoneName, SecurityZone.class);
            temporalAuthenticationRules = temporalAuthenticationRules.stream().filter(x -> zone.equals(x.getSecurityZone())).collect(Collectors.toList());
        }
        if(contextName != null) {
            TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
            temporalAuthenticationRules = temporalAuthenticationRules.stream().filter(x -> context.equals(x.getTemporalContext())).collect(Collectors.toList());
        }
        if(commandName != null) {
            if (!commandName.equals("locked") && !commandName.equals("unlocked") && !commandName.equals("protected")) {
                System.out.println(CLIContainer.getInstance().getIndentation() + "unkown command: " + commandName + ", command should either be " +
                        "\"locked\", \"unlocked\" or \"protected\"");
            }
            else if(commandName.equals("locked")) {
                temporalAuthenticationRules = temporalAuthenticationRules.stream().filter(
                        x -> x.getStatus() == AuthenticationStatus.LOCKED.getStatusCode()
                ).collect(Collectors.toList());
            }
            else if(commandName.equals("unlocked")) {
                temporalAuthenticationRules = temporalAuthenticationRules.stream().filter(
                        x -> x.getStatus() == AuthenticationStatus.UNLOCKED.getStatusCode()
                ).collect(Collectors.toList());
            }
            else {
                temporalAuthenticationRules = temporalAuthenticationRules.stream().filter(
                        x -> x.getStatus() == AuthenticationStatus.PROTECTED.getStatusCode()
                ).collect(Collectors.toList());
            }
            TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
            temporalAuthenticationRules = temporalAuthenticationRules.stream().filter(x -> context.equals(x.getTemporalContext())).collect(Collectors.toList());
        }
        if(priority != -1) {
            temporalAuthenticationRules = temporalAuthenticationRules.stream().filter(x -> x.getPriority() == priority).collect(Collectors.toList());
        }
        for (TemporalAuthenticationRule rule: temporalAuthenticationRules) {
            String command = rule.getStatus() == 0 ? "unlocked" :
                    rule.getStatus() == 1 ? "protected" : "locked";
            System.out.println(CLIContainer.getInstance().getIndentation() + rule.getName() + " : " + command + " " + rule.getSecurityZone() +
                    " during " + rule.getTemporalContext().getName() + " with priority " + rule.getPriority());
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show all constraints")
    public void constraints() {
        SiteAccessControlSystem system = (SiteAccessControlSystem) CLIContainer.getInstance().getModel().getContents().get(0);
        List<PolicyDependentAuthorizationConstraint> authorizationConstraints = system.getAuthorizationConstraints().stream().sorted(
                Comparator.comparing(PolicyDependentAuthorizationConstraint::getName)
        ).collect(Collectors.toList());
        for (PolicyDependentAuthorizationConstraint constraint: authorizationConstraints) {
            System.out.println(CLIContainer.getInstance().getIndentation() + constraint.getName() + ": " + ConstraintHelper.toString(constraint));
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show all constraint violations")
    public void violations(@CommandLine.Option(names = {"-user"}, required = false) String userName,
                           @CommandLine.Option(names = {"-role"}, required = false) String roleName,
                           @CommandLine.Option(names = {"-demarcation"}, required = false) String demarcationName,
                           @CommandLine.Option(names = {"-scenario"}, split = ",", splitSynopsisLabel = ",", paramLabel = "CONTEXT",
                                   required = false) List<String> contextNames) throws ModelManipulationException {
        User user = null;
        if(userName != null) {
            user = (User) CLIContainer.getInstance().getElement(userName, User.class);
        }
        Role role = null;
        if(roleName != null) {
            role = (Role) CLIContainer.getInstance().getElement(roleName, Role.class);
        }
        Demarcation demarcation = null;
        if(demarcationName != null) {
            demarcation = (Demarcation) CLIContainer.getInstance().getElement(demarcationName, Demarcation.class);
        }

        Scenario scenario = null;
        if(contextNames != null) {
            scenario = CLIUtil.getScenario(contextNames);
            if (scenario == null) {
                System.out.println(CLIContainer.getInstance().getIndentation() + "Given scenario: " + contextNames.toString() + " does not correspond to an one unique actual scenario!");
                return;
            }
        }

        CLIContainer.getInstance().getEngine().getMatcher(SoDURPattern.instance()).getAllMatches(null, user).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(SoDUDPattern.instance()).getAllMatches(null, scenario, user).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(SoDUPPattern.instance()).getAllMatches(null, scenario, user).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(SoDRDPattern.instance()).getAllMatches(null, scenario, role).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(SoDRPPattern.instance()).getAllMatches(null, scenario, role).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(SoDDPPattern.instance()).getAllMatches(null, demarcation).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(PrerequisiteURPattern.instance()).getAllMatches(null, user).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(PrerequisiteUDPattern.instance()).getAllMatches(null, scenario, user).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(PrerequisiteUPPattern.instance()).getAllMatches(null, scenario, user).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(PrerequisiteRDPattern.instance()).getAllMatches(null, scenario, role).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(PrerequisiteRPPattern.instance()).getAllMatches(null, scenario, role).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(PrerequisiteDPPattern.instance()).getAllMatches(null, demarcation).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(BoDURPattern.instance()).getAllMatches(null, user).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(BoDUDPattern.instance()).getAllMatches(null, scenario, user).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(BoDUPPattern.instance()).getAllMatches(null, scenario, user).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(BoDRDPattern.instance()).getAllMatches(null , scenario, role).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(BoDRPPattern.instance()).getAllMatches(null, scenario, role).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(BoDDPPattern.instance()).getAllMatches(null, demarcation).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(CardinalityURPattern.instance()).getAllMatches().stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(CardinalityUDPattern.instance()).getAllMatches(null, scenario, null).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(CardinalityUPPattern.instance()).getAllMatches(null, scenario, null).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(CardinalityRDPattern.instance()).getAllMatches(null, scenario, null).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(CardinalityRPPattern.instance()).getAllMatches(null, scenario, null).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(CardinalityDPPattern.instance()).getAllMatches().stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","").replace("Pattern","") + " - " + c.prettyPrint().replace("\"","")));
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show all policy smells")
    public void smells(@CommandLine.Option(names = {"-user"}, required = false) String userName,
                       @CommandLine.Option(names = {"-role"}, required = false) String roleName,
                       @CommandLine.Option(names = {"-demarcation"}, required = false) String demarcationName,
                       @CommandLine.Option(names = {"-permission"}, required = false) String permissionName,
                       @CommandLine.Option(names = {"-object"}, required = false) String objectName,
                       @CommandLine.Option(names = {"-scenario"}, split = ",", splitSynopsisLabel = ",", paramLabel = "CONTEXT",
                               required = false) List<String> contextNames) throws ModelManipulationException {
        User user = null;
        if(userName != null) {
            user = (User) CLIContainer.getInstance().getElement(userName, User.class);
        }
        Role role = null;
        if(roleName != null) {
            role = (Role) CLIContainer.getInstance().getElement(roleName, Role.class);
        }
        Demarcation demarcation = null;
        if(demarcationName != null) {
            demarcation = (Demarcation) CLIContainer.getInstance().getElement(demarcationName, Demarcation.class);
        }
        Permission permission = null;
        if(permissionName != null) {
            permission = (Permission) CLIContainer.getInstance().getElement(permissionName, Permission.class);
        }

        SecurityZone zone = null;
        if(objectName != null) {
            zone = (SecurityZone) CLIContainer.getInstance().getElement(objectName, SecurityZone.class);
        }

        Scenario scenario = null;
        if(contextNames != null) {
            Scenario matchScenario = new Scenario(new HashSet<>());
            for (String contextName: contextNames) {
                matchScenario.add((TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class));
            }
            if(CLIContainer.getInstance().getEngine().getMatcher(Scenarios.instance()).getAllMatches(matchScenario).stream().map(Scenarios.Match::getScenario).collect(Collectors.toSet())
                    .contains(matchScenario)) {
                scenario = matchScenario;
            }
            else {
                System.out.println(CLIContainer.getInstance().getIndentation() + "Given scenario: " + contextNames.toString() + " does not correspond to an  actual scenario!");
                return;
            }
        }

        SiteAccessControlSystem system = (SiteAccessControlSystem) CLIContainer.getInstance().getModel().getContents().get(0);
        CLIContainer.getInstance().getEngine().getMatcher(UnusedRole.instance()).getAllMatches(role).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(UnusedDemarcation.instance()).getAllMatches(demarcation).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(UnusedPermission.instance()).getAllMatches(permission).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(ZombieDemarcation.instance()).getAllMatches(demarcation).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(ZombiePermission.instance()).getAllMatches(permission).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(GodUser.instance()).getAllMatches(user).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(GodRole.instance()).getAllMatches(role).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","") + " - " + c.prettyPrint().replace("\"","")));

        if(role == null) {
            CLIContainer.getInstance().getEngine().getMatcher(IgnoredRoleInheritance.instance()).getAllMatches(user, null, null).stream().forEach(c -> System.out.println(
                    CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.", "") + " - " + c.prettyPrint().replace("\"", "")));
        } else {
            CLIContainer.getInstance().getEngine().getMatcher(IgnoredRoleInheritance.instance()).getAllMatches(user, role, null).stream().forEach(c -> System.out.println(
                    CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.", "") + " - " + c.prettyPrint().replace("\"", "")));
            CLIContainer.getInstance().getEngine().getMatcher(IgnoredRoleInheritance.instance()).getAllMatches(user, null, role).stream().forEach(c -> System.out.println(
                    CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.", "") + " - " + c.prettyPrint().replace("\"", "")));
        }

        if(demarcation == null) {
            CLIContainer.getInstance().getEngine().getMatcher(IgnoredDemarcationInheritance.instance()).getAllMatches(role, scenario, null, null).stream().forEach(c -> System.out.println(
                    CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","") + " - " + c.prettyPrint().replace("\"","")));
        } else {
            CLIContainer.getInstance().getEngine().getMatcher(IgnoredDemarcationInheritance.instance()).getAllMatches(role, scenario, demarcation, null).stream().forEach(c -> System.out.println(
                    CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","") + " - " + c.prettyPrint().replace("\"","")));
            CLIContainer.getInstance().getEngine().getMatcher(IgnoredDemarcationInheritance.instance()).getAllMatches(role, scenario, null, demarcation).stream().forEach(c -> System.out.println(
                    CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","") + " - " + c.prettyPrint().replace("\"","")));
        }

        CLIContainer.getInstance().getEngine().getMatcher(UserCanGetTrapped.instance()).getAllMatches(user, scenario, zone).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","") + " - " + c.prettyPrint().replace("\"","")));
        CLIContainer.getInstance().getEngine().getMatcher(UninvocablePermission.instance()).getAllMatches(user, scenario, permission, zone).stream().forEach(c -> System.out.println(
                CLIContainer.getInstance().getIndentation() + c.patternName().replace("com.vanderhighway.grrbac.patterns.","") + " - " + c.prettyPrint().replace("\"","")));
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Show used memory (runs gc first)")
    public void memory() {
        // Get the Java runtime
        Runtime runtime = Runtime.getRuntime();
        // Run the garbage collector
        runtime.gc();
        // Calculate the used memory
        long memory = (runtime.totalMemory() - runtime.freeMemory()) / (1024L * 1024L);
        System.out.println(CLIContainer.getInstance().getIndentation() + "used memory: " + memory + " MB");
    }
}