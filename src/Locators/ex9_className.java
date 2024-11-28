package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex9_className {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/Welcome/Desktop/Tagname.html");

	driver.findElement(By.className("1234")).sendKeys("xyz");

	driver.findElement(By.className("1234")).sendKeys("abc");

}
}
