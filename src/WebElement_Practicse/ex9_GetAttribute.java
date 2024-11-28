package WebElement_Practicse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex9_GetAttribute {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		String text = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder");
		System.out.println(text);
		String text2=driver.findElement(By.xpath("//input[@id='pass']")).getAttribute("id");
		System.out.println(text2);
	}

}
