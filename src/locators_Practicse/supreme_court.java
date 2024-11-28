package locators_Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class supreme_court {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.sci.gov.in/");
		
		driver.findElement(By.xpath("//a[@title='Case Status']")).click();
		
		driver.findElement(By.linkText("Diary Number")).click();
		
		driver.findElement(By.xpath("//input[@id='diary_no']")).sendKeys("3456789");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		
	
		
	
		
		
	}

}
