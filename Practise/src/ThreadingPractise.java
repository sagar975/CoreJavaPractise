
class Mango extends Thread {

	public void run() {

		for (int i = 1; i <= 3; i++) {

			System.out.println("mango");

		}

	}

	public static synchronized void getClear() {

		for (int i = 1; i < 4; i++) {

			System.out.println("current thread" + " " + Thread.currentThread().getName()); // lock on class. only one
																							// lock is
			// created

		}

	}

	public synchronized void getClear2() {

		for (int i = 1; i < 4; i++) {

			System.out.println("current thread" + " " + Thread.currentThread().getName()); // lock on object. lock for
																							// number
			// of objects

		}

	}

}

public class ThreadingPractise {

	public static void main(String[] args) {

		final Mango m1 = new Mango();

		final Mango m2 = new Mango();

		Runnable runnable = new Runnable() {

			public void run() {

				m1.getClear();
				m2.getClear2();

			}

		};

		Thread one = new Thread(runnable);
		Thread two = new Thread(runnable);

		one.setName("kokan hapuse");
		two.setName("keral hapuse");

		one.start();

		two.start();
		
		
		
		

	}
}
