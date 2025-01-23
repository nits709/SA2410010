package com.MyHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyHooks {

	
	WebDriver driver;
	
	@Before
	public void tearUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://google.co.in");
	}
	
	
	@After
	public void tearDown() {
		driver.close();
	}
	
}
