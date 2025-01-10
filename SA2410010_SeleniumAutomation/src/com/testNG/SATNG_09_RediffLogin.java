package com.testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SATNG_09_RediffLogin {

	WebDriver driver;
	File file;
	FileInputStream fis;
	Properties prop;

	public SATNG_09_RediffLogin() throws IOException {
		file = new File("/Volumes/Renuka/SA2410010/SA2410010_SeleniumAutomation/src/com/testNG/scriptsData.properties");
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
	}

	public void setupEnvironment() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void main(String[] args) throws IOException {
		SATNG_09_RediffLogin testRediff = new SATNG_09_RediffLogin();
		testRediff.setupEnvironment();
		testRediff.launchURL();
		testRediff.enterDataTextBox("username", "nitin");
		testRediff.enterDataTextBox("password", "nitin");
		testRediff.seleniumClick("signButton");
	}

	public void launchURL() {
		driver.get(prop.getProperty("url"));
	}

	public void enterDataTextBox(String locatorsValue, String testData) {
		driver.findElement(By.name(prop.getProperty(locatorsValue))).sendKeys(prop.getProperty(testData));
	}

	public void seleniumClick(String locatorsValue) {
		driver.findElement(By.name(prop.getProperty(locatorsValue))).click();
	}
	
	@AfterTest
	public void closeSetup() {
		driver.close();
	}

	
}
