package Web_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex8_isDisplayed {
	public static void main(String[] args) {
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
	boolean result =driver.findElement(By.xpath("//img[@class='_97vu img']")).isDisplayed();
		System.out.println(result);
		if(result) {
			System.out.println("Element found");
		}
		else
		{
			System.out.println("Element not found");
		}
	}

}
