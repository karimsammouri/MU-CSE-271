/**
 * Given tester class for DateTime class
 * @author Md Osman Gani
 * Date: 02/09/2020
 */

public class DateTimeDriver{
	public static void main (String [] args){
		// Create two objects and initialize using constructors
		DateTime dateTime1, dateTime2;
		dateTime1 = new DateTime();
		dateTime2 = new DateTime();
		
		// Assign value to the instance variables
		dateTime1.hour = 12;
		dateTime1.minute = 21;
		dateTime1.second = 59;
		dateTime1.day = 25;
		dateTime1.month = "January";
		dateTime1.year = 2020;

		dateTime2.hour = 12;
		dateTime2.minute = 43;
		dateTime2.second = 59;
		dateTime2.day = 25;
		dateTime2.month = "January";
		dateTime2.year = 2009;
		
		// Print the information using toString method
		System.out.println("DateTime 1: " + dateTime1.toString());
		System.out.println("DateTime 2: " + dateTime2.toString());
		
		// Test equality
		if(dateTime1.equals(dateTime2) == true){
			System.out.println("Two DateTime objects are equal");
		}
		else{
		 	System.out.println("Two DateTime objects are not equal");
		}
		
		System.out.println();
		
		// change dateTime2 year
		dateTime2.year = 2020;
		
		System.out.println("DateTime 1: " + dateTime1.toString());
		System.out.println("DateTime 2: " + dateTime2.toString());

		// Test equality again
		if(dateTime1.equals(dateTime2) == true){
			System.out.println("Two DateTime objects are equal");
		}
		else {
			System.out.println("Two DateTime objects are not equal");
		}

		System.out.println();
		// change dateTime1 minute
		dateTime1.minute = 43;
		
		System.out.println("DateTime 1: " + dateTime1.toString());
		System.out.println("DateTime 2: " + dateTime2.toString());

		// Test equality again
		if(dateTime1.equals(dateTime2) == true){
			System.out.println("Two DateTime objects are equal");
		}
		else {
			System.out.println("Two DateTime objects are not equal");
		}
	}
}

