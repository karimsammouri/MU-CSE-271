/**
 * This class represents a car object and stores relevant properties of a car.
 * @author Karim R. Sammouri
 */
public class Car {

	// Declare variables or properties.
	int yearModel;
	String make;
	int numberOfWheels;
	int speed;
	double fuelLevel;

	/**
	 * If there is enough fuel, this method increments the car's speed by 4 miles
	 * per hour and decreases the fuel level by 0.5. If the speed is at a max, this
	 * method just decreases the fuel instead.
	 */
	public void accelerate() {
		if (fuelLevel >= 0.5) {
			if (speed < 200) {
				speed += 4;
				fuelLevel -= 0.5;
			} else
				fuelLevel -= 0.5;
		}
	}

	/**
	 * If the speed is at least 3 miles per hour, this method decrements the car's
	 * speed by 3 miles per hour. If less, this method reduces the speed to 0 miles
	 * per hour.
	 */
	public void brake() {
		if (speed >= 3)
			speed -= 3;
		else
			speed = 0;
	}

	/**
	 * It compares two Car objects based on number of wheels, make, and model.
	 * @param c A car to compare with.
	 * @return true if both Car objects have the same number of wheels, make, and
	 *         model. False, otherwise.
	 */
	public boolean equals(Car c) {
		return c.numberOfWheels == this.numberOfWheels && c.make.equals(this.make) && c.yearModel == this.yearModel;
	}

	/**
	 * It returns a string with the relevant car information.
	 * @return A String with relevant car information.
	 */
	public String toString() {
		return "Make: " + make + ", Year: " + yearModel + ", Wheels: " + numberOfWheels + ", Speed: " + speed
				+ ", Fuel Level: " + fuelLevel;
	}
}
