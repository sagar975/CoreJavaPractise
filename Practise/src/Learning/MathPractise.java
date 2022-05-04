package Learning;

public class MathPractise {

	public static void main(String[] args) {

		System.out.println(1 / 0);
		int[] ia = { 1, 3, 5, 7, 9 };

		for (int x : ia) {

			for (int j = 0; j < 3; j++) {
				if (x > 4 && x < 8) {
					continue;
				}

				System.out.print(" " + x);

				if (j == 1) {
					break;
				}

				continue;
			}
			continue;
		}
	}
}
