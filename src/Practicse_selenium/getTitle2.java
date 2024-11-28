package Practicse_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle2 {
	public static void main(String[] args) {
	    WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		String a = driver.getTitle();
		String b= "Log in to facebook";
		
		if(a.equals(b)) {
			System.out.println("this is corrcet title");
		}
		else
		{
			System.out.println("this is not correct title");
		}
	}

}
