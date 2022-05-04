package Learning;

class Aniamal {

	String name;

	public Aniamal(String name) {

	}

	public Aniamal() {

	}

	public static String makeRandomString() {

		int num = (int) (Math.random() * 89);

		String element = new String[] { "sagar", "vishal", }[num];

		return element;

	}

}

public class ConstructorOverloading {

	public static void go() {

		foo();

	}

	public static void foo() {

		go();

	}

	public static void main(String[] args) {

		int c = 3;

		switch (c) {

		case 1:

			System.out.println("hi");

		case 2:
			System.out.println("hello");

		default:

			System.out.println("hello all");

		}

	}

}
