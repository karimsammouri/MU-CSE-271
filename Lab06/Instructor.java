/**
 * This class represents an instructor object and stores its properties.
 * @author Karim R. Sammouri
 */

public class Instructor extends Person {
	
	// Declaring variables or properties.
	private String rank;
	
	/**
	 * Default constructor.
	 */
	public Instructor() {
		super();
		rank = null;
	}
	
	/**
	 * Workhorse constructor.
	 * @param name The name of the instructor.
	 * @param yearOfBirth The birth year of the constructor.
	 * @param rank The rank of the constructor.
	 */
	public Instructor(String name, int yearOfBirth, String rank) {
		super(name, yearOfBirth);
		this.rank = rank;
	}

	/**
	 * This method returns the rank of the instructor.
	 * @return The rank of the constructor.
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * This method sets the rank of the instructor.
	 * @param rank  The rank of the constructor.
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}
	
	/**
	 * This method compares the contents of two instructor objects.
	 * @param obj Another instructor object to be compared with.
	 * @return True if the contents of the two instructor objects are the same and 
	 * false otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Instructor) {
			Instructor instructor = (Instructor) obj;
			if (super.equals(instructor) && this.rank.equals(instructor.getRank()))
				return true;
		}
		return false;
	}
	
	/**
	 * This method returns a string representation of the instructor object.
	 * @return A string representation of the instructor object.
	 */
	public String toString() {
		return "I am a " + rank + ". " + super.toString();
	}
}
