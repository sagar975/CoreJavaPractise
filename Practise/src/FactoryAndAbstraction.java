
abstract class PizzaStore {

	public Pizza orderPizza(String type) {

		Pizza pizza;

		pizza = createPizza(type);

		pizza.create();
		pizza.cut();
		pizza.bake();
		pizza.Wrap();

		return pizza;

	}

	abstract Pizza createPizza(String type);

}

class CheesePizza extends Pizza {

}

class ThinCrest extends Pizza {

}

class NewYorkStyle extends PizzaStore {

	Pizza piz;

	@Override
	public Pizza createPizza(String type) {

		if (type.equals("cheese")) {

			piz = new CheesePizza(); // polymorphic behaviour

		}

		return piz;
	}

}

class California extends PizzaStore {

	Pizza piz;

	@Override
	Pizza createPizza(String type) {

		if (type.equals("thincrest")) {

			piz = new ThinCrest(); // polymorphic behaviour

		}

		return piz;

	}

}

class Pizza {

	public void create() {

		System.out.println("pizza ready");

	}

	public void cut() {

		System.out.println("pizza sliced");

	}

	public void bake() {

		System.out.println("pizza baked");

	}

	public void Wrap() {

		System.out.println("pizza wrapped");
	}

}

public class FactoryAndAbstraction {

	public static void main(String[] args) {

	}

}
