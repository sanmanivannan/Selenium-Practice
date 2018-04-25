package OOPConceptsPart1;

public class CallByValue {

	public static void main(String[] args) {

		CallByValue obj = new CallByValue();
		int x = 10; //
		int y = 20; //
		obj.doSum(x, y); // call by value OR pass by value

		obj.p = 50; //callbyref
		obj.q = 60;//callbyref
		obj.byRef(obj);//callbyref
	}

	public int doSum(int a, int b) {
		// a=30;
		// b=40;
		int c = a + b;
		return c;
	}

	public void byRef(CallByValue t) {//callbyref

		int temp;//callbyref
		temp = t.p;//callbyref
		t.p = t.q;//callbyref
		t.q = temp;//callbyref

	}

}
