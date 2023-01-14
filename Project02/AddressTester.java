
/**
 * This class tests the Address class.
 * 
 * @author Karim R. Sammouri
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class AddressTester {

	// Testing empty constructor.
	@Test
	public void testAddress() {
		Address address = new Address();
		assertEquals(0, address.getStreetNumber());
		assertEquals(null, address.getStreetName());
		assertEquals(null, address.getCity());
		assertEquals(null, address.getState());
		assertEquals(null, address.getZipCode());
	}

	// Testing full constructor.
	@Test
	public void testAddressIntStringStringStringString() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		assertEquals(2260, address.getStreetNumber());
		assertEquals("Benson Avenue", address.getStreetName());
		assertEquals("Brooklyn", address.getCity());
		assertEquals("NY", address.getState());
		assertEquals("11411", address.getZipCode());
	}

	// Testing copy constructor.
	@Test
	public void testAddressAddress() {
		Address address1 = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Address address2 = new Address(address1);
		assertEquals(2260, address2.getStreetNumber());
		assertEquals("Benson Avenue", address2.getStreetName());
		assertEquals("Brooklyn", address2.getCity());
		assertEquals("NY", address2.getState());
		assertEquals("11411", address2.getZipCode());
	}

	// Testing getter, getStreetNumber().
	@Test
	public void testGetStreetNumber() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		assertEquals(2260, address.getStreetNumber());
	}

	// Testing setter, setStreetNumber().
	@Test
	public void testSetStreetNumber() {
		Address address = new Address();
		assertEquals(0, address.getStreetNumber());
		address.setStreetNumber(2260);
		assertEquals(2260, address.getStreetNumber());
	}

	// Testing getter, getStreetName().
	@Test
	public void testGetStreetName() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		assertEquals("Benson Avenue", address.getStreetName());
	}

	// Testing getter, setStreetName().
	@Test
	public void testSetStreetName() {
		Address address = new Address();
		assertEquals(null, address.getStreetName());
		address.setStreetName("Benson Avenue");
		assertEquals("Benson Avenue", address.getStreetName());
	}

	// Testing getter, getCity().
	@Test
	public void testGetCity() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		assertEquals("Brooklyn", address.getCity());
	}

	// Testing getter, setCity().
	@Test
	public void testSetCity() {
		Address address = new Address();
		assertEquals(null, address.getCity());
		address.setCity("Brooklyn");
		assertEquals("Brooklyn", address.getCity());
	}

	// Testing getter, getState().
	@Test
	public void testGetState() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		assertEquals("NY", address.getState());
	}

	// Testing getter, setState().
	@Test
	public void testSetState() {
		Address address = new Address();
		assertEquals(null, address.getState());
		address.setState("New York");
		assertEquals("New York", address.getState());
	}

	// Testing getter, getZipCode().
	@Test
	public void testGetZipCode() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		assertEquals("11411", address.getZipCode());
	}

	// Testing getter, setZipCode().
	@Test
	public void testSetZipCode() {
		Address address = new Address();
		assertEquals(null, address.getZipCode());
		address.setZipCode("11411");
		assertEquals("11411", address.getZipCode());
	}

	// Testing equals() method.
	@Test
	public void testEqualsAddress() {
		Address address1 = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Address address2 = new Address(1120, "Wade Street", "Los Angeles", "California", "10283");
		Address address3 = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		assertFalse(address1.equals(address2));
		assertTrue(address1.equals(address3));
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		assertEquals("2260 Benson Avenue, Brooklyn, NY, 11411", address.toString());
	}
}
