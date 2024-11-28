package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_AlertPopup1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//enter custmer Id
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("101");
		
	    // click on submit button
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//getText from alert popup
		
	String text =driver.switchTo().alert().getText();
	System.out.println(text);
	
	//click on cancel button from alert popup
	
//	driver.switchTo().alert().dismiss();
	
	//click on ok button from alert popup
	
	driver.switchTo().alert().accept();
	
	//click on ok button from 2nd alert popup
	
	driver.switchTo().alert().accept();
		
	
	}
	
	

}
