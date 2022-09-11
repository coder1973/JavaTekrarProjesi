package day19_stringManipulation_part1;

public class makeOutWorld_Question {

	public static void main(String[] args) {
		
		System.out.println(makeOutWord("<<>>", "Yay"));
		System.out.println(makeOutWord("<<>>", "WooHoo"));
		System.out.println(makeOutWord("[[]]", "word"));
	}
	
	public static String makeOutWord(String out, String word) {
		
		out = out.substring(0, 2).concat(word).concat(out.substring(2, out.length()));
		
		return out;
		
		
		  
	}


}
