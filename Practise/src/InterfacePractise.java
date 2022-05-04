
interface mental {

	public static void human() {

		System.out.println("humans are mental in interface");

	}

}

class MentalHospital {

	public static void getAllMentals() {

		System.out.println("mental from hospital");

	}

}

class Human extends MentalHospital implements mental {

	public void useInterface() {

		Human h = null; // helps in avoiding null pointer exception

		h.getAllMentals();

	}

	public void useClass() {
		
		
		

	}

}

public class InterfacePractise {

	public static void main(String[] args) {

		new Human().useInterface();

	}

}
