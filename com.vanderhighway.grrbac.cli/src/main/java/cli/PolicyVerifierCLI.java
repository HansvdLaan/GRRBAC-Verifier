package cli;

import cli.commands.*;
import cli.util.CLIUtil;
import cli.util.Spinner;
import com.vanderhighway.grrbac.core.CoreUtils;
import com.vanderhighway.grrbac.core.modifier.PolicyAutomaticModifier;
import com.vanderhighway.grrbac.core.modifier.PolicyModifier;
import com.vanderhighway.grrbac.core.validator.PolicyValidator;
import com.vanderhighway.grrbac.model.grrbac.model.*;
import com.vanderhighway.grrbac.patterns.*;
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
import org.fusesource.jansi.AnsiConsole;
import org.jline.builtins.Builtins;
import org.jline.builtins.Widgets.TailTipWidgets;
import org.jline.builtins.Widgets.TailTipWidgets.TipType;
import org.jline.keymap.KeyMap;
import org.jline.builtins.SystemRegistry;
import org.jline.builtins.SystemRegistryImpl;
import org.jline.reader.*;
import org.jline.reader.impl.DefaultParser;
import org.jline.reader.impl.LineReaderImpl;
import org.jline.terminal.Terminal;
import org.jline.terminal.TerminalBuilder;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.ParentCommand;
import picocli.shell.jline3.PicocliCommands;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.Callable;

/**
 * Example that demonstrates how to build an interactive shell with JLine3 and picocli.
 * @since 4.4.0
 */
public class PolicyVerifierCLI {

    @CommandLine.Parameters(index = "0", description = "The policy file (.trbac)")
    private File file;

    /**
     * Top-level command that just prints help.
     */
    @Command(sortOptions = false, name = "",
            description = {
                    "Example interactive shell with completion and autosuggestions. " +
                            "Hit @|magenta <TAB>|@ to see available commands.",
                    "Hit @|magenta ALT-S|@ to toggle tailtips.",
                    ""},
            footer = {"", "Press Ctl-D to exit."},
            subcommands = {ClearScreen.class, CommandLine.HelpCommand.class})
    static class CliCommands implements Runnable {
        LineReaderImpl reader;
        PrintWriter out;

        CliCommands() {}

        public void setReader(LineReader reader){
            this.reader = (LineReaderImpl)reader;
            out = reader.getTerminal().writer();
        }

        public void run() {
            System.out.println(new CommandLine(this).getUsageMessage());
        }
    }

    /**
     * Command that clears the screen.
     */
    @Command(sortOptions = false, name = "cls", aliases = "clear",mixinStandardHelpOptions = true,
            description = "Clears the screen", version = "1.0")
    static class ClearScreen implements Callable<Void> {

        @ParentCommand CliCommands parent;

        public Void call() throws IOException {
            parent.reader.clearScreen();
            return null;
        }
    }

    private static Path workDir() {
        return Paths.get(System.getProperty("user.dir"));
    }

