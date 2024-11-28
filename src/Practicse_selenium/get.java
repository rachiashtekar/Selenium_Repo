package Practicse_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class get {
public static void main(String[] args) {
//	WebDriver driver = new ChromeDriver();
//	driver.get("https://www.facebook.com/login/");
	
	WebDriver driver = new EdgeDriver();
   driver.get("https://www.facebook.com/login/");
}
}
