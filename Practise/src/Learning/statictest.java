package Learning;

class Doo {

	static int c = 2;

	public void hel() {

	}

	static {

		System.out.println("static block of class doo");

	}

}

public class statictest {

	public static final int age = 40;

	public static void main(String[] args) {

		String p = new String("sagar");

		String s = "sagar";

		String k = "sagar";

		System.out.println(s.hashCode());

		System.out.println(k.hashCode());

		System.out.println(p.hashCode());

		System.out.println(p == s);

		System.out.println(p == k);
	}

}
