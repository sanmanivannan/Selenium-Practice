package JavaBasics;

public class LoopsConcepts {

	public static void main(String[] args) {
		
		// while loop
		//disadvantage is it will create infinite loop if we dont give increamental or decremental logic 
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i=i+1;
					}
System.out.println("************************************************");
		// for loop
		for(int j=1;j<=10;j++) //Initilization,Condition,Increamenting
		{	
			System.out.println(j);
		}
		System.out.println("************************************************");		
		for(int k=10;k>=-10;k--) //Initilization,Condition,Increamenting
		{
			System.out.println(k);
		}
		
		//post increment
		
		int x=1;
		int y=x++; //post increment
		
		System.out.println(x);
		System.out.println(y);
			
		
		//pre increatment
		
		int c=1;
		int d=++c; //pre increment
		
		System.out.println(c);
		System.out.println(d);
		
		//post decrement
		
		int m=2;
		int n=m--;
		System.out.println(m);
		System.out.println(n);
		
		//pre decrement
		
				int e=2;
				int f=--e;
				System.out.println(e);
				System.out.println(f);
		
		
	}

}
