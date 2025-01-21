package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A05_DynamicTableHandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/91778/aus-vs-ind-1st-test-india-tour-of-australia-2024-25");
		
		
		List<WebElement> totalNoOfRows = driver.findElements(By.xpath("//*[@id=\"innings_1\"]/div[1]/div"));
		List<WebElement>TotalNoofColumnInRow = driver.findElements(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[3]/div"));
		
		System.out.println("tota rows in web table ->" + totalNoOfRows.size());
		System.out.println("tota column in row web table ->" + TotalNoofColumnInRow.size());
		
				
		
	}

}
