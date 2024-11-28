package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex6_SizeOf_getAllSelected_From_MultiselectableListbox {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Desktop/Dropdown.html");
		WebElement selectCountry =driver.findElement(By.xpath("//select[@id='countries']"));
		Select s = new Select(selectCountry);
		s.selectByIndex(0);
		s.selectByIndex(2);
		s.selectByIndex(1);
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		System.out.println(allSelectedOptions.size());
		
		//OR
		
		int size = s.getAllSelectedOptions().size();
		System.out.println(size);
		
		//OR
		
	    System.out.println(s.getAllSelectedOptions().size());
		
		
	}

}
