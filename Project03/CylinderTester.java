import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class test the Cylinder class.
 * 
 * @author Karim R. Sammouri
 */
public class CylinderTester {

	// Testing parameterized constructor.
	@Test
	public void testCylinder() {
		Cylinder cylinder = new Cylinder(10, 15, "Cylinder");
		double delta = 0.0000001;
		assertEquals(10, cylinder.getHeight(), delta);
		assertEquals(15, cylinder.getRadius(), delta);
		assertEquals("Cylinder", cylinder.getName());
	}

	// Testing getter/accessor, getHeight().
	@Test
	public void testGetHeight() {
		Cylinder cylinder = new Cylinder(10, 15, "Cylinder");
		double delta = 0.0000001;
		assertEquals(10, cylinder.getHeight(), delta);
	}

	// Testing setter/mutator, setHeight().
	@Test
	public void testSetHeight() {
		Cylinder cylinder = new Cylinder(10, 15, "Cylinder");
		double delta = 0.0000001;
		assertEquals(10, cylinder.getHeight(), delta);
		cylinder.setHeight(15);
		assertEquals(15, cylinder.getHeight(), delta);
	}

	// Testing getter/accessor, getVolume().
	@Test
	public void testGetVolume() {
		Cylinder cylinder = new Cylinder(10, 15, "Cylinder");
		double delta = 0.0000001;
		assertEquals(Math.PI * 2250, cylinder.getVolume(), delta);
	}

	// Testing equals() method.
	@Test
	public void testEqualsObject() {
		Cylinder cylinder1 = new Cylinder(10, 15, "Cylinder");
		Cylinder cylinder2 = new Cylinder(5, 10, "Cylinder");
		Cylinder cylinder3 = new Cylinder(10, 15, "Cylinder");
		assertFalse(cylinder1.equals(cylinder2));
		assertTrue(cylinder1.equals(cylinder3));
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Cylinder cylinder = new Cylinder(10, 15, "Cylinder");
		assertEquals("Cylinder [Height: 10.0, Radius: 15.0]", cylinder.toString());
	}
}
