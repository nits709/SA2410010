package com.mycucumber.MyCucumberProject;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S02GoogleSearch {
	
	WebDriver driver;
	
	@Given("I open google")
	public void userOpenTheGoogle() {
		
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://google.co.in");
		
		System.out.println("Google");
	}
	
	
	@When("I enter text in searchbox")
	public void userEnterTheTextInSeachBox() {
		//driver.findElement(By.name("q")).sendKeys("Sachin",Keys.ENTER);
		driver.findElement(By.name("q")).sendKeys("Sachin");
	}
	
	@And("I hit enter")
	public void userEnterKey() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	
	@Then("valid search should display")
	public void uservalidateTheSearch() {
		Assert.assertTrue(driver.getTitle().contains("Google"));
	}

}
