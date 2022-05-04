package Learning;

import java.util.HashMap;
import java.util.Map;

class EmployeeInfo {

	private String name;
	private int employeeNumber;
	private String department;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public EmployeeInfo(String name, int emplNumber, String depat, int salary) {
		this.name = name;
		this.department = depat;
		this.salary = salary;
		this.employeeNumber = emplNumber;

	}

	public String toString() {

		return this.name + " :" + this.salary;

	}

	public int hashCode() {

		return this.salary;
	}

	public boolean equals(Object o) {

		EmployeeInfo empl = (EmployeeInfo) o;

		if (o != null && getClass() == EmployeeInfo.class) {

			if (this.name.equals(empl.getName())) {
				return true;

			}

		}

		return false;

	}

}

public class Hash {

	public static void main(String[] args) {

		Map<EmployeeInfo, Integer> employeeMap = new HashMap();

		EmployeeInfo employyeOne = new EmployeeInfo("sam", 123, "IT", 400);
		EmployeeInfo employeeTwo = new EmployeeInfo("samuel", 123, "I", 400);

		employeeMap.put(employyeOne, 1);
		employeeMap.put(employeeTwo, 2);

		employyeOne.setName("roy");

		System.out.println(employeeMap.get(employyeOne));
		
		

	}

}
