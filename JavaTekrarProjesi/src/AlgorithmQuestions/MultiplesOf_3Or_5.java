package AlgorithmQuestions;

public class MultiplesOf_3Or_5 {

	public static void main(String[] args) {
		/*If we list all the natural numbers below 10 that are multiples of 3 or 5, 
		we get 3, 5, 6 and 9. The sum of these multiples is 23.

		Find the sum of all the multiples of 3 or 5 below 1000.*/

		int num = 1001;
		int sum = 0;
		if (num <= 1000) {
			for (int i = 0; i <= num; i++) {
				if (i % 5 == 0 && i % 3 == 0) {
				}
				sum = sum + i;
			}
			System.out.println(sum);

		} else {
			System.out.println("Number is bigger than 1000");
		}
	}

}
