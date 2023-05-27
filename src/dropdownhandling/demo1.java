package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo1 
{
    public static void main(String[] args) throws InterruptedException 
    {
	   ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.tickertape.in/screener/equity");
	    Thread.sleep(3000);
	    //driver.findElement(By.xpath("//button[contains(text(),'Do This Later')]")).clear();
	    //Thread.sleep(2000);
	    WebElement ab=driver.findElement(By.xpath("//img[@id='eq-screener-by-tt-white']"));
	    Actions act= new Actions(driver);
	    Thread.sleep(2000);
	    
	    act.moveToElement(ab).perform();
	    WebElement kc=driver.findElement(By.xpath("(//img[@class='jsx-2373225449'])[2]"));
	    act.contextClick().perform();
	}
}
