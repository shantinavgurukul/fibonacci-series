package simple;

public class ArrayMax {
	public static void main(String args[]) {
		int[] numbers = { 50, 40, 23, 70, 56, 12, 5, 10, 7 };
		int max = 0;
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] > max) {
				max = numbers[index];
			}
		}
		System.out.println("max" + "=" + max);
	}

}
