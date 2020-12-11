package cli.commands.subcommands;

import cli.CLIContainer;
import com.vanderhighway.grrbac.model.grrbac.model.Demarcation;
import com.vanderhighway.grrbac.model.grrbac.model.Permission;
import com.vanderhighway.grrbac.model.grrbac.model.Role;
import com.vanderhighway.grrbac.model.grrbac.model.TemporalContext;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import picocli.CommandLine;

import java.lang.reflect.InvocationTargetException;

@CommandLine.Command(sortOptions = false, name="constraint",mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
        description = "Add an authorization constraint")
public class AddConstraint implements Runnable {

    @Override
    public void run() {

    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a Separation of Duty on the level of Users / Roles")
    public void SoDUR(@CommandLine.Option(names = {"-name"}, required = true) String name,
                      @CommandLine.Option(names = {"-role1"}, required = true) String role1Name,
                      @CommandLine.Option(names = {"-role2"}, required = true) String role2Name) throws ModelManipulationException, InvocationTargetException {
        Role role1 = (Role) CLIContainer.getInstance().getElement(role1Name, Role.class);
        Role role2 = (Role) CLIContainer.getInstance().getElement(role2Name, Role.class);
        CLIContainer.getInstance().getModifier().addSoDURConstraint(name, role1, role2);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a Separation of Duty on the level of Users / Demarcations ")
    public void SoDUD(@CommandLine.Option(names = {"-name"}, required = true) String name,
                      @CommandLine.Option(names = {"-dem1"}, required = true) String demarcation1Name,
                      @CommandLine.Option(names = {"-dem2"}, required = true) String demarcation2Name,
                      @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Demarcation dem1 = (Demarcation) CLIContainer.getInstance().getElement(demarcation1Name, Demarcation.class);
        Demarcation dem2 = (Demarcation) CLIContainer.getInstance().getElement(demarcation2Name, Demarcation.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addSoDUDConstraint(name, dem1, dem2, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a Separation of Duty on the level of Users / Permissions ")
    public void SoDUP(@CommandLine.Option(names = {"-name"}, required = true) String name,
                      @CommandLine.Option(names = {"-perm1"}, required = true) String permission1Name,
                      @CommandLine.Option(names = {"-perm2"}, required = true) String permission2Name,
                      @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Permission perm1 = (Permission) CLIContainer.getInstance().getElement(permission1Name, Permission.class);
        Permission perm2 = (Permission) CLIContainer.getInstance().getElement(permission2Name, Permission.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addSoDUPConstraint(name, perm1, perm2, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a Separation of Duty on the level of Roles / Demarcations")
    public void SoDRD(@CommandLine.Option(names = {"-name"}, required = true) String name,
                      @CommandLine.Option(names = {"-dem1"}, required = true) String demarcation1Name,
                      @CommandLine.Option(names = {"-dem2"}, required = true) String demarcation2Name,
                      @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Demarcation dem1 = (Demarcation) CLIContainer.getInstance().getElement(demarcation1Name, Demarcation.class);
        Demarcation dem2 = (Demarcation) CLIContainer.getInstance().getElement(demarcation2Name, Demarcation.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addSoDRDConstraint(name, dem1, dem2, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a Separation of Duty on the level of Roles / Permissions")
    public void SoDRP(@CommandLine.Option(names = {"-name"}, required = true) String name,
                      @CommandLine.Option(names = {"-perm1"}, required = true) String permission1Name,
                      @CommandLine.Option(names = {"-perm2"}, required = true) String permission2Name,
                      @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Permission perm1 = (Permission) CLIContainer.getInstance().getElement(permission1Name, Permission.class);
        Permission perm2 = (Permission) CLIContainer.getInstance().getElement(permission2Name, Permission.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addSoDRPConstraint(name, perm1, perm2, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a Separation of Duty on the level of Demarcations / Permissions")
    public void SoDDP(@CommandLine.Option(names = {"-name"}, required = true) String name,
                      @CommandLine.Option(names = {"-perm1"}, required = true) String permission1Name,
                      @CommandLine.Option(names = {"-perm2"}, required = true) String permission2Name) throws ModelManipulationException, InvocationTargetException {
        Permission perm1 = (Permission) CLIContainer.getInstance().getElement(permission1Name, Permission.class);
        Permission perm2 = (Permission) CLIContainer.getInstance().getElement(permission2Name, Permission.class);
        CLIContainer.getInstance().getModifier().addSoDDPConstraint(name, perm1, perm2);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a prerequisite on the level of Users / Roles")
    public void PreReqUR(@CommandLine.Option(names = {"-name"}, required = true) String name,
                         @CommandLine.Option(names = {"-role1"}, required = true) String role1Name,
                         @CommandLine.Option(names = {"-role2"}, required = true) String role2Name) throws ModelManipulationException, InvocationTargetException {
        Role role1 = (Role) CLIContainer.getInstance().getElement(role1Name, Role.class);
        Role role2 = (Role) CLIContainer.getInstance().getElement(role2Name, Role.class);
        CLIContainer.getInstance().getModifier().addPrerequisiteURConstraint(name, role1, role2);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a prerequisite on the level of Users / Demarcations ")
    public void PreReqUD(@CommandLine.Option(names = {"-name"}, required = true) String name,
                         @CommandLine.Option(names = {"-dem1"}, required = true) String demarcation1Name,
                         @CommandLine.Option(names = {"-dem2"}, required = true) String demarcation2Name,
                         @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Demarcation dem1 = (Demarcation) CLIContainer.getInstance().getElement(demarcation1Name, Demarcation.class);
        Demarcation dem2 = (Demarcation) CLIContainer.getInstance().getElement(demarcation2Name, Demarcation.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addPrerequisiteUDConstraint(name, dem1, dem2, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a prerequisite on the level of Users / Permissions ")
    public void PreReqUP(@CommandLine.Option(names = {"-name"}, required = true) String name,
                         @CommandLine.Option(names = {"-perm1"}, required = true) String permission1Name,
                         @CommandLine.Option(names = {"-perm2"}, required = true) String permission2Name,
                         @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Permission perm1 = (Permission) CLIContainer.getInstance().getElement(permission1Name, Permission.class);
        Permission perm2 = (Permission) CLIContainer.getInstance().getElement(permission2Name, Permission.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addPrerequisiteUPConstraint(name, perm1, perm2, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a prerequisite on the level of Roles / Demarcations")
    public void PreReqRD(@CommandLine.Option(names = {"-name"}, required = true) String name,
                         @CommandLine.Option(names = {"-dem1"}, required = true) String demarcation1Name,
                         @CommandLine.Option(names = {"-dem2"}, required = true) String demarcation2Name,
                         @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Demarcation dem1 = (Demarcation) CLIContainer.getInstance().getElement(demarcation1Name, Demarcation.class);
        Demarcation dem2 = (Demarcation) CLIContainer.getInstance().getElement(demarcation2Name, Demarcation.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addPrerequisiteRDConstraint(name, dem1, dem2, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a prerequisite on the level of Roles / Permissions")
    public void PreReqRP(@CommandLine.Option(names = {"-name"}, required = true) String name,
                         @CommandLine.Option(names = {"-perm1"}, required = true) String permission1Name,
                         @CommandLine.Option(names = {"-perm2"}, required = true) String permission2Name,
                         @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Permission perm1 = (Permission) CLIContainer.getInstance().getElement(permission1Name, Permission.class);
        Permission perm2 = (Permission) CLIContainer.getInstance().getElement(permission2Name, Permission.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addPrerequisiteRPConstraint(name, perm1, perm2, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a prerequisite on the level of Demarcations / Permissions")
    public void PreReqDP(@CommandLine.Option(names = {"-name"}, required = true) String name,
                         @CommandLine.Option(names = {"-perm1"}, required = true) String permission1Name,
                         @CommandLine.Option(names = {"-perm2"}, required = true) String permission2Name) throws ModelManipulationException, InvocationTargetException {
        Permission perm1 = (Permission) CLIContainer.getInstance().getElement(permission1Name, Permission.class);
        Permission perm2 = (Permission) CLIContainer.getInstance().getElement(permission2Name, Permission.class);
        CLIContainer.getInstance().getModifier().addPrerequisiteDPConstraint(name, perm1, perm2);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a Binding of Duty on the level of Users / Roles")
    public void BoDUR(@CommandLine.Option(names = {"-name"}, required = true) String name,
                      @CommandLine.Option(names = {"-role1"}, required = true) String role1Name,
                      @CommandLine.Option(names = {"-role2"}, required = true) String role2Name) throws ModelManipulationException, InvocationTargetException {
        Role role1 = (Role) CLIContainer.getInstance().getElement(role1Name, Role.class);
        Role role2 = (Role) CLIContainer.getInstance().getElement(role2Name, Role.class);
        CLIContainer.getInstance().getModifier().addBoDURConstraint(name, role1, role2);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a Binding of Duty on the level of Users / Demarcations ")
    public void BoDUD(@CommandLine.Option(names = {"-name"}, required = true) String name,
                      @CommandLine.Option(names = {"-dem1"}, required = true) String demarcation1Name,
                      @CommandLine.Option(names = {"-dem2"}, required = true) String demarcation2Name,
                      @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Demarcation dem1 = (Demarcation) CLIContainer.getInstance().getElement(demarcation1Name, Demarcation.class);
        Demarcation dem2 = (Demarcation) CLIContainer.getInstance().getElement(demarcation2Name, Demarcation.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addBoDUDConstraint(name, dem1, dem2, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a Binding of Duty on the level of Users / Permissions ")
    public void BoDUP(@CommandLine.Option(names = {"-name"}, required = true) String name,
                      @CommandLine.Option(names = {"-perm1"}, required = true) String permission1Name,
                      @CommandLine.Option(names = {"-perm2"}, required = true) String permission2Name,
                      @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Permission perm1 = (Permission) CLIContainer.getInstance().getElement(permission1Name, Permission.class);
        Permission perm2 = (Permission) CLIContainer.getInstance().getElement(permission2Name, Permission.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addBoDUPConstraint(name, perm1, perm2, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a Binding of Duty on the level of Roles / Demarcations")
    public void BoDRD(@CommandLine.Option(names = {"-name"}, required = true) String name,
                      @CommandLine.Option(names = {"-dem1"}, required = true) String demarcation1Name,
                      @CommandLine.Option(names = {"-dem2"}, required = true) String demarcation2Name,
                      @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Demarcation dem1 = (Demarcation) CLIContainer.getInstance().getElement(demarcation1Name, Demarcation.class);
        Demarcation dem2 = (Demarcation) CLIContainer.getInstance().getElement(demarcation2Name, Demarcation.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addBoDRDConstraint(name, dem1, dem2, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a Binding of Duty on the level of Roles / Permissions")
    public void BoDRP(@CommandLine.Option(names = {"-name"}, required = true) String name,
                      @CommandLine.Option(names = {"-perm1"}, required = true) String permission1Name,
                      @CommandLine.Option(names = {"-perm2"}, required = true) String permission2Name,
                      @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Permission perm1 = (Permission) CLIContainer.getInstance().getElement(permission1Name, Permission.class);
        Permission perm2 = (Permission) CLIContainer.getInstance().getElement(permission2Name, Permission.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addBoDRPConstraint(name, perm1, perm2, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a Binding of Duty on the level of Demarcations / Permissions")
    public void BoDDP(@CommandLine.Option(names = {"-name"}, required = true) String name,
                      @CommandLine.Option(names = {"-perm1"}, required = true) String permission1Name,
                      @CommandLine.Option(names = {"-perm2"}, required = true) String permission2Name) throws ModelManipulationException, InvocationTargetException {
        Permission perm1 = (Permission) CLIContainer.getInstance().getElement(permission1Name, Permission.class);
        Permission perm2 = (Permission) CLIContainer.getInstance().getElement(permission2Name, Permission.class);
        CLIContainer.getInstance().getModifier().addBoDDPConstraint(name, perm1, perm2);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a cardinality on the level of Users / Roles")
    public void CardUR(@CommandLine.Option(names = {"-name"}, required = true) String name,
                       @CommandLine.Option(names = {"-role"}, required = true) String roleName,
                       @CommandLine.Option(names = {"-bound"}, required = true) int bound) throws ModelManipulationException, InvocationTargetException {
        Role role = (Role) CLIContainer.getInstance().getElement(roleName, Role.class);
        CLIContainer.getInstance().getModifier().addCardinalityURConstraint(name, role, bound);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a cardinality on the level of Users / Demarcations ")
    public void CardUD(@CommandLine.Option(names = {"-name"}, required = true) String name,
                       @CommandLine.Option(names = {"-dem"}, required = true) String demarcationName,
                       @CommandLine.Option(names = {"-bound"}, required = true) int bound,
                       @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Demarcation demarcation = (Demarcation) CLIContainer.getInstance().getElement(demarcationName, Demarcation.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addCardinalityUDConstraint(name, demarcation, bound, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a cardinality on the level of Users / Permissions ")
    public void CardUP(@CommandLine.Option(names = {"-name"}, required = true) String name,
                       @CommandLine.Option(names = {"-perm"}, required = true) String permissionName,
                       @CommandLine.Option(names = {"-bound"}, required = true) int bound,
                       @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Permission permission = (Permission) CLIContainer.getInstance().getElement(permissionName, Permission.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addCardinalityUPConstraint(name, permission, bound, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a cardinality on the level of Roles / Demarcations")
    public void CardRD(@CommandLine.Option(names = {"-name"}, required = true) String name,
                       @CommandLine.Option(names = {"-dem"}, required = true) String demarcationName,
                       @CommandLine.Option(names = {"-bound"}, required = true) int bound,
                       @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Demarcation demarcation = (Demarcation) CLIContainer.getInstance().getElement(demarcationName, Demarcation.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addCardinalityRDConstraint(name, demarcation, bound, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a cardinality on the level of Roles / Permissions")
    public void CardRP(@CommandLine.Option(names = {"-name"}, required = true) String name,
                       @CommandLine.Option(names = {"-perm"}, required = true) String permissionName,
                       @CommandLine.Option(names = {"-bound"}, required = true) int bound,
                       @CommandLine.Option(names = {"-context"}, required = true) String contextName) throws ModelManipulationException, InvocationTargetException {
        Permission permission = (Permission) CLIContainer.getInstance().getElement(permissionName, Permission.class);
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(contextName, TemporalContext.class);
        CLIContainer.getInstance().getModifier().addCardinalityRPConstraint(name, permission, bound, context);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a cardinality on the level of Demarcations / Permissions")
    public void CardDP(@CommandLine.Option(names = {"-name"}, required = true) String name,
                         @CommandLine.Option(names = {"-perm"}, required = true) String permissionName,
                         @CommandLine.Option(names = {"-bound"}, required = true) int bound) throws ModelManipulationException, InvocationTargetException {
        Permission permission = (Permission) CLIContainer.getInstance().getElement(permissionName, Permission.class);
        CLIContainer.getInstance().getModifier().addCardinalityDPConstraint(name, permission, bound);
    }
}
