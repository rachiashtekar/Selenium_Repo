package Web_Element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class ex5_isSelected {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		//click on create new acc link
		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		driver.findElement(By.xpath("//input[@id='sex']")).click();
		Thread.sleep(3000);
		boolean result = driver.findElement(By.xpath("//input[@class='_8esa']")).isSelected();
		System.out.println(result);
		if(result)
		{
		System.out.println("Radio btn Selected");
		}
		else
		{
		System.out.println("Radio btn De-Selected");
		}
	}

}
