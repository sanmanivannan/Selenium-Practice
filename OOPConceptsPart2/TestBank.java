package OOPConceptsPart2;

public class TestBank {

	public static void main(String[] args) {
		
	//	USBank v = new USBank(); // its not allowed to create a object of the Interface
		
		HSBCBank hs = new HSBCBank();  //static polymorphism
		hs.carloan();
		hs.credit();
		hs.debit();
		hs.educationloan();
		hs.transfer();
		hs.mutualfund();
		hs.FD();
		
		System.out.println("***********************************************************");
		
		//dynamic polymorphism
		//child class object can be refereed by parent INterface reference variable. But only common method name 
		//and Parent specific methods only can be accessible  
		
		USBank v = new HSBCBank();
		v.credit();
		v.debit();
		v.transfer();
			
	}

}
