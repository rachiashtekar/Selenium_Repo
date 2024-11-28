package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex5_xpathByContains_usingAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		// enter user name 
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("abc@gmail.com");
		
		//enter password
		driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]")).sendKeys("xyz");
		
		// click on login button
//		driver.findElement(By.xpath("//button[contains(@class,'selected _51sy')])")).click();
		driver.findElement(By.xpath("//button[contains(@class,'1 selected _51sy')]")).click();
		
	}

}
