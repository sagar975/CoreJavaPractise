package Learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NumberRepition {

	public static void getDigitCount(int Number) {

		Map<Integer, Integer> mp = new HashMap();

		while (Number != 0) {

			int num = Number % 10;

			if (mp.containsKey(num)) {

				mp.put(num, mp.get(num) + 1);

			}

			else {

				mp.put(num, 1);
			}

			Number = Number / 10;

		}

		Set<Integer> st = mp.keySet();

		for (int a : st) {

			System.out.println(a + " " + "repeted of number of times : " + mp.get(a));

		}

	}

	public static void main(String[] args) {

		getDigitCount(223);

	}

}
