import java.util.Scanner;

public class Numwotloop {

	public static int i = 1;

	public static void increment(int value) {

		System.out.println(value);
		value++;

		if (value > 100) {

			return;
		}
		print(value);

	}

	public static void print(int valu2) {

		increment(valu2);

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a number");

		int num = sc.nextInt();

		if (num < 100) {

			increment(num);

		}

		else {

			System.out.println("value is more than ");
			return;
		}

	}

}
