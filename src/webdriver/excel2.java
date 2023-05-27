package webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class excel2 
{
   public static void main(String [] args) throws EncryptedDocumentException, IOException
   {
	    FileInputStream au=new FileInputStream("E:\\\\Software testing\\\\automation testing\\\\automation data.xlsx");
     // boolean value=WorkbookFactory.create(au).getSheet("sheet1").getRow(0).getCell(3).getBooleanCellValue();
	 // System.out.println(value);
	    
	    Workbook data=WorkbookFactory.create(au);
        Sheet kartik=data.getSheet("sheet1");
        Row ro=kartik.getRow(0);
        Cell cl=ro.getCell(2);
        double value=cl.getNumericCellValue();
        System.out.println(value);
   
   }
}
