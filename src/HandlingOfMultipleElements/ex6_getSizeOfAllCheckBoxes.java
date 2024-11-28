package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_getSizeOfAllCheckBoxes {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Downloads/checkboxes.html");
		driver.manage().window().maximize();
	int size =	driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	System.out.println(size);
	
 List<WebElement> allcheckboxSize =	driver.findElements(By.xpath("//input[@type='checkbox']"));
 int size1=allcheckboxSize.size();
 System.out.println(size1);
	
		
	}

}
