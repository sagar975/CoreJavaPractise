
public class Fibonaccai {

	public static void main(String[] args) {

		// sample of fibonacci series 0 1 1 2 3 5 8 13

		int limit = 10;

		int first = 0;

		int second = 1;

		System.out.println(0);

		for (int i = 1; i < limit; i++) {

			int sum = first + second;

			first = second;

			second = sum;

			System.out.println(second);

		}

	}

}
