package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A02_FaceBook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement emailID = driver.findElement(By.className("_55r1"));
		emailID.sendKeys("nitingupta3005@gmail.com");
//		WebElement pass = driver.findElement(By.id("pass"));
//		pass.sendKeys("qweqweqwe");
//		WebElement loginButton = driver.findElement(By.id("u_0_5_AJ"));
//		loginButton.click();
	}

}
