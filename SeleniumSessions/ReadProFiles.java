package SeleniumSessions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProFiles {
	
    static WebDriver driver;

	public static void main(String[] args) throws IOException {

		// 1. Create the object of the Properties class
		Properties prop = new Properties();

		// 2. Create the object of the FileInputStream class
		FileInputStream ip = new FileInputStream(
				"D:\\Learning\\Selenium Workbook\\SeleniumTraining\\src\\SeleniumSessions\\config.properties");

		// 3. Load the properties txt file
		prop.load(ip);

		// 4.Read the file
		// System.out.println(prop.getProperty("Name"));
		
		String url = prop.getProperty("URL");
		// System.out.println(url);

		String browser = prop.getProperty("Browser");
		// System.out.println(browser);

		if (browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
			driver = new ChromeDriver(); // launch chrome driver
		}

		else if (browser.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Learning\\Driver files\\geckodriver.exe");
			driver = new FirefoxDriver(); // launch chrome driver

		}

	
		driver.get(url);
		
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("firstname"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("lastname"));
		driver.findElement(By.xpath(prop.getProperty("emailaddress_xpath"))).sendKeys(prop.getProperty("emailaddress"));
		driver.findElement(By.xpath(prop.getProperty("password_xpath"))).sendKeys(prop.getProperty("password"));
		
		//driver.findElement(By.xpath(""))
	}

}
