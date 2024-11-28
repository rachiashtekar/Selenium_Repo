package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex61_getAllDataInCol {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\Welcome\\\\Desktop\\\\selenium.xlsx");
		Sheet sh =WorkbookFactory.create(file).getSheet("sheet3");
		int lastIndexRow = sh.getLastRowNum()+1;
		for(int i=0;i<lastIndexRow;i++)
		{
			
			Cell cl = sh.getRow(i).getCell(2);
			CellType type = cl.getCellType();
			if(type==CellType.STRING)
			{
				System.out.println(cl.getStringCellValue());
			}
			if(type==CellType.NUMERIC)
			{
				System.out.println(cl.getNumericCellValue());
			}
			if(type==CellType.BOOLEAN)
			{
				System.out.println(cl.getBooleanCellValue());
			}
			
		}
	}

}
