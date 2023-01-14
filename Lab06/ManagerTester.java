/**
 * This class tests the Manager class.
 * @author Karim R. Sammouri
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class ManagerTester {

	// Testing default constructor.
	@Test
	public void testManager() {
		Manager manager = new Manager();
		assertEquals(null, manager.getName());
		assertEquals(0, manager.getYearOfBirth());
		double delta = 0.0000001;
		assertEquals(0, manager.getSalary(), delta);
		assertEquals(null, manager.getDepartment());
	}

	// Testing workhorse constructor.
	@Test
	public void testManagerStringIntDoubleString() {
		Manager manager = new Manager("Karim", 2001, 560750.99, "Technology");
		assertEquals("Karim", manager.getName());
		assertEquals(2001, manager.getYearOfBirth());
		double delta = 0.0000001;
		assertEquals(560750.99, manager.getSalary(), delta);
		assertEquals("Technology", manager.getDepartment());
	}

	// Testing getter/accessor, getDepartment().
	@Test
	public void testGetDepartment() {
		Manager manager = new Manager("Sarah", 1998, 125000, "Marketing");
		assertEquals("Marketing", manager.getDepartment());
	}

	// Testing setter/mutator, setDepartment().
	@Test
	public void testSetDepartment() {
		Manager manager = new Manager();
		assertEquals(null, manager.getDepartment());
		manager.setDepartment("Public Relations");
		assertEquals("Public Relations", manager.getDepartment());
	}
	
	// Testing equals() method.
	@Test
	public void testEqualsObject() {
		Manager manager1 = new Manager("Karim", 2001, 560750.99, "Technology");
		Manager manager2 = new Manager("Sarah", 1998, 125000, "Marketing");
		Manager manager3 = new Manager("Karim", 2001, 560750.99, "Technology");
		assertFalse(manager1.equals(manager2));
		assertTrue(manager1.equals(manager3));
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Manager manager = new Manager("Karim", 2001, 560750.99, "Technology");
		assertEquals("I am a manager of the Technology department. " + 
		"I am an employee and have a salary of $560750.99. I am a person whose name is " + 
				"Karim and was born in 2001", manager.toString());
	}
}
