package com.SA2410010_Automation_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA06_LocateByClassName {

	static String currentURLOFPage = "";

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://google.co.in");

		WebElement searchBox = driver.findElement(By.className("gLFyf"));
		currentURLOFPage = driver.getCurrentUrl();
		searchBox.click();
		searchBox.sendKeys("Automation jobs for freshers");

		System.out.println("Current page URL before hitting the Enter Button " + currentURLOFPage);
		searchBox.sendKeys(Keys.ENTER);

//		WebElement searchButton = driver.findElement(By.className("gNO89b"));
//		searchButton.click();

		String title = driver.getTitle();
		currentURLOFPage = driver.getCurrentUrl();
		System.out.println("Current page URL After hitting the Enter Button " + currentURLOFPage);

		if (title.contains("Automation jobs for freshers")) {
			System.out.println("Correct Search Result Displayed");
		} else {
			System.out.println("Getting wrong output");
		}

	}

}
