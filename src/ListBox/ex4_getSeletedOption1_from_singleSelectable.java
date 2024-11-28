package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex4_getSeletedOption1_from_singleSelectable {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		WebElement month=  driver.findElement(By.xpath("//select[@id='month']"));
		Select s= new Select(month);
		String Text = s.getFirstSelectedOption().getText();
		System.out.println(Text);
		System.out.println(s.getFirstSelectedOption().getText());
		
		
		// OR
		
		WebElement s1= s.getFirstSelectedOption();
		String text =s1.getText();
		System.out.println(text);
		
		
		
	}

}
