package Learning;

class Mythread implements Runnable {

	static ThreadLocal<Integer> local = new ThreadLocal<Integer>() {

		protected Integer initialValue() {

			return 0;

		}

	};

	public static synchronized void foo() {

		for (int i = 0; i < 5; i++) {
			System.out.println("thread name is " + Thread.currentThread().getName());
			local.set(local.get() + 1);

		}

	}

	@Override
	public void run() {
		foo();

	}

}

public class ThreadPrac {

	public static void main(String[] args) {

		Mythread ob = new Mythread();

		Mythread ob2 = new Mythread();

		Thread first = new Thread(ob);

		Thread second = new Thread(ob2);

		first.setName("first thread");
		second.setName("second thread");

		first.start();
		second.start();

	}

}
