package com.test;

import org.testng.annotations.Test;

public class TestNgFeatures {

	@Test

	public void loginTest() {
		System.out.println("Login Test");

		int i = 9 / 10;
	}

	@Test(dependsOnMethods = "loginTest") // dependsOnMethods is validate the testcase, only if the dependednt testcase
											// is passes other testcase will be executed

	public void homePage() {
		System.out.println("HomePage Test");
	}

	@Test(dependsOnMethods = "loginTest")

	public void searchPage() {
		System.out.println("Search Page");
	}

	@Test(dependsOnMethods = "loginTest")

	public void registerPage() {
		System.out.println("Register Page");
	}

}
