package OOPConceptsPart2;

public class HSBCBank implements USBank, BrazilBank { // here we are achieving the multiple Inheritance concept by
														// pulling 2 or more INterfaces
														// this concept is called as "is a relationship"

	// if a class is implementing an INterface, then its mandatory to
	// define/override all the methods of Interface

	public void credit() {
		System.out.println("Print credit");

	}

	public void debit() {
		System.out.println("Print debit");

	}

	public void transfer() {
		System.out.println("Print transfer");

	}

	public void educationloan() {
		System.out.println("Print education loan");

	}

	public void carloan() {
		System.out.println("Print car loan");
	}

	// BrazilBank Interface
	public void mutualfund() {
		System.out.println("Print mutualfund");
	}

	public void FD() {
		System.out.println("Print FD");

	}
}
