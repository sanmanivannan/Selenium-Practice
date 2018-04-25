package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateConcepts {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.get("http://www.google.com/");
		
		driver.navigate().to("http://www.amazon.com/");
		
		driver.navigate().back();
		
		

		
	}

}
