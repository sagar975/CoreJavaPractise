package Learning;

interface Behavoiur {

	void eat();
}

class Animals implements Behavoiur {

	@Override
	public void eat() {
		System.out.println("Animals are eating");

	}

}

class Birds implements Behavoiur {

	@Override
	public void eat() {

		System.out.println("Birds are eating");

	}

}

class Mamals implements Behavoiur {

	@Override
	public void eat() {

		System.out.println("Mamals are eating");

	}

}

public class DesignsPatterns {

	public static void eat(Behavoiur b) {

		if (b instanceof Animals) {

			b = new Animals();
			b.eat();

		}

		else if (b instanceof Birds) {

			b = new Birds();
			b.eat();

		}

		else if (b instanceof Mamals) {

			b = new Mamals();
			b.eat();

		}

	}

	public static void main(String[] args) {

		Birds b = new Birds();
		
		DesignsPatterns.eat(b);
		

	}

}
