
/**
 * Lab Assignment 05 Solution
 * Object-Oriented Programming, CSE 271, Spring 2020
 * Department of Computer Science and Software Engineering, Miami University
 * Oxford, OH
 * 
 * @author Karim R. Sammouri
 */

import static org.junit.Assert.*;

import org.junit.Test;

public class CarTester {

	// Testing default constructor.
	@Test
	public void testCar() {
		Car car1 = new Car();
		assertEquals(null, car1.getOwner());
		assertEquals(null, car1.getMake());
		assertEquals(null, car1.getModel());
		assertEquals(2020, car1.getYearModel());
		// a difference in output value for double variables.
		double delta = 0.0000001;
		assertEquals(1.0f, car1.getFuelLevel(), delta);
		assertEquals(0, car1.getSpeed());
		assertEquals(false, car1.getStart());
	}

	// Testing partial constructor.
	@Test
	public void testCarStringStringStringInt() {
		Car car1 = new Car("Karim", "Lamborghini", "Avendator", 2018);
		assertEquals("Karim", car1.getOwner());
		assertEquals("Lamborghini", car1.getMake());
		assertEquals("Avendator", car1.getModel());
		assertEquals(2018, car1.getYearModel());
		// a difference in output value for double variables.
		double delta = 0.0000001;
		assertEquals(1.0f, car1.getFuelLevel(), delta);
		assertEquals(0, car1.getSpeed());
		assertEquals(false, car1.getStart());
	}

	// Testing partial constructor.
	@Test
	public void testCarStringStringStringIntFloat() {
		Car car1 = new Car("Janet", "Ford", "Sierra", 2019, 0.5f);
		assertEquals("Janet", car1.getOwner());
		assertEquals("Ford", car1.getMake());
		assertEquals("Sierra", car1.getModel());
		assertEquals(2019, car1.getYearModel());
		// a difference in output value for double variables.
		double delta = 0.0000001;
		assertEquals(0.5f, car1.getFuelLevel(), delta);
		assertEquals(0, car1.getSpeed());
		assertEquals(false, car1.getStart());
	}

	// Testing workhorse constructor.
	@Test
	public void testCarStringStringStringIntFloatIntBoolean() {
		Car car1 = new Car("Jacob", "Land Rover", "Range Rover", 2015, 0.2f, 140, true);
		assertEquals("Jacob", car1.getOwner());
		assertEquals("Land Rover", car1.getMake());
		assertEquals("Range Rover", car1.getModel());
		assertEquals(2015, car1.getYearModel());
		// a difference in output value for double variables.
		double delta = 0.0000001;
		assertEquals(0.2f, car1.getFuelLevel(), delta);
		assertEquals(140, car1.getSpeed());
		assertEquals(true, car1.getStart());
	}

	// Testing copy constructor.
	@Test
	public void testCarCar() {
		Car car1 = new Car("Jacob", "Land Rover", "Range Rover", 2015, 0.2f, 140, true);
		Car car2 = new Car(car1);
		assertEquals("Jacob", car2.getOwner());
		assertEquals("Land Rover", car2.getMake());
		assertEquals("Range Rover", car2.getModel());
		assertEquals(2015, car2.getYearModel());
		// a difference in output value for double variables.
		double delta = 0.0000001;
		assertEquals(0.2f, car2.getFuelLevel(), delta);
		assertEquals(140, car2.getSpeed());
		assertEquals(true, car2.getStart());
	}

	// Testing getter/accessor, getOwner().
	@Test
	public void testGetOwner() {
		Car car1 = new Car("Karim", "Lamborghini", "Avendator", 2018);
		assertEquals("Karim", car1.getOwner());
	}

	// Testing setter/mutator, setOwner().
	@Test
	public void testSetOwner() {
		Car car1 = new Car();
		// Before method invocation.
		assertEquals(null, car1.getOwner());
		car1.setOwner("Karim");
		// After method invocation.
		assertEquals("Karim", car1.getOwner());
	}

	// Testing getter/accessor, getMake().
	@Test
	public void testGetMake() {
		Car car1 = new Car("Karim", "Lamborghini", "Avendator", 2018);
		assertEquals("Lamborghini", car1.getMake());
	}

	// Testing setter/mutator, setMake().
	@Test
	public void testSetMake() {
		Car car1 = new Car();
		// Before method invocation.
		assertEquals(null, car1.getMake());
		car1.setMake("Lamborghini");
		// After method invocation.
		assertEquals("Lamborghini", car1.getMake());
	}

	// Testing getter/accessor, getModel().
	@Test
	public void testGetModel() {
		Car car1 = new Car("Karim", "Lamborghini", "Avendator", 2018);
		assertEquals("Avendator", car1.getModel());
	}

