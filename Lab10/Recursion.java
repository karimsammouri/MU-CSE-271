import java.util.Arrays;

/**
 * This class implements several recursive methods.
 * 
 * @author Karim R. Sammouri
 * 
 */
public class Recursion {

	/**
	 * This method computes and returns the factorial of a non-negative integer, n.
	 * 
	 * @param n A non-negative integer.
	 * @return The factorial of the non-negative integer.
	 */
	public static int factorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		return n * factorial(n - 1);
	}

	/**
	 * This method computes and returns the nth power of x.
	 * 
	 * @param x The base.
	 * @param n The power x is raised to.
	 * @return The nth power of x.
	 */
	public static int power(int x, int n) {
		if (n == 0)
			return 1;
		return x * power(x, n - 1);
	}

	/**
	 * This method computes and returns the sum of the digits in a positive integer.
	 * 
	 * @param n A positive integer.
	 * @return The sum of the digits in the positive integer.
	 */
	public static int sumDigits(int n) {
		if (n % 10 == n)
			return n;
		return sumDigits(n / 10) + n % 10;
	}

	/**
	 * This method prints a given string backwards.
	 * 
	 * @param word The string to be printed backwards.
	 */
	public static void printBackword(String word) {
		if (word.length() >= 1) {
			System.out.print(word.charAt(word.length() - 1));
			printBackword(word.substring(0, word.length() - 1));
		}
	}

	/**
	 * This method checks if a given string is a palindrome.
	 * 
	 * @param word The string to be checked.
	 * @return True if the given string is a palindrome and false otherwise.
	 */
	public static boolean isPalindrome(String word) {
		if (word.length() < 2)
			return true;
		return word.charAt(0) == word.charAt(word.length() - 1) && isPalindrome(word.substring(1, word.length() - 1));
	}

	/**
	 * This method computes and returns the sum of the positive integers in a given
	 * array.
	 * 
	 * @param array The array of integers.
	 * @return The sum of the positive integers in the array.
	 */
	public static int sumPositive(int[] array) {
		if (array.length == 0)
			return 0;
		if (array[array.length - 1] < 0)
			return sumPositive(Arrays.copyOfRange(array, 0, array.length - 1));
		return array[array.length - 1] + sumPositive(Arrays.copyOfRange(array, 0, array.length - 1));
	}

	/**
	 * This method computes and returns the maximum integer in a given array.
	 * 
	 * @param array The array of integers.
	 * @return The maximum integer in the array.
	 */
	public static int max(int[] array) {
		if (array.length == 1)
			return array[0];
		return Math.max(max(Arrays.copyOfRange(array, 0, array.length - 1)), array[array.length - 1]);
	}
}
