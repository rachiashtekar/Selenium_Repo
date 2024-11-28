package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_switchToChildWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	
		

		//click on New Tab link from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		
		//get child window Id
		
		Set<String> alids = driver.getWindowHandles(); //[mainpageId , childWindowId]
		ArrayList<String> al = new ArrayList<>(alids); //[mainpage(0),childWindowId(1)]
		System.out.println(al);
		String childWindowId = al.get(1);
		
		//switch to child window
		driver.switchTo().window(childWindowId);
		
		
		
		//click traning link from child window
		driver.findElement(By.xpath("//span[text()='Training'][1]")).click();
		
		
		
		
	}

}
