package com.SA2410010_Automation_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_08_LocateByCssSelectorWithMultipleAttribute {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		WebElement emailId = driver.findElement(By.cssSelector("input[type='text']"));
        emailId.sendKeys("nitingupta3005@gmail.com");
        
       WebElement pass =  driver.findElement(By.cssSelector("input[type='password'][id='pass']"));
        pass.sendKeys("asdadadsdadsad");
        
        
        
	}

}
