package day15_methods_Part3;

public class task67_LastDigit {

	public static void main(String[] args) {
		
		if (lastDigit(43,  1113)) {
			System.out.println("ayni numara");
		}else {
			System.out.println("farkli numara");
		}
	
		

	}
	
	public static boolean lastDigit(int num1, int num2) {
		
		if ((num1%10)==(num2%10)) {
			return true;
						
		}else {
			return false;
		}
		
	}

}
