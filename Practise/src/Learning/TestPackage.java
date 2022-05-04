package Learning;

import java.util.HashMap;

interface Mobile {

	public void android();

}

class Galaxy {

	Mobile mb = new Mobile() {

		@Override
		public void android() {

			System.out.println("galaxy mobile is using");

		}

	};

}

class CarType {

	public String getCar() {

		return "cartype";

	}

}

class Jeep {

	CarType c = new CarType() {

		public String getCar() {

			return "this is jeep car";

			// this is known as annonymus
		}

	};

}

public class TestPackage {

	public static void main(String[] args) {

		new Galaxy().mb.android();

	}

}
