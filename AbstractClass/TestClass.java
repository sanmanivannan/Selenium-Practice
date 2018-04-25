package AbstractClass;

public class TestClass {

	public static void main(String[] args) {

		HSBCBank hb = new HSBCBank();
		hb.credit(); // method from child class
		hb.debit();// method from child class
		hb.carloans();// method from child class
		hb.homeloans();// method from child class
		hb.loans(); // method from parent class

	}

}
