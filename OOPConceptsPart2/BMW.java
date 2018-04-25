package OOPConceptsPart2;

public class BMW extends Car { //this concept is called as "has a relationship"

	//Method Overriding : when same method name and same number of parameter is present on both Parent and Child Class.
	
	
	public void start() { //overridden method
		System.out.println("BMW start method");
	}
	
	public void ABS() {
		System.out.println("BMW ABS method");
	}
	
}
