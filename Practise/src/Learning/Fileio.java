package Learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

abstract class Sooo {

	abstract void fo() throws Exception;

	void solo() {

	}

}

interface Soooo {

	public static final int name = 1;

	private void foo() {

	}

	static void looo() {

		System.out.println("in static context");

	}

	default void moo() {

	}

}

class Mojo implements Soooo {

	public void useAbstarct() {

		Soooo s = new Mojo();

	}

}

class Dyc extends Sooo {

	@Override
	void fo() throws InterruptedException

	{

	}

	public Object getSUme(int a, int b) {

		return a + b;

	}

	public int getSUme(int a) {

		return a + 0;

	}

	public Object fooooo() {

		return null;

	}

	public void solo() {

		return;
	}

}

interface soll {

	void sogo();

}

public class Fileio {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\sonawas\\Ecli\\eclipse\\hello3.txt");

		Scanner sc = new Scanner(System.in);

		try {
			boolean result = file.createNewFile();
			FileOutputStream out = new FileOutputStream(file);

			if (result) {

				System.out.println("file successfully created");

				System.out.println("write your line...........");

				String line = sc.nextLine();

				byte[] arr = line.getBytes();

				out.write(arr);

			}

			else

			{

				System.out.println("file not created");
			}

		}

		catch (Exception e) {

			System.out.println("runtime error occured");

			e.printStackTrace();

		}

	}

}
