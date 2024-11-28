package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ex71_getAllDataInASheet {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\Welcome\\\\Desktop\\\\selenium.xlsx");
	Sheet sh =	WorkbookFactory.create(file).getSheet("Sheet2");
	int lastRowIndex = sh.getLastRowNum();
	for(int i=0;i<=lastRowIndex;i++)
	{
		

		int lastCellIndex = sh.getRow(i).getLastCellNum()-1;
		for(int j=0;j<=lastCellIndex;j++)
		{
			Cell cl = sh.getRow(i).getCell(j);
			CellType type = cl.getCellType();
			if(type==CellType.STRING)
			{
				System.out.print(cl.getStringCellValue()+" ");
			}
			else if(type==CellType.NUMERIC)
			{
				System.out.print(cl.getNumericCellValue()+" ");
			}
			else if(type==CellType.BOOLEAN)
			{
				System.out.print(cl.getBooleanCellValue()+" ");
			}
		}
		System.out.println();
	}
	}

}
