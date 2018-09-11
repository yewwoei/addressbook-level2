package seedu.addressbook.commands;

import seedu.addressbook.data.person.ReadOnlyPerson;

import java.util.List;

/**
 * Represents a "sort" command that prints out the entire addressbook by alphabetical order.
 */

public class SortCommand extends Command {

    public static final String COMMAND_WORD = "sort";

    public static final String MESSAGE_USAGE = COMMAND_WORD
            + ": Displays all persons in the address book in alphabetical order according to name.\n"
            + "Example: " + COMMAND_WORD;

    @Override
    public CommandResult execute() {
        List<ReadOnlyPerson> allPersons = addressBook.getAllPersons().immutableListView();
        return new CommandResult("Do nothing");
    }

}
