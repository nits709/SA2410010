package com.testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SATNG_08_KeyWordDriven {

	WebDriver driver;
	File file;
	FileInputStream fis;
	Properties prop;

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File("/Volumes/Renuka/SA2410010/SA2410010_SeleniumAutomation/src/com/testNG/scriptsData.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);

		System.out.println("Propeties file loads");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void logintest() {
		 
		if(prop.getProperty("flag") != null) {
			System.out.println("true block");
			
		}else {
			System.out.println("else block code");
		}
		
		driver.findElement(By.name(prop.getProperty("username"))).sendKeys("nitingupta");
		driver.findElement(By.name(prop.getProperty("password"))).sendKeys("Smart@123");
		driver.findElement(By.name(prop.getProperty("signButton"))).click();

}
	
	

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
