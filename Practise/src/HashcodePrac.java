import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class BankMaharashtra {

	private String bankname;

	private int ifsc;

	public BankMaharashtra(String name, int ifscnumber) {

		this.bankname = name;
		this.ifsc = ifscnumber;

	}

	@Override
	public boolean equals(Object o) {

		BankMaharashtra b = (BankMaharashtra) o;

		return this.bankname.equals(b.bankname);

	}

	public int hashCode() {

		return this.ifsc;
	}

}

class Company {

	private String empl_name;
	private int emp_id;

	public Company(String name, int id) {

		this.empl_name = name;

		this.emp_id = id;

	}

	public void companyId() {

	}

	public static void foo() {

	}

	public boolean equals(Object o) {

		Company c = (Company) o;

		if (c == null) {

			return false;

		}

		if (c instanceof Company) {

			return this.emp_id == c.emp_id;
		}

		return false;

	}

	public int hashCode() {

		return 1;

	}

}

public class HashcodePrac {

	public static void main(String[] args) {

		Set<BankMaharashtra> set1 = new HashSet();
		Set<BankMaharashtra> set2 = new HashSet();

		set1.add(new BankMaharashtra("kore", 12345));

		set2.add(new BankMaharashtra("korehhi", 12345));

		set1 = set2;

		System.out.println(set1 == set2);

		System.out.println(set1.equals(set2));

		System.out.println(set1.hashCode());

		System.out.println(set2.hashCode());

		String[] names = { "sagar", "jonny", "vijay", "anad" };

		List<String> namelist = new ArrayList();

		List<Company> studentlist = new ArrayList();

		namelist = Arrays.asList(names);

		System.out.println(namelist);

		Collections.sort(namelist);

	}

}