    public static void main(String[] args) {
        AnsiConsole.systemInstall();

        // Dirty Hack to turn off warnings!
        // see https://stackoverflow.com/questions/46454995/how-to-hide-warning-illegal-reflective-access-in-java-9-without-jvm-argument
        System.err.close();
        System.setErr(System.out);

        org.apache.log4j.BasicConfigurator.configure();
        //ViatraQueryLoggingUtil.getDefaultLogger().setLevel(Level.OFF);
        //org.apache.log4j.BasicConfigurator.resetConfiguration();
        //
        org.apache.log4j.Logger.getRootLogger().setLevel(Level.OFF);

        try {
            // set up JLine built-in commands
            Builtins builtins = new Builtins(PolicyVerifierCLI::workDir, null, null);
            builtins.rename(org.jline.builtins.Builtins.Command.TTOP, "top");
            builtins.alias("zle", "widget");
            builtins.alias("bindkey", "keymap");

            // set up picocli commands
            CliCommands commands = new CliCommands();
            EntityCommands entityCommands = new EntityCommands();
            CommandLine cmd = new CommandLine(commands);
            CommandLine cmd2 = new CommandLine(entityCommands);
            PicocliCommands picocliCommands = new PicocliCommands(PolicyVerifierCLI::workDir, cmd);
            ModelCommands myCommands = new ModelCommands(PolicyVerifierCLI::workDir, cmd2);

            Parser parser = new DefaultParser();
            Terminal terminal = TerminalBuilder.builder().build();

            SystemRegistry systemRegistry = new SystemRegistryImpl(parser, terminal, PolicyVerifierCLI::workDir, null);
            systemRegistry.setCommandRegistries(builtins, picocliCommands, myCommands);

            LineReader reader = LineReaderBuilder.builder()
                    .terminal(terminal)
                    .completer(systemRegistry.completer())
                    .parser(parser)
                    .variable(LineReader.LIST_MAX, 50)   // max tab completion candidates
                    .build();
            builtins.setLineReader(reader);
            commands.setReader(reader);
            new TailTipWidgets(reader, systemRegistry::commandDescription, 5, TipType.COMPLETER);
            KeyMap<Binding> keyMap = reader.getKeyMaps().get("main");
            keyMap.bind(new Reference("tailtip-toggle"), KeyMap.alt("s"));

            String prompt = "> ";
            String rightPrompt = null;

            // Print Header Message
            System.out.println("  ____       _ _          __     __        _  __ _           \n" +
                    " |  _ \\ ___ | (_) ___ _   \\ \\   / /__ _ __(_)/ _(_) ___ _ __ \n" +
                    " | |_) / _ \\| | |/ __| | | \\ \\ / / _ \\ '__| | |_| |/ _ \\ '__|\n" +
                    " |  __/ (_) | | | (__| |_| |\\ V /  __/ |  | |  _| |  __/ |   \n" +
                    " |_|   \\___/|_|_|\\___|\\__, | \\_/ \\___|_|  |_|_| |_|\\___|_|   \n" +
                    "                      |___/                                  ");
            System.out.println("For GR-RBAC policies.");
            System.out.println("version 1.0.1");
            System.out.println();

            URI uri = URI.createFileURI(args[0]);
            Spinner fileLoadSpinner = new Spinner("Loading Policy Model... (" + uri.toString() + ") ");
            new Thread(fileLoadSpinner).start();

            // Initializing the EMF package
            GRRBACPackage.eINSTANCE.getName();
            Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("trbac", new XMIResourceFactoryImpl());
            Resource.Factory.Registry.INSTANCE.getContentTypeToFactoryMap().put("*", new XMIResourceFactoryImpl());

            ResourceSet set = new ResourceSetImpl();
            Resource resource = set.getResource(uri, true);

            // Adding Omitted Schedules and Temporal Context Instances...
            // This speeds up the loading of the XML file, since these entities are the same for every file.
            CoreUtils coteUtils = new CoreUtils();
            coteUtils.addMissingDaySchedules(resource, (SiteAccessControlSystem) resource.getContents().get(0));
            fileLoadSpinner.stop();

            Spinner queryEngineSpinner = new Spinner("Initializing Query Engine... ");
            new Thread(queryEngineSpinner).start();

            ViatraQueryEngineOptions options = ViatraQueryEngineOptions.defineOptions()
                    .withDefaultBackend(DRedReteBackendFactory.INSTANCE)
                    .withDefaultCachingBackend(DRedReteBackendFactory.INSTANCE)
                    .withDefaultSearchBackend(LocalSearchEMFBackendFactory.INSTANCE)
                    .build();
            final AdvancedViatraQueryEngine engine = AdvancedViatraQueryEngine.createUnmanagedEngine(new EMFScope(set), options);
            CLIContainer.getInstance().setEngine(engine);
            CLIContainer.getInstance().setModel(resource);

            queryEngineSpinner.stop();

            Spinner modelModifiersSpinner = new Spinner("Initializing Policy Modifiers... ");
            new Thread(modelModifiersSpinner).start();

            PolicyModifier modifier = new PolicyModifier(engine, (SiteAccessControlSystem) resource.getContents().get(0), resource);
            modifier.setInstanceIDCounter(coteUtils.getInstanceIDCounter());
            CLIContainer.getInstance().setModifier(modifier);
            PolicyAutomaticModifier automaticModifier = new PolicyAutomaticModifier(engine, modifier, (SiteAccessControlSystem) resource.getContents().get(0));
            CLIContainer.getInstance().setAutomaticModifier(automaticModifier);

            automaticModifier.initialize();
            automaticModifier.execute();

            modelModifiersSpinner.stop();

            Spinner queriesSpinner = new Spinner("Initializing Queries... ");
            new Thread(queriesSpinner).start();

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

            CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution(); //just
            queriesSpinner.stop();
            System.out.printf("\u0008");

            Spinner checkerSpinner = new Spinner("Initializing Policy Update Listeners... ");
            new Thread(checkerSpinner).start();

            List<ValidDayOfWeekAndMonthAllCombinedInstance_To_Scenario.Match> matches = new ArrayList(engine.getMatcher(ValidDayOfWeekAndMonthAllCombinedInstance_To_Scenario.instance())
                    .getAllMatches(null, null, null, null));

            PolicyValidator validator = new PolicyValidator(engine);
            validator.addDefaultChangeListeners(engine, false);
            CLIContainer.getInstance().setValidator(validator);

            checkerSpinner.stop();
            System.out.printf("\u0008");

            System.out.println("Policy Verifier fully initialized! Please enter a command. ");

            // start the shell and process input until the user quits with Ctrl-D
            String line;
            while (true) {
                try {
                    // read command
                    systemRegistry.cleanUp();
                    line = reader.readLine(prompt, rightPrompt, (MaskingCallback) null, null);
                    String finalLine = line;

                    // execute command
                    if(CLIContainer.getInstance().getOptions().isDelayUpdatePropagation() &&
                            !CLIUtil.shouldIgnoreDelayUpdatePropagation(finalLine)) {
                        CLIContainer.getInstance().getEngine().delayUpdatePropagation(() -> {
                            return systemRegistry.execute(finalLine);
                        });
                    } else {
                        systemRegistry.execute(finalLine);
                    }
                    CLIContainer.getInstance().getAutomaticModifier().getTransformation().getExecutionSchema().startUnscheduledExecution(); //just in case

                } catch (UserInterruptException e) {
                    // Ignore
                } catch (EndOfFileException e) {
                    return;
                } catch (Exception e) {
                    systemRegistry.trace(e);
                }
            }
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    @Command(sortOptions = false, name = "name of entity commands",
            description = {
                    "description of entity commands"},
            footer = {"", "Press Ctl-D to exit."},
            subcommands = {
                    AddCommand.class, RemoveCommand.class, AssignCommand.class, DeassignCommand.class, ShowCommand.class,
                    ExportCommand.class, OptionsCommand.class})
    static class EntityCommands implements Runnable {
        LineReaderImpl reader;
        PrintWriter out;

        EntityCommands() {}

        public void setReader(LineReader reader){
            this.reader = (LineReaderImpl)reader;
            out = reader.getTerminal().writer();
        }

        public void run() {
            System.out.println(new CommandLine(this).getUsageMessage());
        }
    }

}