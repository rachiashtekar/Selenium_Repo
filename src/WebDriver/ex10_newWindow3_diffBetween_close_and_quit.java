package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class ex10_newWindow3_diffBetween_close_and_quit {
public static void main(String[] args) throws InterruptedException  {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.facebook.com/login/");
	Thread.sleep(2000);
	//driver.close();   // close only current Tab(Tab2)
	driver.quit();      // close the chrome window
}
}
