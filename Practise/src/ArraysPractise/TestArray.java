package ArraysPractise;

import java.util.Arrays;
import java.util.Comparator;

class Sorter implements Comparator<EmployeeData> {

	@Override
	public int compare(EmployeeData o1, EmployeeData o2) {

		if (o1.getSalary() < o2.getSalary()) {
			return 10000;

		}

		return -10000;

	}

}

class EmployeeData {

	private int salary;
	private String name;

	public EmployeeData(String name, int salary) {
		this.salary = salary;
		this.name = name;

	}

	public int getSalary() {

		return this.salary;

	}

	public String getName() {

		return this.name;

	}

}

public class TestArray {

	public static void main(String[] args) {

		EmployeeData one = new EmployeeData("sam", 100);
		EmployeeData two = new EmployeeData("mack", 300);
		EmployeeData three = new EmployeeData("paul", 50);

		EmployeeData[] array = { one, two, three };

		Arrays.sort(array, new Sorter());

		for (EmployeeData empl : array) {

			System.out.println(empl.getName());

		}

	}

}
