package seedu.addressbook.person;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

public class NameTest {

    private Name name;

    @Before
    public void setup() throws IllegalValueException {
        name = new Name("Bartlomiej Wozniak");
    }
    
    @Test
    public void isSimilar_nameIsNull(){
    	assertFalse(name.isSimilar(null));
    }
    
    @Test
    public void isSimilar_sameNames() throws IllegalValueException{
    	Name anotherName= new Name("Bartlomiej Wozniak");
    	assertTrue(name.isSimilar(anotherName));
    }
}


