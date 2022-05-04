package Learning;

import java.util.ArrayList;
import java.util.List;

class Car {

}

class Van extends Car {

	private String van_name;

	public Van(String name) {

		this.van_name = name;

	}

	public Van() {

	}

	public static List<Van> addVehicle(List<Van> v) {

		List<Semivan> semvan;

		v.add(new Van("maruti"));
		v.add(new Van("800"));
		v.add(new Van("eartiga"));

		return v;

	}

}

class Semivan extends Van {

}

public class TypesafeMethods {

	public static <E extends Number> List<E> process(List<E> nums) {

		// ArrayList<Integer> a = new ArrayList<Integer>();

		return new ArrayList<>();

	}

	public static void main(String[] args) {

		List<Number> input = null;

		List<Integer> input2 = null;

		ArrayList<Integer> input3 = null;

		TypesafeMethods.process(input);

		TypesafeMethods.process(input2);

		TypesafeMethods.process(input3);

	}

}
