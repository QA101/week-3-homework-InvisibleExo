

import java.util.Scanner;


/**
 * Write a class that will get input from the user through the terminal
 * Only int will be passed in through the terminal. Any other input will likely fail.
 * This class will put all the ints into an array then average them together.
 * The average will be printed to the console.
 * @author dustin
 */
public class ArrayAverage {

	/**
	 * The main method will read from the console to first determine the size of the array
	 * 
	 * Then, the main method should cycle through input from the user to populate the array
	 * 
	 * Then, the main method should average the populated array
	 * 
	 * Finally, the main method should print the average
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// This part from class.
		// if(args.length > 0) {
		double average;
		int total = 0;
		int [] InputArray;
		
		Scanner console = new Scanner(System.in);
		
		System.out.println("Give me array size: ");
		InputArray = new int[console.nextInt()];
		
		System.out.println("Give me your input: ");
		for (int i = 0; i < InputArray.length; i++) {
			InputArray[i] = console.nextInt();
			total += InputArray[i];
		
		}
		System.out.println();
		
		average = (total*1.0)/InputArray.length;
		System.out.println("Your average is: " + average);
	
		console.close();
		}
		/* else {
			System.out.println("Give me an argument, I'll give you an average.");
		}*/
	//}

}
