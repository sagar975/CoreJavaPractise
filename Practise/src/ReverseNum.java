import java.util.Scanner;

public class ReverseNum {

	public static int getReversalNumber(int num) {

		String reverse = "";

		while (num != 0) {

			reverse += num % 10;
			num = num / 10;

		}

		int newnum = Integer.parseInt(reverse);

		return newnum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(ReverseNum.getReversalNumber(12345));

		/*
		 * 
		 * int year = 2020; if (year % 400 == 0) {
		 * 
		 * if (year % 4 == 0) {
		 * 
		 * System.out.println("leap year"); }
		 * 
		 * }
		 * 
		 * else {
		 * 
		 * System.out.println("not leap year"); }
		 * 
		 */

	}

}
