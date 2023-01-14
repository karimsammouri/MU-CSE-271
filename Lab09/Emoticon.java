import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 * This program draws four emoticons side by side on a JComponent using Java
 * graphics.
 * 
 * @author Karim R. Sammouri
 */

public class Emoticon extends JComponent {

	/**
	 * This overriden method draws on the JComponent.
	 * @param g Graphics object that allows us to draw on JComponent.
	 */
	public void paint(Graphics g) {

		// Painting faces.
		g.setColor(Color.YELLOW);
		g.fillOval(100, 100, 300, 300);
		g.fillOval(500, 100, 300, 300);
		g.fillOval(900, 100, 300, 300);
		g.fillOval(1300, 100, 300, 300);

		// Painting eyes.
		g.setColor(Color.BLUE);
		g.fillOval(170, 150, 50, 50);
		g.fillOval(280, 150, 50, 50);
		g.fillOval(570, 150, 50, 50);
		g.fillOval(680, 150, 50, 50);
		g.fillOval(970, 150, 50, 50);
		g.fillOval(1080, 150, 50, 50);
		g.fillOval(1370, 150, 50, 50);
		g.drawLine(1480, 175, 1530, 175);

		// Painting mouths.
		g.setColor(Color.RED);
		g.drawArc(170, 210, 150, 100, 0, -180);
		g.drawArc(570, 260, 150, 100, 0, 180);
		g.drawOval(1025, 260, 50, 50);
		g.drawArc(1370, 210, 150, 100, 0, -180);
	}

	public static void main(String[] args) {

		// Creating window.
		JFrame window = new JFrame();
		window.setSize(1800, 600);
		window.setTitle("Emoticons");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Adding a drawable component.
		Emoticon drawingBoard = new Emoticon();
		window.add(drawingBoard);

		// Making it visible.
		window.setVisible(true);
	}
}
