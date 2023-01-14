/**
 * This class represents a person object and stores its properties.
 * @author Karim R. Sammouri
 */

public class Person {

	// Declaring variables or properties.
	private String name;
	private int yearOfBirth;

	/**
	 * Default constructor.
	 */
	public Person() {
		this(null, 0);
	}

	/**
	 * Workhorse constructor.
	 * @param name Name of the person.
	 * @param yearOfBirth Birth year of the person.
	 */
	public Person(String name, int yearOfBirth) {
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}

	/**
	 * This method returns the name of the person.
	 * @return Name of the person.
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method sets the name of the person.
	 * @param name Name of the person.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method returns the birth year of the person.
	 * @return Birth year of the person.
	 */
	public int getYearOfBirth() {
		return yearOfBirth;
	}

	/**
	 * This method sets the birth year of the person.
	 * @param yearOfBirth Birth year of the person.
	 */
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	/**
	 * This method compares the contents of two person objects.
	 * @param obj Another student object to be compared with.
	 * @return True if the contents of the objects are equal and false otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person person = (Person) obj;
			if (this.name.equals(person.getName()) && 
					(this.yearOfBirth == person.getYearOfBirth()))
				return true;
		}
		return false;
	}

	/**
	 * This method returns a string representation of the person object
	 * @return A string representation of the person object.
	 */
	public String toString() {
		return "I am a person whose name is " + name + " and was born in " + 
	yearOfBirth;
	}
}
