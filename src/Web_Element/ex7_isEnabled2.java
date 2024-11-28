package Web_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex7_isEnabled2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.instagram.com/");
	Thread.sleep(2000);
	boolean result = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
	System.out.println(result);
	if(result) {
		System.out.println("Element is Enabled");
	}
	else
	{
		System.out.println("Element is disabled");
	}
}
}
