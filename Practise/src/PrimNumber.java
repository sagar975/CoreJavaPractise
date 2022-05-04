import java.util.Scanner;

public class PrimNumber {

	public static void main(String[] args) {

		boolean flag = true;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter a number");

		int num = sc.nextInt();

		if (num == 0 || num == 1) {

			System.out.println("num is not prime number");

			return;

		}

		else {

			for (int i = 2; i <= num / 2; i++) {

				if (num % i == 0) {

					flag = false;
					break;

				}

			}

			if (flag) {

				System.out.println("number is prime");

			}

			else {

				System.out.println("number is not prime");

			}

		}

	}

}
