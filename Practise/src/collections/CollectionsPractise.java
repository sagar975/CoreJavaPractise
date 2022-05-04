package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Company1 {
	private String brand;
	private int year;

	public Company1(String name, int year) {
		this.brand = name;
		this.year = year;

	}

	public String toString() {

		return "" + this.year;

	}

	public String getBrand() {

		return this.brand;

	}

	public int getYear() {
		return this.year;

	}

	@Override
	public boolean equals(Object o) {

		if (o != null && getClass() == Company1.class) {

			Company1 c = (Company1) o;

			return this.brand.equals(c.brand);

		}

		return false;

	}

	public int hashCode() {

		return this.year;

	}

}

class Company2 {
	private String brand;
	private int year;

	public Company2(String name, int year) {
		this.brand = name;
		this.year = year;

	}

}

public class CollectionsPractise {

	public static void main(String[] args) {
		Map<Integer, Company1> one = new HashMap<Integer, Company1>();

		Map<Integer, Company1> two = new HashMap<Integer, Company1>();

		one.put(1, new Company1("adidas", 1980));
		one.put(2, new Company1("nike", 1985));
		one.put(3, new Company1("rbk", 1979));
		one.put(5, new Company1("rbk", 1983));

		List<Company1> list1 = new ArrayList<Company1>(one.values());
		List list2 = new ArrayList();

		System.out.println(10 * 3 / 2 + 1);

		Arrays a;

		/*
		 * 
		 * one.forEach((k, v) -> System.out.println("key " + k + "value " + v));
		 * 
		 * ArrayList<String> list1 = new ArrayList<String>(); ArrayList<String> list2 =
		 * new ArrayList<String>(); list1.add("sam"); list1.add("roy");
		 * list1.add("tom");
		 * 
		 * list2.add("roy"); list2.add("tom"); list2.add("sam");
		 * 
		 * 
		 */

	}

}
