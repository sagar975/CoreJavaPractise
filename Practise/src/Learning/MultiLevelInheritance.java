package Learning;

interface Behaviour {

	abstract void anger();

	abstract void happiness();

	abstract void jelleous();

	abstract void lust();

}

abstract class Soul implements Behaviour {

	public void anger() {

	}

}

class FruitsMonth {

	public void sellfruit() {

	}

}

class Chickooo extends FruitsMonth {

	public void hello() {

		System.out.println("in FruitsMonth");

	}

}

public class MultiLevelInheritance {

	public static void main(String[] args) {

		FruitsMonth f = new FruitsMonth();

		Chickooo c = new Chickooo();

		((Chickooo) f).hello();

		((Chickooo) c).hello();

	}

}
