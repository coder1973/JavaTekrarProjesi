package day23_stringManipulationLab_randomClass;

public class Question1_14 {
	
	public static void main(String[] args) {
		
		String str = "oddsly";
		System.out.println(str.substring(str.length()-3));
		
		if (str.length()<2) {
			System.out.println(false);
			return;
		}
		
		if (str.substring(str.length()-2).equals("ly")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}

}
