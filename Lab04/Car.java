/**
 * This class represents a car object and stores properties of a car.
 * 
 * @author Karim R. Sammouri
 */
public class Car {

	// Declaring variables or properties.
	private String owner;
	private String make;
	private String model;
	private int yearModel;
	private float fuelLevel;
	private int speed;
	private boolean start;

	/**
	 * Empty constructor.
	 */
	public Car() {
		owner = null;
		make = null;
		model = null;
		yearModel = 2020;
		fuelLevel = 1.0f;
		speed = 0;
		start = false;
	}

	/**
	 * Partial constructor.
	 * 
	 * @param owner     Owner of the car.
	 * @param make      Make of the car.
	 * @param model     Model of the car.
	 * @param yearModel Year model of the car. The year cannot be greater than 2021
	 *                  and smaller than 1885.
	 */
	public Car(String owner, String make, String model, int yearModel) {
		this.owner = owner;
		this.make = make;
		this.model = model;
		this.yearModel = yearModel;
		fuelLevel = 1.0f;
		speed = 0;
		start = false;
	}

	/**
	 * Partial constructor.
	 * 
	 * @param owner     Owner of the car.
	 * @param make      Make of the car.
	 * @param model     Model of the car.
	 * @param yearModel Year model of the car. The year cannot be greater than 2021
	 *                  and smaller than 1885.
	 * @param fuelLevel Fuel level of the car. The fuel level ranges between 0 and
	 *                  1.0.
	 */
	public Car(String owner, String make, String model, int yearModel, float fuelLevel) {
		this.owner = owner;
		this.make = make;
		this.model = model;
		this.yearModel = yearModel;
		this.fuelLevel = fuelLevel;
		speed = 0;
		start = false;
	}

	/**
	 * Workhorse constructor.
	 * 
	 * @param owner     Owner of the car.
	 * @param make      Make of the car.
	 * @param model     Model of the car.
	 * @param yearModel Year model of the car. The year cannot be greater than 2021
	 *                  and smaller than 1885.
	 * @param fuelLevel Fuel level of the car. The fuel level ranges between 0 and
	 *                  1.0.
	 * @param speed     Current speed of the car. The speed cannot be a negative
	 *                  number and the maximum speed of a car is 250 mph.
	 * @param start     The current state of the engine. True if the engine is
	 *                  turned on and false otherwise.
	 */
	public Car(String owner, String make, String model, int yearModel, float fuelLevel, int speed, boolean start) {
		this.owner = owner;
		this.make = make;
		this.model = model;
		this.yearModel = yearModel;
		this.fuelLevel = fuelLevel;
		this.speed = speed;
		this.start = start;
	}

	/**
	 * Copy constructor.
	 * 
	 * @param owner
	 * @param make
	 * @param model
	 * @param yearModel
	 * @param fuelLevel
	 * @param speed
	 * @param start
	 */
	public Car(Car anotherCar) {
		this.owner = anotherCar.owner;
		this.make = anotherCar.make;
		this.model = anotherCar.model;
		this.yearModel = anotherCar.yearModel;
		this.fuelLevel = anotherCar.fuelLevel;
		this.speed = anotherCar.speed;
		this.start = anotherCar.start;
	}

	/**
	 * This method sets the owner of the car.
	 * 
	 * @param owner The owner of the car.
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/**
	 * This method sets the make of the car.
	 * 
	 * @param make The make of the car.
	 */
	public void setMake(String make) {
		this.make = make;
	}

	/**
	 * This method sets the model of the car.
	 * 
	 * @param model The model of the car.
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * This methods sets the year model of the car.
	 * 
	 * @param yearModel The year model of the car.
	 */
	public void setYearModel(int yearModel) {
		if (yearModel < 1885 || yearModel > 2021)
			throw new IllegalArgumentException("Year model cannot be less than 1885 or greater than 2021!");
		else
			this.yearModel = yearModel;
	}

