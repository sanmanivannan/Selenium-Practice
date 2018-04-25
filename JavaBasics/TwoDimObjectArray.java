package JavaBasics;

public class TwoDimObjectArray {

	public static void main(String[] args) {

Object[][] obj = new Object [20][];
obj[0] = new Object[2]; // which mean 0th row will have 2 columns
obj[1]= new Object[3];  // which means 1st row will have 3 columns

	//no declaring the values for the array

obj[0][0] = "String";
obj[0][1] = 'c';

obj[1][0] = "String";
obj[1][1] = 'c';
obj[1][2] = 23;


System.out.println(obj[0][0]);
System.out.println(obj[0][1]);
System.out.println(obj[1][0]);
System.out.println(obj[1][1]);
System.out.println(obj[1][2]);
	}
 
}
