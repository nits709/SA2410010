package com.SA2410010_Automation_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SA16_HandlingDropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement dropdownList = driver.findElement(By.id("country"));
		Select countries = new Select(dropdownList);
		System.out.println("Selected Country : " +countries.getFirstSelectedOption().getText());
		
	// if you want to perform any operation on Dropdown list then use object of select class.
	// if you want to perform any operation on List then use object of list.	
	
		List<WebElement> countryList = countries.getOptions(); 
		
		System.out.println("Total Countries : "+ countryList.size());
		
		

	}

}
