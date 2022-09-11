package day24_Arrays_part1;

import java.util.Scanner;

public class task87_dayArray {
	/**
	 * Create an array that holds the days User should be able to enter the day
	 * index and output should be: “Today is Monday”
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] days = new String[7];
		days[0] = "Monday";
		days[1] = "Thuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";

		System.out.println("Enter your day index: ");
		int index = sc.nextInt();
		System.out.println("Today is: " + days[index]);

	}

}
