/**
 * This class test the Employee class.
 * @author Karim R. Sammouri
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTester {

	// Testing default constructor.
	@Test
	public void testEmployee() {
		Employee employee = new Employee();
		assertEquals(null, employee.getName());
		assertEquals(0, employee.getYearOfBirth());
		double delta = 0.0000001;
		assertEquals(0, employee.getSalary(), delta);
	}

	// Testing workhorse constructor.
	@Test
	public void testEmployeeStringIntDouble() {
		Employee employee = new Employee("John", 1995, 65000);
		assertEquals("John", employee.getName());
		assertEquals(1995, employee.getYearOfBirth());
		double delta = 0.0000001;
		assertEquals(65000, employee.getSalary(), delta);
	}

	// Testing getter/accessor, getSalary().
	@Test
	public void testGetSalary() {
		Employee employee = new Employee("Elliot", 1980, 120000);
		double delta = 0.0000001;
		assertEquals(120000, employee.getSalary(), delta);
	}

	// Testing setter/mutator, setSalary().
	@Test
	public void testSetSalary() {
		Employee employee = new Employee();
		double delta = 0.0000001;
		assertEquals(0, employee.getSalary(), delta);
		employee.setSalary(250000);
		assertEquals(250000, employee.getSalary(), delta);
	}
	
	// Testing equals() method.
	@Test
	public void testEqualsObject() {
		Employee employee1 = new Employee("Elliot", 1980, 120000);
		Employee employee2 = new Employee("John", 1995, 65000);
		Employee employee3 = new Employee("Elliot", 1980, 120000);
		assertFalse(employee1.equals(employee2));
		assertTrue(employee1.equals(employee3));
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Employee employee = new Employee("Elliot", 1980, 125200.99);
		assertEquals("I am an employee and have a salary of $125200.99. " +
		"I am a person whose name is Elliot and was born in 1980", employee.toString());
	}
}
