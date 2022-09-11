package day11_controlFlowStatements;

public class NestedForLoop {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 5; i++) {
			
			System.out.println("Outer Loop iteration " + + i );
			
				for (int j = 0; j <=2; j++) {
					
					System.out.println("i = " + i + "; j = " + j);
					
				}
		}

	}

}
