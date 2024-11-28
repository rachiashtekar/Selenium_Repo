package Practicse_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.Window;

public class maximize {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
    	driver.get("https://www.facebook.com/login/");
    	driver.manage().window().maximize();
	}

}
