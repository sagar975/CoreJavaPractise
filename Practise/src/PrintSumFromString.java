
public class PrintSumFromString {

	public static int getSum(String seq) {

		int sum = 0;
		char[] array = seq.toCharArray();
		for (char c : array) {

			if (Character.isDigit(c)) {

				String temp = String.valueOf(c);

				int val = Integer.parseInt(temp);

				sum = sum + val;

			}

		}

		return sum;

	}

	public static void getTrickySum(String seq) {

		int sum = 0;

		String first_num = "";

		// [] array = seq.toCharArray();

		for (int i = 0; i < seq.length(); i++) {

			if (Character.isDigit(seq.charAt(i))) {

				first_num += seq.charAt(i);

				if (first_num.length() == 2) {

					sum = sum + Integer.parseInt(first_num);

					first_num = "";

				}

			}

			else if (!Character.isDigit(seq.charAt(i))) {
				continue;

			}

		}

		System.out.println(sum);

	}

	public static void main(String[] args) {

		String num = "sagar10so30naqwq";

		PrintSumFromString.getTrickySum(num);

	}

}
