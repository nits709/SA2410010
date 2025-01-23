package com.mycucumber.MyCucumberProject;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S03MultipleLogintest {

	WebDriver driver;
	@Given("Open Practice test URl in browser")
	public void open_practice_test_u_rl_in_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practicetestautomation.com/practice-test-login/");
	}

	@When("user enter a valid {string} username")
	public void user_enter_a_valid_username(String username) {
	   driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
	}

	@When("user enter a valid password {string}")
	public void user_enter_a_valid_password(String password) {
		 driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
	   driver.findElement(By.xpath("//*[@id='submit']")).click();
	}

	@Then("Home page should display")
	public void home_page_should_display() {
	    Assert.assertTrue(driver.getTitle().contains("In"));
	}
	
	@Then("User close the browser")
	public void userCloseBrowser() {
		driver.close();
	}
}
