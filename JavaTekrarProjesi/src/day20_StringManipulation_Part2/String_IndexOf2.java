package day20_StringManipulation_Part2;

public class String_IndexOf2 {

	public static void main(String[] args) {
		
		//index of with 2 values

		String list = "html-selenium-angular-jenkins-grid";
		
		int firstDash = list.indexOf("-");
		System.out.println("firstDash: " + firstDash);
	
		int secondDash = list.indexOf("-",5);
		System.out.println("SecondDash: " + secondDash);
		System.out.println(list.charAt(secondDash));
		
		int thirdDash = list.indexOf("-",secondDash+1);
		System.out.println("thirdDash: " + thirdDash);
		
		int lastDash = list.lastIndexOf("-");
		System.out.println("lastdash: " + lastDash);
		
		int fifthDash = list.indexOf("m", 0);
		System.out.println("fifthDash: " + fifthDash);
		
		int sixthDash = list.indexOf("j", 0);
		System.out.println("sixthDash: " + sixthDash);
		
	}

}
