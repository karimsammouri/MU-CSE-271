import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class test the Circle class.
 * 
 * @author Karim R. Sammouri
 */
public class CircleTester {

	// Testing parameterized constructor.
	@Test
	public void testCircle() {
		Circle circle = new Circle(5, "Circle");
		double delta = 0.0000001;
		assertEquals(5, circle.getRadius(), delta);
		assertEquals("Circle", circle.getName());
	}

	// Testing getter/accessor, getName().
	@Test
	public void testGetName() {
		Circle circle = new Circle(5, "Circle");
		assertEquals("Circle", circle.getName());
	}

	// Testing getter/accessor, getRadius().
	@Test
	public void testGetRadius() {
		Circle circle = new Circle(5, "Circle");
		double delta = 0.0000001;
		assertEquals(5, circle.getRadius(), delta);
	}

	// Testing setter/mutator, setRadius().
	@Test
	public void testSetRadius() {
		Circle circle = new Circle(5, "Circle");
		double delta = 0.0000001;
		assertEquals(5, circle.getRadius(), delta);
		circle.setRadius(10);
		assertEquals(10, circle.getRadius(), delta);
	}

	// Testing getter/accessor, getArea().
	@Test
	public void testGetArea() {
		Circle circle = new Circle(5, "Circle");
		double delta = 0.0000001;
		assertEquals(Math.PI * 25, circle.getArea(), delta);
	}

	// Testing equals() method.
	@Test
	public void testEqualsObject() {
		Circle circle1 = new Circle(10, "Circle");
		Circle circle2 = new Circle(15, "Circle");
		Circle circle3 = new Circle(10, "Circle");
		assertFalse(circle1.equals(circle2));
		assertTrue(circle1.equals(circle3));
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Circle circle = new Circle(10, "Circle");
		assertEquals("Circle [Radius: 10.0]", circle.toString());
	}
}
