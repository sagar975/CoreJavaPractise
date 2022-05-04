package Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

interface ManEat {

	public void eat();

}

interface DogEat {

	public void eat();

}

class Implementer implements ManEat, DogEat {

	@Override
	public void eat() {

		System.out.println("eating food");

	}

}

public class ListCompare {

	public static void main(String[] args) {

		/*
		 * 
		 * List<String> list1 = new ArrayList<String>(Arrays.asList("A", "B", "F"));
		 * List<String> list2 = new ArrayList<String>(Arrays.asList("A", "B", "C"));
		 * 
		 * Collections.sort(list1); Collections.sort(list2);
		 * 
		 * System.out.println(list1.retainAll(list2));
		 * 
		 * System.out.println("list one is " + list1);
		 * 
		 * System.out.println("list two is as it is " + list2);
		 * 
		 * System.out.println(list1.size());
		 * 
		 */

	}

}