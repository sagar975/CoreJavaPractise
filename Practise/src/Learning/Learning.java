package Learning;

import java.util.HashMap;
import java.util.Map;

interface Fruit {

	public Fruit fruit(String fruitname);

}

class Season implements Fruit {

	@Override
	public Fruit fruit(String fruitname) {

		Season s = new Season();

		if (s instanceof Fruit) {

			System.out.println("fruit name is " + fruitname);

		}

		return s;

	}

}

public class Learning {

	protected String cat = "mooo";

	protected Learning() {

		System.out.println(cat);
	}

	public static void main(String[] a) {

		Map mp = new HashMap();

		mp.put("sagar", 1);

		mp.put(1, "hello");

		mp.put(true, false);

		Fruit p = new Season().fruit("mango");

	}

}
