import java.util.Scanner;

class WildAnimal {

	private String name;
	private int age;

	public WildAnimal(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * 
	 * public boolean equals(Object o) {
	 * 
	 * WildAnimal w = (WildAnimal) o;
	 * 
	 * if (o != null && getClass() == WildAnimal.class) {
	 * 
	 * return this.name.equals(w.name);
	 * 
	 * }
	 * 
	 * return false;
	 * 
	 * }
	 * 
	 */
}

public class Simple {

	public static void main(String[] args) {

		WildAnimal one = new WildAnimal("tiger", 20);
		WildAnimal two = new WildAnimal("tiger", 20);

	}
}
