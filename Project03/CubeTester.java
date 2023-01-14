import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class test the Cube class.
 * 
 * @author Karim R. Sammouri
 */
public class CubeTester {

	// Testing parameterized constructor.
	@Test
	public void testCube() {
		Cube cube = new Cube(10, "Cube");
		double delta = 0.0000001;
		assertEquals(10, cube.getSide(), delta);
		assertEquals("Cube", cube.getName());
	}

	// Testing getter/accessor, getVolume().
	@Test
	public void testGetVolume() {
		Cube cube = new Cube(10, "Cube");
		double delta = 0.0000001;
		assertEquals(1000, cube.getVolume(), delta);
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Cube cube = new Cube(10, "Cube");
		assertEquals("Cube [Side: 10.0]", cube.toString());
	}
}
