import java.util.*;
import java.io.*;

/**
 * Lab Assignment 02 Solution 
 * CSE 271 - G: Object-Oriented Programming with Prof. Md Osman Gani, Spring 2020 
 * Department of Computer Science and Software Engineering, Miami University, Oxford, OH
 * @author Karim R. Sammouri, class of 2023 
 * Date: 02/03/2020
 * This program produces an output file with statistical analysis of N random numbers 
 * given by user input on the console.
 */

public class FileIO {

	public static void main(String[] args) {

		// Create a scanner class object.
		Scanner keyboard = new Scanner(System.in);

		// Prompt user for an integer, N.
		System.out.print("Enter an integer, N: ");
		int N = keyboard.nextInt();

		PrintWriter fileWriter = null;
		Random rnd = new Random();

		// Implementing Try-Catch-Finally block to handle exception.
		try {
			// Open the file for writing.
			fileWriter = new PrintWriter("numbers.txt");
			// Write N integers to the file.
			for (int i = 0; i < N; i++) {
				fileWriter.println(rnd.nextInt(100) + 1);
			}
		} catch (Exception ex) {
			System.out.println(
					"There was an error in opening or writing the file.");

		} finally {
			// Closing file if opened.
			if (fileWriter != null)
				fileWriter.close();
		}

		// Initializing array of length N.
		int[] arr = new int[N];

		// Create a scanner class object.
		Scanner fileInput = null;

		// Create a File object.
		File file = new File("numbers.txt");

		// Implementing Try-Catch-Finally block to handle exception.
		try {
			fileInput = new Scanner(file);
			int i = 0;
			// Scanning file and storing integers into an array.
			while (fileInput.hasNextLine()) {
				arr[i] = Integer.parseInt(fileInput.nextLine());
				i++;
			}
		} catch (Exception ex) {
			System.out.println("There was an error in reading the file.");
		} finally {
			if (fileInput != null)
				fileInput.close();
		}

		// Initializing several variables to be used.
		PrintWriter fileWriter2 = null;
		int oddCount = 0, evenCount = 0;
		double meanSum = 0;

		// Implementing Try-Catch-Finally block to handle exception.
		try {
			// Writing array data into another file.
			fileWriter2 = new PrintWriter("output.txt");
			fileWriter2.println("Numbers:");
			fileWriter2.println(Arrays.toString(arr));
			fileWriter2.println("Sorted Numbers:");
			Arrays.sort(arr);
			fileWriter2.println(Arrays.toString(arr));
			fileWriter2.println();

			// Utilizing enhanced for-loop to traverse array and generate
			// analytical data.
			for (int element : arr) {
				if (element % 2 == 0) {
					evenCount++;
				} else {
					oddCount++;
				}
				meanSum += element;
			}

			// Printing statistics to the file.
			fileWriter2.println("Number of odd numbers: " + oddCount);
			fileWriter2.println("Number of even numbers: " + evenCount);
			fileWriter2.println("Smallest number: " + arr[0]);
			fileWriter2.println("Largest number: " + arr[arr.length - 1]);
			fileWriter2.println("Mean: " + (meanSum / N));
		} catch (Exception ex) {
			System.out.println(
					"There was an error in opening or writing the file.");
		} finally {
			if (fileWriter2 != null)
				fileWriter2.close();
		}
	}
}
