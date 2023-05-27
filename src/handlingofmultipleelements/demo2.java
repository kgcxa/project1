package handlingofmultipleelements;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 {
	
                 public static void main(String[] args) throws InterruptedException 
		{
			WebDriver  driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			
			driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
			Thread.sleep(2000);
			
			List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
			
			String expText="redmi note 50";
			
			for(WebElement s1: allOptions)
			{
				String actText = s1.getText();
				if(actText.equals(expText))
				{
					s1.click();
					break;
				}
			}	
		}
	}


