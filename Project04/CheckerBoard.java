import java.awt.GridLayout;

import javax.swing.JPanel;

/**
 * This class defines a checker board and stores its properties.
 * 
 * @author Karim R. Sammouri
 *
 */
public class CheckerBoard extends JPanel {

	// Declaring variables or properties.
	protected static char[][] boardStatus;

	/**
	 * Parameterized Constructor.
	 * 
	 * @param boardStatus A two-dimensional character array that stores the status
	 *                    value for each board tile: 'b' if it contains a black
	 *                    checker piece, 'r' if it contains a red checker piece, and
	 *                    'e' if empty.
	 */
	public CheckerBoard(char[][] boardStatus) {
		this.boardStatus = boardStatus;
		setLayout(new GridLayout(8, 8));
		for (int row = 0; row < 8; row++) {
			for (int column = 0; column < 8; column++) {
				try {
					add(new CheckerPiece(row, column, boardStatus[row][column]));
				} catch (IllegalCheckerboardArgumentException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * This mutator method sets the board status of the checker board.
	 * 
	 * @param boardStatus A two-dimensional character array that stores the status
	 *                    value for each board tile: 'b' if it contains a black
	 *                    checker piece, 'r' if it contains a red checker piece, and
	 *                    'e' if empty.
	 */
	public void setBoardStatus(char[][] boardStatus) {
		this.boardStatus = boardStatus;
		repaint();
	}

	/**
	 * This mutator method sets the status value of a board tile of a given row and
	 * column.
	 * 
	 * @param row    The row index of the board tile.
	 * @param column The column index of the board tile.
	 * @param status The target status of the board tile.
	 */
	public void setCheckerPiece(int row, int column, char status) {
		boardStatus[row][column] = status;
		remove(row * 8 + column);
		revalidate();
		try {
			add(new CheckerPiece(row, column, boardStatus[row][column]), row * 8 + column);
			repaint();
		} catch (IllegalCheckerboardArgumentException e) {
			e.printStackTrace();
		}
	}
}
