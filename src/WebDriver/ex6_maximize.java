package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex6_maximize {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
    	driver.manage().window().maximize();
		
		
		//Option s1 = driver.manage();    // driver.manage is the method of interface which return the object of option class 
		// Window s2 = s1.window();      // and option class contain window method and window method returns the object of window class
		//s2.maximize();                 // and window class have minimize and maximize methods 
		
	}

}

//driver.manage():
//
//manage() is a method provided by the WebDriver interface.
//It returns an instance of Options, which is an interface that defines various options you can apply to the WebDriver. This includes things like managing the browser window, cookies, timeouts, etc.
//s1.window():
//
//The window() method is part of the Options interface.
//It returns an object of type Window, which represents the current browser window. You can use the Window object to manipulate the browser window (maximize, minimize, etc.).
//s2.maximize():
//
//The maximize() method is part of the Window interface, and it maximizes the browser window.
//Once you have the Window object, calling maximize() will maximize the browser window to full screen.