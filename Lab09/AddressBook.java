import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/**
 * This class implements a simple non-functional address book program.
 * 
 * @author Karim R. Sammouri
 *
 */
public class AddressBook extends JFrame {

	private JLabel nameLabel, addressLabel, phoneLabel, emailLabel;
	private JTextField nameField, addressField, phoneField, emailField;
	private JButton addContactButton, saveFileButton;
	private JTextArea contactsTextArea;
	private JPanel panel1, panel2, panel3;

	/**
	 * Empty Constructor.
	 */
	public AddressBook() {

		// Initializing all components.
		nameLabel = new JLabel("Name:");
		nameField = new JTextField();
		addressLabel = new JLabel("Address:");
		addressField = new JTextField();
		phoneLabel = new JLabel("Phone:");
		phoneField = new JTextField();
		emailLabel = new JLabel("Email:");
		emailField = new JTextField();
		addContactButton = new JButton("Add Contact");
		saveFileButton = new JButton("Save to File");
		contactsTextArea = new JTextArea(15, 40);

		// Initializing first panel, setting titled border and layout, and adding
		// components to the panel.
		panel1 = new JPanel();
		panel1.setBorder(new TitledBorder("Enter New Contact Information"));
		panel1.setLayout(new GridLayout(4, 2));
		panel1.add(nameLabel, 0);
		panel1.add(nameField, 1);
		panel1.add(addressLabel, 2);
		panel1.add(addressField, 3);
		panel1.add(phoneLabel, 4);
		panel1.add(phoneField, 5);
		panel1.add(emailLabel, 6);
		panel1.add(emailField, 7);

		// Initializing second panel, setting titled border and layout, and adding
		// components to the panel.
		panel2 = new JPanel();
		panel2.setBorder(new TitledBorder("Add New Contact or Save to File"));
		panel2.setLayout(new FlowLayout());
		panel2.add(addContactButton);
		panel2.add(saveFileButton);

		// Initializing third panel, setting titled border, and adding component to the
		// panel.
		panel3 = new JPanel();
		panel3.setBorder(new TitledBorder("Saved Contacts"));
		panel3.add(contactsTextArea);

		// Setting layout of the frame and adding the panels to the frame.
		Container window = getContentPane();
		window.setLayout(new BorderLayout());
		window.add(panel1, BorderLayout.NORTH);
		window.add(panel2, BorderLayout.CENTER);
		window.add(panel3, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {

		// Creating window.
		AddressBook ab = new AddressBook();
		ab.setSize(600, 490);
		ab.setTitle("Address Book Application");
		ab.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Making window visible.
		ab.setVisible(true);
	}
}
