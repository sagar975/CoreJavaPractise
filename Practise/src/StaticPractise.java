
class Bank {

	private static final int bank_money = 100000;

	public int getBankMoney() {

		return this.bank_money;

	}

}

class Custooemr extends Bank {

	public int chaneBankMoney() {

		int newcustomerbalance;

		newcustomerbalance = getBankMoney();

		return newcustomerbalance;

	}

}

public class StaticPractise {

	public static void main(String[] args) {

		System.out.println(new Custooemr().chaneBankMoney());

	}

	public static void main(int args) {

	}

}
