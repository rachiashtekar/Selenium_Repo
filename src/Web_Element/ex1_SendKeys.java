package Web_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ex1_SendKeys {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
//	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("abc");
	
//	WebElement un = driver.findElement(By.id("email"));
//	un.sendKeys("abc");
//	
	// findelement return webelement
	//findelement is the methods of webdriver
	
}
}
