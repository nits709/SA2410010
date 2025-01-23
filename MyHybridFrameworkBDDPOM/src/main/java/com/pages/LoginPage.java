package com.pages;

import org.openqa.selenium.WebDriver;

import com.coreFunctions.baseUtil;

public class LoginPage extends baseUtil {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void launchURL() {
		navigateURL();
	}

	public void userLoginWithValidCredentails() {
		type("username_xpath", "Username");
		type("password_xpath", "Username");
		elementClick("Login_xpath");
	}
	
	

}
