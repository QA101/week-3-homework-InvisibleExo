import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This programming challenge requires the use of string methods, for loops, and nested if statements
 * This program is intended to mimic a log-in string in a terminal window and validation of an email address
 * 
 * This is a challenge exercise and will require time to investigate.
 * 
 * @author dustin
 *
 */
public class MimicSignIn {

	/**
	 * Main method should first read arguments from terminal.
	 * first argument -> username
	 * second argument -> password
	 * third argument -> email
	 * If the number of argument is not equal to 3, the program should exit immediately.
	 * 
	 * Then, the program should ask the user to sign in (username and password)
	 * 
	 * They have three attempts to log in, otherwise it should exit
	 * 
	 * Finally, it should tell them if they have a valid email address
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 *  TODO Check if the arguments is the right length.
		 *  If not the right length, exit immediately. //Done.
		 */ 
		if(args.length == 3) {
			String username = args[0];
			String password = args[1];
			String email = args[2];
			final int MAX_ATTEMPTS = 3;
			String username_attempt = "";
			String password_attempt = "";			
			Scanner console = new Scanner(System.in);
			/**
			 *  TODO write a code block that check if the user supplied the correct username and password Tony: Lines 46-48 have been met.
			 *  You should use a for loop Tony: Check
			 *  You should trim off spaces in-front of or after the string Tony: Check
			 *  Then compare the username_attempt to username and password_attempt to password Tony:Check
			 */
			System.out.println("Please enter your username and password: ");
			for(int i = 1; i <= MAX_ATTEMPTS; i++){
				System.out.println("Username:");
				username_attempt = console.nextLine();
				
				System.out.println("Password:");
				password_attempt = console.nextLine();
				
				if (username_attempt.trim().equalsIgnoreCase(username.trim()) && password_attempt.trim().equals(password.trim())) {
					System.out.println("Username and Password are valid.");
					break;
				}
				else if (i == MAX_ATTEMPTS) {
					System.out.println("Warning: multiple sign-in attempts detected. Access is now locked.");
					System.exit(0);
				}
				else {
					System.out.println("Sorry, but the username or password you have provided are incorrect. Please try again.");
				}
				
			}
			
			/**
			 * What is a valid email address?
			 * Answer: Email Regex solution, to check and allow multiple characters and store endpoints (ex.com, .org) for email sites.
			 * What is allowed my also depend on company rules as well. 
			 *
			 * Alternative methods: A string variable with a regex style to match 1 or more () groupings before "@".
			 * Anything after "@" must follow or end with 2-3 groups,  
			 * and ending with group of 2-3 character length.
			 * Use for loop and nested if statement to match conditions mentioned the 3 lines above?
			 * Possible Improvements for later: If sign-in is attempted to mimic sign-in to account. Use get method to grab username associated to email?
			 */
			if(ValidEmail(email) == true) {
				System.out.println("You have a valid email address.");
			}
			else {
				//Now fixed
				System.out.println("The email you have provided is not valid.");
			}
			
			//closing console
			console.close();
		}
		else {
			//Now Fixed
			System.out.println("Wrong number of elements. To run this program, enter a username, a password, and an email in that order.");
		}
	}
	
	/**
	 * This method will take an email string and valid if it has a valid format
	 * 
	 * @param email - email string which needs to be valid for the correct format
	 * @return - returns true if the email is valid, returns false if it is not valid
	 */
	public static boolean ValidEmail(String email) {
		// To define what is considered a valid email address.
		// This string will also address valid domains of .com, .org, .co, .edu
		// Avoid using .net is not valid or anything not .com, .org, .co, .gov, or .edu
		String EMAIL_RULEBOOK = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.(?:[A-Z]{2,3}|com|org|gov|co|edu))+$";
		//In case multiple emails need to be checked at once.
		Pattern p = Pattern.compile(EMAIL_RULEBOOK);
		Matcher m = p.matcher(email.trim());
		boolean b = m.matches();
		//This works too, but would need to be recompiled again if there was than one email to check.
		// Inside the if (): (email.trim().matches(EMAIL_RULEBOOK.trim()) == true)
		if (b == true) {
			return true;
		}
		else {
			
			return false;
		}
		
	}
}
