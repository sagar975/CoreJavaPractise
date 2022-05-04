package Learning;

class Meat {

	public static void getChicken() {

		System.out.println("chicken available in parent class");
	}

	public void foo() {

		System.out.println("this is foo method");

	}

}

class Dukkar extends Meat {

	public static void getChicken() {

		System.out.println("Mutton available in child class");

	}

}

public class ObjectsBasics extends Dukkar {

	public static void main(String[] args) {

		// System.out.println(Dukkar.name);

		Dukkar duk = new Dukkar();

		Meat meat = new Dukkar();

		Meat m = null;

		duk = null;

		// duk.getChicken();

		// meat.getChicken();

		m.getChicken();

		duk.getChicken();

	}

}
