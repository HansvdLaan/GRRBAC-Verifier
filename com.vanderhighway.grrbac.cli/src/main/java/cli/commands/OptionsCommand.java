package cli.commands;

import cli.commands.subcommands.ListenerCommand;
import picocli.CommandLine;

@CommandLine.Command(sortOptions = false, name="options",mixinStandardHelpOptions = true, subcommands = {CommandLine.HelpCommand.class, ListenerCommand.class},
        description = "Set options")
public class OptionsCommand implements Runnable {

    @Override
    public void run() {

    }





}
