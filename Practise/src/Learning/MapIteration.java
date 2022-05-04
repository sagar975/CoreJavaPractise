package Learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIteration {

	public static void main(String[] args) {

		ArrayList<String> compnames = new ArrayList();
		ArrayList<Integer> emp = new ArrayList();

		Map<String, Integer> empldata = new HashMap();
		empldata.put("Amazon", 1000);
		empldata.put("Google", 500);
		empldata.put("wallmart", 5000);

		Iterator<Entry<String, Integer>> it = empldata.entrySet().iterator();
		Set<String> st = empldata.keySet();

		for (String key : st) {
			compnames.add(key);
			emp.add(empldata.get(key));

		}

		for (int employee : emp) {

			System.out.println(employee);
		}

	}

}
