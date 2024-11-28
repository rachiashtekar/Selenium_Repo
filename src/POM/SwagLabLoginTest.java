package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabLoginTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		SwagLabLoginPage login = new SwagLabLoginPage(driver);
		login.inpSwagLabLoginpageUsername();
		login.inpSwagLabLoginPassword();
		login.loginBtn();
		Thread.sleep(2000);
		
		SwagLabHomePage home = new SwagLabHomePage(driver);
		home.clickOpenMenu();
		home.verifyLogo();
		Thread.sleep(3000);
		
		SwagLabOpenMenuPage MenuPage = new SwagLabOpenMenuPage(driver);
		MenuPage.clickOnLogout();
		Thread.sleep(5000);
	}

}
