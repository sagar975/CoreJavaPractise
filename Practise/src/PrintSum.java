
public class PrintSum {

	public static int getSum(int num) {

		int sum = 0;

		while (num != 0) {

			int digits = num % 10;

			sum += digits;

			num = num / 10;

		}

		return sum;

	}

	public static void main(String[] args) {

		System.out.println(PrintSum.getSum(1235));

	}

}
