/**
 * This class tests the Rectangle and Triangle classes.
 * 
 * @author Karim R. Sammouri
 */
public class ShapeDriver {
	
	public static void main(String[] args) {
		
		// Testing Rectangle class.
		System.out.println("Testing Rectangle class:");
		System.out.println();
		
		Rectangle rectangle1 = new Rectangle(10, 10, 20, 30);
		Rectangle rectangle2 = new Rectangle(-5, -10, 40, 10);
		
		System.out.println("Original dimensions:");
		
		System.out.println(rectangle1);
		System.out.println(rectangle2);
		System.out.println("Area of rectangle1: " + rectangle1.getArea());
		System.out.println("Area of rectangle2: " + rectangle2.getArea());
		
		rectangle1.scale(0.5);
		rectangle2.scale(0.5);
		
		System.out.println();
		System.out.println("After scaling rectangle dimensions by a factor of 0.5:");
	
		System.out.println(rectangle1);
		System.out.println(rectangle2);
		System.out.println("Area of rectangle1: " + rectangle1.getArea());
		System.out.println("Area of rectangle2: " + rectangle2.getArea());
		
		rectangle1.scale(2);
		rectangle2.scale(2);
	
		System.out.println();
		System.out.println("After scaling rectangle dimensions by a factor of 2:");
		
		System.out.println(rectangle1);
		System.out.println(rectangle2);
		System.out.println("Area of rectangle1: " + rectangle1.getArea());
		System.out.println("Area of rectangle2: " + rectangle2.getArea());
		
		System.out.println();
		System.out.println("Testing equals() method:");
		
		System.out.println(rectangle1.equals(rectangle2));
		Rectangle rectangle3 = new Rectangle(-40, 10, 20, 30);
		System.out.println(rectangle1.equals(rectangle3));
		Triangle triangle = new Triangle(10, 20);
		System.out.println(rectangle1.equals(triangle));
		System.out.println(rectangle1.equals(null));
		System.out.println("---------------------------------");
		
		// Testing Triangle class.
		System.out.println();
		System.out.println("Testing Triangle class:");
		System.out.println();
		
		Triangle triangle1 = new Triangle(15, 40);
		Triangle triangle2 = new Triangle(35, 5);
		
		System.out.println("Original dimensions:");
		
		System.out.println(triangle1);
		System.out.println(triangle2);
		System.out.println("Area of triangle1: " + triangle1.getArea());
		System.out.println("Area of triangle2: " + triangle2.getArea());
		
		triangle1.scale(0.5);
		triangle2.scale(0.5);
		
		System.out.println();
		System.out.println("After scaling triangle dimensions by a factor of 0.5:");
	
		System.out.println(triangle1);
		System.out.println(triangle2);
		System.out.println("Area of triangle1: " + triangle1.getArea());
		System.out.println("Area of triangle2: " + triangle2.getArea());
		
		triangle1.scale(2);
		triangle2.scale(2);
	
		System.out.println();
		System.out.println("After scaling triangle dimensions by a factor of 2:");
		
		System.out.println(triangle1);
		System.out.println(triangle2);
		System.out.println("Area of triangle1: " + triangle1.getArea());
		System.out.println("Area of triangle2: " + triangle2.getArea());
		
		System.out.println();
		System.out.println("Testing equals() method:");
		
		System.out.println(triangle1.equals(triangle2));
		Triangle triangle3 = new Triangle(15, 40);
		System.out.println(triangle1.equals(triangle3));
		Rectangle rectangle = new Rectangle(10, 20, 100, 40);
		System.out.println(triangle1.equals(rectangle));
		System.out.println(triangle1.equals(null));
		System.out.println("---------------------------------");
		
	}
}
