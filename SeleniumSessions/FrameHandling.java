package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver

		// prerequisite - good practice to follow
		// driver.manage().window().maximize(); // maximizing the webdrowser

		// driver.manage().deleteAllCookies(); //delete all the cookies

		driver.get("https:/www.freecrm.com/index.html");

		Thread.sleep(2000);

		// Alert alert = driver.switchTo().alert();
		// alert.dismiss();

		// Thread.sleep(5000);

		driver.findElement(By.name("username")).sendKeys("sanmanivannan");
		driver.findElement(By.name("password")).sendKeys("santharam23");
		driver.findElement(By.xpath("//INPUT[@type='submit']")).click();

		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),Contacts]")).click();

	}

}
