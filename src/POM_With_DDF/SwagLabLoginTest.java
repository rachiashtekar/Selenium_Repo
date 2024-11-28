package POM_With_DDF;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.SwagLabOpenMenuPage;

public class SwagLabLoginTest {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Welcome\\Desktop\\selenium.xlsx");
		Sheet sh=	WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SwagLabLoginPage login = new SwagLabLoginPage(driver);
		login.inpSwagLabLoginpageUsername(sh.getRow(0).getCell(0).getStringCellValue());
		login.inpSwagLabLoginPassword(sh.getRow(0).getCell(1).getStringCellValue());
		login.SwagLabloginBtn();
		Thread.sleep(2000);
		
		
		SwagLabHomePage home = new SwagLabHomePage(driver);
		home.verifySwagLabHomePageLogo(sh.getRow(0).getCell(2).getStringCellValue());
		Thread.sleep(2000);
		home.clickSwagLabHomePageOpenMenu();
		Thread.sleep(2000);
		
		SwagLabOpenMenuPage menu = new SwagLabOpenMenuPage(driver);
		menu.clickOnLogout();
		Thread.sleep(2000);
		
		
		
	}

}
