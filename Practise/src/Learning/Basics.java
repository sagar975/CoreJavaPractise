package Learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Calculate {

	public static int getPowerOfEnteredNumber(int number) {

		int result = 1;

		System.out.println("Enter your Power");
		Scanner sc = new Scanner(System.in);
		int power = sc.nextInt();

		if (power == 0) {

			return 1;

		}

		else if (power > 1) {

			while (power != 0) {
				result = result * number;
				power--;

			}

		}

		return result;

	}

}

public class Basics {

	public static void main(String[] args) {

		System.out.println(Calculate.getPowerOfEnteredNumber(500));
		
		
		
		
		
		
		
		
		

	}
}
