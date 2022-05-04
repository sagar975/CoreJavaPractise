package Learning;

public class Practise {

	public void printPyramid() {

		// print the forward and reverse pyramid

		for (int i = 1; i <= 5; i++) {

			for (int p = 5; p > i; p--) {

				System.out.print(" ");

			}

			for (int k = 1; k <= i; k++) {

				System.out.print(" *");

			}

			System.out.println();

		}

	}

	public static int[] getSorted(int[] numbers) {

		int temp_var;

		for (int i = 0; i <= numbers.length - 1; i++) {

			for (int p = i + 1; p <= numbers.length - 1; p++) {

				if (numbers[p] < numbers[i]) {

					temp_var = numbers[p];

					numbers[p] = numbers[i];

					numbers[i] = temp_var;

				}

			}

		}

		return numbers;

	}

	public static void main(String[] args) {

		int[] num = { 3, 23, 4, 56, };

		int[] sorted = getSorted(num);

		for (int i : sorted) {

			System.out.println(i);

		}

	}
	
		

}
