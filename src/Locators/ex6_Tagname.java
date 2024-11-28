package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
public class ex6_Tagname  {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Desktop/Tagname.html");
		
		//enter FN
		
		driver.findElement(By.tagName("input")).sendKeys("abc");
		
		//enter Ln
		driver.findElement(By.tagName("input")).sendKeys("xyz");
		
		
	}
	
	

}
