package Learning;

public class CorePatterns {

	public static void print() {

	}

	public static void combine() {

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*");

			}

			System.out.println();

		}

		for (int i = 0; i <= 5; i++) {

			for (int p = 5; p > i; p--) {

				System.out.print("*");

			}

			System.out.println();

		}

	}

	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) {

			for (int j = 4; j >= i; j--) {

				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) {

				System.out.print(" *");

			}

			System.out.println();

		}

	}

}
