package com.SA2410010_Automation_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA02_VerifyPageTitleOfPage {

	public static void main(String[] args) {

		String expTitle = "Yahoo", actTitle;

		WebDriver driver = new ChromeDriver(); // compile time/checked // lunch the browser

		driver.manage().window().maximize(); // maximized the browser.

		driver.get("https://www.google.co.in");

		actTitle = driver.getTitle();
		System.out.println("Title of my page : " + actTitle);

		if (expTitle.equals(actTitle)) {
			System.out.println("Opened Google \nTest case pass");
		} else {
			System.out.println("Opened Google \nTest case fail");
		}

		driver.close(); // close the browser

	}
}
