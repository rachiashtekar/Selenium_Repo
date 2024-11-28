package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_ExampleWithoutDDF {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//enter username
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		
		//enter password
	   driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
	   
	   //click
	   driver.findElement(By.xpath("//input[@type='submit']")).click();
	   
	   //get Title
	String actTitle= driver.getTitle();
	System.out.println(actTitle);
	String extTitle = "Swag Labs1";
	if(actTitle.equals(extTitle))
			{
		System.out.println("right title");
			}
	else
	{
		System.out.println("wrong title");
	}
		
		driver.quit();
	}
	

}
