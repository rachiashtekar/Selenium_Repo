package Popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex3_SwitchToMainPageFrom_ChildWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//click on new tab link from main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window
		Set<String> alids = driver.getWindowHandles();
		ArrayList<String> al= new ArrayList<>(alids);
		
		System.out.println(al.get(0));
		
		//switch  to child window
		driver.switchTo().window(al.get(1));
		
		//click traning link from child window
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		Thread.sleep(3000);
		
		//switch to main page
		driver.switchTo().window(al.get(0));
		
		Thread.sleep(2000);
		
		//click on newwindow link from main page
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		
		//switch to child window 2
		
		
		Set<String> alids2 = driver.getWindowHandles();
		ArrayList<String> al2 = new ArrayList<>(alids2);
		driver.switchTo().window(al2.get(2));
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		//switch to main page
//		driver.switchTo().window(al.get(0));
		
		
		
	}

}
