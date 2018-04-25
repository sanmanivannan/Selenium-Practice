package OOPConceptsPart2;

public class TestCar {

	public static void main(String[] args) {

		// static polymorphism - methods coming from various/multiple class (1 to many)

		BMW b = new BMW();
		b.start(); // method coming from BMW class
		b.stop(); // method coming from Car class
		b.refuel(); // method coming from Car class
		b.ABS(); // method coming from BMW class
		b.engine(); // method coming from vehicle class

		System.out.println("************************************");

		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		// c.ABS(); is not possible because the Parent cannot access Childs method

		System.out.println("************************************");

		// dynamic polymorphism can access common methods(overriding methods) within
		// parent and child. but no child specific methods like ABS() is possible.
		// OR
		// otherwise called as Top Casting
		Car cb = new BMW(); // child class object can be referred by parent referance variable using the DYNAMIC POLYMORPHISM
							// OR Run Time Polymorphism
		cb.start();
		cb.stop();
		cb.refuel();
		

		// Down Casting
		BMW b1 = (BMW) new Car(); // ClassCastException error

	}

}
