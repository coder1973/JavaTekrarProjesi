package day11_controlFlowStatements;

public class task48_Pattern {

	public static void main(String[] args) {
		/**
		 *
		 **
		 ***
		 ****
		 *****
		 ******
		 *******

		 * */ 
		
		int rows = 7;
		
		for (int i = 1; i <= rows; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
