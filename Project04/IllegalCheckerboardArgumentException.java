/**
 * This class defines a customized exception.
 * 
 * @author Karim R. Sammouri
 *
 */
public class IllegalCheckerboardArgumentException extends Exception {

	/**
	 * Default constructor.
	 */
	public IllegalCheckerboardArgumentException() {
		super("The value of the row, column, or status is invalid. The row and column should be between 0 and 7. The status should be 'e', 'b', or 'r'");
	}

	/**
	 * Parameterized constructor.
	 * 
	 * @param message The custom message to be shown when the exception is thrown.
	 */
	public IllegalCheckerboardArgumentException(String message) {
		super(message);
	}
}
