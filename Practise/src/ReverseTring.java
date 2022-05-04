
class c {

}

public class ReverseTring {

	public static String reverseName(String name) {

		String temp = "";

		for (int i = name.length() - 1; i >= 0; i--) {

			temp += name.charAt(i);

		}

		return temp;

	}

	public static String reverseFullname(String name) {

		String[] arr = name.split(" ");

		String temp = "";

		for (int i = arr.length - 1; i >= 0; i--) {

			temp += arr[i] + " ";

		}

		return temp;

	}

	public static String reverse(String arg) {

		String[] arr = arg.split(" ");

		String temp = "";

		for (int i = arr.length - 1; i >= 0; i--) {

			temp += arr[i] + " ";

		}

		return temp;

	}

	public static void main(String[] args) {

		// System.out.println(ReverseTring.reverseName("sagar"));

		// System.out.println(ReverseTring.reverseFullname("sagar khandu sonawane"));

		// System.out.println(ReverseTring.reverse("sagar kahndu sonwane"));

		String name = "sagar khandu sonawane";

		String reversed = "";

		String[] array = name.split(" ");

		for (String str : array) {

			for (int i = str.length() - 1; i >= 0; i--) {
				reversed += str.charAt(i);
				break;

			}

			reversed += " ";

		}

	

	}

}
