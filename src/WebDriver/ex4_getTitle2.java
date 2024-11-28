package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4_getTitle2 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		String actTitle = driver.getTitle();
		String expTitle = "Log in to Facebook";
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("pass :- Navigate to correct webpage");
		}
		else
		{
			System.out.println("Fail :- Navigate to wrong webpage");
		}
	}

}
