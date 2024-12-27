package com.SA2410010_Automation_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA18_HandlingReadingTextFromElement {

	public static void main(String[] args) {
		////*[@id="post-body-7702345506409447484"]/div/input[2]
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[2]")).click();
		
		System.out.println("Element Name " +driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[2]")).getText());

		System.out.println("Element getCssValue 2 "+ driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[2]"))
		.getCssValue("value"));
		
		System.out.println("Element getAttribute 2 "+ driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[2]"))
		.getAttribute("value"));
		
		System.out.println("Element getDomAttribute 2 "+ driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[2]"))
		.getDomAttribute("value"));
		
	}

}
