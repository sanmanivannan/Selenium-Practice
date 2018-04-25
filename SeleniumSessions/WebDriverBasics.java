package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		// how to launch Firefox web browser
		// firefox uses GeckoDriver

		// System.setProperty("webdriver.gecko.driver", "D:\\Learning\\Driver
		// files\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		
		// driver.get("http://www.google.com");

		// *********************************************************************************************************************
		// how to launch Goolge Chrome web browser

		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
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

		// ********************************************************************************************************************

	}

}
