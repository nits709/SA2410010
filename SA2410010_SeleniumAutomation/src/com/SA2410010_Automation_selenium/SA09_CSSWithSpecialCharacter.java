package com.SA2410010_Automation_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA09_CSSWithSpecialCharacter {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		// * contains
		WebElement emailID = driver.findElement(By.cssSelector("input[placeholder*='phone']"));
		emailID.sendKeys("nitin@gmail.com");
		
		
		
		// $ Ends With - when attribute value starting or initial part is dynamic in nature.
		WebElement pass = driver.findElement(By.cssSelector("input[data-testid$='pass']"));
		pass.sendKeys("nitin@gmail.com");
		
		
		//^ Starts with - when attribute value end part is dynamic in nature
		WebElement loginBtn = driver.findElement(By.cssSelector("button[id^='u_0_5']"));
		loginBtn.click();

	}

}
