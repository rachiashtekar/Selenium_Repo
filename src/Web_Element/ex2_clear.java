package Web_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex2_clear {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
		
//		 driver.findElement(By.id("email")).sendKeys("abc");
//		 Thread.sleep(5000);
//		driver.findElement(By.id("email")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.id("email")).sendKeys("xyz");
		
        WebElement un = driver.findElement(By.id("email"));
        un.sendKeys("abc");
		un.clear();
		Thread.sleep(2000);
		un.sendKeys("xyz");
	}

}
