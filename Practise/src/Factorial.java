
public class Factorial {

	public static int fact = 1;
	public static int var = 1;

	public static int getFactorialusingforloop(int value) {

		int factorial = 1;

		for (int i = 1; i <= value; i++) {

			factorial = factorial * i;

		}

		return factorial;

	}

	public static int getFactorialWhileloop(int var) {

		int fact = 1;

		int num = 1;
		while (num <= var) {

			fact = fact * num;
			num++;

		}

		return fact;

	}

	public static void acceptNum(int num) {

		getfactorialvalue(num);

	}

	public static void getfactorialvalue(int val) {

		fact = fact * var;
		var++;

		if (var > val) {

			System.out.println("factorial value is " + fact);

			return;
		}

		acceptNum(val);

	}

	public static void main(String[] args) {

		int num = 5;

		// System.out.println("factorial using for loop" + " = " +
		// getFactorialusingforloop(num));

		// System.out.println("factorial using while loop" + " = " +
		// getFactorialWhileloop(num));

		acceptNum(num);

	}

}
