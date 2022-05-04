package Learning;

import java.util.Arrays;

import java.util.Scanner;

public class SortAndSearch {

	public static int check() {
		String[] fruits = { "mango", "apple", "chickoo", "gua" };

		Scanner sc = new Scanner(System.in);

		System.out.println("enter fruit name");

		String var = sc.next();

		for (int i = 0; i < fruits.length; i++) {

			if (var.equalsIgnoreCase(fruits[i])) {

				return i;
			}

		}
		System.out.println("fruit is not available in cart");

		return -1;

	}

	public static void main(String[] args) {

		check();

	}

}
