package ActionClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ex7_Scroll_To_Element {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Actions act = new Actions(driver);
		
		//scroll down->1st parameter 0, 2nd parameter +ve
//		act.scrollByAmount(0, 3000).perform();
		
		//scroll up -> 1st parameter 0, 2nd parameter -ve
		
//		act.scrollByAmount(0, -200).perform();
		
		//scroll right->1st parameter +ve , 2nd parameter 0
//		act.scrollByAmount(200, 0);
		
		//scroll left=>1st parameter _ve 2nd parameter 0
		act.scrollByAmount(200, 0).perform();
	}

}
