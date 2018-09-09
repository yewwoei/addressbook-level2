package seedu.addressbook.commands;


public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays all persons in the address book as a list in alphabetical order of their names.\n"
            + "Example: " + COMMAND_WORD;

}
