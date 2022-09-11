package day23_stringManipulationLab_randomClass;

public class Question_13 {

	public static void main(String[] args) {
		
						//01234567
		String str = "Hi-there";   //HHii--tthheerree
						  //12345678
		String dummy = "";
		
		for (int i = 0; i < str.length(); i++) {
			dummy=dummy+str.substring(i, i+1).concat(str.substring(i, i+1));
			
		}

		System.out.println(dummy);
	}

}
