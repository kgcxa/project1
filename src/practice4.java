import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

public class practice4 
{
   public static void main(String[] args) throws InterruptedException 
   {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  WebElement s1=driver.findElement(By.xpath("(//img[@class='_396cs4'])[3]"));
	  Actions k1=new Actions(driver);
	  k1.moveToElement(s1).perform();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("(//a[@class='_6WOcW9'])[4]")).click();
	  Thread.sleep(2000);
	  ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300)");
	  driver.findElement(By.xpath("(//img[@class='_2r_T1I'])[3]")).click();
	  Thread.sleep(2000);
	   Set<String> allid=driver.getWindowHandles();
	   ArrayList<String> k3=new ArrayList<String>(allid);
	   driver.switchTo().window(k3.get(1));
	   WebElement kc=driver.findElement(By.xpath("((//div[@class='_1AtVbE col-12-12'])[5]//span)[5]"));
	   System.out.println(kc.getText());
	  
   }
}
