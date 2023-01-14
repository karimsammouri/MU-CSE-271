/**
 * This class represents a rectangle object and stores its properties.
 * 
 * @author Karim R. Sammouri
 */

public class Rectangle implements Shape {

	// Declaring variables or properties.
	private int x;
	private int y;
	private double length;
	private double width;

	/**
	 * Parameterized constructor.
	 * 
	 * @param x      The x-coordinate of the upper-left corner of the rectangle.
	 * @param y      The y-coordinate of the upper-left corner of the rectangle.
	 * @param length The length of the rectangle.
	 * @param width  The width of the rectangle.
	 */
	public Rectangle(int x, int y, double length, double width) {
		this.x = x;
		this.y = y;
		this.length = length;
		this.width = width;
	}

	@Override
	public double getArea() {
		return length * width;
	}

	@Override
	public void scale(double factor) {
		length *= factor;
		width *= factor;
	}

	/**
	 * This method compares two Rectangle objects.
	 * 
	 * @return True if the two objects and their properties are equal and false
	 *         otherwise.
	 */
	public boolean equals(Object otherObject) {
		if (otherObject instanceof Rectangle) {
			Rectangle rectangle = (Rectangle) otherObject;
			if (length - rectangle.length < 0.0000001
					&& width - rectangle.width < 0.0000001)
				return true;
		}
		return false;
	}

	/**
	 * This method returns a string representation of a Rectangle object.
	 * 
	 * @return A string representation of a Rectangle object.
	 */
	public String toString() {
		return "Rectangle [x = " + x + ", y = " + y + ", length = " + length + ", width = " + width + "]";
	}
}
