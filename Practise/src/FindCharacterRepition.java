import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindCharacterRepition {

	public static void main(String[] args) {

		String name = "sagar";
		char[] array = name.toCharArray();

		Map<Character, Integer> mp = new HashMap();

		for (char c : array) {

			if (mp.containsKey(c)) {

				mp.put(c, mp.get(c) + 1);

			} else {
				mp.put(c, 1);
			}

		}

		for (Map.Entry entry : mp.entrySet()) {

			System.out.println(entry.getKey() + " :" + entry.getValue());

		}

	}

}
