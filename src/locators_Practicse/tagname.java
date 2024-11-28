package locators_Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tagname {
	public static void main(String[] args) throws InterruptedException { 
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("abc@gmail.com");     // this is not working   // using tagname it is not working
		
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.tagName("button")).click();
		
//	driver.findElement(By.id("pass")).sendKeys("abc@123");     //this is  working using id
		
//		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");  // working fine
//		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("abc@gmail.com");    // not working 
	}

}
