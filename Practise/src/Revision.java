
public class Revision {

	public static void main(String[] args) {

		int number = 20;

		boolean flag = true;

		if (number == 0 || number == 1) {

			System.out.println("number is not prime");

			return;

		}

		for (int i = 2; i < number / 2; i++) {

			if (number % i == 0) {

				flag = false;

				System.out.println("number is not prime");

				break;
			}

		}

		if (flag) {

			System.out.println("number is prime");

		}

	}

}
