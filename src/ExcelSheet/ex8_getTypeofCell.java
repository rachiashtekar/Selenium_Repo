package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.usermodel.CellType;



public class ex8_getTypeofCell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\\\\\\\Users\\\\\\\\Welcome\\\\\\\\Desktop\\\\\\\\selenium.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
	CellType type = sh.getRow(0).getCell(2).getCellType();
	System.out.println(type);
		
		
		
//		Cell s1= sh.getRow(0).getCell(2);
//		org.apache.poi.ss.usermodel.CellType type = s1.getCellType();
//		System.out.println(type);
	}

}
