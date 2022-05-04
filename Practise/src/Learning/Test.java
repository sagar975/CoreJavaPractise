package Learning;

public class Test {

	public static void main(String[] args) {

		// int counter = 0;
		// String name = "I live with mom and Dad";

		// String reverse = "";

		// String str = null;
//
		// str += "sonawane";

		// System.out.println(str);
		// StringBuilder sb = new StringBuilder("sagar");

		// System.out.println(sb.hashCode());
		String name = "I live with mom and Dad sas pap";

		String[] array = name.split(" ");

		String reversed = "";
		int counter = 0;

		for (String str : array) {

			for (int i = str.length() - 1; i >= 0; i--) {

				reversed += str.charAt(i);
				if (str.equalsIgnoreCase(reversed)) {

					counter++;

					break;

				}

			}
			reversed = "";

		}

		System.out.println(counter);

	}

}
