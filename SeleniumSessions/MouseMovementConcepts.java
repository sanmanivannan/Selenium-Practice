package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcepts {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver

		// prerequisite - good practice to follow
		//driver.manage().window().maximize(); // maximizing the webdrowser

		// driver.manage().deleteAllCookies(); //delete all the cookies
		Thread.sleep(3000);
		driver.get("http://www.spicejet.com/");

		// Actions class for mousemovement

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform(); // build().perform(); is
																							// madatory at the end when
		
			
		driver.findElement(By.linkText("Hot Meals")).click();
	}

}
