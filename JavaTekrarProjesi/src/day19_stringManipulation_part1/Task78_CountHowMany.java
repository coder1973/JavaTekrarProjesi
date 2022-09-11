package day19_stringManipulation_part1;

public class Task78_CountHowMany {

	public static void main(String[] args) {
		/**
		 * Write a program to count the number of occurrences for specific char 
		 * String word = "abcabqcabc” 
		 * Number of a in this string is: 3
		 */
		
		String word = "abcabqcabcadrtaaag" ;
//		
//		char myChar = 'a';
//		
//		int count = 0;
//		
//		for (int i = 0; i < word.length(); i++) {
//			
//			if (word.charAt(i)==myChar) {
//				
//				count++;
//			}
//			
//		}
//			System.out.println(count);
		
		//Yontem	
		String str = "helloslkhellodjladfjhello";
		String findStr = "hello";
		int lastIndex = 0;
		int count = 0;

		while(lastIndex != -1){

		    lastIndex = str.indexOf(findStr,lastIndex);

		    if(lastIndex != -1){
		        count ++;
		        lastIndex += findStr.length();
		    }
		}
		System.out.println(count);
		
		//Yontem
		int count1=(str.split("hello", -1).length)-1;
		System.out.println(count1);
		
		//int indexOf(String target, int fromIndex);
		/** hedefi her zamanki gibi soldan sağa arar, ancak aramayı verilen fromIndex'te başlatır.
		fromIndex'in aslında geçerli olması gerekmez. Negatifse, arama dizenin başından itibaren
		gerçekleşir. fromIndex dize uzunluğundan büyükse, -1 döndürülür.*/
		
		/**int lastIndexof(String hedef, int fromIndex) -- verilen fromIndex'ten başlayarak sağdan sola 
		 arama yapar.*/
	}

}
