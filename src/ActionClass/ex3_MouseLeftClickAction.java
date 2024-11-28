package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex3_MouseLeftClickAction {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		
WebElement element =driver.findElement(By.xpath("//span[text()='Electronics']"));

Actions act = new Actions(driver);

//act.moveToElement(element).perform();
//act.click().perform();

//or

//act.moveToElement(element).click().perform();

//or

act.click(element).perform();



	}

}
