import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * This class implements a simple address book program.
 * 
 * @author Karim R. Sammouri
 *
 */
public class AddressBook extends JFrame implements ActionListener {

	private JLabel nameLabel, addressLabel, phoneLabel, emailLabel;
	private JTextField nameField, addressField, phoneField, emailField;
	private JButton addContactButton, saveFileButton;
	private JTextArea contactsTextArea;
	private JPanel panel;

	/**
	 * Empty constructor.
	 */
	public AddressBook() {
		// Initializing all components.
		nameLabel = new JLabel("Name:   ");
		nameField = new JTextField(50);
		addressLabel = new JLabel("Address:");
		addressField = new JTextField(50);
		phoneLabel = new JLabel("Phone:   ");
		phoneField = new JTextField(50);
		emailLabel = new JLabel("Email:    ");
		emailField = new JTextField(50);
		contactsTextArea = new JTextArea(20, 50);

		// Creating and registering buttons to listen to events.
		addContactButton = new JButton("Add Contact");
		addContactButton.addActionListener(this);
		saveFileButton = new JButton("Save to File");
		saveFileButton.addActionListener(this);

		// Adding components to the panel.
		panel = new JPanel();
		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(addressLabel);
		panel.add(addressField);
		panel.add(phoneLabel);
		panel.add(phoneField);
		panel.add(emailLabel);
		panel.add(emailField);
		panel.add(addContactButton);
		panel.add(saveFileButton);
		panel.add(contactsTextArea);

		// Adding panel to the JFrame.
		add(panel);

		// Retrieving stored contact information from file if it exists and 
		//displaying it in the program though the JTextArea class.
		readContactsFromFile();
	}

	/**
	 * This method reads all the contacts from the file named "contacts.txt" 
	 * if it exists and displays them in the JTextArea through the 
	 * setText(String text) method.
	 */
	public void readContactsFromFile() {
		File file = new File("contacts.txt");
		Scanner fileInput = null;
		String contacts = "";
		int counter = 0;
		try {
			fileInput = new Scanner(file);
			while (fileInput.hasNextLine()) {
				if (counter == 0) {
					contacts += fileInput.nextLine();
					counter++;
				} else
					contacts += "\n" + fileInput.nextLine();
			}
			contactsTextArea.setText(contacts);
		} catch (Exception ex) {
			System.out.println(
					"There was an eror in retrieving the contacts or there "
					+ "was no such information to begin with.");
		} finally {
			if (fileInput != null)
				fileInput.close();
		}
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getActionCommand().equals("Add Contact")) {
			String contact = nameField.getText() + ", " + addressField.getText() + 
					", " + phoneField.getText() + ", " + emailField.getText() 
					+ "\n";
			contactsTextArea.append(contact);
		} else if (event.getActionCommand().equals("Save to File")) {
			writeContactsToFile();
		}
	}
	
	/**
	 * This method gets the text from the JTextArea and writes to the file 
	 * named "contacts.txt".
	 */
	public void writeContactsToFile() {
		PrintWriter fileWriter = null;
		try {
			fileWriter = new PrintWriter("contacts.txt");
			fileWriter.println(contactsTextArea.getText());
		} catch (Exception ex) {
			System.out.println("There was an eror in saving the contacts.");
		} finally {
			if (fileWriter != null)
				fileWriter.close();
		}
	}

	public static void main(String[] args) {
		AddressBook ab = new AddressBook();
		ab.setSize(700, 550);
		ab.setTitle("Address Book Application");
		ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ab.setVisible(true);
	}
}
