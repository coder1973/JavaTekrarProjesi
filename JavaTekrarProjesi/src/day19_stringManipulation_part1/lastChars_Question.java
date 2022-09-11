package day19_stringManipulation_part1;

public class lastChars_Question {

	public static void main(String[] args) {
		/**
		 * Given 2 strings, a and b, return a new string made of the first char of a and
		 * the last char of b, so "yo" and "java" yields "ya". If either string is
		 * length 0, use '@' for its missing char.
		 * 
		 * lastChars("last", "chars") → "ls" l lastChars("yo", "java") → "ya"
		 * lastChars("hi", "") → "h@"
		 */
		System.out.println(lastChars("last", "chars"));
		System.out.println(lastChars("hi", ""));
		System.out.println(lastChars("yo", "java"));
		System.out.println(lastChars("", ""));
	}
	
	public static String lastChars(String a, String b) {
		String istenilen;
		if (a.length() < 0 || b.length() < 0) {
			istenilen = "hatali data";
		} else {
			if (a.equals("") && b.equals("")) {
				istenilen = a.concat("@").concat(b.concat("@"));
			}else if(b.equals("")) {
				istenilen = a.substring(0, 1).concat("@");
			}else if(a.equals("")) {
				istenilen = a.concat("@").concat(b.substring(b.length() - 1));
			}else {
				istenilen = a.substring(0, 1).concat(b.substring(b.length() - 1));

			}

		}
		return istenilen;
	}
}