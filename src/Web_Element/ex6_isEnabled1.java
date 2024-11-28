package Web_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex6_isEnabled1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		System.out.println(result);
		
		if(result)
		{
			System.out.println("Element is Enabled");
		}
		else
		{
			System.out.println("Element is disabled");
		}
	}

}
