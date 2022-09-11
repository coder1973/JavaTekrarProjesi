package day5_unary_assignment_relational_Operators;

public class MixedInteger {

	public static void main(String[] args) {
		
		int i1 = 5;
		int i2 = 10;
		float f1 = 15.5f;
		double d1 = 20.5;
		
		int res1 = i1 + i2;
		float res2 = i1 + f1;
		double res3 = i2 + d1;
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	
		
		short firstNumber = 10; // bunlari sistem int olarak atama yapar
		short secondNumber = 10;
		
		int thirdNumber = firstNumber + secondNumber;
		short thirdNumber2 = (short) (firstNumber + secondNumber);
		System.out.println(thirdNumber);
		System.out.println(thirdNumber2);
		
		byte b1 = 20;
		byte b2 = 2;
		byte b3 = (byte)(b1*b2);
		
		int b4 = 126;
		int b5 = 1;
		
		byte res4 = (byte)(b4 + b5); //casting is required
		System.out.println(res4);
		
		byte res5 = 126 + 1 ;
		System.out.println(res5);
		
		
		

	}

}
