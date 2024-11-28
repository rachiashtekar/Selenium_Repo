package locators_Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAttributeWithContains {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Website");
		driver.findElement(By.xpath("//a[contains(@title,\"You're encouraged to log in\")]")).click();
		driver.findElement(By.xpath("(//input[contains(@placeholder,\"Enter your\")])[1]")).sendKeys("abc@gmail.com");   // here i have use 1 of 2 
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains(@placeholder,\"Enter your\")])[2]")).sendKeys("abc@123");    // here i have use 1 of 2
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='checkbox' and @name='wpRemember']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
