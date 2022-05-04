import java.util.ArrayList;
import java.util.List;

class Cust implements Runnable {

	@Override
	public void run() {

	}
}

class ProductProducer implements Runnable {

	List<String> list;

	int cartmaxitems = 3;

	public ProductProducer(List<String> items) {

		this.list = items;

	}

	@Override
	public void run() {

		produceItems();

		System.out.println("size of list now is " + list.size());

	}

	public void produceItems() {

		synchronized (list) {

			while (list.size() != cartmaxitems) {

				System.out.println("producing new items");

				list.add("mangos");

			}

			try {
				list.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}

public class WaitAndNotify {

	public static void main(String[] args) {

		List<String> cart = new ArrayList();

		Thread producer = new Thread(new ProductProducer(cart));
		Thread producer2 = new Thread(new ProductProducer(cart));

		producer.start();
		producer2.start();

	}

}
