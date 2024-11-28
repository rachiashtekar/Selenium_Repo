package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.SwagLabOpenMenuPage;

public class SwagLabLoginTest extends BaseClass {
	int a; //declare globally
	SwagLabLoginPage login;
	SwagLabHomePage home;
	SwagLabOpenMenuPage menu;
	
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		initializeBrowser();
		
		login=new SwagLabLoginPage(driver);  
		home=new SwagLabHomePage(driver);
		menu=new SwagLabOpenMenuPage(driver);
	}


	@BeforeMethod
    public void LoginToApp() throws InterruptedException, EncryptedDocumentException, IOException {
		System.out.println(a);
		login.inpSwagLabLoginpageUsername(UtilityClass.getTD(0, 0));
		login.inpSwagLabLoginPassword(UtilityClass.getTD(0, 1));
		login.SwagLabloginBtn();
		Thread.sleep(2000);

		
	}
	@Test
	public void verifyLogo() throws EncryptedDocumentException, IOException {
		String actLogoText=home.getSwagLabHomePageLogoText();
		String expLogoText=UtilityClass.getTD(0, 2);
		Assert.assertEquals(actLogoText, expLogoText,"Failed: - both results are diff: ");
		
	}
	@AfterMethod
	public void LogoutFromApp () throws InterruptedException {
		home.clickSwagLabHomePageOpenMenu();
		Thread.sleep(2000);
		menu.clickOnLogout();
		Thread.sleep(5000);

		
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();

	}

}
