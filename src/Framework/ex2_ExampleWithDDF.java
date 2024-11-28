package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2_ExampleWithDDF {
	public static void main(String[] args) throws IOException  {
		FileInputStream file = new FileInputStream("C:\\Users\\Welcome\\Desktop\\selenium.xlsx");
	Sheet sh=	WorkbookFactory.create(file).getSheet("DDF");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//ENTER UN
	String un = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(un);
	
	//Enter pass
	
	String pass = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
	
	//click
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	
	String  acttitle = sh.getRow(0).getCell(2).getStringCellValue();
	String exttitle= "Swag Labss";
	if(acttitle.equals(exttitle)) {
		System.out.println("correct title");
	}
	else
	{
		System.out.println("wrong title");
	}
	
	}

}
