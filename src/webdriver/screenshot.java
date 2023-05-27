package webdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class screenshot 
{
   public static void main(String[] args) throws IOException, InterruptedException 
   {
	     WebDriver driver =new ChromeDriver();
	     driver.get("https://www.facebook.com/");
	     String kc=RandomString.make(2);
	     System.out.println(kc);
	     File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     File dest =new File("C:\\Users\\User\\Desktop\\automation\\kg"+kc+".jpeg");
	     FileHandler.copy(src, dest);

	     driver.findElement(By.xpath("(//a[contains(@role,'butt')])[2]")).click();
	     Thread.sleep(3000);
	     File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     File dest2 =new File("C:\\Users\\User\\Desktop\\automation\\kg.jpeg");
	     FileHandler.copy(src1, dest2);
	     
   }
}
