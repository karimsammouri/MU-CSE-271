/**
 * This class represents a manager object and stores its properties.
 * @author Karim R. Sammouri
 */

public class Manager extends Employee {
	
	// Declaring variables or properties.
	private String department;
	
	/**
	 * Default constructor.
	 */
	public Manager() {
		super();
		department = null;
	}
	
	/**
	 * Workhorse constructor.
	 * @param name The name of the manager.
	 * @param yearOfBirth The birth year of the manager.
	 * @param salary The salary of the manager.
	 * @param department The department of the manager.
	 */
	public Manager(String name, int yearOfBirth, double salary, String department) {
		super(name, yearOfBirth, salary);
		this.department = department;
	}

	/**
	 * This method returns the department of the manager.
	 * @return The department of the manager.
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * This method sets the department of the manager.
	 * @param department The department of the manager.
	 */
	public void setDepartment(String department) {
		this.department = department;
	}
	
	/**
	 * This method compares the contents of two manager objects.
	 * @param obj Another manager object to be compared with.
	 * @return True if the contents of the two manager objects are the same and 
	 * false otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Manager) {
			Manager manager = (Manager) obj;
			if (super.equals(manager) && this.department.equals(manager.getDepartment()))
			return true;
		}
		return false;
	}
	
	/**
	 * This method returns a string representation of the manager object.
	 * @return A string representation of the manager object.
	 */
	public String toString() {
		return "I am a manager of the " + department + " department. " + super.toString();
	}
}
