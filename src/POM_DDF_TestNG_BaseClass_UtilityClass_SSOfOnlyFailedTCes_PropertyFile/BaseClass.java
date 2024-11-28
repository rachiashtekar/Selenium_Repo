package POM_DDF_TestNG_BaseClass_UtilityClass_SSOfOnlyFailedTCes_PropertyFile;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class BaseClass {
	WebDriver driver;
	
	public void initializeBrowser() throws EncryptedDocumentException, IOException {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.saucedemo.com/");
		driver.get(UtilityClass.getPFData("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
}
