/**
 * Thus class represents an employee object and stores its properties.
 * @author Karim R. Sammouri
 */

public class Employee extends Person {

	// Declaring variables or properties.
	private double salary;

	/**
	 * Default constructor.
	 */
	public Employee() {
		super();
		salary = 0;
	}

	/**
	 * Workhorse constructor.
	 * @param name The name of the employee.
	 * @param yearOfBirth The birth year of the employee.
	 * @param salary The salary of the employee.
	 */
	public Employee(String name, int yearOfBirth, double salary) {
		super(name, yearOfBirth);
		this.salary = salary;
	}

	/**
	 * This method returns the salary of the employee.
	 * @return The salary of the employee.
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * This method sets the salary of the employee.
	 * @param salary The salary of the employee.
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * This method compares the contents of two employee objects.
	 * @param obj Another employee object to be compared with.
	 * @return True if the contents of the two employee objects are the same and 
	 * false otherwise.
	 */
	public boolean equals(Object obj) {
		double delta = 0.0000001;
		if (obj instanceof Employee) {
			Employee employee = (Employee) obj;
			if (super.equals(employee) && (this.salary - employee.getSalary() < delta))
				return true;
		}
		return false;
	}

	/**
	 * This method returns a string representation of the employee object.
	 * @return A string representation of the employee object.
	 */
	public String toString() {
		return "I am an employee and have a salary of $" + salary + ". " + super.toString();
	}
}
