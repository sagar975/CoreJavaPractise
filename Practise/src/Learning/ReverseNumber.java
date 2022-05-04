package Learning;

public class ReverseNumber {

	static String reversedNumber = "";

	public static int getReversal(int number) {

		while (number != 0) {
			reversedNumber += number % 10;

			number = number / 10;
			if (number > 0) {
				getReversal(number);

			}
			break;

		}

		return Integer.parseInt(reversedNumber);

	}

	public static void printNumbers(int number) {
		System.out.println(number);

		if (number != 100) {

			number++;

			printNumbers(number);

		}

		return;

	}

	public static void main(String[] args) {

		// System.out.println(ReverseNumber.getReversal(12345));

		// System.out.println(1 % 10);

	}

}
