
public class UniqueElement {

	public static void main(String[] args) {

		// find uniqe elements in array in java

		int count = 0;

		int falg = 0;

		int[] numbers = { 3, 3, 9, 7, 7, 8, 8, 5 };

		for (int i = 0; i < numbers.length; i++) {

			for (int p = 0; p < numbers.length; p++) {

				if (i != p) {

					if (numbers[i] != numbers[p]) {

						falg = 1;

					} else {

						falg = 0;
						break;

					}

				}

			}

			if (falg == 1) {

				// count++;

				System.out.println(numbers[i]);

			}

		}

	}

}
