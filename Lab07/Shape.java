/**
 * This interface defines common methods for geometric shapes.
 * 
 * @author Karim R. Sammouri
 */
public interface Shape {

	/**
	 * This method computes and returns the area of a geometric shape.
	 * 
	 * @return The area of a geometric shape.
	 */
	double getArea();

	/**
	 * This method scales a geometric shape's measurements by a given factor
	 * parameter.
	 * 
	 * @param factor The scaling factor.
	 */
	void scale(double factor);
}
