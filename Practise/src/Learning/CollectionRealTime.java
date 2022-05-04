package Learning;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Showroom {

	public void placeCustomerOrder(int custorder) {

		System.out.println("getting car from factory");

		List<Factroty> list = Factroty.getCarOrder(3);

	}

}

class Factroty {

	private String Car_name;
	private String colour;

	public Factroty(String name, String colour) {

		this.Car_name = name;
		this.colour = colour;

	}

	public String toString() {

		return this.Car_name + this.colour;

	}

	public static List<Factroty> getCarOrder(int order) {

		List<Factroty> carlist = new ArrayList();

		for (int i = 1; i <= order; i++) {

			Factroty carmake = new Factroty("altroz", "black");

			carlist.add(carmake);

		}

		System.out.println("total car made" + carlist.size());

		return carlist;

	}

}

class Customer {

	public static void callShowroom(int sentcarorder) {

		new Showroom().placeCustomerOrder(sentcarorder);

	}

}

public class CollectionRealTime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("please send your oder to showroom");

		int cusordernumber = sc.nextInt();

		Customer.callShowroom(cusordernumber);

	}

}
