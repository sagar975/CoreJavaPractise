
public class CommonInArray {

	public static void main(String[] args) {

		// find common elements in array in java

		int[] first = { 3, 11, 34, 5, 7 };

		int[] second = { 44, 98, 11, 47, 3 };

		for (int i = 0; i < first.length; i++) {

			for (int p = 0; p < second.length; p++) {

				if (first[i] == second[p]) {

					System.out.println("common elements in array are  : " + "  " + first[i]);

				}

			}

		}

	}

}
