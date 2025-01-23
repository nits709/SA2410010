package com.myHooks;

import org.openqa.selenium.WebDriver;

import com.coreFunctions.ObjectLaunched;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks extends ObjectLaunched {

	
	@Before
	public void tearUp() {
		setupFrameworkObjects();
	}
	
	
	@After
	public void tearDown() {
		stopSelenium();
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
	
}
