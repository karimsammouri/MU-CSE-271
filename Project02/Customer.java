/**
 * This class represents a customer object and stores its relevant properties.
 * 
 * @author Karim R. Sammouri
 *
 */
public class Customer {

	// Declaring variables or properties.
	static int idGenerator = 1000;
	private int id;
	private String name;
	private Address address;
	private String ssn;

	/**
	 * Empty constructor.
	 */
	public Customer() {
		this(null, null, null);
	}

	/**
	 * Full constructor.
	 * 
	 * @param name    The name of the customer.
	 * @param address The address of the customer.
	 * @param ssn     The SSN of the customer.
	 */
	public Customer(String name, Address address, String ssn) {
		id = idGenerator;
		idGenerator++;
		setName(name);
		setAddress(address);
		setSSN(ssn);
	}

	/**
	 * Copy constructor.
	 * 
	 * @param customer Another customer.
	 */
	public Customer(Customer customer) {
		this(customer.name, customer.address, customer.ssn);
	}

	/**
	 * This method sets the name of the customer.
	 * 
	 * @param name The name of the customer.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method sets the address of the customer.
	 * 
	 * @param address The address of the customer.
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * This method sets the SSN of the customer.
	 * 
	 * @param ssn The SSN of the customer.
	 */
	public void setSSN(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * This method returns the ID of the customer.
	 * 
	 * @return The ID of the customer.
	 */
	public int getID() {
		return id;
	}

	/**
	 * This method returns the name of the customer.
	 * 
	 * @return The name of the customer.
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method returns the address of the customer.
	 * 
	 * @return The address of the customer.
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * This method returns the SSN of the customer.
	 * 
	 * @return The SSN of the customer.
	 */
	public String getSSN() {
		return ssn;
	}

	/**
	 * This method compares two customer objects.
	 * 
	 * @param customer Another customer to be compared with.
	 * @return True if the objects and their properties are equal and false
	 *         otherwise.
	 */
	public boolean equals(Customer customer) {
		return name.equals(customer.name) && address.equals(customer.address) && ssn.equals(customer.ssn);
	}

	/**
	 * This method returns a string representation of a customer object.
	 * 
	 * @return A string representation of a customer object.
	 */
	public String toString() {
		return id + ", " + name + ", " + address + ", " + ssn;
	}
}
