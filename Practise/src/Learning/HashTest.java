package Learning;

import java.util.HashMap;
import java.util.Map;

class Safari {

	private String name;

	public Safari(String name) {

		this.name = name;

	}

}

class XUV {
	private String name;

	public XUV(String name) {

		this.name = name;

	}

}

class Skoda {

	private String name;

	public Skoda(String name) {

		this.name = name;

	}

}

class Suzuki {

	private String name;

	public Suzuki(String name) {

		this.name = name;

	}

	@Override
	public boolean equals(Object o) {

		if (o instanceof Suzuki) {

			Suzuki s = (Suzuki) o;

			if (this.name == s.name) {

				return true;

			}

		}

		return false;

	}

	@Override
	public int hashCode() {

		return 6;
	}

}

public class HashTest {

	public static void main(String[] args) {

		String name = "sagar";

		Map<Object, Object> mp = new HashMap<Object, Object>();

		mp.put("k1", new Safari("tatasfari"));
		mp.put("k2", new XUV("xov 500"));

		mp.put(new Suzuki("vitara"), new Suzuki("Brezz"));

		mp.put(null, new Safari("oldsafari"));

		// System.out.println(mp.get(new Suzuki("vitara")));

		String[] test = { " a", "A", "C", "        F", "E" };

	
	}

}
