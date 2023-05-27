package webdriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class celltype {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		   FileInputStream kartik=new FileInputStream("E:\\Software testing\\automation testing\\automation data.xlsx");
		   Sheet s1=WorkbookFactory.create(kartik).getSheet("Sheet2");
		   CellType type=s1.getRow(1).getCell(2).getCellType();
		   System.out.println(type);
		   double ka=s1.getRow(1).getCell(2).getNumericCellValue();
		   System.out.println(ka);
	}

}
