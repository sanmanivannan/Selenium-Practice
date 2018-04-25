package JavaBasics;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Test0");    //HashTable stores the data in the form of Key and Value concept
		h.put("B", "Test1");
		h.put("C", "Test2");
		
		System.out.println(h.size());
		
		h.put(1, 100);
		h.put(2, 200);
		System.out.println(h.size());
		
		System.out.println(h.get("B"));
		System.out.println(h.get(2));
		
		h.put(3, 500);
		
		// to have only int datatype on the Hashtable
		Hashtable<Integer,Integer> h1 = new Hashtable<Integer,Integer>();  
		h1.put(5, 900);
		
		//to have multiple datatype on the Hashtable
		Hashtable<Integer,String> h2 = new Hashtable<Integer,String>();
		h2.put(5, "Test");
	}

}
