package cli.commands;

import cli.CLIContainer;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import picocli.CommandLine;

import java.lang.reflect.InvocationTargetException;

@CommandLine.Command(sortOptions = false, name = "assign",mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
        description = "Assign entities")
public class AssignCommand implements Runnable {

    public void run() {
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Assign a role to a user")
    public void UR(@CommandLine.Option(names = {"-user"}, required = true) String userName,
                   @CommandLine.Option(names = {"-role"}, required = true) String roleName) throws ModelManipulationException, InvocationTargetException {
        User user = (User) CLIContainer.getInstance().getElement(userName, User.class);
        Role role = (Role) CLIContainer.getInstance().getElement(roleName, Role.class);
        CLIContainer.getInstance().getModifier().assignRoleToUser(user, role);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Assign a permission to a demarcation")
    public void DP(@CommandLine.Option(names = {"-dem"}, required = true) String demarcationName,
                   @CommandLine.Option(names = {"-permission"}, required = true) String permissionName) throws ModelManipulationException, InvocationTargetException {
        Demarcation demarcation = (Demarcation) CLIContainer.getInstance().getElement(demarcationName, Demarcation.class);
        Permission permission = (Permission) CLIContainer.getInstance().getElement(permissionName, Permission.class);
        CLIContainer.getInstance().getModifier().assignPermissionToDemarcation(demarcation, permission);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Assign an object to a permission")
    public void PO(@CommandLine.Option(names = {"-permission"}, required = true) String permissionName,
                   @CommandLine.Option(names = {"-object"}, required = true) String objectName) throws ModelManipulationException, InvocationTargetException {
        Permission permission = (Permission) CLIContainer.getInstance().getElement(permissionName, Permission.class);
        SecurityZone securityZone = (SecurityZone) CLIContainer.getInstance().getElement(objectName, SecurityZone.class);
        CLIContainer.getInstance().getModifier().assignObjectToPermission(permission, securityZone);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Set reachability between two zones")
    public void reachability(@CommandLine.Option(names = {"-from"}, required = true) String fromZoneName,
                             @CommandLine.Option(names = {"-to"}, required = true) String toZoneName,
                             @CommandLine.Option(names = {"-bidirectional"}, required = false) boolean isBirectional) throws ModelManipulationException, InvocationTargetException {
        SecurityZone fromSecurityZone = (SecurityZone) CLIContainer.getInstance().getElement(fromZoneName, SecurityZone.class);
        SecurityZone toSecurityZone = (SecurityZone) CLIContainer.getInstance().getElement(toZoneName, SecurityZone.class);
        if (isBirectional) {
            CLIContainer.getInstance().getModifier().setBidirectionalReachability(fromSecurityZone, toSecurityZone);
            CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
        } else {
            CLIContainer.getInstance().getModifier().setReachability(fromSecurityZone, toSecurityZone);
            CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
        }
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Set inheritance between two roles")
    public void role_inheritance(@CommandLine.Option(names = {"-junior"}, required = true) String juniorRoleName,
                                 @CommandLine.Option(names = {"-senior"}, required = true) String seniorRoleName) throws ModelManipulationException, InvocationTargetException {
        Role juniorRole = (Role) CLIContainer.getInstance().getElement(juniorRoleName, Role.class);
        Role seniorRole = (Role) CLIContainer.getInstance().getElement(seniorRoleName, Role.class);
        CLIContainer.getInstance().getModifier().addRoleInheritance(juniorRole, seniorRole);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Set inheritance between two demarcations")
    public void demarcation_inheritance(@CommandLine.Option(names = {"-sub"}, required = true) String subDemarcationName,
                                        @CommandLine.Option(names = {"-sup"}, required = true) String supDemarcationName) throws ModelManipulationException, InvocationTargetException {
        Demarcation subDemarcation = (Demarcation) CLIContainer.getInstance().getElement(subDemarcationName, Demarcation.class);
        Demarcation supDemarcation = (Demarcation) CLIContainer.getInstance().getElement(supDemarcationName, Demarcation.class);
        CLIContainer.getInstance().getModifier().addDemarcationInheritance(subDemarcation, supDemarcation);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }
}

