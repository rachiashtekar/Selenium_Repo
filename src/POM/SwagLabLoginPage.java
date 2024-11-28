package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class SwagLabLoginPage {
	@FindBy(xpath="//input[@id='user-name']") private	WebElement UN;
//	UN = driver.findElement(By.xpath(""));
	 @FindBy(xpath="//input[@id='password']")private	WebElement PWD;
//	 PWD = driver.findElement(By.xpath(""));
	 @FindBy(xpath="//input[@type='submit']")private	WebElement loginBtn;
//	 loginBtn = driver.findElement(By.xpath(""));
	 
	 public SwagLabLoginPage(WebDriver driver) {
		 
		PageFactory.initElements(driver, this);
	}

	 public void inpSwagLabLoginpageUsername()
	 {
		 UN.sendKeys("standard_user");
	 }
	 
	 public void inpSwagLabLoginPassword() {
		 PWD.sendKeys("secret_sauce");
		
	}
	 public void loginBtn() {
		 loginBtn.click();
		
	}
}
