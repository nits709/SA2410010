package com.stepDef;

import org.openqa.selenium.WebDriver;

import com.myHooks.MyHooks;
import com.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static com.coreFunctions.ObjectLaunched.reports;
import static com.coreFunctions.ObjectLaunched.test;

public class LoginSteps {

	WebDriver driver;
	MyHooks hooks;
	LoginPage loginPage;

	public LoginSteps(MyHooks hook) {
		this.hooks = hook;
		this.driver = hook.getDriver();
		this.loginPage = new LoginPage(driver);
		test = reports.createTest("LoginTest");
	}

	@Given("The user lanuch the application")
	public void the_user_lanuch_the_application() {
		loginPage.launchURL();
	}

	@When("The user login with valid credetials")
	public void the_user_enter_the_username() {
		loginPage.userLoginWithValidCredentails();
	}

	@When("The user enter the password")
	public void the_user_enter_the_password() {

	}

	@Then("The user click on submit button")
	public void the_user_click_on_submit_button() {

	}

	@Then("The user validate the page title")
	public void the_user_validate_the_page_title() {

	}

}
