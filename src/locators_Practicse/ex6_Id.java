package locators_Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_Id {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("abc");
		
	}

}
