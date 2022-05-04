
public class DigitsInNUmber {

	int counter = 0;

	public int getTotalDigits(int number) {

		while (number != 0) {
			counter++;

			number = number / 10;
		}

		return counter;

	}

	public static void main(String[] args) {

		System.out.println(new DigitsInNUmber().getTotalDigits(123445));

	}

}
