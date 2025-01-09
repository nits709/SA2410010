package com.testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SATNG_07_Groupingtc {

	
	
	@BeforeMethod (alwaysRun =true)
	public void beforeMethod() {
		System.out.println("Lunching the browser");
	}
	
	@AfterMethod (alwaysRun =true)
	public void afterMethod() {
		System.out.println("closing the browser");
	}
	
	@Test(priority = 1, groups = "smoke")
	public void testA() { // login

		System.out.println(" test A");
	}

	@Test(priority = 2, groups = "regression")
	public void registeration() { // logout

		System.out.println(" registeration");
	}

	@Test(priority = 3, groups = "regression")
	public void login() { // login

		System.out.println(" login");
	}

	@Test(priority = 4, groups = "smoke")
	public void searchProduct() { // logout

		System.out.println("searchProduct");
	}
}
