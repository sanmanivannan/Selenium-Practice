package OOPConceptsPart2;

public interface USBank {
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transfer();
	
	//Properties of methods
		//6. no main method in the Interface	
		//1. only method deceleration
		//2. NO method body - only method prototype
		//3. we can declare variables and variables are by default will be STATIC in nature
		//4. variable values will not be change(everything is by default Final in nature)
		//5. No STATIC method in Interface
		//7. we can't create the object of Interface
		//8. Interface is abstract in nature
	
	
}
