package day25_arrays_part2;

public class PassElements {

	public static void main(String[] args) {

		int[] numbers = { 5, 10, 15, 20, 25, 30, 35 };

		for (int value : numbers) {

			showValue(value);

		}

	}

	private static void showValue(int value) {
		System.out.println(value + " ");

	}

}
