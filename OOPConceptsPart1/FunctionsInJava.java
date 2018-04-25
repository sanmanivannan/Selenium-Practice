package OOPConceptsPart1;

public class FunctionsInJava {

	public static void main(String[] args) {

		FunctionsInJava obj1 = new FunctionsInJava();
		// one object will be created, obj1 is the referance variable referring to the
		// object
		// after creating the object, the copy of all non static methods will be given
		// to this object
		obj1.test();
		obj1.prq();
		String j = obj1.qa() + obj1.prq();

		System.out.println(j);

		// obj1.add(3, 5);

	}
	// **********************non static methods*************************

	// void method doesnt return any value
	public void test() {

		System.out.println("test method");
	}

	// pqr method is returning int value
	public int prq() {

		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;

	}

	// qa method is returning String value

	public String qa() {
		System.out.println("qa method");
		String s = "World";
		return s;

	}

	// Input Parameters in the Method

	public int add(int i, int j) {
		System.out.println("add method");
		int k = i + j;
		System.out.println(k);
		return k;
	}

}
