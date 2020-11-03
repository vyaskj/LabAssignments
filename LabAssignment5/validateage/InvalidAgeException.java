package validateage;

public class InvalidAgeException extends Exception {
	/**
	 * creating long serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * call constructor of the class and pass message to super class
	 */
	public InvalidAgeException() {
		super("You entered an invalid age ");
	}
}