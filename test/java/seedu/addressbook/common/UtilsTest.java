package seedu.addressbook.common;

import static org.junit.Assert.*;
import static seedu.addressbook.common.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.commands.IncorrectCommand;
import seedu.addressbook.commands.ViewCommand;
import seedu.addressbook.parser.Parser;

public class UtilsTest {

    @Test
    public void elementsAreUnique_elementsAreUnique() {
    	ArrayList elements = new ArrayList(); 
    	elements.add(5);
    	elements.add(10);
    	assertTrue(Utils.elementsAreUnique(elements));
    }
}
