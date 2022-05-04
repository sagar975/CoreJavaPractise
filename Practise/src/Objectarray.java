
class Season {

	private String name;
	private int price;

	public Season(String fname, int rate) {

		this.name = fname;
		this.price = rate;

	}

	public String toString() {

		return "hello " + this.price + this.name;

	}

}

public class Objectarray {

	public static void main(String[] args) {

		Object[] array = new Object[3];

		array = new Season[3];

		array[0] = new Season("mango", 1000);
		array[1] = new Season("chikoo", 50);
		array[2] = new Season("grapes", 6000);

		for (Object o : array) {

			System.out.println(o.toString());

		}

	}

}
