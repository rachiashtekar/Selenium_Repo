package Locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_xpathByAttribute2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
				driver.get("https://www.facebook.com/login/");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_97w5']")).click();
		
	}

}
