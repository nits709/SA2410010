package com.selenium.mavenproject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.ExcelUtility.ReadDataFromExcelFile;
import com.reusableFunctions.baseUtil;

public class LoginTestcases extends baseUtil {

	@Test(dataProvider = "getLoginData", dataProviderClass = ReadDataFromExcelFile.class)
	public void login(String username, String password) {
		launchBrowser("Chrome");
		navigateURL();
		validateTitle("OrangeHRM");
		isElementVisible("username_xpath");
		type("username_xpath", username);
		type("password_xpath", password);
	}

	
	
	@AfterMethod
	public void closeDrivers() {
		System.out.println("AfterMethod");
		baseUtilDriver.close();
		reports.flush();
	}
}
