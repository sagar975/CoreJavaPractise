package Learning;

class EmployeeData implements Runnable {

	public static String Department;

	public static int salary;

	public EmployeeData(String deptname, int sal) {

		this.Department = deptname;

		this.salary = sal;

	}

	public EmployeeData() {

	}

	static ThreadLocal<EmployeeData> local = new ThreadLocal();

	public static void setEmployeeData(String name, int sal) {

		local.set(new EmployeeData(name, sal));

	}

	public static EmployeeData getData() {

		return local.get();

	}

	public synchronized void run() {

		System.out.println("current running thread is " + Thread.currentThread().getName());

		System.out.println("*************************************");
		EmployeeData.setEmployeeData("finance", 30000);
	}

}

class FetchData implements Runnable {

	@Override
	public synchronized void run() {

		System.out.println("current running thread is " + Thread.currentThread().getName());

		System.out.println("*************************************");
		System.out.println("name of departement is " + " " + EmployeeData.Department);
		System.out.println("salary  is " + " " + EmployeeData.salary);

	}

}

public class ThreadLocalPractise {

	public static void main(String[] args) throws InterruptedException {

		Thread one = new Thread(new EmployeeData());
		Thread two = new Thread(new FetchData());

		one.setName("setting  thread");
		two.setName("getting thread ");

		two.start();
		one.start();

	}

}
