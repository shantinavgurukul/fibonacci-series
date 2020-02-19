package simple;

public class ArrayCount {
	public static void main(String args[]) {
		int count = 0;
		int[] numbers = { 50, 40, 23, 33, 70, 56, 12, 5, 10, 7 };
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > 20 && numbers[index] < 40) {
				System.out.println(numbers[index]);

				count = count + 1;

			}
		}
		System.out.println(count);

	}

}
