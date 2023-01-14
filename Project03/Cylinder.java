/**
 * This class defines a cylinder object and stores its relevant properties.
 * 
 * @author Karim R. Sammouri
 */
public class Cylinder extends Circle implements Volume {

	// Declaring variables or properties.
	private double height;

	/**
	 * Parameterized Constructor.
	 * 
	 * @param height The height of the cylindrical shape.
	 * @param radius The radius of the cylindrical shape.
	 * @param name   The name of the cylindrical shape.
	 */
	public Cylinder(double height, double radius, String name) {
		super(radius, name);
		this.height = height;
	}

	/**
	 * This method returns the height of the cylindrical geometric shape.
	 * 
	 * @return The height of the cylindrical geometric shape.
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * This method sets the height of the cylindrical geometric shape.
	 * 
	 * @param height The height of the cylindrical geometric shape.
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getVolume() {
		return super.getArea() * height;
	}

	/**
	 * This method compares two Cylinder objects.
	 * 
	 * @param obj The object to be compared with.
	 * @return True if the two objects and their properties are equal and false
	 *         otherwise.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Cylinder) {
			Cylinder cylinder = (Cylinder) obj;
			return super.equals(cylinder) && Math.abs(height - cylinder.height) < 0.0000001;
		}
		return false;
	}

	/**
	 * This method returns a string representation of a Cylinder object.
	 * 
	 * @return A string representation of a Cylinder object.
	 */
	public String toString() {
		return name + " [Height: " + getHeight() + ", Radius: " + getRadius() + "]";
	}
}
