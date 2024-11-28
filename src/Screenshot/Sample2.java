package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sample2 {
public static void main(String[] args) throws IOException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement logo = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
	File src = logo.getScreenshotAs(OutputType.FILE);
	File dest = new File("D:\\\\selenium\\\\Screenshots\\\\logo.png");
	FileHandler.copy(src, dest);
}
}

//getScreenshotAs is a method of the TakesScreenshot interface, not directly a method of WebElement. However, in Selenium 4, WebElement inherits the ability to use getScreenshotAs to capture element-specific screenshots.