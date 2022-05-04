package Learning;

class HdfcBank {

	private final String holderName;// for immutable class always decalre calss as private so they cant be
	// inherited

	private final int account_num;// object state cant be change

	public HdfcBank(String holder, int accoun) {

		this.holderName = holder;

		this.account_num = accoun;

	}

	public String toString() {

		return this.account_num + " :" + this.holderName;

	}

	public String getHolderName() {

		return this.holderName;

	}

	public int getAccountName() {

		return this.account_num;

	}

}

class Minibank {

	public void hdfcState() {

	}

}

public class Immutableclass {

	public static void main(String[] args) {

		HdfcBank branch1 = new HdfcBank("sagar", 12345);

		HdfcBank branch2 = new HdfcBank("vishal", 123456);

		System.out.println(branch1.getAccountName());

	}

}
