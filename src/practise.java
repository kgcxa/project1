import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		  FileInputStream au=new FileInputStream("E:\\\\Software testing\\\\automation testing\\\\automation data.xlsx");
		String value=WorkbookFactory.create(au).getSheet("sheet1").getRow(0).getCell(2).getStringCellValue();
	      WebDriver k1=new ChromeDriver();
	      k1.get("https://www.facebook.com/");
	     k1.findElement(By.xpath("//a[text()='Create new account']")).click();
	      Thread.sleep(2000);
	      k1.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(value);

	
		

	}
}