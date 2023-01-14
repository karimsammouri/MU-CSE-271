
/**
 * Project 01 of CSE 271 - G with Prof. Md Osman Gani
 * This class reads words from a text file, parses those words in 3 distinct ways 
 * based on user choice, and writes those words to a new file.
 * Date: 02/17/2020
 * 
 * @author Karim R. Sammouri, class of 2023
 */

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileParser {

	public static void main(String[] args) {

		// Initializes the scanner object, prompts user for the input file, and
		// stores the response.
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter input filename: ");
		File inputFile = new File(keyboard.next());

		// If the input file exits, prompts the user for a parsing style and
		// stores the response.
		// Prints a "File does not exist" message otherwise.
		if (inputFile.exists()) {
			System.out.println("Found. What do you want to output?");
			System.out.println("1. Raw word list");
			System.out.println("2. Palindromes");
			System.out.println("3. $100 words");
			System.out.print("Choose: ");
			int response = keyboard.nextInt();

			if (response >= 1 && response <= 3) {

				// Prompts the user for an output file and stores the response.
				System.out.print("Enter output file name: ");
				File outputFile = new File(keyboard.next());

				// Decides which method to invoke based on the user's response.
				// Prints a "File does not exist" message if an invalid response
				// is stored.
				switch (response) {
					case 1 :
						parse(inputFile, outputFile);
						break;
					case 2 :
						parsePalindrome(inputFile, outputFile);
						break;
					case 3 :
						parseHundredDollarWord(inputFile, outputFile);
						break;
				}
			} else
				System.out.println("Invalid input. Goodbye.");

		} else
			System.out.println("File does not exist. Goodbye.");
		keyboard.close();
	}

	/**
	 * This method takes a string and removes all non-letters, returning an all
	 * uppercase version.
	 * 
	 * @param word
	 *            The word to be cleaned.
	 * @return The cleaned word.
	 */
	public static String clean(String word) {
		String cleanWord = "";
		for (int i = 0; i < word.length(); i++)
			if (Character.isLetter(word.charAt(i)))
				cleanWord += word.charAt(i);
		return cleanWord.toUpperCase();
	}

	/**
	 * This method parses an input file, writing each word from the input on a
	 * separate line in the output file.
	 * 
	 * @param in
	 *            The input file.
	 * @param out
	 *            The output file.
	 */
	public static void parse(File in, File out) {
		Scanner inputFile = null;
		PrintWriter outputFile = null;
		try {
			inputFile = new Scanner(in);
			outputFile = new PrintWriter(out);
			while (inputFile.hasNext())
				outputFile.println(inputFile.next());
			System.out.println("Finished printing raw word list.");
		} catch (Exception ex) {
			System.out.println(
					"There was a problem in reading the input file or printing to the output file.");
		} finally {
			inputFile.close();
			outputFile.close();
		}
	}

	/**
	 * This method determines if a word is a palindrome.
	 * 
	 * @param word
	 *            The word to be tested.
	 * @return True if the word is a palindrome, false otherwise.
	 */
	public static boolean isPalindrome(String word) {
		for (int i = 0; i < word.length() / 2; i++)
			if (Character.toLowerCase(word.charAt(i)) != Character
					.toLowerCase(word.charAt(word.length() - 1 - i)))
				return false;
		return true;
	}

	/**
	 * This method parses an input file, writing only the palindromes to the
	 * output file.
	 * 
	 * @param in
	 *            The input file.
	 * @param out
	 *            The output file.
	 */
	public static void parsePalindrome(File in, File out) {
		Scanner inputFile = null;
		PrintWriter outputFile = null;
		ArrayList<String> arr = new ArrayList<String>();
		String cleanWord;
		try {
			inputFile = new Scanner(in);
			outputFile = new PrintWriter(out);
			while (inputFile.hasNext()) {
				cleanWord = clean(inputFile.next());
				if (isPalindrome(cleanWord) && !arr.contains(cleanWord))
					arr.add(cleanWord);
			}
			Collections.sort(arr);
			for (int i = 0; i < arr.size(); i++)
				outputFile.println(arr.get(i));
			System.out.println("Finished printing palindromes.");
		} catch (Exception ex) {
			System.out.println(
					"There was a problem in reading the input file or printing to the output file.");
		} finally {
			inputFile.close();
			outputFile.close();
		}
	}

	/**
	 * This method returns the monetary value of a word, found by assigning the
	 * value $1 to A, $2 to B and so on.
	 * 
	 * @param word
	 *            The word to be tested.
	 * @return The monetary value of the word.
	 */
	public static int value(String word) {
		int value = 0;
		String cleanWord = clean(word);
		for (int i = 0; i < cleanWord.length(); i++)
			value += cleanWord.charAt(i) - 'A' + 1;
		return value;
	}

	/**
	 * This method parses an input file, writing only the $100 words to the
	 * output file.
	 * 
	 * @param in
	 *            The input file.
	 * @param out
	 *            The output file.
	 */
	public static void parseHundredDollarWord(File in, File out) {
		Scanner inputFile = null;
		PrintWriter outputFile = null;
		ArrayList<String> arr = new ArrayList<String>();
		String cleanWord;
		try {
			inputFile = new Scanner(in);
			outputFile = new PrintWriter(out);
			while (inputFile.hasNext()) {
				cleanWord = clean(inputFile.next());
				if (value(cleanWord) == 100 && !arr.contains(cleanWord))
					arr.add(cleanWord);
			}
			Collections.sort(arr);
			for (int i = 0; i < arr.size(); i++) {
				outputFile.println(arr.get(i));
			}
			System.out.println("Finished printing $100 words.");
		} catch (Exception ex) {
			System.out.println(
					"There was a problem in reading the input file or printing to the output file.");
		} finally {
			inputFile.close();
			outputFile.close();
		}
	}
}
