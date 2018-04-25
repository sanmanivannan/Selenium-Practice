package OOPConceptsPart1;

public class StatisAndNonStaticConcepts {

	String name = "Tom"; // non static globale variable
	static int age = 25; // static global variable

	public static void main(String[] args) {

		// how to call static methods and variables from static main method)can be
		// created without creatign the object of the class)

		// direct calling method from the static methods
		sum();

		// calling method by classname from the static methods
		StatisAndNonStaticConcepts.sum();

		// calling variables directly from the static variable
		System.out.println(age);
		
		// or by callind from class from the static variable
		System.out.println(StatisAndNonStaticConcepts.age); // either one is correct
		
//**************************************************************************************************************************
		
		
		// how to call non-static methods and variables from static main method
		// MUST create the object of the respective class

		StatisAndNonStaticConcepts obj = new StatisAndNonStaticConcepts();

		obj.sendMethod();
		System.out.println(obj.name);

		// can we access STATIC methods by using object reference?? Yes we can but its
		// not recommended

		obj.sum(); // will give warning

	}

	public void sendMethod() { // non static method

		System.out.println("print sendMethod");
	}

	public static void sum() { // static method
		System.out.println("sum method");
	}
}
