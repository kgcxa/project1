package handlingofmultipleelements;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
   public static void main(String[] args) throws InterruptedException 
   {
	   ChromeDriver driver=new ChromeDriver();
	   driver.get("https://www.google.com/");
	   driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
	   Thread.sleep(2000);
	   List<WebElement> ok=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	   String acttext="redmi 12c";
	   for( WebElement s1:ok)
	   {
		  String expected=s1.getText();
		  if(acttext.equals(expected))
		  {
			  s1.click();
			  break;
		  }
	   }
	  
 
	 
   }
}
