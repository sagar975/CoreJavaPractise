import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomHashset {

	private static final Object present = new Object();

	public static HashMap<Object, Object> mp = null;

	public CustomHashset() {

		mp = new HashMap<>();

	}

	public boolean add(Object o) {

		return mp.put(o, present) == null;

	}

	public int getSize() {

		return mp.size();

	}

	public Iterator getIterator() {

		return mp.keySet().iterator();

	}

	public static void main(String[] args) {

		CustomHashset object = new CustomHashset();
		object.add("sagar");
		object.add(1);
		object.add(4.15);

		Iterator it2 = object.getIterator();

		while (it2.hasNext()) {

			object.add("saonaw");

		
		}

	}

}
