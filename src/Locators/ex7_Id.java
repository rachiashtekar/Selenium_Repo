package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex7_Id {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Desktop/Tagname.html");
		
		driver.findElement(By.id("abc123")).sendKeys("abc");
		driver.findElement(By.id("abc1234")).sendKeys("xyz");
		
	}

}
