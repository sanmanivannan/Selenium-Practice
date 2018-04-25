package OOPConceptsPart1;

public class MethodOverloading {

	// Method Overloading is having the same method name with different parameter or parameter datatype 
	// the same class
	public static void main(String[] args) {
		MethodOverloading methover = new MethodOverloading();
		methover.sum();
		methover.sum(10);
		methover.sum(30, 40);

	}

	// ***we cant create a method inside another method

	// no parameter
	public void sum() {
		System.out.println("printing the zero parameter");

	}

	// with 1 input parameter
	public void sum(int i) {
		System.out.println("printing the one parameter");
		System.out.println(i);
	}

	// with 2 input parameter
	public void sum(int j, int k) {
		System.out.println("printing the two parameter");
		System.out.println(j + k);
		// System.out.println(k);
	}
}
