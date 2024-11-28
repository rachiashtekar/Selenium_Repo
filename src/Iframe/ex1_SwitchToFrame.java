package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_SwitchToFrame {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
	    
		//Switch to frame
//	driver.switchTo().frame("iframeResult"); //String FrameName
//	driver.switchTo().frame("iframeResult"); //String FrameID
	driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']"))); //Frame webelement
	//driver.switchTo().frame(FrameIndex);  //int FrameIndex


		
		
		driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();
	}

}
