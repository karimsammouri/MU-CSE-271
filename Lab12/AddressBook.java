import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class implements a basic address book program.
 * 
 * @author Karim R. Sammouri
 *
 */
public class AddressBook {

	// Initializing global variables to be used.
	static ArrayList<Contact> contacts = new ArrayList<Contact>();
	static Scanner keyboard = new Scanner(System.in);
	static boolean programStart = true;
	static int choice = 0;

	public static void main(String[] args) {

		// Loading contacts from file.
		loadContacts();
		programStart = false;

		// Utilizing loop to keep replaying program unless user opts out.
		while (choice != 7) {

			// Displaying menu, prompting user for a choice, and storing the choice.
			System.out.println("Address Book Operations:");
			System.out.println("1) Add");
			System.out.println("2) Remove");
			System.out.println("3) Save");
			System.out.println("4) Load");
			System.out.println("5) Display All");
			System.out.println("6) Search");
			System.out.println("7) Exit");
			System.out.print("Select an option (number): ");
			choice = keyboard.nextInt();
			keyboard.nextLine();

			// Utilizing switch statement to control flow the program depending on the
			// user's given choice.
			switch (choice) {
			case 1:
				addContact();
				break;
			case 2:
				removeContact();
				break;
			case 3:
				saveContacts();
				break;
			case 4:
				loadContacts();
				break;
			case 5:
				displayContacts();
				break;
			case 6:
				searchContact();
				break;
			case 7:
				choice = 7;
				break;
			}
		}

		// Saving contacts to file and confirming program's termination to the user.
		saveContacts();
		System.out.println("The program has successfully terminated.");
	}

	/**
	 * This method adds a contact to the address book.
	 */
	public static void addContact() {
		Contact contact = new Contact();
		System.out.println("Enter Contact Information: ");
		System.out.print("First Name: ");
		contact.setFirstName(keyboard.nextLine());
		System.out.print("Last Name: ");
		contact.setLastName(keyboard.nextLine());
		System.out.print("Address: ");
		contact.setAddress(keyboard.nextLine());
		System.out.print("Email: ");
		contact.setEmail(keyboard.nextLine());
		System.out.print("Phone Number: ");
		contact.setPhoneNumber(keyboard.nextLine());
		contacts.add(contact);
		System.out.println("Done: the contact has been added.");
		System.out.println();
	}

	/**
	 * This method removes a contact from the address book.
	 */
	public static void removeContact() {
		int index = -1;
		System.out.print("Enter Contact Phone Number: ");
		String phoneNumber = keyboard.next();

		for (int i = 0; i < contacts.size(); i++)
			if (contacts.get(i).getPhoneNumber().equals(phoneNumber))
				index = i;

		if (index == -1)
			System.out.println("Error: there is no contact with that phone number.");
		else {
			contacts.remove(index);
			System.out.println("Done: the contact with that phone number has been removed.");
		}
		System.out.println();
	}

	/**
	 * This method saves the contacts to file.
	 */
	public static void saveContacts() {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("addressbook.dat"));
			out.writeObject(contacts);
			out.close();
			System.out.println("Your address book has successfully been saved.");
		} catch (Exception e) {
			System.out.println("Error: your address book could not be saved.");
		}
		if (choice != 7)
			System.out.println();
	}

	/**
	 * This method loads the contacts from file.
	 */
	public static void loadContacts() {
		try {
			File file = new File("addressbook.dat");
			if (file.exists() && file.length() != 0) {
				ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
				contacts = (ArrayList<Contact>) in.readObject();
				in.close();
				if (programStart == false) {
					System.out.println("Your address book have successfully been loaded.");
					System.out.println();
				}
			} else {
				file.createNewFile();
			}
		} catch (Exception e) {
			System.out.println("Error: your address book could not be loaded.");
			System.out.println();
		}
	}

	/**
	 * This method displays all the contacts in the address book.
	 */
	public static void displayContacts() {
		for (Contact x : contacts)
			System.out.println(x);
		if (contacts.size() == 0)
			System.out.println("The address book is empty.");
		System.out.println();
	}

	/**
	 * This method searches for a specific contact based on a keyword given by the
	 * user and then displays the contact.
	 */
	public static void searchContact() {
		System.out.print("Enter contact keyword: ");
		String keyword = keyboard.nextLine();
		boolean found = false;
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getFirstName().contains(keyword) || contacts.get(i).getFirstName().contains(keyword)
					|| contacts.get(i).getLastName().contains(keyword)
					|| contacts.get(i).getPhoneNumber().contains(keyword)
					|| contacts.get(i).getEmail().contains(keyword) || contacts.get(i).getAddress().contains(keyword)) {
				System.out.println(contacts.get(i));
				found = true;
			}
		}
		if (found == false)
			System.out.println("Error: no contact in your address book contains the given keyword.");
		System.out.println();
	}
}
