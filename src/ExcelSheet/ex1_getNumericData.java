package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex1_getNumericData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Creates a FileInputStream object to open the Excel file located at
		FileInputStream file = new FileInputStream("C:\\Users\\Welcome\\Desktop\\selenium.xlsx");
		
		
		double Value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(4).getNumericCellValue();
//		WorkbookFactory.create(file) opens the Excel workbook.
//		getSheet("Sheet1") selects the sheet named "Sheet1".
//		getRow(0) selects the first row (rows are 0-indexed).
//		getCell(4) selects the fifth cell in that row (cells are also 0-indexed).
//		getNumericCellValue() retrieves the numeric value from the cell.
		System.out.println(Value);
	}

}

//Yes, in Excel, a sheet (or worksheet) is composed of a grid of rows and columns.