package webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class printadifftypedatafromexcel 
{
    public static void main(String[] args) throws EncryptedDocumentException, IOException  
    {
	   FileInputStream kartik=new FileInputStream("E:\\Software testing\\automation testing\\automation data.xlsx");
	   Sheet s1=WorkbookFactory.create(kartik).getSheet("Sheet2");
	   int rowindex =s1.getLastRowNum();
	   System.out.println(rowindex);
	   for(int i=0; i<=rowindex; i++)
	   {
		   int s2=s1.getRow(i).getLastCellNum()-1;
		   for(int j=0; j<=s2; j++)
		   {
			 Cell info=s1.getRow(i).getCell(j);
			 CellType type=info.getCellType();
			 if(type==CellType.STRING)
			 {
				String value=info.getStringCellValue();
				 System.out.print(value+" ");
			 }
			 else if (type==CellType.NUMERIC)
			 {
				double value=info.getNumericCellValue();
				 System.out.print(value+" ");
			 }
			 else
			 {
				 boolean value=info.getBooleanCellValue();
				 System.out.print(value+" ");
			 }
		   }
		   System.out.println();
	   }
	   
    
    
    }
}
