package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_AlertPopup2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//enter customer Id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("101");
		
		//driver customer Id
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//switch to alert popup
		Alert alt = driver.switchTo().alert();
		
		//get text from alert popup
		String text = alt.getText();
		System.out.println(text);
		
		//click on cancel btn from alert popup
		//alt.dismiss();
		
		//click on Ok btn from 1st alert popup
		alt.accept();
		
		//click on Ok btn from 2nd alert popup
		alt.accept();
		
		//enter value in alert popup
		//alt.sendKeys("abc");
		
		
		
		
		
	}

}
