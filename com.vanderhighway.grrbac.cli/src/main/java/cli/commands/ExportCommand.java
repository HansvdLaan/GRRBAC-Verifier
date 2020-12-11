package cli.commands;

import cli.CLIContainer;
import com.vanderhighway.grrbac.aggregators.Scenario;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import com.vanderhighway.grrbac.patterns.Scenarios;
import org.eclipse.viatra.transformation.runtime.emf.modelmanipulation.ModelManipulationException;
import picocli.CommandLine;
import cli.exporter.Exporter;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

@CommandLine.Command(sortOptions = false, name="export",mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
        description = "Export data")
public class ExportCommand implements Runnable {

    @Override
    public void run() {

    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "export reachability for user during given scenario (.graphml)")
    public void reachability(@CommandLine.Option(names = {"-user"}, required = true) String userName,
                             @CommandLine.Option(names = {"-scenario"}, split = ",", splitSynopsisLabel = ",", paramLabel = "CONTEXT",
                                     required = true) List<String> contextNames,
                             @CommandLine.Option(names = {"-fileName"}, required = true) String fileName
    ) throws ModelManipulationException, IOException {

        User user = (User) CLIContainer.getInstance().getElement(userName, User.class);
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
        Exporter.exportReachability(user, scenario, new File(fileName), CLIContainer.getInstance().getSystem());
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "export topology (.graphml)")
    public void topology(@CommandLine.Option(names = {"-fileName"}, required = true) String fileName) throws  IOException {
        Exporter.exportTopology(new File(fileName), CLIContainer.getInstance().getSystem());
    }

    @CommandLine.Command(sortOptions = false, mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class},
            description = "export authorization graph (.graphml)")
    public void authorizations(@CommandLine.Option(names = {"-fileName"}, required = true) String fileName) throws ModelManipulationException, IOException {
        Exporter.exportAuthorizationPolicy( new File(fileName), CLIContainer.getInstance().getModifier());
    }

}
