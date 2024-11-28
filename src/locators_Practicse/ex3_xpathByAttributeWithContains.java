package locators_Practicse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex3_xpathByAttributeWithContains {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.linkedin.com/signup/cold-join?source=guest_homepage-basic_nav-header-signin");
		driver.findElement(By.xpath("//button[contains(@id,'join-form-submit')]")).click();
	}

}
