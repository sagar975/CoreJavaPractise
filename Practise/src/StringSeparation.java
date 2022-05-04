
public class StringSeparation {

	public static void main(String[] args) {

		String str = "abc#%&1234";

		String alphanumeric = "";
		String specialCharacter = "";

		for (int i = 0; i < str.length(); i++) {

			if (Character.isAlphabetic(str.charAt(i)) || Character.isDigit(str.charAt(i))) {

				alphanumeric += str.charAt(i);

			}

			else if (!Character.isAlphabetic(str.charAt(i)) && !Character.isDigit(str.charAt(i))) {

				specialCharacter += str.charAt(i);
			}

		}

		System.out.println(alphanumeric);
		System.out.println(specialCharacter);

	}

}
