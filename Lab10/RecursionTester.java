import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This class tests the Recursion class.
 * 
 * @author Karim R. Sammouri
 *
 */
public class RecursionTester {

	// Testing factorial() method.
	@Test
	public void testFactorial() {
		assertEquals(1, Recursion.factorial(0));
		assertEquals(1, Recursion.factorial(1));
		assertEquals(6, Recursion.factorial(3));
		assertEquals(120, Recursion.factorial(5));
		assertEquals(3628800, Recursion.factorial(10));
	}

	// Testing power() method.
	@Test
	public void testPower() {
		assertEquals(1, Recursion.power(0, 0));
		assertEquals(1, Recursion.power(1, 0));
		assertEquals(1, Recursion.power(2, 0));
		assertEquals(0, Recursion.power(0, 1));
		assertEquals(2, Recursion.power(2, 1));
		assertEquals(-2, Recursion.power(-2, 1));
		assertEquals(4, Recursion.power(-2, 2));
		assertEquals(1, Recursion.power(-8, 0));
		assertEquals(8, Recursion.power(2, 3));
		assertEquals(9, Recursion.power(3, 2));
		assertEquals(1, Recursion.power(100, 0));
	}

	// Testing sumDigits() method.
	@Test
	public void testSumDigits() {
		assertEquals(0, Recursion.sumDigits(0));
		assertEquals(1, Recursion.sumDigits(100));
		assertEquals(5, Recursion.sumDigits(11111));
		assertEquals(6, Recursion.sumDigits(123));
		assertEquals(9, Recursion.sumDigits(324));
		assertEquals(9, Recursion.sumDigits(30024));
		assertEquals(8, Recursion.sumDigits(1025));
		assertEquals(8, Recursion.sumDigits(10250000));
	}

	// Testing printBackword() method.
	@Test
	public void testPrintBackword() {
		System.out.println("Testing printBackword():");
		Recursion.printBackword("a");
		System.out.println();
		Recursion.printBackword("ab");
		System.out.println();
		Recursion.printBackword("abba");
		System.out.println();
		Recursion.printBackword("Hello");
		System.out.println();
		Recursion.printBackword("olleH");
		System.out.println();
		Recursion.printBackword("racecar");
		System.out.println();
		Recursion.printBackword("");
	}

	// Testing isPalindrome() method.
	@Test
	public void testIsPalindrome() {
		assertEquals(true, Recursion.isPalindrome(""));
		assertEquals(true, Recursion.isPalindrome("a"));
		assertEquals(true, Recursion.isPalindrome("aa"));
		assertEquals(false, Recursion.isPalindrome("ap"));
		assertEquals(true, Recursion.isPalindrome("lol"));
		assertEquals(true, Recursion.isPalindrome("racecar"));
		assertEquals(false, Recursion.isPalindrome("racecars"));
	}

	// Testing sumPositive() method.
	@Test
	public void testSumPositive() {
		int[] array1 = {};
		int[] array2 = { 0 };
		int[] array3 = { 3 };
		int[] array4 = { 1, 2 };
		int[] array5 = { 0, 0, 0 };
		int[] array6 = { 1, -2, 17 };
		int[] array7 = { 6, 5, 10, -9 };
		int[] array8 = { -2, 5, 10, 100 };
		assertEquals(0, Recursion.sumPositive(array1));
		assertEquals(0, Recursion.sumPositive(array2));
		assertEquals(3, Recursion.sumPositive(array3));
		assertEquals(3, Recursion.sumPositive(array4));
		assertEquals(0, Recursion.sumPositive(array5));
		assertEquals(18, Recursion.sumPositive(array6));
		assertEquals(21, Recursion.sumPositive(array7));
		assertEquals(115, Recursion.sumPositive(array8));
	}

	// Testing max() method.
	@Test
	public void testMax() {
		int[] array1 = { 0 };
		int[] array2 = { 3 };
		int[] array3 = { 1, 2 };
		int[] array4 = { 0, 0, 0 };
		int[] array5 = { 1, -2, 17 };
		int[] array6 = { 6, 5, 10, -9 };
		int[] array7 = { 100, -2, 5, 10 };
		assertEquals(0, Recursion.max(array1));
		assertEquals(3, Recursion.max(array2));
		assertEquals(2, Recursion.max(array3));
		assertEquals(0, Recursion.max(array4));
		assertEquals(17, Recursion.max(array5));
		assertEquals(10, Recursion.max(array6));
		assertEquals(100, Recursion.max(array7));
	}
}
