package webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class iframe 
{
   public static void main(String[] args) throws InterruptedException, IOException 
   {
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	  
	   //driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
	   
	   // driver.get("https://www.w3schools.com/");
	   //driver.findElement(By.xpath("//a[@title='Tutorials']")).click();
	  // File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  // File des=new File("\"C:\\Users\\User\\Desktop\\automation\\ka.jpg");
	   //FileHandler.copy(src, des);
	   //driver.findElement(By.xpath("//a[text()='Learn JavaScript']")).click();
	   //Thread.sleep(3000);
	// driver.findElement(By.xpath("//a[contains(text(),'Try it')]")).click();
	  // driver.manage().window().maximize();
	  // Thread.sleep(1000);
	   driver.switchTo().frame("iframeResult");
	   driver.findElement(By.xpath("//button[contains(text(),'Click me to')]")).click();
   }
}
