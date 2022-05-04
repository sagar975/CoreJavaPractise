import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {

	public static void main(String[] args) throws IOException {

		File reader = new File("C:\\Users\\sonawas\\hello.txt");

		FileInputStream read = new FileInputStream(reader);

		FileOutputStream fsi = new FileOutputStream("C:\\Users\\sonawas\\hello2.txt");

		try {
			int i;

			while ((i = read.read()) != -1) {

				fsi.write(i);

			}

			System.out.println(i);

		} catch (

		IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {

			read.close();
			fsi.close();

		}

	}

}






