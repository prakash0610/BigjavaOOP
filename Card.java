
public class Card {
	private String name;

	// default constructor
	public Card() {
		name = "";
	}

	// constructor with argument
	public Card(String n) {
		name = n;
	}

	// get name
	public String getName() {
		return name;
	}

	// is expired method
	public boolean isExpired() {
		return false;
	}

	// string format method
	public String format() {
		return "Card [name= " + name + "]";
	}

	public boolean equals(Object otherObject) {
		if (getClass() == otherObject.getClass()) {
			Card other = (Card) otherObject;
			return name.equals(other.name);
		}

		return false;
	}

}
