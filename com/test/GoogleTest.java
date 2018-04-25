package com.test;

import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		driver = new ChromeDriver(); // launch chrome driver
		driver.get("http://www.google.com");
	}
		
		@Test(priority=1,groups="Title")   //1st test case  //priority and grouping of the testcases using the keyword
	//@Parameter ({"URL","",""})
		public void googleTitle(String URL) {
			
			String title = driver.getTitle();
			System.out.println(title);
			Assert.assertEquals(title, "Google", "not euqal to title");   //assertion of the titles
			
		}

		@Test(priority=2,groups="Title")   //1st test case  //priority and grouping of the testcases using the keyword

		public void googleTitle1() {
			
			System.out.println(driver.getTitle());
		}

		@Test(priority=3,groups="Title")   //1st test case  //priority and grouping of the testcases using the keyword

		public void googleTitle3() {
			
			System.out.println(driver.getTitle());
		}
		
		@Test(priority=4,groups="Links")   //2nd test case

		public void amazonTitle() {
			//driver.get("www.Amazon.com");
			String t1=driver.getTitle();
			System.out.println(t1);
		}
		
		@Test(priority=5,groups="Links")   //3rd test case

		public void gmailTitle() {
		//	driver.get("www.Amazon.com");
			String t2=driver.getTitle();
			System.out.println(t2);
			
		
		}
		
		
		
		
		@AfterMethod
		public void closeBrowser() {
			driver.close();
		}
	}
