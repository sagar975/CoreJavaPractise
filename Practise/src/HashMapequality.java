import java.util.AbstractMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

class Bus {

	int Busnumber = 123;

	public int hashCode() {

		return 1;

	}

	public boolean equals(Object o) {

		return true;

	}

}

class Truck {

}

public class HashMapequality {

	public static void main(String[] args) {

		String s = "sagar";

		String p = "sagar";

		HashMap<Bus, String> hm = new HashMap<Bus, String>();

		HashMap<Bus, String> hm2 = new HashMap<Bus, String>();

		HashSet set1 = new HashSet();

		// HashMap<Character, String> one = new HashMap<Character, String>();

		System.out.println(hm.equals(hm2));
		System.out.println(hm.hashCode());
		System.out.println(hm2.hashCode());

	}

}
