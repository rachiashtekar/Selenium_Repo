package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass {
	
	public static String getTD(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\Welcome\\Desktop\\selenium.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
	return value;
	}
	
	public static void CaptureSS(WebDriver driver,int TCID) throws IOException {
		
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
	File dest=	new File("C:\\Users\\Welcome\\eclipse-workspace\\selenium\\ScreenShots\\TestCaseID"+".jpg");
	FileHandler.copy(src, dest);
		
	}

}
