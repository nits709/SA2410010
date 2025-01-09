package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SATNG_01_FirstTest {
	
	
  @Test (priority=1)
  public void openGoogle() {
	  System.out.println("openGoogle");
	  WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://google.co.in");
		System.out.println(dr.getTitle());
		dr.close();
  }
  
  @Test (priority=3)
  public void openFaceBook() {
	  System.out.println("openFaceBook");
	  WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://facebook.com");
		System.out.println(dr.getTitle());
		dr.close();
  }
  
//  @Test (priority=2)
//  public void openCNN() {
//	  System.out.println("openCNN");
//	  WebDriver dr = new ChromeDriver();
//		dr.manage().window().maximize();
//		dr.get("https://cnn.com");
//		System.out.println(dr.getTitle());
//		dr.close();
//  }
  
  
}
