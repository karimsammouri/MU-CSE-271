
/**
 * This class tests the Account class.
 * 
 * @author Karim R. Sammouri
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTester {

	// Testing partial constructor.
	@Test
	public void testAccountCustomer() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account = new Account(customer);
		assertEquals(customer, account.getCustomer());
		double delta = 0.0000001;
		assertEquals(0, account.getBalance(), delta);
	}

	// Testing full constructor.
	@Test
	public void testAccountCustomerDouble() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account = new Account(customer, 2120);
		assertEquals(customer, account.getCustomer());
		double delta = 0.0000001;
		assertEquals(2120, account.getBalance(), delta);
	}

	// Testing copy constructor.
	@Test
	public void testAccountAccount() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account1 = new Account(customer, 2120);
		Account account2 = new Account(account1);
		assertEquals(customer, account2.getCustomer());
		double delta = 0.0000001;
		assertEquals(2120, account2.getBalance(), delta);
	}

	// Testing setter, setCustomer().
	@Test
	public void testSetCustomer() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account = new Account(customer);
		assertEquals(customer, account.getCustomer());
		Address address2 = new Address(1120, "Wade Street", "Los Angeles", "CA", "664429");
		Customer customer2 = new Customer("Jacob", address2, "456-04-2184");
		account.setCustomer(customer2);
		assertEquals(customer2, account.getCustomer());
	}

	// Testing setter, setBalance().
	@Test
	public void testSetBalance() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account = new Account(customer);
		double delta = 0.0000001;
		assertEquals(0, account.getBalance(), delta);
		account.setBalance(2120);
		assertEquals(2120, account.getBalance(), delta);
	}

	// Testing getter, getID().
	@Test
	public void testGetID() {
		Account.idGenerator = 1000;
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account = new Account(customer);
		assertEquals(1000, account.getID());
		Address address2 = new Address(1120, "Wade Street", "Los Angeles", "CA", "664429");
		Customer customer2 = new Customer("Jacob", address2, "456-04-2184");
		Account account2 = new Account(customer2);
		assertEquals(1000, account.getID());
		assertEquals(1010, account2.getID());
	}

	// Testing getter, getCustomer().
	@Test
	public void testGetCustomer() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account = new Account(customer, 2120);
		assertEquals(customer, account.getCustomer());
	}

	// Testing getter, getBalance().
	@Test
	public void testGetBalance() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account = new Account(customer, 2120);
		double delta = 0.0000001;
		assertEquals(2120, account.getBalance(), delta);
	}

	// Testing deposit().
	@Test
	public void testDeposit() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account = new Account(customer, 2120);
		double delta = 0.0000001;
		assertEquals(2120, account.getBalance(), delta);
		account.deposit(200);
		assertEquals(2320, account.getBalance(), delta);
	}

	// Testing withdraw() in the context of a normal case and an edge case.
	@Test
	public void testWithdraw() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account = new Account(customer, 2120);
		double delta = 0.0000001;
		assertEquals(2120, account.getBalance(), delta);
		// Normal case.
		assertTrue(account.withdraw(200));
		assertEquals(1920, account.getBalance(), delta);
		// If amount to be withdrawn is greater than balance.
		assertFalse(account.withdraw(4600));
		assertEquals(1920, account.getBalance(), delta);
	}

	// Testing equals() method.
	@Test
	public void testEqualsAccount() {
		Account.idGenerator = 1000;
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account = new Account(customer, 2120);
		Address address2 = new Address(1120, "Wade Street", "Los Angeles", "CA", "664429");
		Customer customer2 = new Customer("Jacob", address2, "456-04-2184");
		Account.idGenerator = 1000;
		Account account2 = new Account(customer2);
		Account.idGenerator = 1000;
		Account account3 = new Account(customer, 2120);
		assertFalse(account.equals(account2));
		assertTrue(account.equals(account3));
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Customer.idGenerator = 1000;
		Account.idGenerator = 1000;
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account = new Account(customer, 2120.5);
		assertEquals("1000, 1000, Karim, 2260 Benson Avenue, Brooklyn, NY, 11411, 231-13-3454, 2120.5",
				account.toString());
	}

	// Testing if the setBalance() method will throw an exception if an invalid
	// input is set.
	@Test(expected = IllegalArgumentException.class)
	public void testSetBalanceException() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account = new Account(customer, 2120);
		account.setBalance(-20);
	}

	// Testing if the deposit() method will throw an exception if an invalid input
	// is set.
	@Test(expected = IllegalArgumentException.class)
	public void testDepostException() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account = new Account(customer, 2120);
		account.deposit(-45);
	}

	// Testing if withdraw() method will throw an exception if an invalid input is
	// set.
	@Test(expected = IllegalArgumentException.class)
	public void testWithdrawException() {
		Address address = new Address(2260, "Benson Avenue", "Brooklyn", "NY", "11411");
		Customer customer = new Customer("Karim", address, "231-13-3454");
		Account account = new Account(customer, 2120);
		account.withdraw(-30);
	}
}
