package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ex3_isMultiple {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
	WebElement selectmonth =	driver.findElement(By.xpath("//select[@id='month']"));
          Select s = new Select(selectmonth);
       boolean multiple=  s.isMultiple();
       System.out.println(multiple);
		if(multiple) {
			System.out.println("list box is multiselected");
		}
		else
		{
			System.out.println("list box is not multiselected");
		}
	}

}
