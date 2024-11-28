package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ex4_TestNGAnnotations {
	@BeforeClass
	public void openBrowser() {
		Reporter.log("open Browser",true);
	}
	
	@BeforeMethod
	public void loginToApp() {
		Reporter.log("Login to app",true);
		
	}
	@Test
	public void verifylogo1() {
		Reporter.log("--running verify logo1--",true);
		}
	@Test
	public void verifylogo2() {
		Reporter.log("--running verify logo2---",true);
		
	}
	@AfterMethod
	public void logoutFromApp() {
		Reporter.log("logout from App",true);
	}
	@AfterClass
	public void closeBrowser() {
		Reporter.log("close Browser",true);
	}

}
