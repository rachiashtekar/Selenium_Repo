package Locators;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_xpathByAttribute1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		//enter user name
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		
		// enter password
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc");
		
		// click on login button
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
