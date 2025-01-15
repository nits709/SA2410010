package com.SA2410010_Automation_selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA25_HandlingWebTables {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		dr.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

		List<WebElement> headers = dr.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println( " number of header in the web tables are " + headers.size());
		
		for(WebElement hname : headers) {
			System.out.println("HeaderName" + ": "+ hname.getText());
		}
		
		
		List<WebElement> TRows = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("number of rows " + TRows.size());
		
//		for(WebElement tableRows : TRows) {
//			System.out.println("Rows text" + ": "+ tableRows.getText());
//		}
		
		System.out.println(TRows.get(5).getText());
		
		for (int i = 1; i <= TRows.size(); i++) {
			
		System.out.println("Index" + i + ": "+ dr.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[" + i + "]/td[1]")).getText());
			
		}
		
		dr.close();
		

	}

}
