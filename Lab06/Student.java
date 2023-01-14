/**
 * This class represents a student object and stores its properties.
 * @author Karim R. Sammouri
 */

public class Student extends Person {
	
	// Declaring variables or properties. 
	private String major;
	
	/**
	 * Default constructor.
	 */
	public Student() {
		super();
		major = null;
	}
	
	/**
	 * Workhorse constructor.
	 * @param name The name of the student.
	 * @param yearOfBirth The birth year of the student.
	 * @param major The major of the student.
	 */
	public Student(String name, int yearOfBirth, String major) {
		super(name, yearOfBirth);
		this.major = major;
	}

	/**
	 * This method returns the major of the student.
	 * @return The major of the student.
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * This sets the major of the student.
	 * @param major The major of the student.
	 */
	public void setMajor(String major) {
		this.major = major;
	}
	
	/**
	 * This method compares the contents of two student objects.
	 * @param obj Another student object to be compared with.
	 * @return True if the contents of the two student objects are equal and 
	 * false otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			if (super.equals(student) && this.major.equals(student.getMajor()))
				return true;
		}
		return false;
	}
	
	/**
	 * This method returns a string representation of the student object.
	 * @return A string representation of the student object.
	 */
	public String toString() {
		return "I am a student majoring in " + major + ". " + super.toString();
	}
}
