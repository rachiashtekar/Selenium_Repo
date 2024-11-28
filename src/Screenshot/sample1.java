package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sample1 {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	File src =	((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	System.out.println(src);
	File dest = new File("D:\\selenium\\Screenshots\\Sample.png");
	System.out.println(dest);
	FileHandler.copy(src, dest);
//	TakesScreenshot s2 =((TakesScreenshot)driver);
	}

}

// 1. TakesScreenshot and WebDriver are two different interfaces in Selenium:
//
//WebDriver: This is the main interface for controlling web browsers. It provides methods for navigating to URLs, finding elements, and performing actions on them.
//
//TakesScreenshot: This interface extends WebDriver and provides the method getScreenshotAs for capturing screenshots of the current browser window.


//2. TakeScreenShot Method
//The TakesScreenshot interface allows you to capture screenshots in various formats, primarily through the getScreenshotAs method.
