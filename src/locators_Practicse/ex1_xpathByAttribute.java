package locators_Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_xpathByAttribute {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(2000);
		//enter username
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("abc@gmail.com");
		
//		//enter password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xyz1234567");
		
		
		Thread.sleep(5000);
		
		//click on login
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
	}

}
