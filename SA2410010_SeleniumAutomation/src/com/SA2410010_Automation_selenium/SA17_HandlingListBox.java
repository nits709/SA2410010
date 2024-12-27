package com.SA2410010_Automation_selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SA17_HandlingListBox {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement listBox = driver.findElement(By.id("multiselect1"));
		Select carListBox = new Select (listBox);
		
		//Select carListBox = new Select (driver.findElement(By.id("multiselect1")));
		
		List<WebElement> carsList = carListBox.getOptions(); 
		
		for(WebElement c: carsList) {
			System.out.println("cars name "+ c.getText());
		}
		
		System.out.println("Select Option Name "+ carsList.get(1).getText());carListBox.selectByIndex(1);
		System.out.println("Select Option Name "+ carsList.get(3).getText());carListBox.selectByIndex(3);
		
		
		System.out.println("DeSelect Option Name "+ carsList.get(1).getText());carListBox.deselectByIndex(1);
		
		carListBox.selectByIndex(0);
		
		carListBox.deselectByIndex(3);
		

	}

}
