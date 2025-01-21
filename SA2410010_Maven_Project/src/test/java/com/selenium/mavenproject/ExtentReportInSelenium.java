package com.selenium.mavenproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportInSelenium {

	public static void main(String[] args) {
		
		ExtentSparkReporter  htmlreport = new ExtentSparkReporter("MyExtentReport.html");
			//Generate the Report file with MyExtentReport.html
			ExtentReports report = new ExtentReports();
			report.attachReporter(htmlreport);
			//Help to add the report in html file.
			
		ExtentTest test;
		//Environment Configuration
			report.setSystemInfo("Laptop","MackBookPro");
			report.setSystemInfo("Processor","M4");
			report.setSystemInfo("OperationSystem","XXXX");
			report.setSystemInfo("UserName","Nitin");
			report.setSystemInfo("Browser","Chrome");
			report.setSystemInfo("Selenium Webdriver","4.17.0");
			
		// Configuration of look and feel for the report
			htmlreport.config().setDocumentTitle("MY First ExtentReport");
			htmlreport.config().setReportName("Google Test");
			htmlreport.config().setTheme(Theme.DARK);
			htmlreport.config().setTimeStampFormat("dd-MMM-yyyy");
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://google.co.in");
			driver.findElement(By.name("q")).sendKeys("Automation jobs");
			
			driver.close();
			
			test= report.createTest("Google Test");
			test.log(Status.PASS, MarkupHelper.createLabel("Google Search: pass",ExtentColor.BLUE));
			// You are adding the log in you report.
			
			
			report.flush(); // Will generate the report.
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
	}

}
