package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex7_getAllDataInCol {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\Welcome\\\\Desktop\\\\selenium.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet2");
		int lastRowIndex =  sh.getLastRowNum();
		for(int i=0;i<=lastRowIndex;i++)
		{
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
		}
	}

}
