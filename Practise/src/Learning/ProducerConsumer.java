package Learning;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Producer implements Runnable {

	List<Integer> sharedsource; // assume as shopping cart

	int max_capacity = 5;

	int start = 0;

	public Producer(List<Integer> numlist) {

		this.sharedsource = numlist;

	}

	public void produce(int i) throws InterruptedException {

		synchronized (sharedsource) {

			while (sharedsource.size() == max_capacity) {

				System.out.println("this cart is full wait for consumer to consume ");

				sharedsource.wait();

			}

		}

		synchronized (sharedsource) {

			System.out.println("producing the objects");

			sharedsource.add(i);

			Thread.sleep(1000);

			sharedsource.notify();

		}

	}

	@Override
	public void run() {

		while (true) {

			try {

				produce(start++);
			}

			catch (Exception e) {

			}

		}
	}

}

class Consumber implements Runnable {

	List<Integer> sharedsource; // assume as shopping cart

	public Consumber(List<Integer> lis) {

		this.sharedsource = lis;

	}

	public void consume() throws InterruptedException {

		synchronized (sharedsource) {

			while (sharedsource.isEmpty()) {

				System.out.println("wait for producing  objects");

				sharedsource.wait();

			}

		}

		synchronized (sharedsource) {

			Thread.sleep(1000);

			System.out.println("consumng the objects" + sharedsource.remove(0));

			sharedsource.notify();

		}

	}

	@Override
	public void run() {

		while (true) {

			try {

				consume();
			}

			catch (Exception e) {

			}

		}
	}

}

public class ProducerConsumer {

	public static List<String> itemslist;

	public static void main(String[] args) {

		List<Integer> caller = new ArrayList<Integer>();

		Thread p = new Thread(new Producer(caller));

		Thread c = new Thread(new Consumber(caller));

		p.start();

		c.start();

	}

}
