/**
 * Given tester class for Car class
 * @author Md Osman Gani
 */
public class CarDriver {
	public static void main(String[] args) {
		// Create two objects and initialize using constructors
		Car car1 = new Car();
		Car car2 = new Car();
		
		// Print the information using toString method
		System.out.println("Car 1: " + car1.toString());
		System.out.println("Car 2: " + car2.toString());
		
		// set car1 fields
		car1.speed = 188;
		car1.make = "BMW";
		car1.yearModel = 2020;
		car1.numberOfWheels = 4;
		car1.fuelLevel = 2.0;
		
		// set car2 fields
		car2.speed = 200;
		car2.make = "Tesla";
		car2.yearModel = 2020;
		car2.numberOfWheels = 4;
		car2.fuelLevel = 5.0;

		
		System.out.println();
		
		// Print the information using toString method
		System.out.println("Car 1: " + car1.toString());
		System.out.println("Car 2: " + car2.toString());
		
		// Accelerate 4 times
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();
		car1.accelerate();

		// Brake 6 times
		car2.brake();
		car2.brake();
		car2.brake();
		car2.brake();
		car2.brake();
		car2.brake();
		
		System.out.println("\nAfter 4 accelerations for car1 and 6 brakes for car 4");		
		// Print the information using toString method
		System.out.println("Car 1: " + car1.toString());
		System.out.println("Car 2: " + car2.toString());
		
		// Create two more objects
		Car car3 = new Car();
		Car car4 = new Car();

		// set car3 fields
		car3.speed = 25;
		car3.make = "Google";
		car3.yearModel = 2022;
		car3.numberOfWheels = 4;
		car3.fuelLevel = 5.0;

		// set car4 fields
		car4.speed = 20;
		car4.make = "Apple";
		car4.yearModel = 2022;
		car4.numberOfWheels = 2;
		car4.fuelLevel = 5.0;

		System.out.println();
		System.out.println("Car 3: " + car3.toString());
		System.out.println("Car 4: " + car4.toString());
		
		// Let's accelerate car3 a couple of times 
		// and brake car4 the same amount of times
		for(int i = 1; i <= 12; i++) {
			car3.accelerate();
			car4.brake();
		}		
		
		System.out.println("\nAfter 12 accelerations for car3 and 12 brakes for car 4");
		System.out.println("Car 3: " + car3.toString());
		System.out.println("Car 4: " + car4.toString());
		
		
		
		// Test equality
		if(car3.equals(car4)){
			System.out.println("The cars are equal");
		}
		else{
			System.out.println("The cars are not equal");
		}

		// Change car3 number of wheels
		car3.numberOfWheels = 2;

		System.out.println();
		System.out.println("Car 3: " + car3.toString());
		System.out.println("Car 4: " + car4.toString());

		// Test equality
		if(car3.equals(car4)){
			System.out.println("The cars are equal");
		}
		else{
			System.out.println("The cars are not equal");
		}

		// Change car4 make
		car4.make = "Google";

		System.out.println();
		System.out.println("Car 3: " + car3.toString());
		System.out.println("Car 4: " + car4.toString());

		// Test equality
		if(car3.equals(car4)){
			System.out.println("The cars are equal");
		}
		else{
			System.out.println("The cars are not equal");
		}
	}

}
