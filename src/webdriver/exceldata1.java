package webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class exceldata1 
{
   public static void main (String [] args) throws EncryptedDocumentException, IOException
   {
	   FileInputStream data=new FileInputStream("E:\\\\Software testing\\\\automation testing\\\\automation data.xlsx");
      String value= WorkbookFactory.create(data).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
      System.out.println(value);
   
   }
}
