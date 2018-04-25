package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.get("https://www.freecrm.com");

		driver.findElement(By.name("username")).sendKeys("sanmanivannan");
		driver.findElement(By.name("password")).sendKeys("santharam23");
		driver.findElement(By.xpath("//INPUT[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),Contacts]")).click();

		// to get the list of all links and images
		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.addAll(driver.findElement(By.tagName("img")));

		// prints the total number of links
		System.out.println("Total number of Links" + links.size());

		ArrayList<WebElement> arrlist = new ArrayList<WebElement>();

		// iterates all the links and images; and excludes all the links and images
		// which doesnt have the href arrtibute

		for (int i = 0; i < links.size(); i++) {
			if (links.get(i).getAttribute("href") != null) {
				arrlist.add(links.get(i));

			}
			// printsthe size of the active links
			System.out.println("Size of the active 	links" + arrlist.size());

		}

		// check the href url and httpconnection api

		for(int j=0;j<arrlist.size();j++) {
			
			//This Topic is not completed and the class used to check the connection is HttpURLConnection
			
		}
	}

}
