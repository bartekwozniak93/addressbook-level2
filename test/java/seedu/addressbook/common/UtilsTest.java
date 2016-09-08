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
    	ArrayList<Integer> elements = new ArrayList<Integer>(); 
    	for(int i =0; i<50; i++){
    		elements.add(i);
    	}
    	assertTrue(Utils.elementsAreUnique(elements));
    }
    
    @Test
    public void elementsAreUnique_elementsAreNotUnique() {
    	ArrayList<Integer> elements = new ArrayList<Integer>(); 
    	elements.add(5);
    	elements.add(5);
    	assertFalse(Utils.elementsAreUnique(elements));
    }
    
    @Test
    public void isAnyNull_isNull() {
    	ArrayList<Integer> elements = new ArrayList<Integer>(); 
    	elements.add(5);
    	elements.add(null);
    	assertFalse(Utils.isAnyNull(elements));
    }
    
    @Test
    public void isAnyNull_isNotNull() {
    	ArrayList<Integer> elements = new ArrayList<Integer>(); 
    	for(int i =0; i<50; i++){
    		elements.add(i);
    	}
    	assertFalse(Utils.isAnyNull(elements));
    }
    
}
