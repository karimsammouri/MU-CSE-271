/**
 * This class tests the Executive class.
 * @author Karim R. Sammouri
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class ExecutiveTester {

	// Testing default constructor.
	@Test
	public void testExecutive() {
		Executive executive = new Executive();
		assertEquals(null, executive.getName());
		assertEquals(0, executive.getYearOfBirth());
		double delta = 0.0000001;
		assertEquals(0, executive.getSalary(), delta);
		assertEquals(null, executive.getDepartment());
		assertEquals(null, executive.getOfficeLocation());
	}

	// Testing workhorse constructor.
	@Test
	public void testExecutiveStringIntDoubleStringString() {
		Executive executive = new Executive("Karim", 2001, 560750.99, "Technology", "suite 2000");
		assertEquals("Karim", executive.getName());
		assertEquals(2001, executive.getYearOfBirth());
		double delta = 0.0000001;
		assertEquals(560750.99, executive.getSalary(), delta);
		assertEquals("Technology", executive.getDepartment());
		assertEquals("suite 2000", executive.getOfficeLocation());
	}

	// Testing getter/accessor, getOfficeLocation().
	@Test
	public void testGetOfficeLocation() {
		Executive executive = new Executive("Jason", 1990, 65870.85, "Operations", "room 17");
		assertEquals("room 17", executive.getOfficeLocation());
	}

	// Testing setter/mutator, setOfficeLocation().
	@Test
	public void testSetOfficeLocation() {
		Executive executive = new Executive();
		assertEquals(null, executive.getOfficeLocation());
		executive.setOfficeLocation("room 17");
		assertEquals("room 17", executive.getOfficeLocation());
	}
	
	// Testing equals() method.
	@Test
	public void testEqualsObject() {
		Executive executive1 = new Executive("Karim", 2001, 560750.99, "Technology", "suite 2000");
		Executive executive2 = new Executive("Jason", 1990, 65870.85, "Operations", "room 17");
		Executive executive3 = new Executive("Karim", 2001, 560750.99, "Technology", "suite 2000");
		assertFalse(executive1.equals(executive2));
		assertTrue(executive1.equals(executive3));
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Executive executive = new Executive("Karim", 2001, 560750.99, "Technology", "suite 2000");
		assertEquals("I am an executive and my office location is suite 2000. I am a manager of the " + 
		"Technology department. I am an employee and have a salary of $560750.99. " + 
				"I am a person whose name is Karim and was born in 2001", executive.toString());
	}
}
