package OOPConceptsPart1;

public class LocalVsGlobalVariables {

	// gloable variable or class variables
	String name = "Tome";
	int age = 25;

	public static void main(String[] args) {

		int i = 10; // local variables
		System.out.println(i);

		// to access the global variables, neeed to crete the objectof the respective
		// class in which the variables are available

		LocalVsGlobalVariables gloToLocal = new LocalVsGlobalVariables();
		System.out.println(gloToLocal.name);

	}

	public void sum() {
		int i = 21; // local variables
		int j = 22;
		int age = 25;

	}
}
