package day10_controlFlowStatements;

public class task44_SpeedConverter {

	public static void main(String[] args) {
		/**
		 * Your friend Mike Smith just inherited a European sports car from his uncle.
		 * Mike lives in the USA, and he is afraid he will get a speeding ticket because
		 * the car’s speedometer indicates kilometers per hour(KPH). He has asked you to
		 * write a program that displays a table of speeds in kilometers per hour with
		 * their values converted to miles per hour(MPH). The formula for converting KPH
		 * to 
		 * MPH is: MPH = KPH * 0.6214 
		 * The table that your program displays should
		 * show speeds from 60 kilometers per hour thru 130 kilometers per hour, in
		 * increments of 10, along with their values converted to miles per hour. The
		 * table should look like something like this:
		 */

		final int STARTING_KPH=60;
		final int MAX_KPH = 130;
		final int INCREMENT=10;
		
		int kph;
		double mph;
		
		System.out.println("KPH\t\tMPH");
		System.out.println("----------------p-");
		
		for (kph =STARTING_KPH; kph <= MAX_KPH; kph+=INCREMENT) {
			
			mph = kph * 0.6214;
			
			System.out.println(kph + "\t\t" + mph);
			
		}
	}

}
