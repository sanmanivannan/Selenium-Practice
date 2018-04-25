package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessBrowserTesting {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();

		// ************need to document and practice more refer the video number#12
		// https://www.youtube.com/watch?v=d4RDWzhVD7o&index=12&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT
		//Option#1
		
		WebDriver driver = new HtmlUnitDriver();
		
		//HtmlUnitDriver is not available as part of the selenium 3.x version
		//So to use this Class we need to download htmlunitdriver jar file from internet(just like gecko and chrome drivers)
		
		// Its otherwise called as Ghost Driver or Headless Browser
		   //HtmlUnitDriver for Java
		   //PhantomJS for JS
		
		//Advantages
		//1.testing is happening on the background without opening any browser
		//2.execution of test cases are really fast
		
		//Limitaion/DisAdvantages
		//1. Not suitable for Actions class - like mouse movements like hover, doubleclick, dra and drop will not work
		//2. not suitable for complex DOM 

		//Option#2
		//If you want to run the headless browser within the chrome
		//following chrome options are required for Chrome HeadLess Browser:
		
		
//		ChromeOptions options = new ChromeOptions();
//			options.addArguments("window-size=1400,800");
//			options.addArguments("headless");
		
		driver.get("http://www.google.com"); // driver.get is from WedDriver Interface and is used to hit the url

		String title = driver.getTitle(); // driver.getTitle is from WedDriver Interface and is used to get the title of
											// the website
		System.out.println(title);

		if (title.equals("Google")) { // .equals is the method from String class
			System.out.println("Correct title");
		} else {
			System.out.println("Incorrect title");
		}

		System.out.println(driver.getCurrentUrl()); // driver.quit is from WedDriver Interface

		driver.quit(); // quit the browser //driver.quit is from WedDriver Interface

	}

}
