package Learning;

interface Humann {

	public abstract void getLife();

}

interface Anima {
	public abstract void getLife();

}

class Life implements Humann, Anima {

	@Override
	public void getLife() {
		System.out.println("not sure from where getting called");

	}

}

public class SubString {

	public static boolean flag = true;

	public static boolean checkSubString(String first, String second) {

		if (first.trim().contains(second)) {

			return flag;

		}

		return false;

	}

	public static void main(String[] args) {

		boolean value = SubString.checkSubString("sagarsonawane", "k");

		System.out.println(value);

	}

}
