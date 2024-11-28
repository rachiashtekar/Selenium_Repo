package Web_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex9_getAttribute1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		String value = driver.findElement(By.xpath("//input[@id='email']")).getAttribute("placeholder");
		System.out.println(value);
		
		String value1 = driver.findElement(By.xpath("//input[@id='pass']")).getAttribute("placeholder");
	    System.out.println(value1);
	    
	    
	}

}
