
/**
 * This class tests the Customer class.
 * 
 * @author Karim R. Sammouri
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTester {

	// Testing empty constructor.
	@Test
	public void testCustomer() {
		Customer.idGenerator = 1000;
		Customer customer = new Customer();
		assertEquals(1000, customer.getID());
		assertEquals(null, customer.getName());
		assertEquals(null, customer.getAddress());
		assertEquals(null, customer.getSSN());
	}

	// Testing full constructor.
	@Test
	public void testCustomerStringAddressString() {
		Customer.idGenerator = 1000;
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		assertEquals(1000, customer.getID());
		assertEquals("Karim", customer.getName());
		assertEquals(address, customer.getAddress());
		assertEquals("231-13-3454", customer.getSSN());
	}

	// Testing copy constructor.
	@Test
	public void testCustomerCustomer() {
		Customer.idGenerator = 1000;
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer1 = new Customer("Karim", address, "231-13-3454");
		Customer customer2 = new Customer(customer1);
		assertEquals(1001, customer2.getID());
		assertEquals("Karim", customer2.getName());
		assertEquals(address, customer2.getAddress());
		assertEquals("231-13-3454", customer2.getSSN());
	}

	// Testing setter, setName().
	@Test
	public void testSetName() {
		Customer customer = new Customer();
		assertEquals(null, customer.getName());
		customer.setName("Karim");
		assertEquals("Karim", customer.getName());
	}

	// Testing setter, setAddress().
	@Test
	public void testSetAddress() {
		Customer customer = new Customer();
		assertEquals(null, customer.getAddress());
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		customer.setAddress(address);
		assertEquals(address, customer.getAddress());
	}

	// Testing setter, setSSN().
	@Test
	public void testSetSSN() {
		Customer customer = new Customer();
		assertEquals(null, customer.getSSN());
		customer.setSSN("231-13-3454");
		assertEquals("231-13-3454", customer.getSSN());
	}

	// Testing getter, getID().
	@Test
	public void testGetID() {
		Address address1 = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Address address2 = new Address(1120, "Wade Street", "Los Angeles", "CA", "664429");
		Address address3 = new Address(651, "South Maple Avenue", "Oxford", "OH", "45056");
		Customer customer1 = new Customer("Karim", address1, "231-13-3454");
		assertEquals(1000, customer1.getID());
		Customer customer2 = new Customer("Jacob", address2, "456-04-2184");
		assertEquals(1000, customer1.getID());
		assertEquals(1001, customer2.getID());
		Customer customer3 = new Customer("Jane", address3, "345-23-3564");
		assertEquals(1000, customer1.getID());
		assertEquals(1001, customer2.getID());
		assertEquals(1002, customer3.getID());
	}

	// Testing getter, getName().
	@Test
	public void testGetName() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		assertEquals("Karim", customer.getName());
	}

	// Testing getter, getAddress().
	@Test
	public void testGetAddress() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		assertEquals(address, customer.getAddress());
	}

	// Testing getter, getSSN().
	@Test
	public void testGetSSN() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		assertEquals("231-13-3454", customer.getSSN());
	}

	// Testing equals() method.
	@Test
	public void testEqualsCustomer() {
		Address address1 = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Address address2 = new Address(1120, "Wade Street", "Los Angeles", "CA", "664429");
		Customer customer1 = new Customer("Karim", address1, "231-13-3454");
		Customer customer2 = new Customer("Jacob", address2, "456-04-2184");
		Customer customer3 = new Customer("Karim", address1, "231-13-3454");
		assertFalse(customer1.equals(customer2));
		assertTrue(customer1.equals(customer3));
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Customer.idGenerator = 1000;
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		assertEquals("1000, Karim, 2260 Benson Avenue, Brooklyn, NY, 11411, 231-13-3454", customer.toString());
	}
}
