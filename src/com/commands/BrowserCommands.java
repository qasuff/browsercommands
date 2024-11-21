package com.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class BrowserCommands {

	public static void main(String[] args) {
		
		
	   WebDriver abc = new ChromeDriver();
	   
	   abc.get("https://echoecho.com/htmlforms10.htm");	  
	   
	   
	 //  abc.findElement(By.xpath("//input[@value='Cheese']")).click();
	   
	   
	   
	  int count1 = abc.findElements(By.xpath("//input[@name='group1']")).size();
	   
	   System.out.println(count1);
	   
	   
	   for(int i=0; i<count1;i++)
	   {
		 //  abc.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		   
		 //  System.out.println(abc.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
		   
		  String text=abc.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
	    
	   
	   
	   
	   if(text.equals("Cheese"))
	   {
		   abc.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		   System.out.println(abc.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
	   }
	   
	   
	 
	   
	
	   }
	   
	   
	   
	   
	   
	   
	/*   abc.get("https://www.facebook.com/reg/");
	   
	   abc.manage().window().maximize();
	   
	   
	   abc.findElement(By.xpath("//input[@value='1']")).click();
	   
	   // abc.findElement(By.xpath("//input[@value='1']")).isSelected();
	   
	   System.out.println(abc.findElement(By.xpath("//input[@value='1']")).isSelected());
	   
	   System.out.println(abc.findElement(By.xpath("//input[@value='1']")).isEnabled());
	   
	   System.out.println(abc.findElement(By.xpath("//input[@value='1']")).isDisplayed());
	   
	   
	   
	   int count = abc.findElements(By.xpath("//input[@type='radio']")).size();
	   
	   System.out.println(count);
	   
	   
	   
	   
	   
	  // abc.findElement(By.id("u_0_4_gW")).click();
	   
	   
	   
	   
	  
	   
	 /*  abc.get("https://www.spicejet.com/");
	   
	   
	   abc.findElement(By.xpath("//*[@id=\"main-container\"]/div/div[1]/div/div/div[3]/div/div/div[1]/div[4]/div[3]/div/div[2]/div[1]/div")).click();
	   
	   
	/*   Select day = new Select(abc.findElement(By.id("day")));
	   
	   day.selectByValue("2");
	   
	 //  day.selectByVisibleText("2");
	   
	 //  day.selectByIndex(2);
	   
	   
	   Select month = new Select(abc.findElement(By.id("month")));
	   
	   
	  // month.selectByValue("6");
	   
	   month.selectByVisibleText("Jun");
	   
	   
	   
	   Select year = new Select(abc.findElement(By.id("year")));
	   
	   year.selectByValue("2018");
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   

	  
	   
	   //abc.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc");
	   
	 //  abc.findElement(By.cssSelector("#email")).sendKeys("abc");
	   
	   
	  // abc.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc");
	   
	   //abc.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("abc");
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 /*  abc.findElement(By.id("email")).sendKeys("abc");
	   
	   
	 
	   
	   
        abc.findElement(By.id("pass")).sendKeys("pass");
        
        
      //  abc.findElement(By.linkText("Forgotten password?")).click();
        
        
        
      //  abc.findElement(By.partialLinkText("password")).click();
        
	   
	   
	   
	   
	    /*abc.get("https://www.saucedemo.com/");
	   
	   
	   abc.manage().window().maximize();
	   
	   
	   abc.findElement(By.id("user-name")).sendKeys("standard_user");
	   
	  // abc.findElement(By.id("user-name")).clear();
	   
	   
	   abc.findElement(By.name("password")).sendKeys("secret_sauce");
	   
	   
	   abc.findElement(By.id("login-button")).click();
	   
	   
	  
	    // get commands 
	   
/*	   abc.get("https://www.amazon.com/");
	   
	   //navigate().to()
	   
	   abc.navigate().to("https://www.selenium.dev/");
	   
	   
	   //navigate Back Command
	   
	   abc.navigate().back();
	   
	   
	   //navigate forword command 
	   
	   abc.navigate().forward();
	   
	   
	   //refresh command 
	   
	   abc.navigate().refresh();
	   
	   
	   //	Get Title
	   
/*	  String title= abc.getTitle();
	   
	   System.out.println(title);
	   
	   
	   
	   //Get Current URL 
	   
	   String current =abc.getCurrentUrl();
	   
	   System.out.println(current);
	   
	   
	   //Get Page Source 
	   
	 //  String pagesource =abc.getPageSource();
	   
	 //  System.out.println(pagesource);

	   
	   //Maximize a browser
	   
	   abc.manage().window().maximize();
	   
	   
	   //Minimize a browser
	   
	   abc.manage().window().setPosition(new Point(0, -999));
	   
	   
	   //close Driver
	   
	   
	  // abc.close(); */
	   
	   
	   
	}

}
