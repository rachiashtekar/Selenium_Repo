package ExcelSheet;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex5_getAllDataInRow {
public static void main(String[] args) throws  EncryptedDocumentException, IOException {
	FileInputStream file = new FileInputStream("C:\\\\Users\\\\Welcome\\\\Desktop\\\\selenium.xlsx");
	Sheet sh =WorkbookFactory.create(file).getSheet("Sheet2");
	
	int lastCollIndex=sh.getRow(0).getLastCellNum()-1;
	for(int i=0;i<lastCollIndex;i++)
	{
		String value = sh.getRow(0).getCell(i).getStringCellValue();
		System.out.println(value +" ");
	}
	
	}
}
