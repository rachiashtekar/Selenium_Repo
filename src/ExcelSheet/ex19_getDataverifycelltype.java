package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex19_getDataverifycelltype {
	public static void main(String[] args) throws Exception {
		FileInputStream file=new FileInputStream("C:\\\\\\\\Users\\\\\\\\Welcome\\\\\\\\Desktop\\\\\\\\selenium.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		CellType type = sh.getRow(0).getCell(2).getCellType();
		
		if(type==CellType.NUMERIC)
		{
			double num =  sh.getRow(0).getCell(2).getNumericCellValue();
			System.out.println(num);
		}
		else if(type==CellType.STRING)
		{
			String str = sh.getRow(0).getCell(2).getStringCellValue();
			System.out.println(str);
		}
		else if(type==CellType.BOOLEAN)
		{
			boolean bol = sh.getRow(0).getCell(2).getBooleanCellValue();
			System.out.println(bol);
		}
	}

}
