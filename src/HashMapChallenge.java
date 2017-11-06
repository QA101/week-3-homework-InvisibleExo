import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapChallenge {
	

	public static void main(String[] args) {
		HashMap<String, Integer> dataMap = new HashMap<>();
		Scanner console = new Scanner(System.in);
		//Part 1
		ptOneGrades(dataMap, console);
		dataMap.clear();
		//Part 2
		ptTwoNames(console);
		//Part 3
		ptThreeOccurance();
		//Part 4
		ptFourMaxOccur();
		//Part 5
		ptFiveMinOccur();
		//Part 6
		ptSixOnlyEven();
		//Part 7
		ptSevenOnlyOdd();
		//Part 8
		ptEightThreeTimes();
		//Part 9
		ptNineStringCount();
		//Part 10
		ptTenAnagram();
		console.close();
	}
	//Pt 1
	public static void ptOneGrades(Map<String, Integer> grades, Scanner console) {
		//Map<String, Integer> grades = new HashMap<>();
		
		System.out.println("Please enter seven students and their scores");
		int i = 1;
		String student;
		int grade;
		while (i <= 7) {
			System.out.println("Student:");
			student = console.next();
			System.out.println("Grade:");
			grade = console.nextInt();
			grades.put(student, grade);
			i++;
		}
		System.out.println("List of reports: " + grades);
	}
	
	//Pt 2
	public static void ptTwoNames(Scanner type) {
		Map<String, String> list = new HashMap<>();
		int fullSize = 0;
		System.out.println("Please enter the names of the 10 students attending class.");
		String last;
		String first;
		do {
			System.out.println("First name:");
			first = type.next();
			System.out.println("Last name: ");
			last = type.next();
			list.put(first, last);
			fullSize++;
		} while (fullSize < 10);
		System.out.println(list);
	}
	
	//Pt 3
	public static void ptThreeOccurance() {
		int[] randomList = {34, 56, 56, 75, 56};
		Map<Integer, Integer> counter = new HashMap<>();
		int i =0;
		while (i < randomList.length) {
			if (counter.containsKey(randomList[i])) {
				int count = counter.get(randomList[i]);
				counter.put(randomList[i], count + 1);
			}
			else {
				counter.put(randomList[i], 1);
			}
			i++;
		}
		System.out.println("Occurances are: " + counter);
		for (Integer num : counter.keySet()) {
			Integer occur = counter.get(num);
			System.out.println(num + ", " + occur);
		}
	}
	//Pt 4
	public static void ptFourMaxOccur() {
		int [] arr = {10, 9, 8, 8, 7, 8, 56, 5, 4, 34, 56, 56, 43, 56, 56};
		Map<Integer, Integer> counter = new HashMap<>();
		int maxCount = 0; 
		int mostOftenNum = 0;
		int i = 0;
		do {
			if (counter.containsKey(arr[i])) {
				int count = counter.get(arr[i]);
				counter.put(arr[i], count + 1);
			}
			else {
				counter.put(arr[i], 1);
			}
			i++;
		} while (i < arr.length);
		for (Integer j : counter.keySet() ) {
			int occur = counter.get(j);
			if (occur >= maxCount) {
				maxCount = occur;
				mostOftenNum = j;
			}
		}
		System.out.println("Number: " + mostOftenNum);
		System.out.println("MaxCount: " + maxCount);
	}
	
	// Pt 5
	public static void ptFiveMinOccur() {
		int [] arr = {10, 9, 8, 8, 7, 8, 56, 5, 4, 34, 56, 56, 43, 56, 56};
		Map<Integer, Integer> counter = new HashMap<>();
		int minCount = 0; 
		int leastOftenNum = 0;
		int i = 0;
		do {
			if (counter.containsKey(arr[i])) {
				int count = counter.get(arr[i]);
				counter.put(arr[i], count + 1);
			}
			else {
				counter.put(arr[i], 1);
			}
			i++;
		} while (i < arr.length);
		for (Integer j : counter.keySet() ) {
			int occur = counter.get(j);
			if (minCount == 0) {
				minCount = occur;
				leastOftenNum = j;
			}
			else if (occur <= minCount) {
				minCount = occur;
				leastOftenNum = j;
			}
		}
		System.out.println("Number: " + leastOftenNum);
		System.out.println("MinCount: " + minCount);
	}
	//Part 6
	public static void ptSixOnlyEven () {
		int [] arr = {10, 56, 8, 8, 7, 8, 8, 5, 56, 34, 56, 56, 10, 56, 56};
		Map<Integer, Integer> evenCounter = new HashMap<>();
		int times = 0;
		int number = 0;
		int i = 0;
		do {
			if (evenCounter.containsKey(arr[i])) {
				int count = evenCounter.get(arr[i]);
				evenCounter.put(arr[i], count + 1);
			}
			else {
				evenCounter.put(arr[i], 1);
			}
			i++;
		} while (i < arr.length);
		for (Integer j : evenCounter.keySet()) {
			number = evenCounter.get(j);
			if (number % 2 == 0) {
				times = number;
				number = j;
				System.out.println("Number is " + number);
				System.out.println("Even times : " + times);
			}
		}
		System.out.println("Array contain all numbers: " + evenCounter);
	}
	//Part 7
	public static void ptSevenOnlyOdd() {
		int [] arr = {10, 56, 8, 8, 7, 8, 56, 5, 56, 34, 56, 56, 10, 56, 56};
		Map<Integer, Integer> oddCounter = new HashMap<>();
		int times = 0;
		int number = 0;
		int i = 0;
		do {
			if(oddCounter.containsKey(arr[i])) {
				int count = oddCounter.get(arr[i]);
				count = oddCounter.put(arr[i], count + 1);
			}
			else {
				oddCounter.put(arr[i], 1);
			}
			i++;
		} while (i < arr.length);
		for (Integer j : oddCounter.keySet()) {
			number = oddCounter.get(j);
			if (number % 2 != 0) {
				times = number;
				number = j;
				System.out.println("Number : " + number);
				System.out.println("Odd times : " + times);
			}
		}
		System.out.println(oddCounter);
	}
	//Part 8
	public static void ptEightThreeTimes() {
		int [] arr = {12,45,25,67,98,12,45,45,67,12,45,98,45,67,45};
		Map<Integer, Integer> anotherMap = new HashMap<>();
		int threeChecker = 0;
		int number = 0;
		int i = 0;
		do {
			if(anotherMap.containsKey(arr[i])) {
				int count = anotherMap.get(arr[i]);
				count = anotherMap.put(arr[i], count + 1);
			}
			else {
				anotherMap.put(arr[i], 1);
			}
			i++;
		} while(i < arr.length);
		for (Integer j : anotherMap.keySet()) {
			number = anotherMap.get(j);
			if (number == 3) {
				threeChecker = number;
				number = j;
				System.out.println("Numbers of 3 occurances are: " + number);
				System.out.println("Times : " + threeChecker);
			}
		}
		System.out.println(anotherMap);
	}
	//Part 9
	public static void ptNineStringCount() {
		String testSubject = "aaaaaaaaaabbbbbbbbbccccccccffffffffffdddddjdjdjdjddjdjd";
		Map<Character, Integer> stringCount = new HashMap<>();
		int i = 0;
		do {
			if (stringCount.containsKey(testSubject.charAt(i))) {
				int count = stringCount.get(testSubject.charAt(i));
				count = stringCount.put(testSubject.charAt(i), count + 1);
			}
			else {
				stringCount.put(testSubject.charAt(i), 1);
			}
			i++;
		} while(i < testSubject.length());
		System.out.println("The character ocurrance from your string : " + testSubject);
		System.out.println(stringCount);
	}
	//Part 10
	public static void ptTenAnagram() {
		Map<Character, Integer> map1 = new HashMap<>();
		Map<Character, Integer> map2 = new HashMap<>();
		//How to solve situations with upper/lower casing.
		String str1 = "Dracula".toLowerCase();
		String str2 = "alucard".toLowerCase();
		int i = 0, j =0;
		do {
			if (map1.containsKey(str1.charAt(i))) {
				int count = map1.get(str1.charAt(i));
				count = map1.put(str1.charAt(i), count + 1);
			}
			else {
				map1.put(str1.charAt(i), 1);
			}
			i++;
		} while (i<str1.length());
		System.out.println("From map1 : " + map1);
		do {
			if (map2.containsKey(str2.charAt(j))) {
				int count = map2.get(str2.charAt(j));
				count = map2.put(str2.charAt(j), count + 1);
			}
			else {
				map2.put(str2.charAt(j), 1);
			}
			j++;
		} while (j<str2.length());
		System.out.println("From map2 : " + map2);
		if (map1.keySet().equals(map2.keySet())) {
			System.out.println(str1 + " and " + str2 + " are anagrams.");
		}
		else {
			System.out.println(str1 + " and " + str2 + " aren't anagrams.");
		}
	}
	//End of HashMap methods.
}
