package Learning;

class God {

	final int number = 4;

}

class Humannn extends God {

	public void printNUm() {

		System.out.println(number); // final member can be inherited but cant modify , private cant inherit

	}

}

interface Service {

	public final static int num = 3;

	public abstract void foo();

}

public class BoxingWidening {

	public static int foo(Byte a) {

		return a;

	}

	public static void main(String[] args) {

		// short num = 4;

		/// System.out.println(BoxingWidening.foo(num)); compile error cant call object
		/// type with primitive though in memory its small

		boolean flag = true;

		int counter = 0;

		int[] values = { 23, 34, 23, 34, 8 };

		for (int i = 0; i < values.length; i++) {

			for (int p = 0; p < values.length; p++) {

				if (i != p) {

					if (values[i] != values[p]) {

						counter = 1;

					} else {

						flag = true;

						break;

					}

				}

				if (counter == 1) {

					System.out.println(values[i]);

				}

			}

		}

	}

}
