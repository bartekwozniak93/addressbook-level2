package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

/**
 * Represents a Person's address in the address book. Guarantees: immutable; is
 * valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

	public static final String EXAMPLE = "123, Clementi Ave 3, #12-34, 231534";
	public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses can be in any format";

	/**
	 * Adreess is in format(example): a/123, Clementi Ave 3, #12-34, 231534
	 */
	public static final String ADDRESS_VALIDATION_REGEX = "(.*)([\\,])(.*)([\\,])(.*)([\\,])(.*)";

	private boolean isPrivate;

	private Block block;
	private Street street;
	private Unit unit;
	private PostalCode postalCode;

	/**
	 * Validates given address.
	 *
	 * @throws IllegalValueException
	 *             if given address string is invalid.
	 */

	private void prepareAddress(String address) {
		String[] addressParts = address.split(",");
		this.block = new Block(addressParts[0]);
		this.street= new Street(addressParts[1]);
		this.unit= new Unit(addressParts[2]);
		this.postalCode = new PostalCode(addressParts[3]);
	}

	public Address(String address, boolean isPrivate) throws IllegalValueException {
		this.isPrivate = isPrivate;
		if (!isValidAddress(address)) {
			throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
		}
		prepareAddress(address);
	}

	/**
	 * Returns true if a given string is a valid person email.
	 */
	public static boolean isValidAddress(String test) {
		return test.matches(ADDRESS_VALIDATION_REGEX);
	}

	@Override
	public String toString() {
		return block.getBlock() + " " + street.getStreet() + " " + unit.getUnit() + " " + postalCode.getPostalCode();
	}

	@Override
	public boolean equals(Object other) {
		return other == this // short circuit if same object
				|| (other instanceof Address // instanceof handles nulls
						&& this.block.getBlock().equals(((Address) other).block.getBlock())
						&& this.street.getStreet().equals(((Address) other).street.getStreet())
						&& this.unit.equals(((Address) other).unit.getUnit())
						&& this.postalCode.equals(((Address) other).postalCode.getPostalCode()));
	}

	@Override
	public int hashCode() {
		return this.toString().hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}
}