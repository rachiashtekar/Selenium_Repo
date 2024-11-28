package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex5_xpathByIndex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		Thread.sleep(2000);
		//enter firstname
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("abc");
		
		// enter surname
		
		driver.findElement(By.xpath("(//input[@type='text'])[2] ")).sendKeys("xyz");
	}
		

}
