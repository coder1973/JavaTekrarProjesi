package day19_stringManipulation_part1;

public class PrintingEachCharacter {

	public static void main(String[] args) {
		
		/**Display each character in the console.*/ 
		
		String str = "Cybertek School";
		
		for (int i = 0; i < str.length(); i++) {
			
			System.out.print(str.charAt(i));
			
		}

	}

}
