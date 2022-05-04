package Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

class StringSort implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o1.compareTo(o2);
	}

}

class Tiger extends WildAnimal {

	public Tiger(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

}

class WildAnimal {

	private String name;
	private int age;

	public WildAnimal(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String toString() {

		return this.name + ": " + this.age;

	}

	public boolean equals(Object o) {

		WildAnimal w = (WildAnimal) o;
		if (this.name.equals(w.name) && this.age == w.age) {

			return true;

		}

		return false;

	}

	public int hashCode() {

		return -8;

	}

	public static List<Number> getLiest() {

		List<Number> li = null;

		return li;

	}

	public static WildAnimal getAnimalInstance() {

		return new Tiger("Hippo", 30);

	}

}

public class Hashing {

	public static void main(String[] args) {

		/*
		 * 
		 * PriorityQueue<String> pq = new PriorityQueue<String>(); pq.add("2");
		 * pq.add("4"); System.out.print(pq.peek() + " "); pq.offer("1"); pq.add("3");
		 * pq.remove("1"); System.out.print(pq.poll() + " ");
		 * 
		 * if (pq.remove("2")) {
		 * 
		 * System.out.println("hello");
		 * 
		 * }
		 * 
		 * System.out.println(pq.poll() + " " + pq.peek());
		 * 
		 * System.out.println("size of priority q at last is " + pq.size());
		 * 
		 * System.out.println("last element remianing is " + " :" + pq.peek());
		 * 
		 * }
		 * 
		 */

		String[] s = { "map", "pen", "marble", "key" };

		Arrays.sort(s, new StringSort());

		for (String s1 : s) {

			System.out.println(s1);

		}

	}
}
