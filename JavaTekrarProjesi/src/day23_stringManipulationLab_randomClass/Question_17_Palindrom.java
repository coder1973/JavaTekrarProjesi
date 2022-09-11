package day23_stringManipulationLab_randomClass;

public class Question_17_Palindrom {

	public static void main(String[] args) {
		
		String str = "Taco cat";
		
		String dummy="";
		
		for (int i = str.length()-1; i >=0; i--) {
			dummy = dummy + str.charAt(i);			
		}
		
		if (str.replace(" ", "").equalsIgnoreCase(dummy.replace(" ", ""))) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
