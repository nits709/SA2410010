package com.selenium.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstMavenScripts {
	
	
	public static void main(String[] args) {
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://google.com");
		
		System.out.println(dr.getTitle());
		
		
		dr.close();
		
	}

}
