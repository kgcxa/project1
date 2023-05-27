package webdriver;



import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demo 
{
    public static void main(String[] args) throws InterruptedException 
     {
	      WebDriver k1=new ChromeDriver();
	      k1.get("https://www.facebook.com/");
	  	
	  	k1.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	      Thread.sleep(2000);
	      WebElement s1=k1.findElement(By.xpath("//select[@id='day']"));
	      Select s2=new Select(s1);
	      s2.selectByVisibleText("22");
	      Thread.sleep(3000);
	      WebElement month=k1.findElement(By.xpath("//select[@id='month']"));
	      Select s3=new Select(month);
	      s3.selectByVisibleText("Apr");
	    // System.out.println(s3.getFirstSelectedOption().getText());
	      String t1=s3.getFirstSelectedOption().getText();
	      System.out.println(t1.toUpperCase());
	     String text=s2.getFirstSelectedOption().getText();
	     System.out.println(text);
	     List<WebElement> all=s3.getOptions();
	     System.out.println(all.size());
	      TreeSet kartik=new TreeSet();  
	     for(WebElement s:all)
	     {
	    	String k3=s.getText();
	    	kartik.add(k3);
	     }
	     System.out.println(kartik);
     }
	
}
