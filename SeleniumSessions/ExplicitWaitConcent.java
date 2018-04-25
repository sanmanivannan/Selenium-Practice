package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcent {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.get("https://half.ebay.com");

		// callind the below explicit wait method for this element
		clickOn(driver, driver.findElement(By.xpath("//INPUT[@type='submit']")), 20);

	}

	// need to write this method for using the explicwait
	// Explicit wait is only for the specific Element
	// in the below case we used specific element using the locator

	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable((By) locator));
		((WebElement) locator).click();

	}
}
