
public class CoreJavaTricks {

	public static void test() {

		int i = 4 / 0;

	}

	public static void main(String[] args) {

		try {
			test();
		}

		catch (Exception e) {

			e.printStackTrace();

		}

	}

}
