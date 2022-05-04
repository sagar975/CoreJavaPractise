package Learning;

import java.util.Set;

import java.util.TreeSet;

public class GenericPra2 {

	public static String name = "sagar";

	public static String caller;

	public static String temp = "";

	public static void acceptString(String var) {

		temp += var.charAt(var.length() - 1);

		int finalindex = var.length() - 1;

		if (finalindex == 0) {

			System.out.println(temp);

			return;

		}

		call(var.substring(0, finalindex));

	}

	public static void call(String value) {

		acceptString(value);

	}

	public static void main(String[] args) {

		// GenericPra2.acceptString(name);

		String foo = "sagar";

		call(foo);

	}

}
