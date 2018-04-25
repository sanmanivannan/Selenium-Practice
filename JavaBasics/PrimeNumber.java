package JavaBasics;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int i;
		int num = 24;
		int mod;
		for(i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("is not a prime number");
			} else 
				System.out.println("is a prime number");
			
			
		}
		
	}

}
