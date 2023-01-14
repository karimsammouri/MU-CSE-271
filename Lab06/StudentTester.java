/**
 * This class tests the Student class.
 * @author Karim R. Sammouri
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTester {

	// Testing default constructor.
	@Test
	public void testStudent() {
		Student student = new Student();
		assertEquals(null, student.getName());
		assertEquals(0, student.getYearOfBirth());
		assertEquals(null, student.getMajor());
	}

	// Testing workhorse constructor.
	@Test
	public void testStudentStringIntString() {
		Student student = new Student("Karim", 2001, "Computer Science");
		assertEquals("Karim", student.getName());
		assertEquals(2001, student.getYearOfBirth());
		assertEquals("Computer Science", student.getMajor());
	}

	// Testing getter/accessor, getMajor().
	@Test
	public void testGetMajor() {
		Student student = new Student("Nate", 2000, "Business Economics");
		assertEquals("Business Economics", student.getMajor());
	}

	// Testing setter/mutator, setMajor().
	@Test
	public void testSetMajor() {
		Student student = new Student();
		assertEquals(null, student.getMajor());
		student.setMajor("Business Economics");
		assertEquals("Business Economics", student.getMajor());
	}

	// Testing equals() method.
	@Test
	public void testEqualsObject() {
		Student student1 = new Student("Karim", 2001, "Computer Science");
		Student student2 = new Student("Jane", 2000, "Mechanical Engineering");
		Student student3 = new Student("Karim", 2001, "Computer Science");
		assertFalse(student1.equals(student2));
		assertTrue(student1.equals(student3));
	}

	// Testing toString() method;
	@Test
	public void testToString() {
		Student student = new Student("Karim", 2001, "Computer Science");
		assertEquals("I am a student majoring in Computer Science. "
				+ "I am a person whose name is Karim and was born in 2001", student.toString());
	}
}
