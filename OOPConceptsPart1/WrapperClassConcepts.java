package OOPConceptsPart1;

public class WrapperClassConcepts {

	public static void main(String[] args) {

		String x = "100";
		System.out.println(x + 20);
		// String to INteger Conversion

		int i = Integer.parseInt(x); // Integer wrapper classes are availbe for conversion of the datatype to integer
		System.out.println(i + 20);

		// Double wrapper classes
		String y="12.334";
		Double d = Double.parseDouble(y);
		

		System.out.println(d+11.52); 		
		// Wrapper classes like Integer, Double, Boolean.  need to use parseInteger or parseDouble methods

	}

}
