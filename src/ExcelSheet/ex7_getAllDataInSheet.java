package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex7_getAllDataInSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("C:\\\\\\\\Users\\\\\\\\Welcome\\\\\\\\Desktop\\\\\\\\selenium.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		int lastRowIndex = sh.getLastRowNum();
		for(int i=0;i<=lastRowIndex;i++)
		{
			int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=lastCellIndex;j++)
			{
				String value = sh.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value+" ");
			}
			System.out.println();
		}
	}

}

//getLastRowNum() tells you the last row number in the whole sheet.
//getLastCellNum() tells you the number of cells (columns) in a specific row, like the first row (getRow(0)).
//You can't directly call getLastCellNum() on the whole sheet because the sheet is made up of rows, and each row can have a different number of columns. So, you need to first choose a row (like row 0) and then ask for the number of columns in that row.
//
//That's why you do sh.getRow(0).getLastCellNum()—to get the number of columns in the first row.