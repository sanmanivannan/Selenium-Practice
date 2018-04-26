package JavaBasics;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {

		ArrayList ar = new ArrayList();
		ar.add(100);
		ar.add(200);
		ar.add(300);
		
		System.out.println(ar.size());

		ar.add("String");
		ar.add('c');

		System.out.println(ar.get(5));

		// to print all the values on the ArrayList
		// use for loop after knowing the size

		for (int i = 0; i < (ar.size()); i++) {
			System.out.println(ar.get(i));
		}

		// to have only int datatype on the arraylist
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(1000);
		// ar1.add("String"); not allowed because this arraylist is only for the INT
		// datatype

		// to have only String datatype on the arraylist
		ArrayList<String> ar2 = new ArrayList<String>();
		// ar2.add(1000); not allowed because this arraylist is only for the String
		// datatype
		ar2.add("String");
		
		
		//ArrayList <Object> ar3 = new ArrayList<Object>();
		

	}

}
