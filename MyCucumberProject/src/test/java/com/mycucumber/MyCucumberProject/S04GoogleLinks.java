package com.mycucumber.MyCucumberProject;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S04GoogleLinks {


	WebDriver driver;
	
	@Given("I open googleIndia")
	public void userOpenTheGoogle1() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.co.in");
	}
	
	
	@When("Click on Gmail Link")
	public void click_on_gmail_link() {
		driver.findElement(By.linkText("Gmail")).click();
	    
	}

	@Then("Gmail page should display")
	public void gmail_page_should_display() {
		Assert.assertTrue(driver.getTitle().contains("Gmail"));
	   
	}

	@When("Click on Images Link")
	public void click_on_images_link() {
		driver.findElement(By.linkText("Images")).click();
	}

	@Then("Images page should display")
	public void images_page_should_display() {
		Assert.assertTrue(driver.getTitle().contains("Images"));
	}

	@When("Click on Advert Link")
	public void click_on_advert_link() {
	    driver.findElement(By.linkText("Advertising")).click();
	}

	@Then("Advert page should display")
	public void advert_page_should_display() {
		Assert.assertTrue(driver.getTitle().contains("Advertising"));
	}

	@When("Click on Business Link")
	public void click_on_business_link() {
		 driver.findElement(By.linkText("Business")).click();
	}

	@Then("Business page should display")
	public void business_page_should_display() {
		Assert.assertTrue(driver.getTitle().contains("Business"));
	}
}
