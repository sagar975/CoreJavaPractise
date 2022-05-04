package Learning;

public class Wrapping {

	public static void get(int a) {

		System.out.println(a + 1);

	}

	public static void get() throws Exception {

		try {
			get2();
		}

		catch (Exception e) {

			System.out.println("exception in get2 call");

		}

	}

	public static void get2() throws Exception {

		try {
			get3();
		}

		catch (Exception e) {

			System.out.println("your Exception is handele");

		}

		System.out.println("hello");

		get3();

	}

	public static void get3() throws Exception {

		throw new Exception();

	}

	public static void main(String[] args) {

	}
}
