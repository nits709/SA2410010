package com.coreFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.report.ExtentReporter;

public class ObjectLaunched {

	public WebDriver driver = null;
	public static ExtentReports reports;
	public static ExtentTest test;
	public static File file;
	public static FileInputStream fis;
	public static Properties prop;
	public static String propFilePath = "/Volumes/Renuka/SA2410010/MyHybridFrameworkBDDPOM/OB.properties";

	public void setupFrameworkObjects() {
		try {
			startSelenium();
			init();
		} catch (Exception e) {
			e.getLocalizedMessage();
		}
	}

	public void init() {
		try {
			file = new File(propFilePath);
			fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
			reports = ExtentReporter.getReports();
		//	test = reports.createTest("LoginTest");
		} catch (Exception e) {
			e.getLocalizedMessage();
		}
	}

	public void startSelenium() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void stopSelenium() {
		driver.close();
		reports.flush();
	}
}
