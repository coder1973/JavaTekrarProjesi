
public class String_CharAt {

	public static void main(String[] args) {
		
		String word = "Computer";
		
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8));
		
		//Check if first character is 'A'
		
		String word2 = "Apple";
		
		if(word2.charAt(0)=='A') {
			System.out.println("A is the first character");
		}else {
			System.out.println("A is not the first character");
		}
		
		//check if first and last characters are same
		
		String str3 = "civic";
		
		char first = str3.charAt(0);
		char last = str3.charAt(str3.length()-1);
		
		if(first==last) {
			System.out.println("first and last character match");
		}else {
			System.out.println("first and last character no match");
		}
		
		String word4 = "Java Script";
		
		char lastChar = word4.charAt(word4.length()-1);
		System.out.println(lastChar);
	}

}
