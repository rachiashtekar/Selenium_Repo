package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex51_getDataInRow {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\Welcome\\Desktop\\selenium.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		int lastCollIndex = sh.getRow(0).getLastCellNum()-1;
		for(int i=0;i<=lastCollIndex;i++)
		{
		Cell s1= sh.getRow(1).getCell(i);
		CellType type = s1.getCellType();
		
		if(type==CellType.STRING)
		{
			String value = s1.getStringCellValue();
			System.out.println(value);
		}
		else if(type==CellType.NUMERIC)
		{
			double value = s1.getNumericCellValue();
			System.out.println(value);
		}
		else if(type==CellType.BOOLEAN)
		{
			boolean value = s1.getBooleanCellValue();
			System.out.println(value);
		}
		}
	}

}
