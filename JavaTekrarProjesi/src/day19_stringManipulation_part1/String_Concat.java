package day19_stringManipulation_part1;

public class String_Concat {

	public static void main(String[] args) {
		
		String word = "Java";
		
		System.out.println(word.concat("+selenium"));
		System.out.println(word.concat(" in eclipse"));
		
		System.out.println(word);
		
		word = word.concat(" + Eclipse");
		System.out.println(word);
		
		word = word + 123;
		System.out.println(word);
		
		word = word + true;
		System.out.println(word);

		System.out.println(word.concat(" -hey").concat(" olur").concat(" hey"));
	}

}
