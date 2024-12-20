package com.SA2410010_Automation_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA05_LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement emailId = driver.findElement(By.name("email"));
		emailId.sendKeys("nitingupta3005@gmail.com");
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys("qwerty");
		WebElement LoginBtn = driver.findElement(By.name("login"));
		LoginBtn.click();

	}

}
