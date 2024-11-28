package HandlingDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_getRatingsFromFlipkartApp {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//search mobile
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("redmi 13c 5g");
		
		//cllick to search icon
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	String text =	driver.findElement(By.xpath("(//div[@class='tUxRFH'][1]//span)[6]")).getText();
	System.out.println(text);
	
	}

}
