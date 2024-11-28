package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_SwitchToMainPage_From_IFrame {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	
		//switch to frame
		driver.switchTo().frame("iframeResult");
		
		// click  on date and time button from Iframe
		driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();
		
		//switch to main page from Iframe
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		
		
		//click on openMenu link from Main Page
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	
	
	
	}

}

//driver.switchTo().parentFrame(): This moves you up one level in the frame hierarchy. If you're inside a frame within another frame, it takes you back to the frame just above the current one.

//driver.switchTo().defaultContent(): This moves you out of all frames and brings you back to the main page (the top-level content).