package day20_StringManipulation_Part2;

public class task80_CheckedString {

	public static void main(String[] args) {
		
		checkedString("Your order confirmation number is XYZ", "confirmation");
	}
	
	public static void checkedString(String str1, String str2) {
		
		if (str1.contains(str2)) {
			System.out.println(str1.indexOf(str2));
		} else {
			System.out.println("Not found");
		}
	}

}
