package Learning;

public class StringLengh {

	static int counter = 0;

	public static int getLength(String string) {

		char[] arr = string.replace(" ", "").toCharArray();

		for (char c : arr) {
			counter++;

		}

		return counter;

	}

	public static int getLength2(String input) {

		int i = 0;
		try {
			while (true) {
				input.charAt(i);
				i++;

			}

		}

		catch (ArrayIndexOutOfBoundsException ex) {

			// return i;

		}

		return i;

	}

	public static void main(String[] args) {

		// System.out.println(StringLengh.getLength(" s a g a r "));

		// System.out.println(StringLengh.getLength("sagar"));

		String s = "sag$#$^&";

		s.replaceAll("[a-zA-Z0-9]", "");

		StringBuilder sb = new StringBuilder("sagar");

		sb.append("sonawane");

		System.out.println(sb); // mutuable ob

	}

}
