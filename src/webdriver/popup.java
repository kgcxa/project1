package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup 
{
  public static void main(String[] args) 
  {
	  WebDriver driver =new ChromeDriver();
	  driver.get("https://www.flipkart.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("xyz");
	  
	  
	  
  }
}
