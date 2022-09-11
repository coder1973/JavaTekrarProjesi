package day19_stringManipulation_part1;

public class hasBad_Question {
	
	
	public static void main(String[] args) {
		
		String str = "xxbad";
		System.out.println(hasBad(str));

		
	}
	
	public static boolean hasBad(String str) {
		
		if (str.length()<3) {
			return false;
		} else if(str.substring(0, 3).equals("bad")){
			return true;
		}else if(str.length()>3){
			if(str.substring(1, 4).equals("bad")) {
				return true;
			}
			
		}
		return false;
		

		}
		
	}

