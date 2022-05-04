package Learning;

class A {

}

class B extends A {

}

public class Tenor {

	static String s = "-";

	public static void main(String[] args) {

		A[] aa = new A[2];
		B[] ba = new B[2];

		Tenor.sifter(ba);
		Tenor.sifter(4);

		System.out.println(s);

	}

	static void sifter(A[]... a2) {
		s += "1";
	}

	static void sifter(B[]... b1) {
		s += "2";
	}

	static void sifter(Object o) {
		s += "4";
	}

	static void sifter(int o) {
		s += "5";
	}

}
