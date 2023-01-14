/**
 * This class tests the Person class.
 * @author Karim R. Sammouri
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonTester {

	// Testing default constructor.
	@Test
	public void testPerson() {
		Person person = new Person();
		assertEquals(null, person.getName());
		assertEquals(0, person.getYearOfBirth());
	}

	// Testing workhorse constructor.
	@Test
	public void testPersonStringInt() {
		Person person = new Person("Karim", 2001);
		assertEquals("Karim", person.getName());
		assertEquals(2001, person.getYearOfBirth());
	}

	// Testing a getter/accessor, getName().
	@Test
	public void testGetName() {
		Person person = new Person("Karim", 2001);
		assertEquals("Karim", person.getName());
	}

	// Testing a setter/mutator, setName().
	@Test
	public void testSetName() {
		Person person = new Person();
		assertEquals(null, person.getName());
		person.setName("Karim");
		assertEquals("Karim", person.getName());
	}

	// Testing a getter/accessor, getYearOfBirth().
	@Test
	public void testGetYearOfBirth() {
		Person person = new Person("Karim", 2001);
		assertEquals(2001, person.getYearOfBirth());
	}

	// Testing a setter/mutator, setYearOfBirth().
	@Test
	public void testSetYearOfBirth() {
		Person person = new Person();
		assertEquals(0, person.getYearOfBirth());
		person.setYearOfBirth(2001);
		assertEquals(2001, person.getYearOfBirth());
	}

	// Testing equals() method.
	@Test
	public void testEqualsObject() {
		Person person1 = new Person("Karim", 2001);
		Person person2 = new Person("Jacob", 2003);
		Person person3 = new Person("Karim", 2001);
		assertFalse(person1.equals(person2));
		assertTrue(person1.equals(person3));
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Person person = new Person("Karim", 2001);
		assertEquals("I am a person whose name is Karim and was born in 2001", person.toString());
	}

}