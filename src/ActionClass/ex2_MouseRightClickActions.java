package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

;

public class ex2_MouseRightClickActions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
WebElement element =driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(element).perform();
		act.contextClick().perform();
        	
		
		//or
		
//		act.moveToElement(element).contextClick().perform();
		
		//or
		
		act.contextClick(element).perform();
		
	
	}

}
