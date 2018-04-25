package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcepts {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.get("http://jqueryui.com/droppable/");

		driver.switchTo().frame(0); //use only is the frame are present on the webpage, else skip this step

		//Using Actions classes we do drag and drop
		Actions action = new Actions(driver);
		action.clickAndHold(driver.findElement(By.xpath("//P[text()='Drag me to my target']")))
				.moveToElement(driver.findElement(By.xpath("//DIV[@id='droppable']")))
				.release()
				.build()
				.perform();
		
		
		

	}

}
