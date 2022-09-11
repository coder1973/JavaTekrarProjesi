package day20_StringManipulation_Part2;

public class String_Equals {
	
	public static void main(String[] args) {
		
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = "Welcome to C++";
		
		boolean b1 = s1.equals(s2);
		boolean b2 = s1.equals(s3);
		
		 /**equals() : metodu ile icerik karsilastirilmasi yapilir.
		      ==        : operatörü ile referans karşılaştırması (reference) (address comparison) 
		      				yapilmaktadir.*/
		System.out.println(b1 + "|" + b2);
		
		boolean b3 = s1==s2;
		boolean b4 = s1==s3;
		
		System.out.println(b3 + "|" + b4);
		
		String s4 = new String("Welcome to Java"); /**Bu sekilde de bir kullanim vardir, 
		buradan anladigimiz String clasindan bir object urettigimiz manasi cikmaktadir
		yani String'de bir object demektir. */ 
		
		System.out.println(s1==s4);/**Burada s1'in referansi farkli s4'un referansi farkli demektir.*/
		System.out.println(s1.equals(s4));
		
	}

}
