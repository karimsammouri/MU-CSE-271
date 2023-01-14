/**
 * This class tests the Car class.
 * 
 * @author Karim R. Sammouri
 */
public class CarDriver {
	public static void main(String[] args) {

		// Testing constructors.
		System.out.println("Testing constructors: ");
		Car car1 = new Car();
		System.out.println("Car 1: " + car1.toString());
		Car car2 = new Car("Karim", "Lamborghini", "Avendator", 2010);
		System.out.println("Car 2: " + car2.toString());
		Car car3 = new Car("Sarah", "Toyota", "Camry", 2015, 0.8f);
		System.out.println("Car 3: " + car3.toString());
		Car car4 = new Car("Karim", "Land Rover", "Range Rover", 2017, 0.9f, 190, true);
		System.out.println("Car 4: " + car4.toString());
		Car car5 = new Car(car1);
		System.out.println("Car 1: " + car5.toString());
		Car car6 = new Car(car2);
		System.out.println("Car 2: " + car6.toString());
		Car car7 = new Car(car3);
		System.out.println("Car 3: " + car7.toString());
		Car car8 = new Car(car4);
		System.out.println("Car 4: " + car8.toString());
		System.out.println("---------------------------------------");

		// Testing setter and getter methods:
		System.out.println("Testing setter and getter methods: ");

		// Testing setOwner() and getOwner().
		System.out.println("Testing setOwner() and getOwner()");
		car1.setOwner("Jonathan");
		System.out.println(car1.getOwner());
		System.out.println("Car 1: " + car1.toString());
		System.out.println("---------------------------------------");

		// Testing setMake() and getMake().
		System.out.println("Testing setMake() and getMake()");
		car1.setMake("Ford");
		System.out.println(car1.getMake());
		System.out.println("Car 1: " + car1.toString());
		System.out.println("---------------------------------------");

		// Testing setModel() and getModel().
		System.out.println("Testing setOwner() and getOwner()");
		car1.setModel("Explorer");
		System.out.println(car1.getModel());
		System.out.println("Car 1: " + car1.toString());
		System.out.println("---------------------------------------");

		// Testing setYearModel() and getYearModel().
		System.out.println("Testing setYearModel() and getYearModel()");
		car1.setYearModel(2000);
		System.out.println(car1.getYearModel());
		System.out.println("Car 1: " + car1.toString());
		try {
			car1.setYearModel(2050);
		} catch (Exception ex) {
			System.out.println("Error: year model cannnot be less than 1885 or greater than 2021.");
		} finally {
			System.out.println(car1.getYearModel());
			System.out.println("Car 1: " + car1.toString());
		}
		try {
			car1.setYearModel(1870);
		} catch (Exception ex) {
			System.out.println("Error: year model cannnot be less than 1885 or greater than 2021.");
		} finally {
			System.out.println(car1.getYearModel());
			System.out.println("Car 1: " + car1.toString());
		}
		System.out.println("---------------------------------------");

		// Testing setFuelLevel() and getFuelLevel().
		System.out.println("Testing setFuelLevel() and getFuelLevel()");
		car1.setFuelLevel(0.5f);
		System.out.println(car1.getFuelLevel());
		System.out.println("Car 1: " + car1.toString());
		try {
			car1.setFuelLevel(2.0f);
		} catch (Exception ex) {
			System.out.println("Error: fuel level cannot be less than 0 or greater than 1.0.");
		} finally {
			System.out.println(car1.getFuelLevel());
			System.out.println("Car 1: " + car1.toString());
		}
		try {
			car1.setFuelLevel(-0.5f);
		} catch (Exception ex) {
			System.out.println("Error: fuel level cannot be less than 0 or greater than 1.0.");
		} finally {
			System.out.println(car1.getFuelLevel());
			System.out.println("Car 1: " + car1.toString());
		}
		System.out.println("---------------------------------------");

		// Testing setSpeed() and getSpeed().
		System.out.println("Testing setSpeed() and getSpeed()");
		car1.setSpeed(110);
		System.out.println(car1.getSpeed());
		System.out.println("Car 1: " + car1.toString());
		try {
			car1.setSpeed(280);
		} catch (Exception ex) {
			System.out.println("Error: speed cannot be a less than 0 or greater than 250.");
		} finally {
			System.out.println(car1.getSpeed());
			System.out.println("Car 1: " + car1.toString());
		}
		try {
			car1.setSpeed(-90);
		} catch (Exception ex) {
			System.out.println("Error: speed cannot be a less than 0 or greater than 250.");
		} finally {
			System.out.println(car1.getSpeed());
			System.out.println("Car 1: " + car1.toString());
		}
		System.out.println("---------------------------------------");

		// Testing setStart() and getStart().
		System.out.println("Testing setStart() and getStart()");
		System.out.println(car1.getStart());
		car1.setStart(true);
		System.out.println(car1.getStart());
		System.out.println("Car 1: " + car1.toString());
		System.out.println("---------------------------------------");

		// Testing accelerate().
		System.out.println("Testing accelerate()");
		System.out.println(car1.toString());
		System.out.println(car1.accelerate());
		System.out.println(car1.toString());
		System.out.println(car1.accelerate());
		System.out.println(car1.toString());
		car1.setSpeed(250);
		car1.setFuelLevel(1.0f);
		System.out.println(car1.toString());
		System.out.println(car1.accelerate());
		System.out.println(car1.toString());
		car1.setStart(false);
		car1.setSpeed(100);
		car1.setFuelLevel(1.0f);
		System.out.println(car1.toString());
		System.out.println(car1.accelerate());
		System.out.println(car1.toString());
		System.out.println("---------------------------------------");

		// Testing brake().
		System.out.println("Testing brake()");
		System.out.println(car1.toString());
		System.out.println(car1.getStart());
		System.out.println(car1.brake());
		System.out.println(car1.toString());
		car1.setStart(true);
		System.out.println(car1.brake());
		System.out.println(car1.toString());
		car1.setSpeed(2);
		System.out.println(car1.toString());
		System.out.println(car1.brake());
		System.out.println(car1.toString());
		System.out.println("---------------------------------------");

		// Testing isGasTankEmpty().
		System.out.println("Testing isGasTankEmpty()");
		System.out.println(car1.toString());
		System.out.println(car1.isGasTankEmpty());
		car1.setFuelLevel(0.4f);
		System.out.println(car1.toString());
		System.out.println(car1.isGasTankEmpty());
		System.out.println("---------------------------------------");

		// Testing sameOwner().
		System.out.println("Testing sameOwner()");
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car1.sameOwner(car2));
		System.out.println(car2.toString());
		System.out.println(car4.toString());
		System.out.println(car2.sameOwner(car4));
		System.out.println("---------------------------------------");

		// Testing equals().
		System.out.println("Testing equals()");
		System.out.println(car1.toString());
		System.out.println(car2.toString());
		System.out.println(car1.equals(car2));
		System.out.println(car2.toString());
		System.out.println(car6.toString());
		System.out.println(car2.equals(car6));
		System.out.println("---------------------------------------");

		// Testing toString().
		System.out.println("Testing toString()");
		System.out.println(car1.toString());
		System.out.println("---------------------------------------");
	}
}
