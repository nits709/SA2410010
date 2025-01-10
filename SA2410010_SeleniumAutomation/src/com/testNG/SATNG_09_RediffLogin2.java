package com.testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class SATNG_09_RediffLogin2 {

	WebDriver Rediffdriver;

	@FindBy (name="login") WebElement username;
	@FindBy (name="proceed") WebElement SignButton;
	

	public SATNG_09_RediffLogin2(WebDriver driver) {
		this.Rediffdriver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void launchURL() {
		Rediffdriver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	public void enterDataTextBox() {
		//driver.findElement(By.name("login")).sendKeys("nitin");
		username.sendKeys("nitin");
	}

	public void seleniumClick() {
		//driver.findElement(By.name("proceed")).click();
		SignButton.click();
	}
	
	@AfterTest
	public void closeSetup() {
		Rediffdriver.close();
	}

	
}
