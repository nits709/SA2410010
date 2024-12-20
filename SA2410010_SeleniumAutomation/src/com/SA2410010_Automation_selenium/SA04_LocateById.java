package com.SA2410010_Automation_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA04_LocateById {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement emailID = driver.findElement(By.id("email"));
		emailID.sendKeys("nitingupta3005@gmail.com");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.sendKeys("qweqweqwe");
		WebElement loginButton = driver.findElement(By.id("u_0_5_AJ"));
		loginButton.click();
		
	
		
		
	}

}
