/**
 * This class represents an address object and stores its relevant properties.
 * 
 * @author Karim R. Sammouri
 */

public class Address {

	// Declaring variables or properties.
	private int streetNumber;
	private String streetName;
	private String city;
	private String state;
	private String zipCode;

	/**
	 * Empty constructor
	 */
	public Address() {
		this(0, null, null, null, null);
	}

	/**
	 * Full constructor.
	 * 
	 * @param streetNumber The street number of the address.
	 * @param streetName   The street name of the address.
	 * @param city         The city of the address.
	 * @param state        The state of the address.
	 * @param zipCode      The zip code of the address.
	 */
	public Address(int streetNumber, String streetName, String city, String state, String zipCode) {
		setStreetNumber(streetNumber);
		setStreetName(streetName);
		setCity(city);
		setState(state);
		setZipCode(zipCode);
	}

	/**
	 * Copy constructor.
	 * 
	 * @param address Another address
	 */
	public Address(Address address) {
		this(address.streetNumber, address.streetName, address.city, address.state, address.zipCode);
	}

	/**
	 * This method returns the street number of the address.
	 * 
	 * @return The street number of the address.
	 */
	public int getStreetNumber() {
		return streetNumber;
	}

	/**
	 * This method sets the street number of the address.
	 * 
	 * @param streetNumber The street number of the address.
	 */
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}

	/**
	 * This method returns the street name of the address.
	 * 
	 * @return The street name of the address.
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * This method sets the street name of the address.
	 * 
	 * @param streetName The street name of the address.
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * This method returns the city of the address.
	 * 
	 * @return The city of the address.
	 */
	public String getCity() {
		return city;
	}

	/**
	 * This method sets the city of the address.
	 * 
	 * @param city The city of the address.
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * This method returns the state of the address.
	 * 
	 * @return The state of the address.
	 */
	public String getState() {
		return state;
	}

	/**
	 * This method sets the state of the address.
	 * 
	 * @param state The state of the address.
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * This method returns the zip code of the address.
	 * 
	 * @return The zip code of the address.
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * This method sets the zip code of the address.
	 * 
	 * @param zipCode The zip code of the address.
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * This method compares two address objects.
	 * 
	 * @param address Another address to be compared with.
	 * @return True if the objects and their properties are equal and false
	 *         otherwise.
	 */
	public boolean equals(Address address) {
		return streetNumber == address.streetNumber && streetName.equals(address.streetName)
				&& city.equals(address.city) && state.equals(address.state) && zipCode.equals(address.zipCode);
	}

	/**
	 * This method returns a string representation of an address object.
	 * 
	 * @return A string representation of an address object.
	 */
	public String toString() {
		return streetNumber + " " + streetName + ", " + city + ", " + state + ", " + zipCode;
	}
}
