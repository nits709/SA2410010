package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_03_ECHOTRACK {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echotrak.com/Login.aspx?ReturnUrl=%2f+Login.aspx");
		
		WebElement emailID = driver.findElement(By.className("form-control"));
		emailID.sendKeys("nitingupta3005@gmail.com");
		
		WebElement pass = driver.findElement(By.id("txtPassword"));
		pass.sendKeys("dsfsdfffd");
		
		WebElement loginBtn = driver.findElement(By.className("btn-primary"));
		loginBtn.click();

	}

}
