package day19_stringManipulation_part1;

import java.util.Scanner;

public class Task75_TotalCharacters {

	public static void main(String[] args) {
		/**
		 * Write a program that ask user to enter his/her firstname and lastname.
		 * Display in the console total number of characters.
		 */
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Enter your first name: ");
			String firstName = scan.nextLine();
			System.out.println("Enter your last name");
			String lastName = scan.nextLine();
			
			System.out.println("Total characters of first name and last name: " + (firstName.length() 
					+ lastName.length()));
	}

}
