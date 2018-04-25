package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPopUpWindow {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//A[@class='black'][text()='Good PopUp #3']")).click();

		// Set is the collection in Java
		// Set is not List or Array //In Set, its not stored in form or Array
		//
		Set<String> windowid = driver.getWindowHandles(); // getwindowhandles is used to find the ids of the webbrowser

		Iterator<String> it = windowid.iterator();   //Iterator is used because Set is not Indexedas Array
		String parentwindwid = it.next();
		System.out.println("parentwindwid" + parentwindwid);

		String childwindwid = it.next();
		System.out.println("childwindwid" + childwindwid);

		driver.switchTo().window(childwindwid);
		System.out.println("title of child page is" + driver.getTitle());
		driver.close(); // use only driver.close();and not .quit();

		driver.switchTo().window(parentwindwid);
		System.out.println("title of parent page is" + driver.getTitle());
		driver.close();
	}

}
