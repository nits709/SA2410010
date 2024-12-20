package com.SA2410010_Automation_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SA03_LunchMultipleBrowsers {

	static WebDriver driver = null;

	public static void main(String[] args) {

		String browserType = "Safari";

		if (browserType.equals("Chrome")) {

			driver = new ChromeDriver();

		} else if (browserType.equals("Safari")) {

			driver = new SafariDriver();

		} else if (browserType.equals("Edge")) {

			driver = new EdgeDriver();

		} else if (browserType.equals("firefox")) {

			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();

		driver.close();

	}

}
