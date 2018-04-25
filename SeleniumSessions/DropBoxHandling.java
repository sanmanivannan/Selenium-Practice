package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropBoxHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.get("http://www.calculator.net/loan-calculator.html");

		//driver.findElement(By.id("ccompound"));

		// Handling the dropdown  //SELECT class usage

		Select select = new Select(driver.findElement(By.id("ccompound"))); // Need to create the object from the Select
																			// class
		select.selectByVisibleText("Daily");

	}

}
