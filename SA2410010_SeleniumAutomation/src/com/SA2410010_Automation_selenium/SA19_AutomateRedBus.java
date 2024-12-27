package com.SA2410010_Automation_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA19_AutomateRedBus {
//	driver.navigate().to("https://www.redbus.in/"); // navigate to url
//	driver.navigate().refresh();
//	driver.navigate().forward();
//	driver.navigate().back();


	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");  // navigate to url
		
		//From City		
			driver.findElement(By.id("src")).sendKeys("PUNE");
			Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[1]/div/div[1]/ul/li[2]/div")).click();
            
       //To City
            driver.findElement(By.id("dest")).sendKeys("Mumbai");
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[3]/div[1]/ul/li[3]/div")).click();    
		
		// Calender
            driver.findElement(By.id("onwardCal")).click();
            Thread.sleep(5000);
            driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[3]/div[1]/ul/li[3]/div")).click();
		
	     // Date
            driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[4]/div/div[2]")).click();
            
        //Search Button
            driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/button")).click();
            
            
         //Result
            System.out.println(driver.findElement(By.xpath("/html/body/section/div[2]/div[4]/div/div[2]/div/div[2]/div[2]/div/ul/div[2]/li/div[1]/div/div[1]/div[1]/div[1]/div[1]")).getText());

	
            	driver.close();
	}

}
