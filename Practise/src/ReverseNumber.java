import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		String test = "XoR!@nT!123@#";

		String charcerts = "";

		String others = "";

		for (int i = 0; i < test.length(); i++) {

			if (Character.isAlphabetic(test.charAt(i)) || Character.isDigit(test.charAt(i))) {

				charcerts += test.charAt(i);

			}

			else {

				others += test.charAt(i);

			}

		}

		System.out.println(charcerts);

		System.out.println(others);

	}

}
