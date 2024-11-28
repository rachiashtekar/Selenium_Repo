package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex3_isMultiple1 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Welcome/Desktop/Dropdown.html");
	Thread.sleep(2000);
	WebElement selectCountry = driver.findElement(By.xpath("//select[@id='countries']"));
	
	Select s= new Select(selectCountry);
	boolean result = s.isMultiple();
	System.out.println(result);
	if(result)
	{
		System.out.println("Listbox is multi-selectable");
	}
	else
	{
		System.out.println("listbox is not multi_selectable");
	}
	
}
}
