
class Country {

	public void getCmOfState(Country name) {

		System.out.println("thackery");

	}

}

interface President {

	public abstract void presedentrule();

	default void common() {

		System.out.println("this is commom stuff of preseident");

	}

	static void uncommon() {

		System.out.println("not common stuff of president");

	}

}

class Bat {

	public void getYourBrand(String bat_name, Mrf m) {

		System.out.println("brand of your bat is " + bat_name);

	}

}

class Mrf {

	public void useBat() {

		new Bat().getYourBrand("SG", this);

	}

}

class Kookabura {
	public void useBat() {

	}

}

class Maharashtra extends Country {

	public void getOwnCm(Maharashtra m) {

		System.out.println("this is pepole elected cm  " + "Fadanvis");

	}

	public void getCmOfState(Country name) {

		System.out.println("devendra fadanvis");

	}

}

public class InheritancePrac {

	public static void main(String[] args) {

		Country c = new Country();

		Maharashtra mh = new Maharashtra();

		Country count = new Maharashtra();

		new Mrf().useBat();

	}

}
