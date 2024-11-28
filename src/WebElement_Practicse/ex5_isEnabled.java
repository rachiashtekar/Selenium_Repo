package WebElement_Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_isEnabled {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/signup/cold-join");
	boolean result =	driver.findElement(By.xpath("//input[@placeholder='First name']")).isEnabled();
	System.out.println(result);
	if(result)
	{
		System.out.println("this is enabled");
	}
	else
	{
		System.out.println("this is not enabled");
	}
		
	}

}
