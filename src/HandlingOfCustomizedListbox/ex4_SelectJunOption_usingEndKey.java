package HandlingOfCustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex4_SelectJunOption_usingEndKey {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);
		
	WebElement month =driver.findElement(By.xpath("//select[@id='month']"));
	Actions act = new Actions(driver);
	act.click(month).perform();
	Thread.sleep(2000);
	
	//jump to last option using end key
	act.sendKeys(Keys.END).perform();
	Thread.sleep(2000);
	
	//navigate to june option
	for(int i=1;i<=6;i++)
	{
		act.sendKeys(Keys.ARROW_UP).perform();
		Thread.sleep(2000);
		
	}
	Thread.sleep(2000);
	//select option using enter key
	act.sendKeys(Keys.ENTER).perform();
	}

}
