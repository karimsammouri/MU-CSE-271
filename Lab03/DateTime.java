/**
 * This class represents a time object and stores its relevant properties.
 * @author Karim R. Sammouri
 */
public class DateTime {

	// Declare variables or properties.
	int second;
	int minute;
	int hour;
	int day;
	String month;
	int year;

	/**
	 * It compares two DateTime objects based on second, minute, hour, day, month,
	 * and year.
	 * @param anotherDateTime A time to compare with.
	 * @return true if both DateTime objects have the same second, minute, hour,
	 *         day, month, and year. False, otherwise.
	 */
	public boolean equals(DateTime anotherDateTime) {
		return anotherDateTime.second == this.second && anotherDateTime.minute == this.minute
				&& anotherDateTime.hour == this.hour && anotherDateTime.day == this.day
				&& anotherDateTime.month.equals(this.month) && anotherDateTime.year == this.year;
	}

	/**
	 * It returns a string with the relevant time information.
	 * @return A String with relevant time information.
	 */
	public String toString() {
		return hour + ":" + minute + ":" + second + " " + day + " " + month + " " + year;
	}
}
