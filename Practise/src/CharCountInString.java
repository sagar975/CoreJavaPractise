import Learning.Learning;

class Car {

	public String car;

	public Car(String car) {

		this.car = car;

	}

	public boolean equals(Object o) {

		Car c = (Car) o;

		if (c instanceof Car && c.car == this.car) {

			return true;
		}

		else {

			return false;
		}

	}

}

class Car2 {

	public String Car;

	public Car2(String car) {

		this.Car = car;

	}

}

public class CharCountInString {

	public static void main(String[] args) {

		Car ob = new Car("maruti");

		Car ob2 = new Car("maruti2");

		System.out.println(ob.equals(ob2));

	}

}
