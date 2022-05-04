package Learning;

import java.util.HashMap;
import java.util.Map;

public class Count {

	public static int lowerDigit = 0;
	public static int upperDigit = 0;

	public static void countCases(String string) {

		String valid = string.replaceAll("^a-zA-Z47", "");
		System.out.println(valid);

		for (int i = 0; i < string.length(); i++) {

			if (Character.isUpperCase(string.charAt(i))) {
				upperDigit++;

			}

			else if (Character.isLowerCase(string.charAt(i))) {
				lowerDigit++;

			}

		}

		System.out.println("total number of lowers character are " + " :" + lowerDigit);
		System.out.println("total number of upper character are " + " :" + upperDigit);

	}

	public static void main(String[] args) {

		Count.countCases("sag47&*%$");

		String value = "sagar$";

		String formatted = value.replaceAll("[^a-zA-z0-9]", ""); // regular expression

		System.out.println(formatted);

	}

}
