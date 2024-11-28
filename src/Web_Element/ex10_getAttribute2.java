package Web_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex10_getAttribute2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://www.facebook.com/login/");
//		  String abc = driver.getTitle();
//		  System.out.println(abc);
		// enter user name
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc");
		
		String text = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("value");
		System.out.println(text);
		
	}

}
