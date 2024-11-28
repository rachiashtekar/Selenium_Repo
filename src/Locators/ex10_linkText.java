package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex10_linkText {
	public static void main(String[] args)  throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Desktop/Tagname.html");
		Thread.sleep(2000);
		driver.findElement(By.linkText("click here")).click();
		
	}

}
