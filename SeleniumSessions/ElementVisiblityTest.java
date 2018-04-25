package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisiblityTest {

	public static void main(String[] args) {

		// Difference between isDisplayed(), isEnabled() and isSelected() Methods in
		// Selenium WebDriver:
		//
		// 1. isDisplayed() is the method used to verify the presence of a web element
		// within the web page. The method returns a “true” value if the specified web
		// element is present on the web page and a “false” value if the web element is
		// not present on the webpage.
		// 2. isDisplayed() is capable to check for the presence of all kinds of web
		// elements available.
		// 3. isEnabled() is the method used to verify if the web element is enabled or
		// disabled within the web page.
		// 4. isEnabled() is primarily used with buttons.
		// 5. isSelected() is the method used to verify if the web element is selected
		// or not. 6. isSelected() method is predominantly used with radio buttons,
		// dropdowns and checkboxes.

		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.get("https:/www.freecrm.com/register");

		// isDisplayed() method : appliclable for all the elements. to check whether the
		// selected element is displayed or not as a boolean output

		// boolean isdisplayed = driver.findElement(By.className("btn")).isDisplayed();
		// System.out.println(isdisplayed);
		//*************************************************************************************************
		// isEnabled() method :

		driver.findElement(By.name("agreeTerms")).click();
		boolean isenabled = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(isenabled);
		
		//*************************************************************************************************
		
		//isSelected //is used only for button,checkbox,radio button
		
		boolean isselected = driver.findElement(By.id("submitButton")).isSelected();
		System.out.println(isselected);
		
		
	}

}
