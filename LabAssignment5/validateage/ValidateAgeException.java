package validateage;

/**
 * 
 * @author Krish Vyas
 * Validate the age of a person and display proper message by using user defined exception. 
 * Age of a person should be above 15.
 *
 */
import java.util.*;

public class ValidateAgeException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		// input from the user
		int age = sc.nextInt();
		// scanner close
		sc.close();
		try {
			/**
			 * check the person age is valid or not. Age of a person should be above 15 If
			 * age should not be above 15 then it throw exception for InvalidAgeException
			 * otherwise it print valid person's age
			 */
			if (age > 15) {
				System.out.println("Valid Person's age: " + age);
			} else {
				throw new InvalidAgeException(); // call InvalidAgeException class
			}
		} catch (InvalidAgeException e) {
			// display exception message
			System.out.println(e.getMessage() + age);
		}
	}

}