package Learning;

public class SortArrayOfNumbers {

	public static void SortArray(int[] numbers) {

		int temp;

		for (int i = 0; i < numbers.length; i++) {

			// This loop will sort the element in Descending element

			for (int k = i + 1; k < numbers.length; k++) {

				if (numbers[i] > numbers[k]) {

					temp = numbers[i];
					numbers[i] = numbers[k];
					numbers[k] = temp;

				}

			}

		}

		for (int num : numbers) {

			System.out.println(num);

		}

	}

	public static void main(String[] args) {

		int[] numbers = { 10, 15, 1, 12, 3 };

		SortArrayOfNumbers.SortArray(numbers);

	}

}
