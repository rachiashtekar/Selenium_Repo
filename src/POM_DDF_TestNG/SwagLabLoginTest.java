package POM_DDF_TestNG;

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

public class SwagLabLoginTest {
	int a; //declare globally
	SwagLabLoginPage login;
	SwagLabHomePage home;
	SwagLabOpenMenuPage menu;
	Sheet sh;
	WebDriver driver;
	@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\\\\\\\Users\\\\\\\\Welcome\\\\\\\\Desktop\\\\\\\\selenium.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    login =new SwagLabLoginPage(driver); 
		home=new SwagLabHomePage(driver);
		menu=new SwagLabOpenMenuPage(driver);
		 a=10; //initialize locall
		
	}
	@BeforeMethod
    public void LoginToApp() throws InterruptedException {
		System.out.println(a);
		login.inpSwagLabLoginpageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		login.inpSwagLabLoginPassword(sh.getRow(0).getCell(1).getStringCellValue());
		login.SwagLabloginBtn();
		Thread.sleep(2000);

		
	}
	@Test
	public void verifyLogo() {
		String actLogoText=home.getSwagLabHomePageLogoText();
		String expLogoText=sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(actLogoText, expLogoText,"Failed: - both results are diff: ");
		
	}
	@AfterMethod
	public void LogoutFromApp () throws InterruptedException {
		home.clickSwagLabHomePageOpenMenu();
		Thread.sleep(2000);
		menu.clickOnLogout();
		Thread.sleep(2000);

		
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();

	}

}
