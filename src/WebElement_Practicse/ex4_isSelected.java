package WebElement_Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_isSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.xpath("//a[@class='_97w5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@class='_58mt']")).click();
		Thread.sleep(5000);
		
	boolean result = driver.findElement(By.xpath("//input[@name='sex' and @value='1']")).isSelected();
	System.out.println(result);
	if(result)
	{
		System.out.println("this is selected");
	}
	else
	{
		System.out.println("this is not selected");
	}
		
	}

}