	/**
	 * This method sets the fuel level of the car.
	 * 
	 * @param fuelLevel The fuel level of the car.
	 */
	public void setFuelLevel(float fuelLevel) {
		if (fuelLevel < 0 || fuelLevel > 1.0)
			throw new IllegalArgumentException("Fuel level cannot be less than 0 or more than 1.0!");
		else
			this.fuelLevel = fuelLevel;
	}

	/**
	 * This method sets the speed of the car.
	 * 
	 * @param speed The speed of the car.
	 */
	public void setSpeed(int speed) {
		if (speed < 0 || speed > 250)
			throw new IllegalArgumentException("Speed cannot be less than 0 or more than 250!");
		else
			this.speed = speed;
	}

	/**
	 * This method sets the state of the car's engine.
	 * 
	 * @param start The state of the car engine.
	 */
	public void setStart(boolean start) {
		this.start = start;
	}

	/**
	 * This method returns the owner of the car.
	 * 
	 * @return The owner of the car.
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * This method returns the make of the car.
	 * 
	 * @return The make of the car.
	 */
	public String getMake() {
		return make;
	}

	/**
	 * This method returns the model of the car.
	 * 
	 * @return The model of the car.
	 */
	public String getModel() {
		return model;
	}

	/**
	 * This method returns the year model of the car.
	 * 
	 * @return The year model of the car.
	 */
	public int getYearModel() {
		return yearModel;
	}

	/**
	 * This method returns the fuel level of the car.
	 * 
	 * @return The fuel level of the car.
	 */
	public float getFuelLevel() {
		return fuelLevel;
	}

	/**
	 * This method returns the speed of the car.
	 * 
	 * @return The speed of the car.
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * This method returns the state of the car's engine.
	 * 
	 * @return The state of the car's engine.
	 */
	public boolean getStart() {
		return start;
	}

	/**
	 * This method increases the car's speed by 3 miles per hour if the car's engine
	 * is on, the fuel level is at least 0.5, and the speed is less than 250. If the
	 * car is already at max speed, acceleration will not increase speed but decrese
	 * the fuel level.
	 * 
	 * @return True if the car was able to be accelerated, false otherwise.
	 */
	public boolean accelerate() {
		if (start == true && fuelLevel >= 0.5) {
			if (speed < 250) {
				speed += 4;
				fuelLevel -= 0.5;
				return true;
			} else {
				fuelLevel -= 0.5;
			}
		}
		return false;
	}

	/**
	 * This method decreases the car speed by 3 if the speed is at least 3. If the
	 * car's speed is less than 3, the speed is set to zero.
	 * 
	 * @return True if the car was able to be slowed, false otherwise.
	 */
	public boolean brake() {
		if (start == true) {
			if (speed >= 3) {
				speed -= 3;
				return true;
			} else if (speed > 0) {
				speed = 0;
				return true;
			}
		}
		return false;
	}

	/**
	 * This method returns true if the fuel level of the car is less than 0.5, false
	 * otherwise.
	 * 
	 * @return True if fuel level of the car is below 0, false otherwise.
	 */
	public boolean isGasTankEmpty() {
		return (fuelLevel < 0.5);
	}

	/**
	 * This method checks if two car objects have the same owner.
	 * 
	 * @param anotherCar The car to compare with.
	 * @return True if both car objects have the same owner, false otherwise.
	 */
	public boolean sameOwner(Car anotherCar) {
		return (this.owner.equals(anotherCar.owner));
	}

	/**
	 * This method compares two car objects based on their make, model, and year
	 * model.
	 * 
	 * @param anotherCar The car to compare with.
	 * @return True if both cars have the same make, model, and year model, false
	 *         otherwise.
	 */
	public boolean equals(Car anotherCar) {
		return (this.make.equals(anotherCar.make) && this.model.equals(anotherCar.model)
				&& this.yearModel == anotherCar.yearModel);
	}

	/**
	 * This method returns a String representation of a car object.
	 * 
	 * @return A String representation of a car object.
	 */
	public String toString() {
		return "Owner: " + owner + ", Make: " + make + ", Model: " + model + ", Year: " + yearModel + ", Speed: "
				+ speed + ", Fuel Level: " + fuelLevel;
	}
}
