package com.test;

import org.testng.annotations.Test;

public class InvocationCountTest {

	@Test(invocationCount=10)   //invocationCount is used to execute the same method/test multipletimes depending on the count menthoded
	public void sum() {

		int a = 1;
		int b = 3;
		int c = a + b;

		System.out.println("the total is" + c);

	}

}
