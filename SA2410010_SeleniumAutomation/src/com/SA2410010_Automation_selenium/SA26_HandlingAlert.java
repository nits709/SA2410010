package com.SA2410010_Automation_selenium;

import java.time.Duration;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA26_HandlingAlert {

	public static void main(String[] args)   {
		Alert alt ;
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		dr.get("https://demoqa.com/alerts");
		
//		dr.findElement(By.id("alertButton")).click();
		
	   // alt = dr.switchTo().alert();  // pass control from webdriver to alert interface
		//dr.switchTo().defaultContent(); // pass control from alert to webdriver.
		
		//alt.accept(); // click on ok button internal user cannot see click operation on ok button from normal eye
		
		//dr.findElement(By.id("timerAlertButton")).click();
		
		//alt = dr.switchTo().alert();
		
		//add 5 seconds in this code and run it. 
		
//		dr.findElement(By.id("confirmButton")).click();
//		
//		alt = dr.switchTo().alert();
//		
//		System.out.println(alt.getText());
//		
//		alt.dismiss();
		
		dr.findElement(By.id("promtButton")).click();
		
		alt = dr.switchTo().alert();
		
		alt.sendKeys("AARYA");
		
		alt.accept();
		
		System.out.println(dr.findElement(By.id("promptResult")).getText());
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
