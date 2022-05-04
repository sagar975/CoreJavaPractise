import java.util.ArrayList;
import java.util.List;

class Vehicle {

	String car_name;
	Vehicle e;

	public Vehicle(String a) {

		this.car_name = a;

	}

	public Vehicle() {

	}

	public Vehicle(int makeyear) {

		System.out.println("make year is " + makeyear);

	}

}

class Tata extends Vehicle {

	String Carname;

	public Tata(String car) {
		this.Carname = car;

	}

	public void printCarNames(List<Vehicle> vehiclelist) {

		for (Vehicle e : vehiclelist) {

			this.Carname = e.toString();

			System.out.println(this.Carname);

		}

	}

	public List<Vehicle> getList() {

		List<Vehicle> veh = new ArrayList<Vehicle>();

		return veh;

	}

}

public class ConstrucorPrac {

	public static void main(String[] args) {

		Tata car1 = new Tata("Indica");

		List<Tata> veh = new ArrayList<Tata>();
		List<Vehicle> veh2 = new ArrayList<Vehicle>();

		veh2.add(new Vehicle("tigor"));

		veh2.add(new Vehicle("harrier"));

		veh2.add(new Vehicle("safari"));

		// car1.printCarNames(veh2);

		// Tata car2 = new Tata("Indica");
		// Tata car3 = new Tata("harrier");

		for (Vehicle v : veh2) {

			System.out.println(v.toString());

		}

	}

}
