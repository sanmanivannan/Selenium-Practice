package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Learning\\Driver files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // launch chrome driver
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.xpath("//INPUT[@type='submit']")).click(); // clicking go button
				
		Thread.sleep(5000);
		
		//Alert call for popup handle
		
		Alert alert = driver.switchTo().alert(); //switching popuo/alert screen
		System.out.println(alert.getText());
		alert.accept();   //click on ok button on the popuo
	
		//alert.dismiss();  // clickon the cancle button
		
		String output = alert.getText();
		
		if(output.equals("Please enter a valid user name")){
			System.out.println("Correct");
		}
		else {
			System.out.println("INCorrect");
		}
		
		driver.close();
	
	}

}
