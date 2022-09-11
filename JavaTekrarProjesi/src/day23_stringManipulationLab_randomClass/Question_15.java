package day23_stringManipulationLab_randomClass;

public class Question_15 {

	public static void main(String[] args) {
		
		String str1= "fbadjfbkjbfbadkfbadakhfhbaxbadx";
		String str2 = "bad";
		
		int count = 0;
		
		for (int i = 1; i < str1.length()-2; i++) {
			
			if (str1.subSequence(i, i+3) == str2) {
				
			}
			count++;
		}
		
		System.out.println(count);
	}
}
