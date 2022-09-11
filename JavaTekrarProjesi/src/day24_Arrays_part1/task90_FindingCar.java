package day24_Arrays_part1;

public class task90_FindingCar {

	public static void main(String[] args) {
		/**
		 * ØCreate a car array that holds 6 car names inside 
		 * ØCheck if your array has the car name “Honda” 
		 * ØIf it is , print “ I found your car Honda in this array” 
		 * ØIf it is not, print “ I could not find your car Honda in this array”
		 */
		
		String[] cars = {"Toyota","Nissan","BMW","Mercedes","Honda", "Fiat"};
	
		boolean flag=false;
		
		for (int i = 0; i < cars.length; i++) {
			if (cars[i].equals("Honda")) {
				flag=true;
				break;
			}
		}
		
		if (flag) {
			System.out.println("Found it");
		}else {
			System.out.println("Not found it");
		}
	}

}
