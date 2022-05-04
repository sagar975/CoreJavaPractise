package Learning;

public class ReverseEachSTring {

	public static void main(String[] args) {

		String str = "";
		String name = "khandu sonawane";
		String[] array = name.split(" ");

		for (String s : array) {

			for (int i = s.length() - 1; i >= 0; i--) {

				str += s.charAt(i);

			}

			str += " ";

		}

		System.out.println(str);

	}

}
