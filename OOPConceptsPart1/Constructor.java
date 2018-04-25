package OOPConceptsPart1;

public class Constructor {

	String name;
	int age;

	public Constructor(String name, int age) { // Constructor overloading
		this.name = name; //global variable name  = local valiable name
		this.age = age;  //global variable age = local variable age

		System.out.println("Name" + name);
		System.out.println("age" + age);
	}

	public Constructor() {

		System.out.println("Default Constructor");

	}

	public Constructor(int i) { // Constructor overloading

		System.out.println("single value constructor");
		System.out.println("the value of i" + i);
	}

	public Constructor(int i, int j) { // Constructor overloading

		System.out.println("two value constructor");
		System.out.println("the value of i" + i);
		System.out.println("the value of j" + j);
	}

	public static void main(String[] args) {

		Constructor c = new Constructor();
		Constructor c1 = new Constructor(10);
		Constructor c2 = new Constructor(10, 20);

	}

}
