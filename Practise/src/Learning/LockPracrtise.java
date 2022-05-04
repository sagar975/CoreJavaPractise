package Learning;

class Vehicle implements Runnable {

	public static synchronized void getVehicleResource() {

		for (int i = 0; i <= 2; i++) {

			System.out.println("current production vehicle is " + Thread.currentThread().getName());

		}

	}

	public void run() {

		getVehicleResource();

	}

}

class Truck implements Runnable {

	public static synchronized void drive() {

		for (int i = 0; i <= 2; i++) {

			System.out.println("driver your truck" + Thread.currentThread().getName());

		}

	}

	@Override
	public void run() {

		drive();

	}

}

public class LockPracrtise {

	public static void main(String[] args) {

		Vehicle vh = new Vehicle();

		Truck tr = new Truck();

		Thread one = new Thread(vh);

		Thread two = new Thread(tr);

		two.setName("tata");

		one.setName("truck");

		one.start();
		two.start();

	}

}
