package locators_Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_Tagname {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/emailsignup/");
		Thread.sleep(2000);
		driver.findElement(By.tagName("input")).sendKeys("abc@gmail.com");
		driver.findElement(By.tagName("input")).sendKeys("abc");
	}

}
