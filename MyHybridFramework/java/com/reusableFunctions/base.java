package com.reusableFunctions;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;



public class base {

	WebDriver Basedriver;
	File file;
	FileInputStream fis;
	Properties prop;
	String propFilePath = "/Volumes/Renuka/SA2410010/SA2410010_Maven_Project/data.properties";
	
	//dataProperties.properties
	public base(WebDriver driver) throws IOException {
		file = new File(propFilePath);
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		
		this.Basedriver = driver;
	}
	
	public void navigateURL(String URL) {
		Basedriver.get(URL);
	}
	
	public void validateTitle(String ExpectedTitle) {
		String ActualTitle  =	Basedriver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);	
	}
	
	public void getScreenShot(String filePath) throws IOException {
		
		File srcFile = ((TakesScreenshot)Basedriver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File(prop.getProperty("screenshotFilePath") + filePath));	
	}

	
	
}
