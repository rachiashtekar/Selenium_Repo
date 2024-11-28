package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_Select_DeSelect_MultipleCheckbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Downloads/checkboxes.html");
		driver.manage().window().maximize();
List<WebElement> allcheckbox =	driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement s1 : allcheckbox)
	{
		s1.click();
		Thread.sleep(2000);
	}
	
	for(int i= allcheckbox.size()-1;i>=0;i--)
	{
		allcheckbox.get(i).click();
		Thread.sleep(1000);
	}
	
	}

}
