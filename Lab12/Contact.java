import java.io.Serializable;

/**
 * This class represents a contact and stores relevant properties.
 * 
 * @author Karim R. Sammouri
 *
 */
public class Contact implements Serializable{

	// Declaring relevant properties.
	private String firstName, lastName, phoneNumber, email, address;

	/**
	 * This getter/accessor method returns the first name of the contact.
	 * 
	 * @return The first name of the contact.
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * This setter/mutator method sets the first name of the contact.
	 * 
	 * @param firstName The first name of the contact.
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * This getter/accessor method returns the last name of the contact.
	 * 
	 * @return The last name of the contact.
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * This setter/mutator method sets the last name of the contact.
	 * 
	 * @param lastName The last name of the contact.
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * This getter/accessor method returns the phone number of the contact.
	 * 
	 * @return The phone number of the contact.
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * This setter/mutator method sets the phone number of the contact.
	 * 
	 * @param phoneNumber The phone number of the contact.
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/**
	 * This getter/accessor method returns the email of the contact.
	 * 
	 * @return The email of the contact.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * This setter/mutator method sets the email of the contact.
	 * 
	 * @param email The email of the contact.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * This getter/accessor method returns the address of the contact.
	 * 
	 * @return The address of the contact.
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * This setter/mutator method sets the address of the contact.
	 * 
	 * @param address The address of the contact.
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * This method compares two contact objects.
	 * 
	 * @param obj Another contact object to be compared with.
	 * @return True if the objects are the same and false otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Contact) {
			Contact anotherContact = (Contact) obj;
			return firstName.equals(anotherContact.getFirstName()) && lastName.equals(anotherContact.getLastName())
					&& phoneNumber.equals(anotherContact.getPhoneNumber());
		}
		return false;
	}

	/**
	 * This method returns a String representation of a contact object.
	 * 
	 * @return A string representation of a contact object.
	 */
	public String toString() {
		return firstName + " " + lastName + ", " + address + ", " + email + ", " + phoneNumber;
	}
}
