
public class ArmstrongNumber {

	// ArmstrongNumber = sum of power of its own digits

	// power = depends on number of digits in number

	public static boolean checkArmStrong(int num) {

		if (num >= 0 && num < 10) {

			return true;

		}

		String val = String.valueOf(num);

		int holder = num;

		int sum = 0;

		int power = val.length();

		while (holder != 0) {

			int eachdigit = holder % 10;

			sum = (int) (sum + Math.pow(eachdigit, power));

			holder = holder / 10;

		}

		if (sum == num) {

			return true;

		}

		return false;

	}

	public static void main(String[] args) {

		System.out.println(ArmstrongNumber.checkArmStrong(3));

	}

}
