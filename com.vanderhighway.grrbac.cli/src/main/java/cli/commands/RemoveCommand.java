package cli.commands;

import cli.CLIContainer;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import picocli.CommandLine;

import java.lang.reflect.InvocationTargetException;

@CommandLine.Command(sortOptions = false, name = "remove",mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
        description = "remove a model entity")
public class RemoveCommand implements Runnable {

    public void run() {
        System.out.println("I'm a nested subcommand. I don't do much, but I have sub-subcommands!");
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Remove a user")
    public void user(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        User user = (User) CLIContainer.getInstance().getElement(name, User.class);
        CLIContainer.getInstance().getModifier().removeUser(user);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Remove a role")
    public void role(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        Role role = (Role) CLIContainer.getInstance().getElement(name, Role.class);
        org.apache.log4j.BasicConfigurator.configure();
        CLIContainer.getInstance().getModifier().removeRole(role);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Remove a demarcation")
    public void demarcation(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        Demarcation demarcation = (Demarcation) CLIContainer.getInstance().getElement(name, Demarcation.class);
        CLIContainer.getInstance().getModifier().removeDemarcation(demarcation);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Remove a permission")
    public void permission(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        Permission permission = (Permission) CLIContainer.getInstance().getElement(name, Permission.class);
        CLIContainer.getInstance().getModifier().removePermission(permission);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Remove a security zone")
    public void securityzone(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        SecurityZone securityZone = (SecurityZone) CLIContainer.getInstance().getElement(name, SecurityZone.class);
        CLIContainer.getInstance().getModifier().removeSecurityZone(securityZone);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Remove a temporal context")
    public void temporalcontext(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(name, TemporalContext.class);
        CLIContainer.getInstance().getModifier().removeTemporalContext(context);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Remove a temporal context instance")
    public void temporalcontextinstance(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        TimeRange timeRange = (TimeRange) CLIContainer.getInstance().getElement(name, TimeRange.class);
        CLIContainer.getInstance().getModifier().removeTemporalContextInstance(timeRange);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Remove a temporal grant rule")
    public void temporalgrantrule(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        TemporalGrantRule rule = (TemporalGrantRule) CLIContainer.getInstance().getElement(name, TemporalGrantRule.class);
        CLIContainer.getInstance().getModifier().removeTemporalGrantRule(rule);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Remove a temporal grant rule")
    public void temporalauthenticationrule(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        TemporalAuthenticationRule rule = (TemporalAuthenticationRule) CLIContainer.getInstance().getElement(name, TemporalAuthenticationRule.class);
        CLIContainer.getInstance().getModifier().removeTemporalAuthenticationRule(rule);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Remove a temporal grant rule")
    public void constraint(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        PolicyDependentAuthorizationConstraint constraint = (PolicyDependentAuthorizationConstraint)
                CLIContainer.getInstance().getElement(name, PolicyDependentAuthorizationConstraint.class);
        CLIContainer.getInstance().getModifier().removeAuthorizationConstraint(constraint);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }
}
