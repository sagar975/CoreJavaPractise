package Threading;

class JungleAnimal implements Runnable {

	// synchronized lock on object level and exisist per object
	// static synchronized lock is per class and only one lock is created

	public void animalEating() {
		for (int i = 1; i < 5; i++) {
			System.out.println("widanimal is eating with thread " + " :" + Thread.currentThread().getName());
		}

	}

	public void run() {
		animalEating();
	}

}

public class Mthreading {

	public static synchronized void main(String[] args) throws InterruptedException {

		/*
		 * JungleAnimal jungel = new JungleAnimal(); JungleAnimal jungel2 = new
		 * JungleAnimal();
		 * 
		 * Thread one = new Thread(jungel); one.setName("Jungly"); Thread two = new
		 * Thread(jungel2); two.setName("wild junglee");
		 * 
		 * two.start(); one.join();
		 * 
		 * 
		 */
		Thread t = new Thread();
		synchronized (t) {

			t.start();

			System.out.print("X");
			t.wait(10000);
			System.out.print("Y");

		}

	}

}
