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

public class parameterization 
{
 public static void main(String[] args) throws EncryptedDocumentException, IOException 
    {
	   //nevigate the programm to excel path we have a method
	 FileInputStream file = new FileInputStream("E:\\Software testing\\automation testing\\automation data.xlsx");
	 //to open a excel sheet we have a inbuilt class workbook factory from that we need to call a static method
	Workbook book=WorkbookFactory.create(file);
	//to fetch a specififc sheet data from excel
	       Sheet data=book.getSheet("Sheet1");
	      Row ro =data.getRow(0);
	      Cell cl=ro.getCell(0);
	      String value=cl.getStringCellValue();
	      System.out.println(value);
	       
    }	

}
