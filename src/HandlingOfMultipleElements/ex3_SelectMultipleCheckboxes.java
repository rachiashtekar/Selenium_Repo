package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex3_SelectMultipleCheckboxes {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Welcome/Downloads/checkboxes.html");
	List<WebElement> allcheckbox	= driver.findElements(By.xpath("//input[@type='checkbox']"));
	for(WebElement s1 : allcheckbox)
	{
		s1.click();
		Thread.sleep(2000);
	}
	}

}
