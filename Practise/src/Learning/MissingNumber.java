package Learning;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MissingNumber {

	public static int getMissingNumber(int[] arr) {

		// time complexity with nested loop is : O(n2);

		Arrays.sort(arr); // before searching in array sorting is must

		int missing = 0;

		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i + 1] - arr[i] > 1) {

				missing = arr[i] + 1;

			}

		}

		return missing;

	}

	public void findDuplicateProduct() {

		// time complexity for operation is O(n)

		String[] products = { "biscuts", "breads", "tea", "coffee", "biscuts", "tea" };

		Set<String> set = new HashSet<String>();

		for (String prod : products) {

			if (set.add(prod) == false) {

				System.out.println("duplicate product in cart is " + " : " + prod);

			}

		}

	}

	public static void getDuplicateByHashMap() {

		// time complexity herre also is O(n)

		String[] products = { "biscuts", "breads", "tea", "coffee", "biscuts", "tea" };

		Map<String, Integer> mp = new HashMap();

		for (String pro : products) {

			if (mp.containsKey(pro)) {

				// System.out.println("duplicate product is " + pro);
				mp.put(pro, mp.get(pro) + 1);

			}

			else {

				mp.put(pro, 1);

			}

		}

		Set<String> keyset = mp.keySet();

		System.out.println("repition is as follows ");

		System.out.println("----------------");

		for (String ky : keyset) {

			if (mp.get(ky) > 1) {

				System.out.println("duplicates product is " + ky);

			}

		}

	}

	public static void foo(String s) {

	}

	public static void main(String[] args) {

		MissingNumber.getDuplicateByHashMap();

	}

}
