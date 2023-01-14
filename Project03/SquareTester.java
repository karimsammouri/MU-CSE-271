import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class test the Square class.
 * 
 * @author Karim R. Sammouri
 */
public class SquareTester {

	// Testing parameterized constructor.
	@Test
	public void testSquare() {
		Square square = new Square(5, "Square");
		double delta = 0.0000001;
		assertEquals(5, square.getSide(), delta);
		assertEquals("Square", square.getName());
	}

	// Testing getter/accessor, getName().
	@Test
	public void testGetName() {
		Square square = new Square(5, "Square");
		assertEquals("Square", square.getName());
	}

	// Testing getter/accessor, getSide().
	@Test
	public void testGetSide() {
		Square square = new Square(5, "Square");
		double delta = 0.0000001;
		assertEquals(5, square.getSide(), delta);
	}

	// Testing setter/mutator, setSide().
	@Test
	public void testSetSide() {
		Square square = new Square(5, "Square");
		double delta = 0.0000001;
		assertEquals(5, square.getSide(), delta);
		square.setSide(10);
		assertEquals(10, square.getSide(), delta);
	}

	// Testing getter/accessor, getArea().
	@Test
	public void testGetArea() {
		Square square = new Square(5, "Square");
		double delta = 0.0000001;
		assertEquals(25, square.getArea(), delta);
	}

	// Testing equals() method.
	@Test
	public void testEqualsObject() {
		Square square1 = new Square(10, "Square");
		Square square2 = new Square(15, "Square");
		Square square3 = new Square(10, "Square");
		assertFalse(square1.equals(square2));
		assertTrue(square1.equals(square3));
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Square square = new Square(10, "Square");
		assertEquals("Square [Side: 10.0]", square.toString());
	}
}
