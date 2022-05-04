package Learning;

import java.util.ArrayList;
import java.util.List;

public class TestOperator {

	private static List<Integer> list;

	private int sum = 0;

	int num = 0;

	public static int foo(int num) {

		return num += 0;

	}

	public static void main(String[] args) {

		String name = "sda23rt16a12";
		list = new ArrayList();

		String temp = "";

		StringBuilder sb;
		int testSum = 0;

		int tempsum = 0;

		int[] numbers = new int[6];

		for (int i = 0; i < name.length() - 1; i++) {

			sb = new StringBuilder();

			if (Character.isDigit(name.charAt(i)) && Character.isDigit(name.charAt(i + 1))) {

				sb.append(name.charAt(i)).append(name.charAt(i + 1));

				temp = sb.toString();

				tempsum += Integer.parseInt(temp);

				sb = null;

			}

		}

		System.out.println(tempsum);
	}

}