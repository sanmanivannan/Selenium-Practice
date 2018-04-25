package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");

		// By.xpath

		driver.findElement(By.xpath("//INPUT[@id='firstname']")).sendKeys("Tom");
		driver.findElement(By.xpath("//INPUT[@id='lastname']")).sendKeys("Hanks");
		driver.findElement(By.xpath("//INPUT[@id='email']")).sendKeys("Tom.Hanks123@gmail.com");
		driver.findElement(By.xpath("//INPUT[@id='PASSWORD']")).sendKeys("Tom1234");

		// By.name
		// driver.findElement(By.name("PASSWORD")).sendKeys("Tom1234");

		// By.id
		driver.findElement(By.id("ppaFormSbtBtn")).click();

		// By.linkText (highly recommened for links only)
		// driver.findElement(By.linkText("Sign in")).click();

		// By.CSSSelector
		driver.findElement(By.cssSelector("#email")).sendKeys("Tom.Hanks123updated@gmail.com");

		// By.partialLinkText (not useful and not recommended)
		// driver.findElement(By.partialLinkText("Sign in")).click();

		// By.className (not useful and not recommended)
		// driver.findElement(By.className("fld wide wide
		// fld")).sendKeys("Tom.Hanks123updated@gmail.com");

		// By.type

	}

}
