import java.awt.BorderLayout;
import java.awt.Container;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * This class implements a simple checker game.
 * 
 * @author Karim R. Sammouri
 *
 */
public class CheckerGame extends JFrame implements ActionListener, MouseListener, MouseMotionListener {

	// Declaring variables or properties.
	private char[][] boardStatus = new char[][] { { 'e', 'b', 'e', 'b', 'e', 'b', 'e', 'b' },
			{ 'b', 'e', 'b', 'e', 'b', 'e', 'b', 'e' }, { 'e', 'b', 'e', 'b', 'e', 'b', 'e', 'b' },
			{ 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e' }, { 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e' },
			{ 'r', 'e', 'r', 'e', 'r', 'e', 'r', 'e' }, { 'e', 'r', 'e', 'r', 'e', 'r', 'e', 'r' },
			{ 'r', 'e', 'r', 'e', 'r', 'e', 'r', 'e' }, };
	private CheckerBoard board;
	private CheckerGame game;
	private int blackCheckerCount = 12, redCheckerCount = 12;
	private int gridX1 = -1, gridY1 = -1, gridX2 = -1, gridY2 = -1;
	private int numberOfClicks = 0;
	private boolean blackTurn = true;
	private JLabel gameStatus;
	private boolean validClick = true;

	/**
	 * Default constructor.
	 */
	public CheckerGame() {
		Container window = getContentPane();
		window.setLayout(new BorderLayout());

		JMenuItem menuItemNew = new JMenuItem("New");
		menuItemNew.addActionListener(this);
		JMenuItem menuItemExit = new JMenuItem("Exit");
		menuItemExit.addActionListener(this);

		JMenu menuGame = new JMenu("Game");
		menuGame.add(menuItemNew);
		menuGame.add(menuItemExit);

		JMenuItem menuItemRules = new JMenuItem("Checker Game Rules");
		menuItemRules.addActionListener(this);
		JMenuItem menuItemAbout = new JMenuItem("About Checker Game App");
		menuItemAbout.addActionListener(this);

		JMenu menuHelp = new JMenu("Help");
		menuHelp.add(menuItemRules);
		menuHelp.add(menuItemAbout);

		JMenuBar menuBar = new JMenuBar();
		menuBar.add(menuGame);
		menuBar.add(menuHelp);
		setJMenuBar(menuBar);

		board = new CheckerBoard(boardStatus);
		add(board, BorderLayout.CENTER);

		gameStatus = new JLabel("             Number of black checkers: " + blackCheckerCount
				+ "      Number of red checkers: " + redCheckerCount);
		JLabel programmerName = new JLabel("                         This game was developed by Karim Sammouri");
		JPanel statusBar = new JPanel();
		statusBar.setLayout(new BorderLayout());
		statusBar.add(gameStatus, BorderLayout.NORTH);
		statusBar.add(programmerName, BorderLayout.SOUTH);
		add(statusBar, BorderLayout.SOUTH);

		setSize(490, 565);
		setTitle("Checker Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addMouseListener(this);
		addMouseMotionListener(this);
	}

	public static void main(String[] args) {
		CheckerGame game = new CheckerGame();
		game.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("New")) {
			char[][] boardStatus = new char[][] { { 'e', 'b', 'e', 'b', 'e', 'b', 'e', 'b' },
					{ 'b', 'e', 'b', 'e', 'b', 'e', 'b', 'e' }, { 'e', 'b', 'e', 'b', 'e', 'b', 'e', 'b' },
					{ 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e' }, { 'e', 'e', 'e', 'e', 'e', 'e', 'e', 'e' },
					{ 'r', 'e', 'r', 'e', 'r', 'e', 'r', 'e' }, { 'e', 'r', 'e', 'r', 'e', 'r', 'e', 'r' },
					{ 'r', 'e', 'r', 'e', 'r', 'e', 'r', 'e' }, };
			remove(board);
			board = new CheckerBoard(boardStatus);
			add(board, BorderLayout.CENTER);
			blackCheckerCount = 12;
			redCheckerCount = 12;
			gridX1 = -1;
			gridY1 = -1;
			gridX2 = -1;
			gridY2 = -1;
			numberOfClicks = 0;
			blackTurn = true;
			gameStatus.setText("             Number of black checkers: " + blackCheckerCount
					+ "      Number of red checkers: " + redCheckerCount);
		}
		if (e.getActionCommand().equals("Exit")) {
			dispose();
		}
		if (e.getActionCommand().equals("Checker Game Rules")) {
			JOptionPane.showMessageDialog(this, "https://www.wikihow.com/Play-Checkers");
		}
		if (e.getActionCommand().equals("About Checker Game App")) {
			JOptionPane.showMessageDialog(this,
					"Developer: Karim Sammouri\nEmail: sammouka@miamioh.edu\nAffiliation: Miami University");
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		if (numberOfClicks % 2 == 0) {
			gridX1 = e.getX() / 60;
			gridY1 = e.getY() / 60 - 1;
			if (blackTurn && CheckerBoard.boardStatus[gridY1][gridX1] == 'r'
					|| !blackTurn && CheckerBoard.boardStatus[gridY1][gridX1] == 'b'
					|| CheckerBoard.boardStatus[gridY1][gridX1] == 'e')
				validClick = false;
		}
		if (numberOfClicks % 2 == 1) {
			gridX2 = e.getX() / 60;
			gridY2 = e.getY() / 60 - 1;

			if (gridX1 == gridX2 && gridY1 == gridY2 || blackTurn && CheckerBoard.boardStatus[gridY2][gridX2] == 'b'
					|| !blackTurn && CheckerBoard.boardStatus[gridY2][gridX2] == 'r'
					|| CheckerBoard.boardStatus[gridY2][gridX2] != 'e')
				validClick = false;

			if (validClick) {
				if (blackTurn) {
					if (gridX2 == gridX1 + 1 && gridY2 == gridY1 + 1) {
						board.setCheckerPiece(gridY1, gridX1, 'e');
						board.setCheckerPiece(gridY2, gridX2, 'b');
						blackTurn = false;
					}
					if (gridX2 == gridX1 - 1 && gridY2 == gridY1 + 1) {
						board.setCheckerPiece(gridY1, gridX1, 'e');
						board.setCheckerPiece(gridY2, gridX2, 'b');
						blackTurn = false;
					}
					if (gridX2 == gridX1 + 2 && gridY2 == gridY1 + 2
							&& CheckerBoard.boardStatus[gridY2 - 1][gridX2 - 1] == 'r') {
						board.setCheckerPiece(gridY1, gridX1, 'e');
						board.setCheckerPiece(gridY2 - 1, gridX2 - 1, 'e');
						board.setCheckerPiece(gridY2, gridX2, 'b');
						redCheckerCount--;
						gameStatus.setText("             Number of black checkers: " + blackCheckerCount
								+ "      Number of red checkers: " + redCheckerCount);
						blackTurn = false;
					}
					if (gridX2 == gridX1 - 2 && gridY2 == gridY1 + 2
							&& CheckerBoard.boardStatus[gridY2 - 1][gridX2 + 1] == 'r') {
						board.setCheckerPiece(gridY1, gridX1, 'e');
						board.setCheckerPiece(gridY2 - 1, gridX2 + 1, 'e');
						board.setCheckerPiece(gridY2, gridX2, 'b');
						redCheckerCount--;
						gameStatus.setText("             Number of black checkers: " + blackCheckerCount
								+ "      Number of red checkers: " + redCheckerCount);
						blackTurn = false;
					}
				} else {
					if (gridX2 == gridX1 + 1 && gridY2 == gridY1 - 1) {
						board.setCheckerPiece(gridY1, gridX1, 'e');
						board.setCheckerPiece(gridY2, gridX2, 'r');
						blackTurn = true;
					}
					if (gridX2 == gridX1 - 1 && gridY2 == gridY1 - 1) {
						board.setCheckerPiece(gridY1, gridX1, 'e');
						board.setCheckerPiece(gridY2, gridX2, 'r');
						blackTurn = true;
					}
					if (gridX2 == gridX1 + 2 && gridY2 == gridY1 - 2
							&& CheckerBoard.boardStatus[gridY2 + 1][gridX2 - 1] == 'b') {
						board.setCheckerPiece(gridY1, gridX1, 'e');
						board.setCheckerPiece(gridY2 + 1, gridX2 - 1, 'e');
						board.setCheckerPiece(gridY2, gridX2, 'r');
						blackCheckerCount--;
						gameStatus.setText("             Number of black checkers: " + blackCheckerCount
								+ "      Number of red checkers: " + redCheckerCount);
						blackTurn = true;
					}
					if (gridX2 == gridX1 - 2 && gridY2 == gridY1 - 2
							&& CheckerBoard.boardStatus[gridY2 + 1][gridX2 + 1] == 'b') {
						board.setCheckerPiece(gridY1, gridX1, 'e');
						board.setCheckerPiece(gridY2 + 1, gridX2 + 1, 'e');
						board.setCheckerPiece(gridY2, gridX2, 'r');
						blackCheckerCount--;
						gameStatus.setText("             Number of black checkers: " + blackCheckerCount
								+ "      Number of red checkers: " + redCheckerCount);
						blackTurn = true;
					}
				}
			}
		}
		if (validClick == true) {
			numberOfClicks++;
		} else
			validClick = true;
		if (redCheckerCount == 0) {
			gameStatus.setText("                                                     Black wins!");
		}
		if (blackCheckerCount == 0) {
			gameStatus.setText("                                                       Red wins!");
		}
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}
}
