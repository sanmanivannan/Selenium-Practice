package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableConcepts {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver

		driver.get("https:/www.freecrm.com/index.html");

		Thread.sleep(2000);

		
		driver.findElement(By.name("username")).sendKeys("sanmanivannan");
		driver.findElement(By.name("password")).sendKeys("santharam23");
		driver.findElement(By.xpath("//INPUT[@type='submit']")).click();

		Thread.sleep(2000);
		driver.switchTo().frame("mainpanel");
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),Contacts]")).click();
		
		//id("vContactsForm")/table[1]/tbody[1]/tr[4]/td[2]/a[1]
		//id("vContactsForm")/table[1]/tbody[1]/tr[5]/td[2]/a[1]		
		//id("vContactsForm")/table[1]/tbody[1]/tr[6]/td[2]/a[1]
		
		
		//id("vContactsForm")/table[1]/tbody[1]/tr[4]/td[1]/input[1]
		
		//Method:1 using the for loop condition by breaking the absolute xpath
		
		String before_xpath = "@id("vContactsForm")/table[1]/tbody[1]/tr[";
		String after_xpath = "]/td[2]/a[1]";
		
		for( int i= 4; i<=7;i++) {
			
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(name);
			if(name.contains("firstname lastname"))
					{
					
				driver.findElement(By.xpath("id(\"vContactsForm\")/table[1]/tbody[1]/tr["+i + "]/td[1]/input[1]")).click();
			
		}
		
	}
		
		//Method:2  using the customized xpath
		
		//Method-2:
				driver.findElement(By.xpath("//a[contains(text(),'test2 test2')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
				driver.findElement(By.xpath("//a[contains(text(),'ui uiii')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
	}
}


