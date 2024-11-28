package HandlingOfAutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_SelectSpecificOptionFrom_autosuggestion {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com/");
		
		//enter input
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		Thread.sleep(2000);	
		String expText = "redmi 13c";
List<WebElement> allOptions =driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li//div[@class='wM6W7d']"));
for(WebElement s1 : allOptions)
{
	String actText = s1.getText();
	if(actText.equals(expText))
	{
		s1.click();
		System.out.println(actText);
		break;
	}
//	else
//	{
//		System.out.println("not in the suggestion");    // it will check that what expText is there in the automation or not
//	}
}
		
	}		

}
