package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopup {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.get("https://html.com/input-type-file/");
		
		driver.findElement(By.xpath("//INPUT[@id='fileupload']")).sendKeys("C:\\Users\\Vishnuram\\Desktop\\Java The Complete Reference - 7th Edition [DwzRG] (2).pdf");
	}

}
