package com.test;

import org.testng.annotations.Test;

public class ExceptionTimeoutTest {

	// @Test(invocationTimeOut=2,expectedExceptions=NumberFormatException.class)
	// //timeOut , invocationTimeOut, expectedException
	// public void infiniteLoop() {
	// int i =1;
	// while(i==1) {
	// System.out.println("print result");
	// }
	//
	// }

	@Test(expectedExceptions = NumberFormatException.class) // exceptedExceptions are the methpd within TestNG to
															// ignorethe exception caused by the execution

	public void test1() {

		String x = "100A";
		Integer.parseInt(x);
		
		

	}

}
