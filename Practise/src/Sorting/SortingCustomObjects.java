package Sorting;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

class Dockyard {

	public void foo() {

	}

}

class Ship extends Dockyard {

	public void foo(String name) {

	}

	public void foo() {

	}

}

class Employee implements Comparable<Employee> {

	private String name;
	private int age;
	private int salary;

	public Employee(String name, int age, int salary) {

		this.name = name;
		this.age = age;
		this.salary = salary;

	}

	public int getAge() {
		return this.age;

	}

	public String getName() {

		return this.name;

	}

	@Override
	public int compareTo(Employee o) {

		Employee emp = (Employee) o;

		if (this.getAge() > emp.getAge()) {
			return 1;

		}

		return -1;

	}

}

public class SortingCustomObjects {

	public static void main(String[] args) {

		Employee one = new Employee("sagar", 30, 1000);
		Employee two = new Employee("sam", 25, 4000);
		Employee third = new Employee("gaurav", 24, 50000);
		Employee four = new Employee("sammy", 60, 3000);

		List<Employee> employeelist = new ArrayList();

	}

}
