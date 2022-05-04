import java.util.ArrayList;
import java.util.List;

class Grocery {

	public static List<String> grocerylist;

}

class GroceryProducer implements Runnable {

	public void run() {

		Grocery.grocerylist = new ArrayList();

		synchronized (Grocery.grocerylist) {

			System.out.println("producing grocery");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if (Grocery.grocerylist.isEmpty()) {

				Grocery.grocerylist.add("kirana");

			}
			Grocery.grocerylist.notify();

		}

	}

}

class GroceryConsumer implements Runnable {

	public void run() {

		Grocery.grocerylist = new ArrayList();

		synchronized (Grocery.grocerylist) {

			System.out.println("consuming grocery");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			if (Grocery.grocerylist.size() == 0) {

				try {
					Grocery.grocerylist.wait();
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}

			Grocery.grocerylist.remove(0);

		}

	}

}

public class ConcurrentPrac {

	public static void main(String[] args) {

		GroceryProducer prooducer = new GroceryProducer();

		GroceryConsumer consumer = new GroceryConsumer();

		Thread one = new Thread(prooducer);

		Thread two = new Thread(consumer);

		one.start();
		two.start();

	}

}
