package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*
always out of testng will be like below shown

@BeforeMethod
@Test   -1
@AfterMethod

@BeforeMethod
@Test   -2
@AfterMethod

@BeforeMethod
@Test   -3
@AfterMethod

*/


/*
preferancesc

@BeforeSuite   -1st preferance
@BeforeTest    - 2nd preferance
@BeforeClass	- 3rd preferance 
@BeforeMethod   - 4th preferance
@Test   
@AfterMethod
@AfterClass
@AfterTest
@AfterSuite

*/


public class TestNGBasics {

	// pre condition annotations -- starting with @Before
	@BeforeSuite

	public void setUp() {

		System.out.println("setup system properties");
	}

	@BeforeClass

	public void launchBrowser() {
		System.out.println("launch chrome browser");
	}

	@BeforeMethod

	public void enterURL() {
		System.out.println("enter URL");
	}

	@BeforeTest

	public void login() {
		System.out.println("login method");
	}

	
	// Testcases starting with @Test
	@Test   //1st test case

	public void googleTitle1() {
		System.out.println("title test1");
	}

	@Test   //2nd test case

	public void googleTitle2() {
		System.out.println("title test2");
	}
	
	@Test   //3rd test case

	public void googleTitle3() {
		System.out.println("title test3");
	}
	
	//post conditions annotatoins - starting with @After
	@AfterMethod
	public void logout() {
		System.out.println("logout from app");
	}

	@AfterTest

	public void deleteCookies() {
		System.out.println("after test");
	}

	@AfterClass

	public void closeBrowser() {
		System.out.println("aafter class");
	}

	@AfterSuite

	public void generateTestResults() {
		System.out.println("generateTestResults");
	}
}
