package day20_StringManipulation_Part2;

public class String_IndexOf {

	public static void main(String[] args) {
		
		String word1 = "github";
		System.out.println(word1.indexOf("g"));
		System.out.println(word1.indexOf("th"));
		System.out.println(word1.indexOf("hub"));
		
		System.out.println(word1.indexOf("java"));/**Burada "java" aradigimiz word1 icinde olmadigi 
		icin -1 deger doner */
		
		String url = "www.okta.com";
		int i = url.indexOf("."); /**Burada once ".'nin url icindeki index degerini buluyoruz 
		ve bunu int i'ye atiyoruz.*/
		System.out.println("Pos of . " + i );
		
		System.out.println(url.charAt(i+1));/**charAt(1) metodu ile index numarasi verilen element 
		char degerinden karsiligini aliriz*/
		System.out.println(url.charAt(0));
		
		/**find position of '-' and check if space is on right and left side*/
		String title = "Java - Google Search";
		int dash = title.indexOf("-"); /**once indexOf() metodu ile yerini sayisal olarak buluyoruz 
		ve bunu int dash'e sayisal olarak atiyoruz	*/  
		System.out.println("dash: " + dash);
		System.out.println(title.charAt(dash+2));
		System.out.println(title.charAt(dash-2));
		
		String country = "United States of America";
		int states = country.indexOf("States");
		System.out.println("Position of states: " + states);
		
		String word2 = "java, c++, python, tomcat, eclipse";
		//check if c++ is in the word2
		
		/**1) contains() metodunu kullanarak bulabiliriz*/
		
		if (word2.contains("c++")) {
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is not there");
		}
		
		/**indexOf() metodunu kullanarak bulabiliriz*///--->indexOf() metodunda aranilan degre yok ise -1 doner
		if (word2.indexOf("c++")>-1) {
			System.out.println("c++ is there");
		} else {
			System.out.println("c++ is not there");
		}
	}

}
