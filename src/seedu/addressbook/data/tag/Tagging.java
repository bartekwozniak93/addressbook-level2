package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
	private Tag tag;
	private Person person;
	private TaggingType type;

	public enum TaggingType {
		ADDED, DELTED
	};

	public Tagging(Tag tag, Person person, TaggingType type) {
		this.tag = tag;
		this.person = person;
		this.type = type;
	}

	@Override
	public String toString() {
		String prefix = type == TaggingType.ADDED ? "+ " : "- ";
		return prefix + person.getName() + " " + tag;
	}
}
