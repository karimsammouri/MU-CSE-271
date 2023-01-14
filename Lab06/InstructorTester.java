/**
 * This class tests the Instructor class.
 * @author Karim R. Sammouri
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class InstructorTester {

	// Testing default constructor.
	@Test
	public void testInstructor() {
		Instructor instructor = new Instructor();
		assertEquals(null, instructor.getName());
		assertEquals(0, instructor.getYearOfBirth());
		assertEquals(null, instructor.getRank());
	}

	// Testing workhorse constructor.
	@Test
	public void testInstructorStringIntString() {
		Instructor instructor = new Instructor("Joseph Stinn", 1985, "professor");
		assertEquals("Joseph Stinn", instructor.getName());
		assertEquals(1985, instructor.getYearOfBirth());
		assertEquals("professor", instructor.getRank());
	}

	// Testing getter/accessor, getRank().
	@Test
	public void testGetRank() {
		Instructor instructor = new Instructor("Benjamin Stein", 1987, "lecturer");
		assertEquals("lecturer", instructor.getRank());
	}

	// Testing setter/mutator, setRank().
	@Test
	public void testSetRank() {
		Instructor instructor = new Instructor();
		assertEquals(null, instructor.getRank());
		instructor.setRank("lecturer");
		assertEquals("lecturer", instructor.getRank());
	}
	
	// Testing equals() method.
	@Test
	public void testEqualsObject() {
		Instructor instructor1 = new Instructor("Joseph Marquette", 1985, "professor");
		Instructor instructor2 = new Instructor("Benjamin Stein", 1987, "lecturer");
		Instructor instructor3 = new Instructor("Joseph Marquette", 1985, "professor");
		assertFalse(instructor1.equals(instructor2));
		assertTrue(instructor1.equals(instructor3));
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Instructor instructor = new Instructor("Benjamin Stein", 1987, "lecturer");
		assertEquals("I am a lecturer. I am a person whose name is Benjamin Stein " +
	"and was born in 1987", instructor.toString());
	}
}
