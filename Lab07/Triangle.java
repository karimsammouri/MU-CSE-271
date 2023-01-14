/**
 * This class represents a rectangle object and stores its properties.
 * 
 * @author Karim R. Sammouri
 */

public class Triangle implements Shape {

	// Declaring variables or properties.
	private double base;
	private double height;

	/**
	 * Parameterized constructor.
	 * 
	 * @param base   The base of the triangle.
	 * @param height The height of the triangle.
	 */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		return 1.0 / 2 * base * height;
	}

	@Override
	public void scale(double factor) {
		base *= factor;
		height *= factor;
	}

	/**
	 * This method compares two Triangle objects.
	 * 
	 * @return True if the two objects and their properties are equal and false
	 *         otherwise.
	 */
	public boolean equals(Object otherObject) {
		if (otherObject instanceof Triangle) {
			Triangle triangle = (Triangle) otherObject;
			if (base - triangle.base < 0.0000001 && height - triangle.height < 0.0000001)
				return true;
		}
		return false;
	}

	/**
	 * This method returns a string representation of a Triangle object.
	 * 
	 * @return A string representation of a Triangle object.
	 */
	public String toString() {
		return "Triangle [base = " + base + ", height = " + height + "]";
	}
}
