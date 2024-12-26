package com.SA2410010_Automation_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA13_LocateByRelativeXpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://facebook.com");
		
		WebElement emailID = driver.findElement(By.xpath("//input[@type='text']"));
		emailID.sendKeys("adadsadsaddsa");
		
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("ewrwerewrwe");
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		loginBtn.click();
		
		
		

	}

}
