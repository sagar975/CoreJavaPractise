
public class DecimaltoBinary {

	public static void main(String[] args) {

		int number = 15;

		int raminer;

		int quitoient;

		String temp = "";

		if (number == 0) {

			System.out.println(0);

			return;

		}

		while (number != 0) {

			if (number % 2 == 0) {

				temp += 0;

			}

			else {

				temp += 1;
			}

			number = number / 2;

		}

		StringBuilder sb = new StringBuilder(temp);

		System.out.println(sb.reverse());

	}

}
