import org.apache.juneau.json.JsonSerializer;

import org.apache.juneau.xml.XmlSerializer;

public class UseDepartment {

	public static void main(String[] args) {

		// convert your pojo class to json
		// convert your pojo class to xml and html

		Department dept = new Department("chemistry", 919293);

		JsonSerializer obj = JsonSerializer.DEFAULT_READABLE;

		XmlSerializer obj2 = XmlSerializer.DEFAULT_SQ_READABLE;

		try {

			String josn = obj.serialize(dept);

			String xml = obj2.serialize(dept);

			System.out.println(josn);
			System.out.println(xml);
		}

		catch (Exception e) {

			e.printStackTrace();

		}

	}

}
