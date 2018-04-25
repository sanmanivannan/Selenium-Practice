package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.get("https://half.ebay.com");

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		// 1. get the total count of links on the page
		// 2. get the text of each link on the page

		// using findElements method
		List<WebElement> linklist = driver.findElements(By.tagName("a")); // since all the links are represented by <a>
																			// tag we user tagName as <a>
		System.out.println(linklist.size());
for(int i=0;i<linklist.size();i++) {
	
	String link1 = linklist.get(i).getText();
	
		System.out.println(link1);
	
}
	
	}

}
