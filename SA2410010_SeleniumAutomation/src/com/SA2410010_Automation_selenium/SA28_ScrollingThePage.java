package com.SA2410010_Automation_selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA28_ScrollingThePage {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		dr.get("https://echoecho.com/school.htm");
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		
		js.executeScript("window.scrollBy(0,600)", ""); // top to down
		//js.executeScript("window.scrollBy(300,0)", ""); left to right

	}

}
