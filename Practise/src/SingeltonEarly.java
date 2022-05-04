
class Soul {

	// This is type of eagely design pattern

	private static Soul sol = new Soul();

	private static String Mansoul = "male";
	private static String womensoul = "female";

	private Soul() {

	}

	public static Soul getSoul() {

		return sol;

	}

}

public class SingeltonEarly {

	// create singelton early design pattern

	public static void main(String[] args) {

		Soul animal = Soul.getSoul();

	}

}
