package webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertpopups 
{
public static void main(String[] args) 
{
	 WebDriver driver =new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/delete_customer.php");
	  driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("111");
	  driver.findElement(By.xpath("//input[@name='submit']")).click();
	  Alert pop=driver.switchTo().alert();
	  pop.getText();
	  //pop.accept();
	  pop.dismiss();
}
}
