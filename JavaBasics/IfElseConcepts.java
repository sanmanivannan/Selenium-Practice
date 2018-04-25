package JavaBasics;

public class IfElseConcepts {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		if (b > a) {

			System.out.println("b is greater than a");
		} else {
			System.out.println("a is greater than b");
		}

		// Comparision operator
		// < > <= >= == !=
		// = is the assignment operator
		// == is the comparision operator

		int c = 40;
		int d = 50;
		
		if(c==d) {
			System.out.println("c is equal to d");
			
		}
		else {
			System.out.println("c is not equal to d");
		}

		
		int a1=100;
		int b1=200;
		int c1=300;
		
		if (a1>b1 & a1>c1) {
			System.out.println("a1 is greater");
					}
		else if (b1>c1) {
			System.out.println("b1 is greater");
		}
		else {
		System.out.println("c1 is greater");
		}
	}

}
