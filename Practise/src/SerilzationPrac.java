import org.apache.juneau.annotation.Beanc;

class Department {

	private String departmentname;

	private int depid;

	@Beanc(properties = "departmentname,departmentid")
	public Department(String deptname, int id) {

		this.departmentname = deptname;
		this.depid = id;

	}

	public void setName(String p1) {

		this.departmentname = p1;

	}

	public void setid(int p2) {

		this.depid = p2;

	}

	public String getName() {

		return this.departmentname;
	}

	public int getId() {

		return this.depid;

	}

}

public class SerilzationPrac {

	public static void main(String[] args) {

	}

}
