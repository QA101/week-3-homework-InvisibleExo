import java.util.Scanner;

public class WhileYouCan {

	public static void main(String[] args) {
		int sponge = 1;
		System.out.println("First method: ");
		firstWhile(sponge);
		System.out.println("Second method: ");
		secondWhile(sponge);
		System.out.println("Third method: ");
		thirdWhile(sponge);
		System.out.println("Forth method: ");
		forthWhile(sponge);
		System.out.println("Fifth method:");
		fifthWhile(sponge);
		System.out.println("Sixth method: ");
		sixthWhile(sponge);
		System.out.println("Seventh method: ");
		seventhWhile(sponge);
		System.out.println("Eigth method: ");
		eigthWhile(sponge);
		System.out.println("Ninth method: ");
		ninthWhile(sponge);
		System.out.println("Tenth method: ");
		tenthWhile(sponge);
		
	}
	// While P1
	public static void firstWhile(int ticker) {
		while(ticker <= 10) {
			System.out.println(ticker);
			ticker++;
		}
	}
	// While P2
	public static void secondWhile(int ticker) {
		while(ticker <= 10) {
			if (ticker%2 == 0) {
				System.out.println(ticker);
			}
			ticker++;
		}
	}
	//While P3
	public static void thirdWhile(int ticker) {
		while(ticker <= 10) {
			if (ticker%2 != 0) {
				System.out.println(ticker);
			}
			ticker++;
		}
	}
	//While P4
	public static void forthWhile(int counter) {
		int square = 0;
		while (counter <= 10) {
			System.out.print("Square number of " + counter + " is ");
			square = (int)Math.pow(counter, 2);
			System.out.println(square);
			counter++;
		}
		/* Likely dead code at this point
		if (square >= 2147483647) {
			System.out.println("Looks like we hit the cap.");
		} */
	}
	//While P5
		public static void fifthWhile(int counter) {
			//For this method only:
			int cube = 0;
			while (counter <= 10) {
				System.out.print("Cubic power of " + counter + " is ");
				cube = (int)Math.pow(counter, 3);
				System.out.println(cube);
				counter++;
			}
			//Likely dead code at this point.
			/*if (cube >= 2147483647) {
				System.out.println("Looks like we hit the cap way sooner.");
			} */
		}
		// Part 6
		public static void sixthWhile(int counter) {
			int sum = 0;
			while (counter <= 5) {
				sum = sum + counter;
				if (counter == 5) {
					System.out.print(counter + " = ");
				}
				else {
				System.out.print(counter + " + ");
				}
				counter++;
			}
			System.out.println(sum);
		}
		// While Pt7
		public static void seventhWhile(int inputLength) {
			Scanner console = new Scanner(System.in);
			System.out.println("How many input values do you want to enter? ");
			inputLength = console.nextInt();
			System.out.println("Now enter " + inputLength + " values: ");
			int counter = 1; 
			int sum = 0;
			double value;
			while (counter <= inputLength) {
				value = console.nextDouble();
				sum += value;
				counter++;
			}
			System.out.println("Your sum of all those values is: " + sum);
			console.close();
		}
		// While Pt 8
		public static void eigthWhile(int inputLength) {
			Scanner console = new Scanner(System.in);
			System.out.println("How many input values do you want to enter? ");
			inputLength = console.nextInt();
			System.out.println("Now enter " + inputLength + " values: ");
			int counter = 1; 
			int sum = 1;
			double value;
			while (counter <= inputLength) {
				value = console.nextDouble();
				sum *= value;
				counter++;
			}
			System.out.println("Your sum of all those values is: " + sum);
			console.close();
		}
		//While Pt 9
		public static void ninthWhile(int originalNum) {
			Scanner console = new Scanner(System.in);
			System.out.println("Enter the number you wish to be reveresed: ");
			originalNum = console.nextInt();
			int reverse = 0;
			int remainder;
			while (originalNum != 0) {
				remainder = originalNum % 10; 
				reverse = reverse * 10 + remainder; 
				originalNum = originalNum/10;
			}
			System.out.println("The reverse number is: " + reverse);
			console.close();
		}
		// While Pt 10
		public static void tenthWhile(int counter) {
			int sum = 0;
			while(counter <= 10) {
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
			}
			System.out.println(sum);
		}
}
