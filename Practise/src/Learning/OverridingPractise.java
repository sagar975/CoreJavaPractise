package Learning;

import java.sql.SQLException;

class JunglyAnimal {

	public static void eatMeat() throws SQLException {

		System.out.println("Jungly Animal Eating");

	}

}

class Chita extends JunglyAnimal {

	public static void eatMeat() {

		// This is method hiding

		System.out.println("Chita is eating");

	}

}

public class OverridingPractise {

	public static void main(String[] args) {

		String header = "application/json; charset=utf-8";
		String[] array = header.split("=");
		for (String name : array) {

		}
	}

}
