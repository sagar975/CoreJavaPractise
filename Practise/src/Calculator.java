import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("please enter first number");

		int a = sc.nextInt();

		System.out.println("please enter second number");

		int b = sc.nextInt();

		char add = '+';
		char subtract = '-';
		char multi = '*';
		char dvide = '/';

		System.out.println("please select operation " + add + subtract + multi + dvide);

		char choice = sc.next().charAt(0);

		switch (choice) {

		case '+':

			System.out.println(a + b);

			break;

		case '-':

			System.out.println(a - b);

			break;

		case '/':

			try {
				System.out.println(a / b);
			}

			catch (Exception e) {

				System.out.println("cant divide by zero");
			}

		default:

			System.out.println("please select right operation");

		}

	}

}
