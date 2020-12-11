package cli.commands;

import cli.CLIContainer;
import cli.commands.subcommands.AddConstraint;
import cli.util.CLIUtil;
import com.brein.time.timeintervals.intervals.IntegerInterval;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import picocli.CommandLine;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

@CommandLine.Command(sortOptions = false, name = "add",mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class, AddConstraint.class},
        description = "Add an entity")
public class AddCommand implements Runnable {

    public void run() {
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a user")
    public void user(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        CLIContainer.getInstance().getModifier().addUser(name);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a role")
    public void role(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        CLIContainer.getInstance().getModifier().addRole(name);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a demarcation")
    public void demarcation(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        CLIContainer.getInstance().getModifier().addDemarcation(name);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a permission")
    public void permission(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        CLIContainer.getInstance().getModifier().addPermission(name);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a security zone")
    public void securityzone(@CommandLine.Option(names = {"-building"}, required = true) String buildingName,
                             @CommandLine.Option(names = {"-name"}, required = true) String name,
                             @CommandLine.Option(names = {"-public"}, required = false) boolean isPublic) throws ModelManipulationException, InvocationTargetException {
        CLIContainer.getInstance().getModifier().addSecurityZone(name, isPublic);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a temporal context")
    public void temporalcontext(@CommandLine.Option(names = {"-name"}, required = true) String name) throws ModelManipulationException, InvocationTargetException {
        CLIContainer.getInstance().getModifier().addTemporalContext(name);
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a temporal context instance")
    public void temporalcontextinstance(@CommandLine.Option(names = {"-context"}, required = true) String temporalContextName,
                                        @CommandLine.Option(names = {"-day"}, required = true) String dayScheduleName,
                                        @CommandLine.Option(names = {"-start"}, required = true) String startTime,
                                        @CommandLine.Option(names = {"-end"}, required = true) String endTime
    ) throws ModelManipulationException, ParseException, InvocationTargetException {
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(temporalContextName, TemporalContext.class);
        if(context == null) {System.out.println("unkown temporal context: " + context); return;}

        if(dayScheduleName.split("_").length == 3) {
            DateFormat format = new SimpleDateFormat("EEEE_d_MMMM", Locale.ENGLISH);
            try {
                format.parse(dayScheduleName);

            } catch (ParseException pe) {
                dayScheduleName = CLIUtil.addDayToDateString(dayScheduleName);
                // Do nothing. Apparently, there is no cleaner way to check if the format is respected.
            }
        }

        ValidDay validDay = (ValidDay) CLIContainer.getInstance().getModel().getEObject(dayScheduleName);
        if(validDay == null) {
            if(dayScheduleName.split("_").length == 4) {
                ValidDayOfWeekMonth validDayOfWeekMonth = (ValidDayOfWeekMonth) CLIContainer.getInstance().getElement(
                        dayScheduleName.split("_")[0]
                                + "_" + dayScheduleName.split("_")[1]
                                + "_" + dayScheduleName.split("_")[2],
                        ValidDayOfWeekMonth.class
                );
                validDay = CLIContainer.getInstance().getModifier().addValidDayOfYear(validDayOfWeekMonth, dayScheduleName);
                CLIContainer.getInstance().getModifier().addDayScheduleTimeRange(validDay, new IntegerInterval(0, 1439));
                CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
            }
        }

        CLIContainer.getInstance().getModifier().addTemporalContextInstance(context, validDay, new IntegerInterval(
                CLIUtil.toMinutes(startTime), CLIUtil.toMinutes(endTime)));

        //To prevent spurious scenarios appearing and dissapearing
        CLIContainer.getInstance().getEngine().delayUpdatePropagation( () -> {
            CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
            return null;
        });
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "Add a temporal grant rule")
    public void temporalgrantrule(
            @CommandLine.Option(names = {"-name"}, required = true) String ruleName,
            @CommandLine.Option(names = {"-context"}, required = true) String temporalContextName,
            @CommandLine.Option(names = {"-role"}, required = true) String roleName,
            @CommandLine.Option(names = {"-dem"}, required = true) String demarcationName,
            @CommandLine.Option(names = {"-command"}, required = true) String commandName,
            @CommandLine.Option(names = {"-priority"}, required = true) int priority
    ) throws ModelManipulationException, InvocationTargetException {
        TemporalContext context = (TemporalContext) CLIContainer.getInstance().getElement(temporalContextName, TemporalContext.class);
        Role role = (Role) CLIContainer.getInstance().getElement(roleName, Role.class);
        Demarcation demarcation = (Demarcation) CLIContainer.getInstance().getElement(demarcationName, Demarcation.class);
        if(commandName.toLowerCase().equals("grant")) {
            CLIContainer.getInstance().getModifier().addTemporalGrantRule(context, ruleName, role, demarcation, true, priority);
        } else if(commandName.toLowerCase().equals("revoke")) {
            CLIContainer.getInstance().getModifier().addTemporalGrantRule(context, ruleName, role, demarcation, false, priority);
        } else {
            System.out.println(CLIContainer.getInstance().getIndentation() + "unkown command: " + commandName + ", command should either be \"grant\" or \"revoke\"");
        }
        CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution();
    }
}
