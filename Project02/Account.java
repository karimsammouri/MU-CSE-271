/**
 * This class represents an account object and stores relevant properties.
 * 
 * @author Karim R. Sammouri
 *
 */
public class Account {

	// Declaring variables or properties.
	static int idGenerator = 1000;
	private int id;
	private Customer customer;
	private double balance;

	/**
	 * Partial constructor.
	 * 
	 * @param customer The customer of the account.
	 */
	public Account(Customer customer) {
		this(customer, 0);
	}

	/**
	 * Full constructor.
	 * 
	 * @param customer The customer of the account.
	 * @param balance  The balance of the account.
	 */
	public Account(Customer customer, double balance) {
		id = idGenerator;
		idGenerator += 10;
		setCustomer(customer);
		setBalance(balance);
	}

	/**
	 * Copy constructor.
	 * 
	 * @param account Another account.
	 */
	public Account(Account account) {
		this(account.customer, account.balance);
	}

	/**
	 * This method sets the customer of the account.
	 * 
	 * @param customer The customer of the account.
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * This method sets the balance of the account. It throws an exception if the
	 * user inputs a negative amount.
	 * 
	 * @param balance The balance of the account. It cannot be a negative number.
	 */
	public void setBalance(double balance) {
		if (balance < 0)
			throw new IllegalArgumentException("The balance cannot be a negative number.");
		this.balance = balance;
	}

	/**
	 * This method returns the ID of the account.
	 * 
	 * @return The ID of the account.
	 */
	public int getID() {
		return id;
	}

	/**
	 * This method returns the customer of the account.
	 * 
	 * @return The customer of the account.
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * This method returns the balance of the account.
	 * 
	 * @return The balance of the account.
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * This method deposits money into the account. It throws an exception if the
	 * user enters a negative amount.
	 * 
	 * @param amount The amount to be deposited. It cannot be a negative number.
	 */
	public void deposit(double amount) {
		if (amount < 0)
			throw new IllegalArgumentException("The deposit amount cannot be a negative number.");
		balance += amount;
	}

	/**
	 * This method withdraw moneys from the account. It throws an exception if the
	 * user enters a negative amount.
	 * 
	 * @param amount The amount to be withdrawn. It cannot be a negative number.
	 * @return True if the operation is successful and false otherwise.
	 */
	public boolean withdraw(double amount) {
		if (amount < 0)
			throw new IllegalArgumentException("The amount to be withdrawn cannot be a negative number.");
		if (amount > balance)
			return false;
		balance -= amount;
		return true;
	}

	/**
	 * This method compares two account objects.
	 * 
	 * @param account Another account to be compared with.
	 * @return True if the objects and their properties are equal and false
	 *         otherwise.
	 */
	public boolean equals(Account account) {
		return id == account.getID() && customer.equals(account.customer);
	}

	/**
	 * This method returns a string representation of an account object.
	 * 
	 * @return A string representation of an account object.
	 */
	public String toString() {
		return id + ", " + customer + ", " + balance;
	}
}
