package day23_stringManipulationLab_randomClass;

public class Question_11 {

	public static void main(String[] args) {
		/**
		 * Return the number of times that the string "hi" appears anywhere in the given string. 
		 * countHi("abc hi ho") →1 
		 * countHi("ABChi hi") →2 
		 * countHi("hihi") →2
		 */

		String str = "abc hi ho"; 			//hi 2     //hihello  = substring(0,2)   
        											//xhihello = substring(1,3)
        											//xxhihell = substring(2,4)
		
		int counter=0;
		
		for (int i = 0; i < str.length()-1; i++) {
			if(str.substring(i, i+2).equals("hi")) {
				counter++;
			}
			
		}
		
		System.out.println(counter);
	}

}
