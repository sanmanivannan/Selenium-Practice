package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcepts {

	public static void main(String[] args) {

		// Implicit Wait is a dymanic wait

		// Thread.sleep(3000); // this is a static wait

		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.get("https://half.ebay.com");

		//Dynamic Wait - is recommened over the Tread.sleep
		//Use once before starting any actions on the code....
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// page will wait for 40 seconds to load for the entire page, if not will time out
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		//wait for the element(s) only to get loaded
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);

		
	}

}
