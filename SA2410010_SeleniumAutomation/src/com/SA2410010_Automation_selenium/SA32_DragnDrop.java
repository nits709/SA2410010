package com.SA2410010_Automation_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SA32_DragnDrop {

	public static void main(String[] args) {

		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();

		dr.get("https://jqueryui.com/droppable/");

		dr.switchTo().frame(0);
		
		Actions act = new Actions(dr);
		WebElement source = dr.findElement(By.id("draggable"));
		WebElement target = dr.findElement(By.id("droppable"));

		act.dragAndDrop(source, target).perform();

	}

}
