package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_getSizeOfAllLinksFromWebpage {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
	int size = allLinks.size();
	System.out.println(size);
	
	
	System.out.println(driver.findElements(By.xpath("//a")).size());
	}

}
