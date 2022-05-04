package Learning;

abstract class Heppo {

	public abstract void foo();

	public static final void foo2() {

	}

}

class Godies {

	public void foo() {

		System.out.println("acts as a god in parent");
	}

}

class Humanoid extends Godies {

	public void foo() {

		super.foo();

		System.out.println("acts as humaanoid in child");

	}

}

public class OverridingTricky {

	static int id = 1;

	public OverridingTricky() {

		id++;

		System.out.println(id);

	}

	public static void main(String[] args) {

	}

}