	// Testing setter/mutator, setModel().
	@Test
	public void testSetModel() {
		Car car1 = new Car();
		// Before method invocation.
		assertEquals(null, car1.getModel());
		car1.setModel("Avendator");
		// After method invocation.
		assertEquals("Avendator", car1.getModel());
	}

	// Testing getter/accessor, getYearModel().
	@Test
	public void testGetYearModel() {
		Car car1 = new Car("Karim", "Lamborghini", "Avendator", 2018);
		assertEquals(2018, car1.getYearModel());
	}

	// Testing setter/mutator, setYearModel().
	@Test
	public void testSetYearModel() {
		Car car1 = new Car();
		// Before method invocation.
		assertEquals(2020, car1.getYearModel());
		car1.setYearModel(2018);
		// After method invocation.
		assertEquals(2018, car1.getYearModel());
	}

	// Testing getter/accessor, getFuelLevel().
	@Test
	public void testGetFuelLevel() {
		Car car1 = new Car("Jacob", "Land Rover", "Range Rover", 2015, 0.2f, 140, true);
		double delta = 0.0000001;
		assertEquals(0.2f, car1.getFuelLevel(), delta);
	}

	// Testing setter/mutator, setFuelLevel().
	@Test
	public void testSetFuelLevel() {
		Car car1 = new Car();
		double delta = 0.0000001;
		// Before method invocation.
		assertEquals(1.0f, car1.getFuelLevel(), delta);
		car1.setFuelLevel(0.2f);
		// After method invocation.
		assertEquals(0.2f, car1.getFuelLevel(), delta);
	}

	// Testing getter/accessor, getSpeed().
	@Test
	public void testGetSpeed() {
		Car car1 = new Car("Jacob", "Land Rover", "Range Rover", 2015, 0.2f, 140, true);
		assertEquals(140, car1.getSpeed());
	}

	// Testing setter/mutator, setSpeed().
	@Test
	public void testSetSpeed() {
		Car car1 = new Car();
		// Before method invocation.
		assertEquals(0, car1.getSpeed());
		car1.setSpeed(140);
		// After method invocation.
		assertEquals(140, car1.getSpeed());
	}

	// Testing getter/accessor, getStart().
	@Test
	public void testGetStart() {
		Car car1 = new Car("Jacob", "Land Rover", "Range Rover", 2015, 0.2f, 140, true);
		assertEquals(true, car1.getStart());
	}

	// Testing setter/mutator, setStart().
	@Test
	public void testSetStart() {
		Car car1 = new Car();
		// Before method invocation.
		assertEquals(false, car1.getStart());
		car1.setStart(true);
		// After method invocation.
		assertEquals(true, car1.getStart());
	}

	// Testing accelerate() method in the contexts of a normal scenario and multiple edge cases.
	@Test
	public void testAccelerate() {
		// The state of relevant car properties before acceleration.
		Car car1 = new Car("Jacob", "Land Rover", "Range Rover", 2015, 0.2f, 140, true);
		double delta = 0.0000001;
		assertEquals(0.2f, car1.getFuelLevel(), delta);
		assertEquals(140, car1.getSpeed());
		assertEquals(true, car1.getStart());
		// The state of relevant car properties after accelerating in a normal scenario (engine is on, 
		//fuel level is at least 0.05, and speed is well below the 250 maximum). The speed is expected to 
		//increase by 4, while the fuel level is expected to decrease by 0.05.
		assertTrue(car1.accelerate());
		assertEquals(0.15f, car1.getFuelLevel(), delta);
		assertEquals(144, car1.getSpeed());
		assertEquals(true, car1.getStart());
		// The state of relevant car properties after accelerating if the car has enough fuel 
		//and the speed is below the maximum but the engine is off. The speed and fuel level 
		//is not expected to change.
		car1.setStart(false);
		assertFalse(car1.accelerate());
		assertEquals(0.15f, car1.getFuelLevel(), delta);
		assertEquals(144, car1.getSpeed());
		assertEquals(false, car1.getStart());
		// The state of relevant car properties after accelerating if the car has enough fuel 
		//and the engine is set to on but the car is at maximum speed. The speed is not expected 
		//to change but the fuel level is nevertheless expected to decrease by 0.05.
		car1.setStart(true);
		car1.setSpeed(250);
		assertFalse(car1.accelerate());
		assertEquals(0.10f, car1.getFuelLevel(), delta);
		assertEquals(250, car1.getSpeed());
		assertEquals(true, car1.getStart());
		// The state of relevant car properties after accelerating if the car is not at maximum speed 
		//and the engine is set to on but there is not enough fuel (0.05). The speed and fuel level 
		//is not expected to change.
		car1.setSpeed(140);
		car1.setFuelLevel(0.03f);
		assertFalse(car1.accelerate());
		assertEquals(0.03f, car1.getFuelLevel(), delta);
		assertEquals(140, car1.getSpeed());
		assertEquals(true, car1.getStart());
	}

