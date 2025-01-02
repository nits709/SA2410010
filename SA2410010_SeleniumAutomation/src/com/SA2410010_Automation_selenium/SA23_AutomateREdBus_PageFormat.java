package com.SA2410010_Automation_selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class SA23_AutomateREdBus_PageFormat {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		

		driver.get("https://www.redbus.in/"); // navigate to url  // 60 seconds

		// webdriver object, time (wait time)
		
		

		// From City
		driver.findElement(By.id("src")).sendKeys("PUNE");
		
				
	
	

//		driver.findElement(
//				By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[1]/div/div[1]/ul/li[2]/div"))
//				.click();

		// To City
		driver.findElement(By.id("dest")).sendKeys("Mumbai");

		driver.findElement(
				By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[3]/div[1]/ul/li[3]/div"))
				.click();

		// Calender
		driver.findElement(By.id("onwardCal")).click();

		driver.findElement(
				By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[3]/div[1]/ul/li[3]/div"))
				.click();

		// Date
		driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/div[4]/div/div[2]"))
				.click();

		// Search Button
		driver.findElement(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div/button")).click();

		// Result
		System.out.println(driver.findElement(By.xpath(
				"/html/body/section/div[2]/div[4]/div/div[2]/div/div[2]/div[2]/div/ul/div[2]/li/div[1]/div/div[1]/div[1]/div[1]/div[1]"))
				.getText());

		driver.close();
	}
}
