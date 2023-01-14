/**
 * This class represents an executive object and stores its properties.
 * @author Karim R. Sammouri
 */

public class Executive extends Manager {

	// Declaring variables or properties.
	private String officeLocation;

	/**
	 * Default constructor.
	 */
	public Executive() {
		super();
		officeLocation = null;
	}

	/**
	 * Workhorse constructor.
	 * @param name The name of the executive.
	 * @param yearOfBirth The birth year of the executive.
	 * @param salary The salary of the executive.
	 * @param department The department of the executive.
	 * @param officeLocation The office location of the executive.
	 */
	public Executive(String name, int yearOfBirth, double salary, String department, String officeLocation) {
		super(name, yearOfBirth, salary, department);
		this.officeLocation = officeLocation;
	}

	/**
	 * This method returns the office location of the executive.
	 * @return The office location of the executive.
	 */
	public String getOfficeLocation() {
		return officeLocation;
	}

	/**
	 * This method sets the office location of the executive.
	 * @param officeLocation The office location of the executive.
	 */
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	
	/**
	 * This method compares the contents of two executive objects.
	 * @param obj Another executive object to be compared with.
	 * @return True if the contents of the two executive objects are the same and 
	 * false otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Executive) {
			Executive executive = (Executive) obj;
			if (super.equals(executive) && this.officeLocation.equals(executive.getOfficeLocation()))
			return true;
		}
		return false;
	}
	
	/**
	 * This method returns a string representation of the executive object.
	 * @return A string representation of the executive object.
	 */
	public String toString() {
		return "I am an executive and my office location is " + officeLocation + ". " +
	super.toString();
	}

}
