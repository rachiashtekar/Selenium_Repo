package locators_Practicse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex4_xpathByIndex {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
	     Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign up')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("abc@");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abc@123");
	}

}
