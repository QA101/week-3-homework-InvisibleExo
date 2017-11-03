import java.util.Scanner;

public class DoWhileYouCan {
		//Instance variable for the Do-While Methods
		public final static int mySponge = 1;
	public static void main(String[] args) {
		System.out.println("First method: ");
		firstDoWhile(mySponge);
		System.out.println("Second method: ");
		secondDoWhile(mySponge);
		System.out.println("Third method: ");
		thirdDoWhile(mySponge);
		System.out.println("Forth method: ");
		forthDoWhile(mySponge);
		System.out.println("Fith method: ");
		fifthDoWhile(mySponge);
		System.out.println("Sixth method: ");
		sixthDoWhile(mySponge);
		System.out.println("Seventh method: ");
		seventhDoWhile(mySponge);
		System.out.println("Eigth method: ");
		eighthDoWhile(mySponge);
		System.out.println("Ninth method: ");
		ninthDoWhile();
		System.out.println("Tenth method: ");
		tenthDoWhile(mySponge);
	}
	// Pt 1
	public static void firstDoWhile(int counter) {
		do {
			System.out.println(counter);
			counter++;
		} while (counter <= 10);
	}
	// Pt 2
	public static void secondDoWhile(int counter) {
		do {
			if(counter%2 == 0) {
				System.out.println(counter);
			}
			counter++;
		} while (counter <= 10);
	}
	// Pt 3
	public static void thirdDoWhile(int counter) {
		do {
			if(counter%2 != 0) {
				System.out.println(counter);
			}
			counter++;
		} while(counter < 10);
	}
	// Pt 4
	public static void forthDoWhile(int counter) {
		int squareNum;
		do {
			System.out.print("Square number of " + counter + " is: ");
			squareNum = (int)Math.pow(counter, 2);
			System.out.println(squareNum);
			counter++;
		} while(counter <= 10);
		// Dead code at this point
		/* if (squareNum >= Integer.MAX_VALUE) {
			System.out.println("Looks like we hit the cap.");
		} */
	}
	// Pt 5
	public static void fifthDoWhile(int counter) {
		int cubicNum;
		do {
			System.out.print("Cubic number of " + counter + " is: ");
			cubicNum = (int)Math.pow(counter, 3);
			System.out.println(cubicNum);
			counter++;
		} while(counter <= 10);
		// Dead code at this point
		/* if (cubicNum >= Integer.MAX_VALUE) {
			System.out.println("Looks like we hit the cap.");
		} */
	}
	// Pt 6
	public static void sixthDoWhile(int counter) {
		int sum = 0;
		do {
			if (counter == 5 ) {
				System.out.print(counter + " = ");
			}
			else {
			System.out.print(counter + " + ");
			}
			sum +=counter;
			counter++;
			
		} while(counter <= 5);
		System.out.println(sum);
	}
	//Pt 7
	public static void seventhDoWhile(int counter) {
		Scanner console = new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");
		int valueLength = console.nextInt();
		int sum = 0;
		double inputValue;
		System.out.println("Enter " + valueLength + " values: ");
		do {
			inputValue = console.nextDouble();
			sum += inputValue;
			counter++;
			
		} while (counter <= valueLength);
		console.close();
		System.out.println("The sum of the values you entered is: " + sum);
	}
	//Pt 8
	public static void eighthDoWhile(int counter) {
		Scanner console = new Scanner(System.in);
		System.out.println("How many values do you want to enter: ");
		int valueLength = console.nextInt();
		int sum = 1;
		double inputValue;
		System.out.println("Enter " + valueLength + " values: ");
		do {
			inputValue = console.nextDouble();
			if (counter == valueLength) {
				System.out.print(inputValue + " = ");
			}
			else {
			System.out.print(inputValue + " * ");
			}
			sum *= inputValue;
			counter++;
		} while (counter <= valueLength);
		console.close();
		System.out.println(sum);
		System.out.println("The sum of the values you entered when multiplied is the product of: " + sum);
	}
	// Pt 9 
	public static void ninthDoWhile() {
		Scanner console = new Scanner(System.in);
		int originalNum;
		int reverse = 0;
		int remainder;
		System.out.println("Enter a number you wish to reverse: ");
		originalNum = console.nextInt();
		do {
			remainder = originalNum % 10;
			reverse = reverse * 10 + remainder;
			originalNum = originalNum/10;
			
		} while (originalNum !=0);
		console.close();
		System.out.println("Reverse number is: " + reverse);
	}
	//Pt 10
	public static void tenthDoWhile(int counter) {
		int sum = 0;
		do {
			if (counter%2 == 0) {
				sum += counter;
				if (counter == 10) {
					System.out.print(counter + " = ");
				}
				else {
				System.out.print(counter + " + ");
				}
			}
			counter++;
			
		} while (counter <=10);
		System.out.println(sum);
	}
}
