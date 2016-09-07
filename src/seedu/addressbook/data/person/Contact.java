package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {

	protected boolean isPrivate;
	public String value;
	private static String MESSAGE_CONSTRAINTS;
	private static String VALIDATION_REGEX;

	public Contact(String value, boolean isPrivate, String messageContraints, String validationRegex)
			throws IllegalValueException {
		this.isPrivate = isPrivate;
		this.value = value;
		MESSAGE_CONSTRAINTS = messageContraints;
		VALIDATION_REGEX = validationRegex;
		this.value = value.trim();
		if (!isValid(value)) {
			throw new IllegalValueException(MESSAGE_CONSTRAINTS);
		}
	}

	public boolean isPrivate() {
		return isPrivate;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public String toString() {
		return value;
	}

	/**
	 * Checks if a given string is a valid value.
	 */
	public static boolean isValid(String test) {
		return test.matches(VALIDATION_REGEX);
	}
}
