import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * This program allows users to pick a color through a menu bar and displays the
 * color.
 * 
 * @author Karim R. Sammouri
 *
 */

public class ColorFrame extends JFrame implements ActionListener {

	private JMenuBar menuBar;
	private JMenu menuColors;
	private JMenuItem menuItemRed, menuItemGreen, menuItemBlue;
	private JPanel panel;

	/**
	 * Empty Constructor.
	 */
	public ColorFrame() {

		// Creating menu items and registering them to listen to events.
		menuItemRed = new JMenuItem("Red");
		menuItemRed.addActionListener(this);
		menuItemGreen = new JMenuItem("Green");
		menuItemGreen.addActionListener(this);
		menuItemBlue = new JMenuItem("Blue");
		menuItemBlue.addActionListener(this);

		// Creating menu and adding the menu items to it.
		menuColors = new JMenu("Colors");
		menuColors.add(menuItemRed);
		menuColors.add(menuItemGreen);
		menuColors.add(menuItemBlue);

		// Creating menu bar and adding the menu to it.
		menuBar = new JMenuBar();
		menuBar.add(menuColors);

		// Setting menu bar.
		setJMenuBar(menuBar);

		// Creating panel and adding it to the frame.
		panel = new JPanel();
		add(panel);
	}

	public static void main(String[] args) {

		// Creating window.
		ColorFrame cf = new ColorFrame();
		cf.setSize(300, 300);
		cf.setTitle("Color Frame");
		cf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Making it visible.
		cf.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Red"))
			panel.setBackground(Color.RED);
		if (e.getActionCommand().equals("Green"))
			panel.setBackground(Color.GREEN);
		if (e.getActionCommand().equals("Blue"))
			panel.setBackground(Color.BLUE);
	}
}
