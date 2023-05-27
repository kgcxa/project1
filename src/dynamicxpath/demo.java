package dynamicxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo 
{
	public static void main(String[] args) throws InterruptedException 
    {
    	  WebDriver driver =new ChromeDriver();
    	  
  	    driver.get("https://www.flipkart.com/");	
  	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
  	   driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("samsung s22 ");
  	 Actions s1=new Actions(driver);
  	   Thread.sleep(2000);
  	   s1.sendKeys(Keys.ARROW_DOWN).perform();
  	   s1.sendKeys(Keys.ENTER).perform();
  	   Thread.sleep(2000);
  	  String s3=driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[9]")).getText();
  	   System.out.println(s3);
	}
}
