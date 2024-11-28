package Web_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex4_getText {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		String text = driver.findElement(By.xpath("//button[contains(@class,'_42ft _4jy0')]")).getText();
		System.out.println(text);

		
	}

}
