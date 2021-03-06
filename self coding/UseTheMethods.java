import java.util.Scanner;

public class UseTheMethods {
	
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		//Pt1
		System.out.println("Enter your number for the first method: ");
		int inputNum = console.nextInt(); 
		System.out.println("The next even numbers after your number are: " + methodOne(inputNum));
		//Pt2 and reassign new value.
		System.out.println("Now enter a number for the second method:");
		inputNum = console.nextInt();
		System.out.println("The next odd numbers ater your number are: " + methodTwo(inputNum));
		//Pt3
		System.out.println("Now enter a number for the third method: ");
		inputNum = console.nextInt();
		System.out.println("Based on this number and counting up 7 times, squared numbers are: " + methodThree(inputNum));
		//Pt4
		System.out.println("Now enter a number for the forth method: ");
		inputNum = console.nextInt();
		System.out.println("The sum of " + inputNum + " is " + methodFour(inputNum));
		//Pt5 and returning an int this time.
		System.out.println("Now enter a number for the fifth method: ");
		inputNum = console.nextInt();
		System.out.println("Product of " + inputNum + " is " + methodFive(inputNum)); 
		//Pt6
		System.out.println("Now enter a number for the sixth method, ");
		System.out.println("but first, what number would you like to see mirrored?" );
		inputNum = console.nextInt();
		System.out.println("Mirror number is: " + methodSix(inputNum));
		//Pt7
		System.out.println("Now this time for 7th, enter two numbers: \nFirst number for slot1: ");
		inputNum = console.nextInt();
		System.out.print("Now for the second number slot2: ");
		int inputNum2 = console.nextInt();
		System.out.println("Now the numbers for Slot1 and Slot2 are: " + methodSeven(inputNum, inputNum2));
		//Pt8
		System.out.println("Now enter two numbers for method 8: ");
		inputNum = console.nextInt();
		System.out.println("And for the second: " );
		inputNum2 = console.nextInt();
		System.out.println("The max number for your two values is: " + methodEight(inputNum, inputNum2));
		//Pt9
		System.out.println("Now enter two numbers for method 9: ");
		inputNum = console.nextInt();
		System.out.println("And for the second: " );
		inputNum2 = console.nextInt();
		System.out.println("The minimum number for your two values is: " + methodNine(inputNum, inputNum2));
		//Pt10
		System.out.println("Enter a number for method 10: ");
		inputNum = console.nextInt();
		System.out.println("Factorial of " + inputNum + " is " + methodTen(inputNum));
		//Pt11
		System.out.println("Enter three numbers for method 11. \n First: ");
		inputNum = console.nextInt();
		System.out.println("Second: ");
		inputNum2 = console.nextInt();
		System.out.println("Third: ");
		int inputNum3 = console.nextInt();
		System.out.println("The max value of your three numbers is: " + methodEleven(inputNum, inputNum2, inputNum3));
		//Pt12
		System.out.println("Enter three numbers for the final method 12. \n First: ");
		inputNum = console.nextInt();
		System.out.println("Second: ");
		inputNum2 = console.nextInt();
		System.out.println("Third: ");
		inputNum3 = console.nextInt();
		System.out.println("The min value of your three numbers is: " + methodTweleve(inputNum, inputNum2, inputNum3));
		console.close();

	}
	//Part 1
	public static String methodOne(int input) {
		String Final = " ";
		for(int i = 1; i <= 5; i++) {
			if(input%2 != 0) {
				input++;
				Final = Final + " " + input;
			}
			else {
				input+=2;
				Final = Final + " " + input;
			}
		}
		return Final;
	}
	//Part2
	public static String methodTwo(int input) {
		String Final = " ";
		for (int i = 1; i <= 10; i++) {
			if(input%2 == 0) {
				input++;
				Final = Final + " " + input;
			}
			else {
				input+=2;
				Final = Final + " " + input;
			}
		}
		return Final;
	}
	//Part3
	public static String methodThree(int input) {
		String Final = " ";
		int counter = 1;
		int square;
		while (counter <= 7){
			square = (int)Math.pow(input, 2);
			Final = Final + " " + square;
			input++;
			counter++;
		}
		return Final;
	}
	//Part4
	public static int methodFour(int input) {
		int sum = 0, remainder = 0, wholeNum = 0;
		while (input < 0) {
			remainder = input % 10;
			wholeNum = input / 10;
			sum = sum + remainder;
			input = wholeNum;
		}
		return sum;
	}
	//Part5
	public static int methodFive(int input) {
		int product = 1, remainder = 0, wholeNum = 0;
		while (input < 0) {
			remainder = input % 10;
			wholeNum = input / 10;
			product = product * remainder;
			input = wholeNum;
		}
		return product;
	}
	//Part6
	public static String methodSix(int input) {
		String prize = " ";
		int remainder;
		int reverse = 0;
		while (input != 0) {
			remainder = input%10;
			reverse = reverse * 10 + remainder;
			input = input/10;
		}
		prize = " " + reverse;
		return prize;
	}
	//Part7
	public static String methodSeven(int slot1, int slot2) {
		int temp;
		String printMe = " ";
		temp = slot1; 
		slot1 = slot2;
		slot2 = temp;
		printMe = slot1 + " & " + slot2;
		return printMe;
	}
	//Part8
	public static int methodEight(int num1, int num2) {
		int maxNum;
		maxNum = Math.max(num1, num2);
		return maxNum;
	}
	//Part9
	public static int methodNine(int num1, int num2) {
		int minNum;
		minNum = Math.min(num1, num2);
		return minNum;
	}
	//Part10
	public static int methodTen(int num) {
		int fact = 1;
		int i = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		return fact;
	}
	//Part11
	public static int methodEleven(int num1, int num2, int num3) {
		int maxNum;
		maxNum = Math.max(num1, Math.max(num2, num3));
		return maxNum;
	}
	//Part12
	public static int methodTweleve(int num1, int num2, int num3) {
		int minNum;
		minNum = Math.min(num1, Math.min(num2, num3));
		return minNum;
	}
}
