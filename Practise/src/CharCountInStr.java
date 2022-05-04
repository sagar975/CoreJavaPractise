import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CharCountInStr {

	public static void main(String[] args) {

		String name = "vishal";

		char[] arr = name.toCharArray();

		Map<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char c : arr) {

			if (hm.containsKey(c)) {

				hm.put(c, hm.get(c) + 1);

			}

			else {

				hm.put(c, 1);

			}

		}

		/*
		 * 
		 * 
		 * Set<Entry<Character, Integer>> entry = hm.entrySet();
		 * 
		 * Iterator<Entry<Character, Integer>> it = entry.iterator();
		 * 
		 * while (it.hasNext()) {
		 * 
		 * System.out.println(it.next());
		 * 
		 * }
		 */
		Set<Character> charset = hm.keySet();

		for (char c : charset) {

			System.out.println(c + " :" + hm.get(c));

		}

	}

}
