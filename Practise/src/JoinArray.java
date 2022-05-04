import java.util.Scanner;

public class JoinArray {

	// join two arrays

	// check enterend value is present in array

	static boolean flag;
	public static Scanner sc;

	private static int[] combine;

	public static void getMergedArray() {

		for (int num : combine) {

			System.out.println(num);

		}

	}

	public static boolean checkPresence() {

		int[] array = { 11, 22, 33, 5, 6, 7 };

		sc = new Scanner(System.in);
		System.out.println("entered your number");
		int userinput = sc.nextInt();

		for (int i = 0; i < array.length; i++) {

			if (userinput == array[i]) {

				System.out.println("number is present in array at index position" + i);

				flag = true;

				break;

			}

			else {

				flag = false;

			}

		}

		System.out.println("element is not present in array");

		return flag;

	}

	public static void main(String[] args) {

		// join two array

		int[] number1 = { 1, 2, 3, 4, 5, 6 };

		int[] number2 = { 7, 8, 9, 10 };

		int counterindex = 0;

		combine = new int[number1.length + number2.length];

		for (int i = 0; i < number1.length; i++) {

			combine[counterindex] = number1[i];
			counterindex++;

		}

		for (int j = 0; j < number2.length; j++) {

			combine[counterindex] = number2[j];

			counterindex++;

		}

		// getMergedArray(); not using now

		System.out.println(checkPresence());

	}

}
