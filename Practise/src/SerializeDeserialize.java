import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Tofu {

	public Tofu() {

		this("hello");
	}

	public Tofu(String name) {

	}

}

class Product implements Serializable {

	String productname;
	int price;
	int makeyear;

	public Product(String pro, int p, int m) {

		this.productname = pro;

		this.price = p;

		this.makeyear = m;

	}

}

public class SerializeDeserialize {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// System.out.println("yes it was false");

		Product one = new Product("shampoo", 70, 2022);

		FileOutputStream fo = new FileOutputStream("product.str");
		ObjectOutputStream ob = new ObjectOutputStream(fo);

		ob.writeObject(one); // serialization finished write object to file

		// ***************************************************************************************************

		// starting deserialization . reading or converting object from file to java Obj
		// or java supported type

		FileInputStream in = new FileInputStream("product.str");

		ObjectInputStream read = new ObjectInputStream(in);

		Product p2 = (Product) read.readObject();

		// System.out.println(p2.productname);

	}

}
