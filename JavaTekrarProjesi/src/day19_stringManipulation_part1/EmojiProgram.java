package day19_stringManipulation_part1;

public class EmojiProgram {

	public static void main(String[] args) {
		/**
		 * Create a emoji program: 
		 * 1- Check if emoji has 2 characters. If it is not, print “invalid emoji” 
		 * 2- Valid emojis: 
		 * Starting with : = > :) Smile, :( Sad, :/ Upset, :p Playful, Otherwise invalid 
		 * Starting with ; = > ;) Wink, ;0 Surprised, Otherwise invalid
		 */
		
		String emoji = ":p";
		
		//check if it does not equal to 2 chars
		
		if (emoji.length() !=2) {
			System.out.println("Invalid Emoji");
			return; 
		}
		
		//if code reaches this point, then emoji is 2 chars
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if(first==':') {
			if (second==')') {
				System.out.println("Smile");
			}else if(second=='(') {
				System.out.println("Sad");
			}else if(second=='/') {
				System.out.println("Üpset");
			}else if(second=='p') {
				System.out.println("Playful");
			}else {
				System.out.println("Unknown Emoji");
			}
			
		}else if(first==';') {
			if (second==')') {
				System.out.println("Wink");
			}else if(second=='0') {
				System.out.println("Surprised");
			}else {
				System.out.println("Unknown Emoji");
			}
		}else {
			System.out.println("Invalid");
		}

	}

}
