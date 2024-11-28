package HandlingOfAutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_getAllOptionsFrom_Autosuggestion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		//enter input
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		
		Thread.sleep(2000);
		
	List<WebElement> allOptions =	driver.findElements(By.xpath("//ul[@class='G43f7e'][1]//li//div[@class='wM6W7d']"));

	for(WebElement s1 : allOptions)
	{
		System.out.println(s1.getText());
	}
	}

}
