
abstract class Test {

}

public class SortAndPrint {

	public static void main(String[] args) {

		int[] number = { 2, 11, 7, 8, 3, 4 };

		int[] odd_number = new int[3];

		int index = 0;

		int temp;

		for (int i = 0; i < number.length; i++) {

			for (int p = i + 1; p < number.length; p++) {

				if (number[i] > number[p]) {

					temp = number[i];

					number[i] = number[p];

					number[p] = temp;

				}

			}

		}

		System.out.println("printing sorted array in ascending order");

		for (int i = 0; i < number.length; i++) {

			if (number[i] % 2 == 0) {

				System.out.print(number[i] + "  ");
			}

			else {

				odd_number[index] = i;

				index++;

			}

		}

		for (int num : odd_number) {

			System.out.print(num + " ");

		}

	}

}
