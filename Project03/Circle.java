/**
 * This class defines a circle object and stores its relevant properties.
 * 
 * @author Karim R. Sammouri
 */
public class Circle extends Shape implements Area {

	// Declaring variables or properties.
	private double radius;

	/**
	 * Parameterized Constructor.
	 * 
	 * @param radius The radius of the circular shape.
	 * @param name   The name of the circular shape.
	 */
	public Circle(double radius, String name) {
		super(name);
		this.radius = radius;
	}

	/**
	 * This method returns the radius of the circular geometric shape.
	 * 
	 * @return The radius of the circular geometric shape.
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * This method sets the radius of the circular geometric shape.
	 * 
	 * @param radius The radius of the circular geometric shape.
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}

	/**
	 * This method compares two Circle objects.
	 * 
	 * @param obj The object to be compared with.
	 * @return True if the two objects and their properties are equal and false
	 *         otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Circle) {
			Circle circle = (Circle) obj;
			return name.equals(circle.name) && Math.abs(radius - circle.radius) < 0.0000001;
		}
		return false;
	}

	/**
	 * This method returns a string representation of a Circle object.
	 * 
	 * @return A string representation of a Circle object.
	 */
	public String toString() {
		return name + " [Radius: " + radius + "]";
	}
}