	// Testing brake() method in the contexts of a normal scenario and multiple edge cases.
	@Test
	public void testBrake() {
		// The state of relevant car properties before braking.
		Car car1 = new Car("Jacob", "Land Rover", "Range Rover", 2015, 0.2f, 140, true);
		assertEquals(140, car1.getSpeed());
		assertEquals(true, car1.getStart());
		// The state of relevant car properties after braking in a normal scenario (engine is set to 
		//on and the speed is above or equal to 3). The speed is expected to decrease by 3.
		assertTrue(car1.brake());
		assertEquals(137, car1.getSpeed());
		assertEquals(true, car1.getStart());
		// The state of relevant car properties after braking if the speed is well above 0 but the engine 
		//is off. The speed is not expected to change.
		car1.setStart(false);
		assertFalse(car1.brake());
		assertEquals(137, car1.getSpeed());
		assertEquals(false, car1.getStart());
		// The state of relevant car properties after braking if the engine is on but the speed is 0. 
		//The speed is not expected to change.
		car1.setStart(true);
		car1.setSpeed(0);
		assertFalse(car1.brake());
		assertEquals(0, car1.getSpeed());
		assertEquals(true, car1.getStart());
		// The state of relevant car properties after braking if the engine is on but the speed is between 
		//0 and 3. The speed is expected to fall to 0.
		car1.setSpeed(2);
		assertTrue(car1.brake());
		assertEquals(0, car1.getSpeed());
		assertEquals(true, car1.getStart());
	}

	// Testing isGasTankEmpty() method.
	@Test
	public void testIsGasTankEmpty() {
		Car car1 = new Car("Jacob", "Land Rover", "Range Rover", 2015, 0.2f, 140, true);
		// Testing method if fuel level is above 0.05.
		assertEquals(false, car1.isGasTankEmpty());
		car1.setFuelLevel(0.03f);
		// Testing method if fuel level is below 0.05.
		assertEquals(true, car1.isGasTankEmpty());
	}

	// Testing sameOwner() method.
	@Test
	public void testSameOwner() {
		Car car1 = new Car("Jacob", "Land Rover", "Range Rover", 2015, 0.2f, 140, true);
		Car car2 = new Car("Kris", "Toyota", "Camry", 2012, 0.3f, 100, true);
		Car car3 = new Car("Jacob", "Tesla", "Model 3", 2015, 0.4f, 200, true);
		// Testing method with two cars of different owners.
		assertFalse(car1.sameOwner(car2));
		// Testing method with two cars of the same owners.
		assertTrue(car1.sameOwner(car3));
	}

	// Testing equals() method.
	@Test
	public void testEqualsCar() {
		Car car1 = new Car("Jacob", "Land Rover", "Range Rover", 2015, 0.2f, 140, true);
		Car car2 = new Car("Kris", "Toyota", "Camry", 2012, 0.3f, 100, true);
		Car car3 = new Car("Sam", "Land Rover", "Range Rover", 2015, 0.4f, 200, true);
		// Testing method with two cars that have different makes, models, and yearModels.
		assertFalse(car1.equals(car2));
		// Testing method with two cars that have the same make, model, and yearModel.
		assertTrue(car1.equals(car3));
	}

	// Testing toString() method.
	@Test
	public void testToString() {
		Car car1 = new Car("Jacob", "Land Rover", "Range Rover", 2015, 0.2f, 140, true);
		assertEquals("Owner: Jacob, Make: Land Rover, Model: Range Rover," +
		" Year: 2015, Speed: 140, Fuel Level: 0.2", car1.toString());
	}
	
	// Testing if the setYearModel() method will throw an exception if an invalid input is set.
	@Test(expected=IllegalArgumentException.class)
	public void testSetYearModelException() {
		// set an invalid value in setYearModel() method
		Car car1 = new Car();
		car1.setYearModel(1882);
		car1.setYearModel(2025);
	}
	
	// Testing if the setFuelLevel() method will throw an exception if an invalid input is set.
	@Test(expected=IllegalArgumentException.class)
	public void testSetFuelLevelException() {
		// set an invalid value in setFuelLevel() method
		Car car1 = new Car();
		car1.setFuelLevel(-1.0f);
		car1.setFuelLevel(2.0f);
	}
	
	// Testing if the setSpeed() method will throw an exception if an invalid input is set.
	@Test(expected=IllegalArgumentException.class)
	public void testSetSpeedException() {
		// set an invalid value in setSpeed() method
		Car car1 = new Car();
		car1.setSpeed(-20);
		car1.setSpeed(280);
	}

}
