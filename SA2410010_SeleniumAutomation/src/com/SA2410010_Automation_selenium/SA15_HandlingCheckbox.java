package com.SA2410010_Automation_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA15_HandlingCheckbox {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement checkbx = driver.findElement(By.cssSelector("input[name^='chk_alt']"));
		
		System.out.println("Before");
		System.out.println("Selected : " + checkbx.isSelected());
		System.out.println("is Disabled : "+ checkbx.isEnabled());
		System.out.println("is visible : "+ checkbx.isDisplayed());
		
		if(checkbx.isSelected()== false) {
		
		checkbx.click();
		}
		
		System.out.println("\nAfter");
		System.out.println("Selected : " + checkbx.isSelected());
		System.out.println("is Disabled : "+ checkbx.isEnabled());
		System.out.println("is visible : "+ checkbx.isDisplayed());
		
		
		
		
		
		
	}

}
