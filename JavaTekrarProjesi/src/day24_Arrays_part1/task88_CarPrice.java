package day24_Arrays_part1;

import java.util.Random;
import java.util.Scanner;

public class task88_CarPrice {
	

	/**
	 * • Create an array that holds cars (Honda, Toyota, Nissan, BMW, Mercedes,
	 * Porsche, Ferrari) 
	 * • Ask user to enter an index number to choose his dream
	 * car. 
	 * • Print the price for selected car. Car prices : Honda – Toyota – Nissan
	 * (Random price between 20000 and 40000) BMW-Mercedes(Random price between
	 * 50000 and 80000) Porsche - Ferrari(Random price between 100000 and 150000) 
	 * • * Hint : finding a random number between 2 numbers = > ((max - min) + 1) + min
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rn = new Random();
		
		int price=0;
		
		String[] cars = new String[7];
		
		cars[0] = "Honda";
		cars[1] = "Toyota";
		cars[2] = "Nissan";
		cars[3] = "BMW";
		cars[4] = "Mercedes";
		cars[5] = "Porsche";
		cars[6] = "Ferrari";
		
		System.out.println("Select your car: ");
		int indexCar = sc.nextInt();
		String selectedCar = cars[indexCar];
		
		switch (selectedCar) {
		case "Honda": case "Toyota": case "Nissan":
		price = rn.nextInt((40000-20000)+1)+20000;	
		break;
		case "BMW": case "Mercedes": 
		price = rn.nextInt((80000-50000)+1)+50000;
		break;	
		case "Porsche": case "Ferrari": 
		price = rn.nextInt((150000-100000)+1)+100000;
		break;	
		default:
		System.out.println("Invalid Car");
			break;
		}
		System.out.println("Price for selected car is: " + price);
	}

}
