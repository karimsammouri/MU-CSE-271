/*
 * This program performs grade statistical analysis given the grades 
 * of an entered number of students of the user's choosing.
 */

import java.util.Arrays;
import java.util.Scanner;

public class GradeStatistics {

	public static void main(String[] args) {
		// 1.
		double[] grades = populateGrades();

		// 2.
		System.out.print("The grades are: ");
		printGrades(grades);

		// 3.
		sortGrades(grades);

		// 4.
		System.out.print("\nThe sorted grades are: ");
		printGrades(grades);

		// 5.
		System.out.print("\nMean = " + getMean(grades));

		// 6.
		System.out.print("\nMedian = " + getMedian(grades));

		// 7.
		double[] minMax = getMinMax(grades);
		System.out.print("\nMin = " + minMax[0] + " Max = " + minMax[1]);

	}

	public static double[] populateGrades() {
		// Create a Scanner class object.
		Scanner keyboard = new Scanner(System.in);

		// Prompt user for number of students.
		System.out.print("How many students do you have in the class: ");
		int numberOfStudents = keyboard.nextInt();

		// Create an array.
		double[] grades = new double[numberOfStudents];

		// Take grades input for all students.
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.print("Enter grade of Student " + (i + 1) + ": ");
			grades[i] = keyboard.nextDouble();
		}
		// Return the array.
		return grades;
	}

	public static void sortGrades(double grades[]) {
		// Sort the array.
		Arrays.sort(grades);
	}

	public static double getMean(double grades[]) {
		double sum = 0;

		for (int i = 0; i < grades.length; i++)
			sum += grades[i];

		return sum / grades.length;
	}

	public static double getMedian(double grades[]) {
		// Return the median.
		if (grades.length % 2 == 1)
			return grades[grades.length / 2];
		else
			return (grades[grades.length / 2] + grades[grades.length / 2 - 1])
					/ 2;
	}

	public static double[] getMinMax(double grades[]) {
		// Given a sorted array, return an array with the minimum and maximum
		// grades.
		double[] minMax = new double[2];

		minMax[0] = grades[0];
		minMax[1] = grades[grades.length - 1];

		return minMax;
	}

	public static void printGrades(double grades[]) {
		// Print n - 1 grades with commas and spaces.
		for (int i = 0; i < grades.length - 1; i++) {
			System.out.print(grades[i] + ", ");
		}
		// Print the last grade.
		System.out.print(grades[grades.length - 1]);
	}

}
