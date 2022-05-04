package Threading;

public class Starter implements Runnable {

	void go(long id) {

		System.out.println(id);

	}

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getId() + " ");

		new Thread(new Starter()).start();

	}

	@Override
	public void run() {

		System.out.println("run is invoked");

		go(Thread.currentThread().getId());

	}

}
