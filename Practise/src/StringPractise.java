
public class StringPractise {
	public static String str = "546897643";

	public static boolean check(String value) {

		for (int i = 0; i < value.length(); i++) {

			if (Character.isAlphabetic(value.charAt(i))) {

				return false;

			}

		}

		return true;

	}

	public static void main(String[] args) {

		// String names = "12dcvf&&##";

		// String newstring = names.replaceAll("[^a-zA-Z0-9]", "");

		// /"Hello"/

		System.out.println("\"Hello\"");

	}

}
