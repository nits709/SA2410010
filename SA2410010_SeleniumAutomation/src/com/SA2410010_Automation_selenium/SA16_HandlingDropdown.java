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
		
		System.out.println("First Country : " + countryList.get(0).getText()); // india
		
		//select the dropdown value by visibletext
		//countries.selectByVisibleText("Colombia");
		//Select the dropdwon value by selectbyvalue method
		//countries.selectByValue("48");
		countries.selectByIndex(32);
		
		
		
		
		
//		for(WebElement lnks : countryList ) {
//			System.out.println(" link name " + lnks.getText());
//		}
		
//		for(int i =0; i< countryList.size() ; i++) {
//			
//			System.out.println(" Index is " + i + ". Link Name is " +countryList.get(i).getText());
//			
//			if(countryList.get(i).getText().equals("Aruba")) {
//				System.out.println("Control inside if condition and country name is " + countryList.get(i).getText());
//				
//			}
//			
//		}
		
		
		

	}

}
