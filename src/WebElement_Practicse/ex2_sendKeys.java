package WebElement_Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_sendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement un = driver.findElement(By.xpath("//input[@name='email']"));
		un.sendKeys("abc");
		Thread.sleep(2000);
		un.clear();
		un.sendKeys("xyz");
		
	}

}
