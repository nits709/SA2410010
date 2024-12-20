package com.SA2410010_Automation_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA01_LaunchBrowser {

	public static void main(String[] args) {
		
		
		//control + shift + o
		
	WebDriver driver = new ChromeDriver(); // compile time/checked // lunch the browser
	
	driver.manage().window().maximize(); // maximized the browser.
				
	// lunch the browser
				
	// open the website
				
	driver.get("https://www.google.co.in");


	driver.close(); // close the browser
	}

}
