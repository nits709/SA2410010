package com.coreFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.reports.ExtentReporter;

public class baseUtil {

	public WebDriver baseUtilDriver;
	public ExtentReports reports;
	ExtentTest test;
	File file;
	FileInputStream fis;
	Properties prop;
	String propFilePath = "/Volumes/Renuka/SA2410010/SA2410010_Maven_Project/data.properties";

	@BeforeMethod 
	public void init() {
		System.out.println("Before Method");
		reports = ExtentReporter.getReports();
		test = reports.createTest("LoginTest");
	}
	
	
	
	@BeforeTest
	public void beforeTest() throws IOException { // method is responsible to initialized all objects of my framework
		
		file = new File(propFilePath);
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
	}

	public void launchBrowser(String browserName) {

		if (browserName.equals("Chrome"))
			baseUtilDriver = new ChromeDriver();
		baseUtilDriver.manage().window().maximize();

	}

	public void navigateURL() {
		baseUtilDriver.get(prop.getProperty("applicationURL"));
	}

	public void validateTitle(String ExpectedTitle) {
		String ActualTitle = baseUtilDriver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	public void getScreenShot(String filePath) throws IOException {
		File srcFile = ((TakesScreenshot) baseUtilDriver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile, new File(prop.getProperty("screenshotFilePath") + filePath));
	}

	public void type(String locator, String textData) {
		baseUtilDriver.findElement(getLocators(locator)).sendKeys(textData);
	}

	public void elementClick(String locator) {
		baseUtilDriver.findElement(getLocators(locator)).click();
	}

	public void isElementVisible(String locator) {

		WebDriverWait wait = new WebDriverWait(baseUtilDriver, Duration.ofSeconds(10));
		try {

			wait.until(ExpectedConditions.visibilityOfElementLocated(getLocators(locator)));

		} catch (Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
	

	public By getLocators(String locatorKey) {
			
		By by = null;
		
		if(locatorKey.endsWith("_id"))
		{
			by = By.id(prop.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_xpath")) 
		{
			by = By.xpath(prop.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_name"))
{
			by = By.name(prop.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_css")) 
		{
			by = By.cssSelector(prop.getProperty(locatorKey));
		}else if (locatorKey.endsWith("_tagName")) 
			by = By.tagName(prop.getProperty(locatorKey));
		
		return by;
	}

}
