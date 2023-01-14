import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JComponent;

/**
 * This class defines a checker board tile and stores its properties.
 * 
 * @author Karim R. Sammouri
 *
 */
public class CheckerPiece extends JComponent {

	// Declaring variables or properties.
	private char status;
	private int row, column;
	private final int checkerSideLength = 40, tileSideLength = 60;

	/**
	 * Parameterized constructor.
	 * 
	 * @param row    The row index of the checker board tile.
	 * @param column The column index of the checker board tile.
	 * @param status The status of the board tile: 'b' if it contains a black
	 *               checker piece, 'r' if it contains a red checker piece, and 'e'
	 *               if empty.
	 * @throws IllegalCheckerboardArgumentException if the value of the row, column,
	 *                                              or status of the board tile is
	 *                                              invalid.
	 */
	public CheckerPiece(int row, int column, char status) throws IllegalCheckerboardArgumentException {
		if (row >= 0 && row <= 7 && column >= 0 && column <= 7) {
			if (status != 'e')
				if (row % 2 == 0 && column % 2 == 0 || row % 2 == 1 && column % 2 == 1)
					throw new IllegalCheckerboardArgumentException();
			this.row = row;
			this.column = column;
		} else
			throw new IllegalCheckerboardArgumentException();

		if (status == 'e' || status == 'b' || status == 'r')
			this.status = status;
		else
			throw new IllegalCheckerboardArgumentException();
	}

	/**
	 * This overridden method draws a checker tile with or without a checker piece
	 * based on the value of status.
	 * 
	 * @param g Graphics object that allows us to draw on JComponent.
	 */
	public void paintComponent(Graphics g) {
		if (row % 2 == 0 && column % 2 == 0 || row % 2 == 1 && column % 2 == 1) {
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, tileSideLength, tileSideLength);
			g.setColor(Color.BLACK);
			g.drawRect(0, 0, tileSideLength, tileSideLength);
		} else {
			g.setColor(Color.GREEN);
			g.fillRect(0, 0, tileSideLength, tileSideLength);
			g.setColor(Color.BLACK);
			g.drawRect(0, 0, tileSideLength, tileSideLength);
			if (status == 'b') {
				g.setColor(Color.BLACK);
				g.fillOval(10, 10, checkerSideLength, checkerSideLength);
			}
			if (status == 'r') {
				g.setColor(Color.RED);
				g.fillOval(10, 10, checkerSideLength, checkerSideLength);
			}
		}
	}
}
