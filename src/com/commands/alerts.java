package com.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class alerts {

	public static void main(String[] args) throws InterruptedException 
	
	{
		
		
		   WebDriver abc = new ChromeDriver();
		   
		  // abc.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		   
		   
		  // abc.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		   
		   
		   
		   abc.get("https://www.amazon.com/");
		   
		   abc.manage().window().maximize();
		   
		   Actions act =new Actions(abc);
		   
		   
     /*       act.sendKeys(Keys.PAGE_DOWN).build().perform();
		   
		   act.sendKeys(Keys.PAGE_DOWN).build().perform(); 
		   
		   abc.findElement(By.xpath("/html/body/div/main/section[2]/div/div/div[1]/div/div[2]/div/a")).click();
			 
		   
		   
	  
		  
          JavascriptExecutor je = (JavascriptExecutor) abc;
           

		  WebElement morelinks = abc.findElement(By.xpath("/html/body/div/main/section[2]/div/div/div[1]/div/div[2]/div/a"));
		  
		  je.executeScript("arguments[0].scrollIntoView(true)",morelinks);
		  morelinks.click();
		  
		 abc.findElement(By.xpath("/html/body/div/main/section[2]/div/div/div[1]/div/div[2]/div/a")).click();
		   
		  
		   ((JavascriptExecutor)abc).executeScript("")
          ((JavascriptExecutor)abc).executeScript("scroll(0,4000)");
           
           Thread.sleep(4000);
		   
           ((JavascriptExecutor)abc).executeScript("scroll(4000,0)");
		   
		   
		 /*(int i=1;i<3;i++)
		   {
			   act.sendKeys(Keys.PAGE_DOWN).build().perform();
		   }
		   
		   
		   for(int i=1;i<3;i++)
		   {
			   act.sendKeys(Keys.PAGE_UP).build().perform();
		   }
		   
		   
		   
		   
		   
		   
		   
		  /* act.sendKeys(Keys.PAGE_DOWN).build().perform();
		   
		   act.sendKeys(Keys.PAGE_DOWN).build().perform();
		   
		   act.sendKeys(Keys.PAGE_DOWN).build().perform();
		   
		   
		   act.sendKeys(Keys.PAGE_UP).build().perform();
		   act.sendKeys(Keys.PAGE_UP).build().perform();
		   act.sendKeys(Keys.PAGE_UP).build().perform();
		   
		   
		   
		   
		   /*abc.switchTo().frame(abc.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		   
		
		   
		   Actions act =new Actions(abc);
		   
		   WebElement source= abc.findElement(By.id("draggable"));
		   
		   WebElement Desination = abc.findElement(By.id("droppable"));
		   
		   act.dragAndDrop(source, Desination).build().perform(); */
		
		

	}

}
