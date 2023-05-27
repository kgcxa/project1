package webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel3 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream k1=new FileInputStream("E:\\Software testing\\automation testing\\automation data.xlsx");
	     //int k2=WorkbookFactory.create(k1).getSheet("Sheet1").getLastRowNum()+1; to get row size +1 for it give index
		Sheet k2=WorkbookFactory.create(k1).getSheet("Sheet1");
		     // int num =k2.getRow(0).getLastCellNum()-1;
		int num= k2.getLastRowNum();
	       System.out.println(num);
	//for(int i=0; i<=num; i++)
	//{
		//String k3=k2.getRow(0).getCell(i).getStringCellValue();
		//String k3=k2.getRow(i).getCell(1).getStringCellValue();
		//System.out.println(k3);
	//}
	System.out.println("----------------------------------------------------");
	
	for(int i=0;i<=num; i++)
	{
		for(int j=0; j<=3; j++)
		{
			String k3=k2.getRow(i).getCell(j).getStringCellValue();
			System.out.print(k3+" ");
		}
		System.out.println();
	}
	
	
	}

}
