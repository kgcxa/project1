package framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class withddf 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
    {
		    FileInputStream kartik=new FileInputStream("E:\\Software testing\\automation testing\\automation data.xlsx");
		    Sheet s4=WorkbookFactory.create(kartik).getSheet("data");
		    
		    WebDriver driver = new ChromeDriver();
		    driver.get("https://www.policybazaar.com/");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		    driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		    driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(s4.getRow(0).getCell(0).getStringCellValue());
		    driver.findElement(By.xpath("(//a[@id='central-loggin-with-pwd'])[2]")).click();
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(s4.getRow(0).getCell(1).getStringCellValue());
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
		    WebElement k1=driver.findElement(By.xpath("//div[text()='My Account']"));
		    Thread.sleep(2000);
		    Actions s1=new Actions(driver);
		    s1.moveToElement(k1).perform();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
		    Thread.sleep(2000);
		    Set<String> g1=driver.getWindowHandles();
		    ArrayList<String> g2=new ArrayList<String>(g1);
		    driver.switchTo().window(g2.get(1));
		    Thread.sleep(2000);
		    String k2=driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
		    String act=s4.getRow(0).getCell(2).getStringCellValue();
		    if(k2.equalsIgnoreCase(act))
		    {
		    	System.out.println("test case is pass");
		    }
		    else
		    {
		    	System.out.println("test case failed");
		    }
		    
		    driver.quit();
		    
		    
	 } 
}
