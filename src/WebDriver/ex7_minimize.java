package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex7_minimize {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		Thread.sleep(2000);
	    Options s1= driver.manage();
	    Window s2 = s1.window();
	    s2.minimize();
	}
	

}

//driver.manage() returns an Options object, which allows you to manage various settings of the browser.
//s1.window() returns a Window object, which allows you to manipulate the browser window (resize, maximize, etc.).
//s2.maximize() maximizes the browser window.
