package com.testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SATNG_10_TC_Runner {
	WebDriver driver;
	SATNG_09_RediffLogin2 R1;
	
	
	@Test
	public void loginTest() {
		R1.enterDataTextBox();
		R1.seleniumClick();
	}
	
	
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();  // runner class object
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		R1 = new SATNG_09_RediffLogin2(driver); // runner class driver passes 
		//control to rediff login class drivers object
		
		R1.launchURL();
	}
	
	@AfterTest
	public void afterTest() {
		
	}

}
