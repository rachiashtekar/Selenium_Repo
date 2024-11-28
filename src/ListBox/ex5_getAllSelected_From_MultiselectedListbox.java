package ListBox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex5_getAllSelected_From_MultiselectedListbox {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Desktop/Dropdown.html");
		WebElement selectCountry = driver.findElement(By.xpath("//select[@id='countries']"));
		Select s = new Select(selectCountry);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(3);
		s.selectByIndex(2);
		
		List<WebElement> selectedOption = s.getAllSelectedOptions();
		for(WebElement s1 : selectedOption)
		{
			System.out.println(s1.getText());
		}
		
		
	}

}
