package Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ProductCart {
	public List<String> list = new ArrayList();// common resource shared by two threads

}

class ProductAdder extends ProductCart implements Runnable {

	@Override
	public void run() {

		synchronized (list) {
			if (list.size() == 0) {

				System.out.println("adding product");
				list.add("product");
				list.notify();

			}
		}

	}

}

class ProductReceiver extends ProductCart implements Runnable {

	@Override
	public void run() {

		synchronized (list) {

			if (list.size() > 0) {

				System.out.println("consuming product");

				list.remove(0);

			}

			else if (list.size() == 0) {

				try {
					list.wait(2000);

				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}

		}

	}

}

public class ArraysSorting {

	public static synchronized void main(String[] args) throws InterruptedException {

		/*
		 * Thread producer = new Thread(new ProductAdder());
		 * 
		 * Thread consumber = new Thread(new ProductReceiver());
		 * 
		 * consumber.start();
		 * 
		 */
		Thread t = new Thread();
		t.start();
		System.out.print("X");
		t.wait(10000);
		System.out.print("Y");

	}

}
