package webdriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newwindow 
{
   public static void main(String[] args) 
   {
	   WebDriver driver=new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://skpatro.github.io/demo/links/");
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	   Set<String> index=driver.getWindowHandles();
	   //System.out.println(index);
	   ArrayList<String> index1=new ArrayList<String>(index);
	   String kc=index1.get(1);
	   driver.switchTo().window(kc);
	   driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	   driver.switchTo().window(index1.get(0));
	   driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
   }
}
