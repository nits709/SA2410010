package com.SA2410010_Automation_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA27_HandlingFileUpload {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		dr.get("https://demo.guru99.com/test/upload/");
		
		dr.findElement(By.id("uploadfile_0")).sendKeys("/Users/nitingupta/Downloads/medical_bills/3.pdf");
		
		dr.findElement(By.cssSelector("#terms")).click();
		
		Thread.sleep(1000);
		dr.findElement(By.cssSelector("#submitbutton")).click();
		
	}
}
