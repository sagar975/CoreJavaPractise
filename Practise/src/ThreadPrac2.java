
class Fruits implements Runnable {

	private static String fruit = "mango";

	private static String boy = "sagar";

	String name;

	@Override
	public void run() {

		for (int i = 1; i < 3; i++) {

			System.out.println(boy + " " + "is eating fruit" + "  " + fruit);

		}

		System.out.println("sagar ate fruit with thread name " + Thread.currentThread().getName());

	}

}

public class ThreadPrac2 {

	public static void main(String[] args) {

		Fruits f = new Fruits();

		Thread t = new Thread(f);
		Thread t2 = new Thread(f);

		t.setName("eating  first");
		t2.setName("eating second");

		t.start();

		t2.start();

	}

}
