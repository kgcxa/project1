package webdriver;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printrowandcell 
{
   public static void main(String[] args) throws EncryptedDocumentException, IOException {
	   
	   FileInputStream kartik=new FileInputStream("E:\\Software testing\\automation testing\\automation data.xlsx");
	   Sheet sh=WorkbookFactory.create(kartik).getSheet("Sheet2");
	   
	   
	   
	   int lastRowIndex = sh.getLastRowNum();
	   for(int i=0; i<=lastRowIndex; i++)
	   {
	   Cell cellInfo = sh.getRow(i).getCell(2);
	   CellType s1 = cellInfo.getCellType();
	   if(s1 == CellType.STRING)
	   {
	   String value = cellInfo.getStringCellValue();
	   System.out.println(value);
	   }
	   else if (s1==CellType.NUMERIC)
	   {
	   double value = cellInfo.getNumericCellValue();
	   System.out.println(value);
	   }
	   else if (s1==CellType.BOOLEAN)
	   {
	   boolean value = cellInfo.getBooleanCellValue();
	   System.out.println(value);
	   }
	   }
}
}
