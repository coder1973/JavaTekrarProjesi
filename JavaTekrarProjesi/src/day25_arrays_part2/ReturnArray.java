package day25_arrays_part2;

public class ReturnArray {

	public static void main(String[] args) {
		
		double[] values;
		
		values = getArray();
		
		for (double d : values) {
			System.out.println(d + " ");
		}
		

	}

	private static double[] getArray() {
		double[] array = {10.2, 2.3, 4.4, 5.6};
		return array;
	}

}
