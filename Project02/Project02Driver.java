
/**
 * Project 2, CSE 271-G with Prof. Md Osman Gani, Miami University
 * @author Karim R. Sammouri
 */

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;

public class Project02Driver {

	/**
	 * This method will read a list of account information from a file and return an
	 * array of the accounts.
	 * 
	 * @param fileName The name of the file.
	 * @return An array of accounts.
	 */
	public static Account[] readAccountsFromFile(String fileName) {
		File file = new File(fileName);
		Scanner fileInput = null;
		try {
			fileInput = new Scanner(file);
			if (fileInput.hasNext()) {
				Account[] arrayOfAccounts = new Account[10];
				int i;
				for (i = 0; i < 10; i++) {
					String[] array = fileInput.nextLine().split(", ");

					int streetNumber = Integer.parseInt(array[3].substring(0, array[3].indexOf(" ")));
					String streetName = array[3].substring(array[3].indexOf(" ") + 1);

					arrayOfAccounts[i] = new Account(new Customer(array[2],
							new Address(streetNumber, streetName, array[4], array[5], array[6]), array[7]),
							Double.parseDouble(array[8]));
				}
				return arrayOfAccounts;
			}
			return null;
		} catch (Exception ex) {
			System.out.println("There was an error in reading the file");
			return null;
		} finally {
			if (fileInput != null)
				fileInput.close();
		}
	}

	/**
	 * This method will write a list of account information into a file from a
	 * user-given array of accounts.
	 * 
	 * @param accounts An array of accounts.
	 * @param fileName The name of the output file.
	 * @return True if the file was successfully written and false otherwise.
	 */
	public static boolean writeAccountstoFile(Account[] accounts, String fileName) {
		PrintWriter fileWriter = null;
		try {
			fileWriter = new PrintWriter(fileName);
			for (int i = 0; i < accounts.length; i++) {
				fileWriter.println(accounts[i].toString());
			}
			return true;
		} catch (Exception ex) {
			System.out.println("There was an error in opening or writing to the file");
			return false;
		} finally {
			if (fileWriter != null)
				fileWriter.close();
		}
	}

	public static void main(String[] args) {
		// Testing the readAccountsFromFile() method by using a pre-made file
		// and checking whether the elements of the Account array it returns
		// correctly encapsulates the data in the file (as shown in the console).
		System.out.println("Testing readAccountsFromFile():");
		Account[] arrayOfAccounts = readAccountsFromFile("accounts.txt");
		for (Account element : arrayOfAccounts) {
			System.out.println(element);
		}
		// Testing the writeAccountstoFile() by using the array returned by the above
		// method and checking if it prints the list of account information properly
		// to another file.
		System.out.println("Testing writeAccountstoFile():");
		System.out.println(writeAccountstoFile(arrayOfAccounts, "output.txt"));
	}
}
