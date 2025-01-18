package com.selenium.mavenproject;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.reusableFunctions.base;

public class takeScreenShotWithBase {

	WebDriver driver;
	base baseClass ; 
	
	
	
	
	
	String expectedTitle = "Google";
	
	@Test
	public void takeScreenShots() throws IOException {
		//launchBrowser();
		baseClass.navigateURL("https://google.com");
		baseClass.validateTitle(expectedTitle);
		baseClass.getScreenShot("nitin.png");
		
	}
	
	
	
	
	
}
