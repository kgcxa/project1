package scrolldownandup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
  public static void main(String[] args) throws InterruptedException 
  {
	    WebDriver driver =new ChromeDriver();
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	  //  Thread.sleep(2000);
	   // ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,3500)");
	  //  Thread.sleep(2000);
	 //   ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-350)");
	    WebElement terms=driver.findElement(By.xpath("//a[contains(text(),'Flipkart Axis Bank')]"));
		 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",terms);
	    
  }
}
