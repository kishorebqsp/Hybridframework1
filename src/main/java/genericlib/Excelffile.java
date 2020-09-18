package genericlib;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excelffile {
	public static String getexceldata(String path,String sheetname,int row,int cell)
	{
		String s="";
		try {
		FileInputStream f=new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(f);
		 s = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		
		}
		
		catch(Exception e)
		{
			Reporter.log("Excel data was not found");
		}
		return s;
		
	}

}
