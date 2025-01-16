package com.selenium.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTestngScripts {

	WebDriver driver; 
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
	}
	
	@Test
	public void launchBrowser() {
		System.out.println(driver.getTitle());
	}
	
	
	@AfterTest
	public void quiteDriver() {
		driver.close();
	}
}
