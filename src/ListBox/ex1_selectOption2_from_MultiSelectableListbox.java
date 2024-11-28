package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex1_selectOption2_from_MultiSelectableListbox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Desktop/Dropdown.html");
		Thread.sleep(2000);
	WebElement SelectCountry=driver.findElement(By.xpath("//select[@id='countries']"));
		
	Select s= new Select(SelectCountry);
	
	s.selectByIndex(1);
    s.selectByVisibleText("AMER");
	s.selectByVisibleText("SRI");
		
	}

}
