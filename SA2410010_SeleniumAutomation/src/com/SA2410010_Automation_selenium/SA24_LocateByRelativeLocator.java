package com.SA2410010_Automation_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class SA24_LocateByRelativeLocator {

	public static void main(String[] args) {
		
System.setProperty("webdriver.ch.driver","driverpath");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		driver.get("https://facebook.com");
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("pass")))
		.sendKeys("nitingupta@gmail.com");

	}

}
