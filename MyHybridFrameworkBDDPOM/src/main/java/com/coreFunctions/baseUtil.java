package com.coreFunctions;

import static com.coreFunctions.ObjectLaunched.prop;
import static com.coreFunctions.ObjectLaunched.test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.aventstack.extentreports.Status;
import com.report.ExtentReporter;

public class baseUtil {

	protected WebDriver baseUtilDriver;
	
	public baseUtil(WebDriver driver) {
		this.baseUtilDriver = driver;
	}

	public void navigateURL() {
		log("User navigate to "+prop.getProperty("applicationURL") );
		baseUtilDriver.get(prop.getProperty("applicationURL"));
		
	}

	public void validateTitle(String ExpectedTitle) {
		String ActualTitle = baseUtilDriver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
	}

	public void getScreenShot(String filePath) throws IOException {
		File srcFile = ((TakesScreenshot) baseUtilDriver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File(prop.getProperty("screenshotFilePath") + filePath));
	}

	public void type(String locator, String textData) {
		log("Enter a "+ textData + " on element "+ prop.getProperty(locator));
		baseUtilDriver.findElement(getLocators(locator)).sendKeys(textData);
	}

	public void elementClick(String locator) {
		log("element "+ prop.getProperty(locator));
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
	
	public void reportFailure(String failureMsg, boolean stopOnFailure) {
		System.out.println(failureMsg);
		test.log(Status.FAIL, failureMsg);// failure in extent reports
		takeScreenShot();// put the screenshot in reports
		//softAssert.fail(failureMsg);// failure in TestNG reports
		
		if(stopOnFailure) {
			Reporter.getCurrentTestResult().getTestContext().setAttribute("criticalFailure", "Y");
			//assertAll();// report all the failures
			Assert.fail();
		}
	}
	
	public void log(String msg) {
		System.out.println(msg);
		takeScreenShot();
		test.log(Status.PASS, msg);
		
	}

	public void takeScreenShot(){
		// fileName of the screenshot
		Date d=new Date();
		String screenshotFile=d.toString().replace(":", "_").replace(" ", "_")+".png";
		String filePath = ExtentReporter.screenshotFolderPath;
		// take screenshot
		File srcFile = ((TakesScreenshot)baseUtilDriver).getScreenshotAs(OutputType.FILE);
		try {
			// get the dynamic folder name
			FileUtils.copyFile(srcFile, new File(filePath+"//"+screenshotFile));
			//put screenshot file in reports
			test.log(Status.INFO,"Screenshot-> "+ test.addScreenCaptureFromPath(filePath+"//"+screenshotFile));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
