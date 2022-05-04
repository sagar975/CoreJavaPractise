package Learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student {

	int rollnumber;

	String name;

	public Student(int number, String fname) {

		this.rollnumber = number;
		this.name = fname;

	}

	@Override
	public String toString() {

		return this.name + this.rollnumber;

	}

}

class SortStudent implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {

		// return o1.rollnumber - o2.rollnumber; // will sort rollnumber is asc

		return o2.rollnumber - o1.rollnumber; // will sort rollnumber in desc

	}

}

public class SortingCollections {

	public static void main(String[] args) {

		Student s1 = new Student(10, "sagar");
		Student s2 = new Student(24, "sam");
		Student s3 = new Student(4, "michael");
		Student s4 = new Student(6, "adrii");
		Student s5 = new Student(3, "storoy");

		ArrayList<Student> arr = new ArrayList<Student>();

		arr.add(s1);
		arr.add(s2);
		arr.add(s3);
		arr.add(s4);
		arr.add(s5);

		Collections.sort(arr, new SortStudent());

		Iterator it = arr.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());

		}

	}

}
