package cli.commands.subcommands;

import cli.CLIContainer;
import com.vanderhighway.grrbac.core.validator.PolicyValidator;
import com.vanderhighway.grrbac.patterns.*;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;
import picocli.CommandLine;

import static com.vanderhighway.grrbac.core.validator.AuthorizationRelationsUpdateListenerFactory.*;
import static com.vanderhighway.grrbac.core.validator.ContextDependentConstraintsUpdateListenerFactory.getUninvocablePermissionUpdateListener;
import static com.vanderhighway.grrbac.core.validator.ContextDependentConstraintsUpdateListenerFactory.getUserCanGetTrappedUpdateListener;

@CommandLine.Command(sortOptions = false, name="listeners",mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
        description = "options regarding the change update listeners")
public class ListenerCommand implements Runnable {

    @Override
    public void run() {

    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "delay updates until the change has been fully processed")
    public void delay(@CommandLine.Option(names = {"-status"}, required = true) boolean delay) {
        CLIContainer.getInstance().getOptions().setDelayUpdatePropagation(delay);
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "add change update listener (USP/RSD/RHSDH/UninvocablePermission/UserCanGetTrapped)")
    public void add(@CommandLine.Option(names = {"-name"}, required = true) String name,
                    @CommandLine.Option(names = {"-fireNow"}, required = true) boolean fireNow) {
        AdvancedViatraQueryEngine engine = CLIContainer.getInstance().getEngine();
        switch (name) {
            case "USP":
                engine.addMatchUpdateListener(USP.Matcher.on(engine), getAccessRelationUpdateListener(), fireNow);
                break;
            case "RSD":
                engine.addMatchUpdateListener(RSD.Matcher.on(engine), getRSDUpdateListener(), fireNow);
                break;
            case "RHSDH":
                engine.addMatchUpdateListener(RHSDH.Matcher.on(engine), getRHSDHUpdateListener(), fireNow);
                break;
            case "UninvocablePermission":
                engine.addMatchUpdateListener(UninvocablePermission.Matcher.on(engine), getUninvocablePermissionUpdateListener(), fireNow);
                break;
            case "UserCanGetTrapped":
                engine.addMatchUpdateListener(UserCanGetTrapped.Matcher.on(engine), getUserCanGetTrappedUpdateListener(), fireNow);
                break;
            default:
                System.out.println(CLIContainer.getInstance().getIndentation() + "invalid change update listener:" + name);
                System.out.println(CLIContainer.getInstance().getIndentation() + "possible change update listeners are: USP/RSD/RHSDH/UninvocablePermission/UserCanGetTrapped");
        }
    }

}
