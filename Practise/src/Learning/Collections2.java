package Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

class Data extends CompanyEmployee {

}

class CompanyEmployee {

	private String name;
	private int departmentId;

	public CompanyEmployee() {

	}

	public CompanyEmployee(String name, int departmentId) {
		this.name = name;

		this.departmentId = departmentId;

	}

	public boolean equals(Object o) {

		if (o != null && getClass() == CompanyEmployee.class) {

			CompanyEmployee empl = (CompanyEmployee) o;

			return empl.name.equals(this.name);

		}

		return false;

	}

	public int hashCode() {

		return this.departmentId;

	}

}

public class Collections2 {

	/*
	 * static void overloadedMethod(Number N) {
	 * System.out.println("Number Class Type"); }
	 */

}