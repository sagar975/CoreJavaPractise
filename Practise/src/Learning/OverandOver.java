package Learning;

import java.io.IOException;
import java.sql.SQLException;

class Gotcha extends RuntimeException {

	static void go() throws Gotcha {

		go();

	}

}

class Fotch extends Gotcha {

	public static void foo() throws SQLException {

		int c = 3 / 0;
	}

}

public class OverandOver {

	static String s = "";

	public static void main(String[] args) throws SQLException {

		try {

			Fotch.foo();
		}

		catch (ArithmeticException e) {

			System.out.println("you caught it");

		}

	}
}
