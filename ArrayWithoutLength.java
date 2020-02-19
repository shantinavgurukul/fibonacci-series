package simple;

public class ArrayWithoutLength {
	public static void main(String args[]) {
		int count = 0;
		int numbers[] = { 23, 87, 9, 3, 5, 2};
		for  ( int index :numbers) {
			System.out.println(index);

			count = count + 1;
		}

		System.out.println("count:" + count);

	}

}
