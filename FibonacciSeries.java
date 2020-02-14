package simple;

public class FibonacciSeries {
	public static void main(String args[]) {
		int number=0;
		int number2=1;
		int count;
		for(int fibo=0;fibo<=10;fibo++) {
			count=number+number2;
			System.out.println(count);
			number=number2;
			number2=count;
		}
	}
	

}
