package Learning;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Company {

}

class Hr extends Company {

	public static ArrayList getHr(ArrayList<? extends Company> a) {

		System.out.println("your array list is not modified");

		// a.add(new Company()); you are addiding anything to incoming collection
		// a.add(new Hr());

		return a;

	}

	public static List getArrayList(ArrayList a) {

		return a;

	}

}

class Animal {

	public void eating(Animal a) {

		System.out.println("Animal is eating");

	}

}

class Dog extends Animal {

	@Override
	public void eating(Animal b) {

		System.out.println("Dog is eating");

	}

}

public class GenericsPrctise {

	public static void main(String[] args) {
		/*
		 * ArrayList<Company> ab = new ArrayList<Company>();
		 * 
		 * ArrayList<Hr> ac = new ArrayList<Hr>();
		 * 
		 * ArrayList<Animal> animallist = new ArrayList<Animal>(); ArrayList<Object>
		 * objectlist = new ArrayList<Object>();
		 * 
		 * Hr.getHr(ab); Hr.getHr(ac);
		 * 
		 * Hr.getArrayList(ac); Hr.getArrayList(ab); Hr.getArrayList(animallist);
		 * Hr.getArrayList(objectlist);
		 */
		Dog obj = new Dog();

		Animal ani = new Dog();

		Animal an = new Animal();

		new Animal().eating(obj);

		ani.eating(ani);
		an.eating(an);
		
		
		
		
		
		
		
		
		
		
	}

}
