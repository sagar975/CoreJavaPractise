package Learning;

import java.util.Arrays;

class Arrayf {

}

public class ArraysFill {

	// print 1 to 100 without recrusion, for loop

	public static void printNumbers(int num) {

		if (num <= 100) {

			System.out.println(num);

			num++;

			printNumbers(num++);

		}

	}

	public static void main(String[] args) {

		// printNumbers(0);

	}

}
