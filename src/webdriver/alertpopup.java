package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopup 
{
   public static void main(String[] args) 
   {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
	  String text=driver.switchTo().alert().getText();
	  System.out.println(text);
	  //driver.switchTo().alert().accept();
	  driver.switchTo().alert().dismiss();
   }
}
