
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Student {

	public static List<String> li;

	static {

		li = new ArrayList();

		// System.out.println(li.hashCode());

	}

	public Student(String name) {

		li.add(name);

	}

}

public class PractiseArrays {

	public static void main(String[] args) {

		Student s = new Student("sagar");
		Student s2 = new Student("sono");
		Student s3 = new Student("mono");
		Student s4 = new Student("tono");

		System.out.println(Student.li.size());

	}

}
