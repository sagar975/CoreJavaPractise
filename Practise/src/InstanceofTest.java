class Factory {

}

class Pepole extends Factory {

	public static void foo(Factory f) {

		if (f instanceof Factory) {

			System.out.println("working");

		}

	}

}

public class InstanceofTest {

	public static void main(String[] args) {

		// System.out.println("/\"Hello\"/");

		System.out.println("/'Hello'/");

		System.out.println("\"hello\"");

		System.out.println("i \"love\" java");

	}

}
