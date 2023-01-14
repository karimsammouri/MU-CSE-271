/**
 * This class defines a Sphere object and stores its relevant properties.
 * 
 * @author Karim R. Sammouri
 */
public class Sphere extends Circle implements Volume {

	/**
	 * Parameterized Constructor.
	 * 
	 * @param radius The radius of the spherical shape.
	 * @param name   The name of the spherical shape.
	 */
	public Sphere(double radius, String name) {
		super(radius, name);
	}

	@Override
	public double getVolume() {
		return (4 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
	}

	/**
	 * This method returns a string representation of a Sphere object.
	 * 
	 * @return A string representation of a Sphere object.
	 */
	public String toString() {
		return super.toString();
	}
}
