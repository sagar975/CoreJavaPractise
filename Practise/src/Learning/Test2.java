package Learning;

class CC {

	public void foo() throws Test2 {

	}

}

class CC2 extends CC {

	public void foo() {

		Error er = new Error();

	}

}

public class Test2 extends Exception {

	public static void main(String[] args) {

	}

}
