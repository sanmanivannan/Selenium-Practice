package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.get("https://half.ebay.com");

		//Dynamic Wait - is recommened over the Tread.sleep
		//Use once before starting any actions on the code....
		//driver.manage().window().maximize();
		//driver.manage().deleteAllCookies();
		// page will wait for 40 seconds to load, if not will time out
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		//wait for the element(s) to get loaded
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("iphone");
		
		//to handle dynamic id or name
		driver.findElement(By.xpath("//input[contains(@id, 'id_')]")).sendKeys("123");
		//or use
		driver.findElement(By.xpath("//input[starts-with(@id,'123')]")).sendKeys("wee");
		driver.findElement(By.xpath("//input[ends-with(@id,'123')]")).sendKeys("wee");
		
		
		//custom xpath for links
		//driver.findElement(By.xpath("//a[contains(@text, 'text')]")).sendKeys(123);
		
		
		
		
		
		
	}

}
