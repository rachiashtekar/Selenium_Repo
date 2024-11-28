package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex5_SelectSpecifixCheckBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Downloads/checkboxes.html");
		driver.manage().window().maximize();
		
List<WebElement> checkBox =	driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(int i=0;i<4;i++)
	{
		checkBox.get(i).click();
		Thread.sleep(1000);
		
	}
	
	}

}
