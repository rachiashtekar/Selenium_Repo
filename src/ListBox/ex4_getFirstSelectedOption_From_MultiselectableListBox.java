package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex4_getFirstSelectedOption_From_MultiselectableListBox {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Welcome/Desktop/Dropdown.html");
		Thread.sleep(2000);
	WebElement selectCountry=driver.findElement(By.xpath("//select[@id='countries']"));
		Select s = new Select(selectCountry);
		s.selectByIndex(1);
		s.selectByIndex(0);
		s.selectByIndex(2);
		String text =s.getFirstSelectedOption().getText();
		System.out.println(text);
		
	}

}
