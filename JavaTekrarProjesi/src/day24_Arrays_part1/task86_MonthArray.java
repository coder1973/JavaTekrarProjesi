package day24_Arrays_part1;

import java.util.Scanner;

public class task86_MonthArray {
	/**
	 * Create an array that holds 12 months names User should be able to enter month
	 * index and output should be: “The month name is <MonthName>”
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String[] myArray = new String[12];

		myArray[0] = "Januaray";
		myArray[1] = "February";
		myArray[2] = "March";
		myArray[3] = "April";
		myArray[4] = "May";
		myArray[5] = "June";
		myArray[6] = "July";
		myArray[7] = "August";
		myArray[8] = "September";
		myArray[9] = "October";
		myArray[10] = "Noivember";
		myArray[11] = "December";

		System.out.println("Enter your month index number: ");
		int index = scan.nextInt();

		System.out.println("The month is : " + myArray[index]);

	}

}
