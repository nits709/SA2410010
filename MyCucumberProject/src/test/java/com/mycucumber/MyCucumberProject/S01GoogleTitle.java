package com.mycucumber.MyCucumberProject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class S01GoogleTitle {

	@Given("open google")
	public void open_google() {
		System.out.println("Open Google");
	}
	
	
	@When("Read the title")
	public void read_the_title() {
		System.out.println("Read google Title");
	}
	
	
	@Then("Title should be google")
	public void title_should_google() {
		System.out.println("Open Google");
	}
	
	
	
	
	
}
