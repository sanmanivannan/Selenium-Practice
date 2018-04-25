package JavaBasics;

public class ArrayConcepts {

	public static void main(String[] args) {
	
		//array is to store similar datatype values in a array variable
		
		//disadvantages of Array 
		//1. its size is fixed(static array) === to over come the issue we use Collections - ArrayList, HashTable(dynamic array)
		//2. stores only similar data type  === to over come the issue we use Object Array
		
		
		//int array
		
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i[0]);
		// System.out.println(i[4]); //Error: ArrayIndexOutOfBoundsException
		
		System.out.println(i.length); //length of array
		
		//print all the value of array //using for loops
		
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		
		//double array
		
		double x[] = new double[3];
		x[0]=12.33;
		x[1]=23.44;
		x[2]=45.55;
		
		System.out.println(x[2]);
		
		//char array
		
		char c[] = new char[2];
		
		c[0]= '$';
		c[1]= 'b';
		
		System.out.println(c[0]);
		
		//boolean array
		
		boolean m[] = new boolean[2];
		
		m[0]= true;
		m[1]= false;
		
		
		//String Array
		
		String s[] = new String[3];
		s[0]="new";
		s[1]="string";
		s[2]="array";
		
		System.out.println(s.length);
		
		
		//OBJECT ARRAY  (Object is the class just like String) is use to store different data type
		
		Object ob[]= new Object[5];
		
		ob[0]= "Tom";
		ob[1]="2010-09-23";
		ob[2]="London";
		ob[3]= 30000;
		ob[4]= 'M';
		
		System.out.println(ob[2]);
		
		
		
		
	}

}
