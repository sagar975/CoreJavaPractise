package Learning;

import java.util.Arrays;

public class SortArray {

	public static void sortAsc(int[] num) {

		int temp;

		for (int i = 0; i < num.length; i++) {

			for (int p = i + 1; p < num.length; p++) {

				if (num[p] < num[i]) {

					temp = num[i];

					num[i] = num[p];

					num[p] = temp;

				}

			}

		}

		for (int a : num) {
			System.out.println(a);

		}

	}

	public static void main(String[] args) {

		int[] arr = { 34, 4, 21, 3, 6, 0, -1, -3, -500 };

		// SortArray.sortAsc(arr);
		
		
		
		
		

	}

}
