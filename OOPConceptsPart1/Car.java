package OOPConceptsPart1;

public class Car {

	//global class variable
	int mod;
	int wheel;
	
	
	public static void main(String[] args) {

		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.mod=2010;
		a.wheel=4;
		
		b.mod=2016;
		b.wheel=2;
		
		c.mod=2018;
		c.wheel=4;
		
		System.out.println("Before assigning the referances");
		
		System.out.println(a.mod);
		System.out.println(a.wheel);
		
		System.out.println(b.mod);
		System.out.println(b.wheel);
		
		System.out.println(c.mod);
		System.out.println(c.wheel);
		
		System.out.println("After assiging the referance");
		
		a=b;
		b=c;
		c=a;
		
		a.mod=20;
		System.out.println(a.mod);
		
		
	}

}
