package com.commands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/");
		
		driver.manage().window().maximize();
		
		
		
		//int count =driver.findElements(By.tagName("a")).size();
		
	     String urlname =driver.findElement(By.tagName("a")).getText();
		
		System.out.println(urlname);
		
	//	System.out.println(count);
		
		
/*		List<WebElement>links = driver.findElements(By.tagName("a")); 
		
		for(int i=0;i<links.size();i++)
		{
			
			
			if(!links.get(i).getText().isEmpty())
			{
				String  Linkname= links.get(i).getText();
				links.get(i).click();
				
				System.out.println(Linkname);
				
				links=driver.findElements(By.tagName("a"));
			
				
			}
			
		}
		
		
	
		
		
	
		
		/*for(WebElement link:links)
		{
			System.out.println(link.getText());
		}
		
		
		
		
		
		//WebElement news =driver.findElement(By.xpath(""));
		
		//System.out.println(news.findElements(By.tagName("a")).size());
		
		
		
		//WebElement footer = driver.findElement(By.id("navFooter"));
		
		//footer.findElements(By.tagName("a")).size();
		
		//System.out.println(footer.findElements(By.tagName("a")).size());
		
		
		
		////WebElement mainmenu= driver.findElement(By.id("nav-main"));
		
		//System.out.println(mainmenu.findElements(By.tagName("a")).size());
		
		 
		 
		 
		 
		 
	
		/*Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		
		//driver.findElement(By.xpath("//*[@id=\"nav_prefetch_yourorders\"]/span")).click();
		
		WebElement move = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		act.moveToElement(move).contextClick().build().perform();
		//act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).doubleClick().keyDown(Keys.SHIFT).sendKeys("phone").build().perform();
		
		//driver.findElement(By.id("nav-search-submit-button")).click();
		*/
		
		
		
		

	}

}
