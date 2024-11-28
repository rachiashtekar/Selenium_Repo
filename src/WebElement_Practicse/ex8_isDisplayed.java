package WebElement_Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex8_isDisplayed {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _agiv img']")).isDisplayed();
		System.out.println(result);
		if(result) {
			System.out.println("yess this is displyed");
		}
		else
		{
			System.out.println("yess this is not displyed");
		}
		
		
	}

}
