package Learning;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class HashingPractise {

	public static void main(String[] args) {

		HashMap<String, Integer> hashmap = new HashMap();

		Hashtable<String, Integer> hashtable = new Hashtable();

		hashmap.put("sagar", 123);
		hashmap.put("Vishal", 98765);
		hashmap.put("maddy", 2345);
		hashmap.put("deaay", 34567);

		// hashtable.put(null, 23);
		// hashtable.put("sammyi", 5);

		// System.out.println(hashtable.size());
		// System.out.println(hashtable.get("sammyi"));

		Set<String> keyset = hashmap.keySet();

		for (String key : keyset) {

			System.out.println(key + ":" + hashmap.get(key));

		}

	}

}
