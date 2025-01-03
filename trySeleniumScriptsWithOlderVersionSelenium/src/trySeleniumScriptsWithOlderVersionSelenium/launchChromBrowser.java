package trySeleniumScriptsWithOlderVersionSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchChromBrowser {

	
	public static void main(String[] args) {
        
		System.setProperty("webdriver.chrome.driver",
				"//Users//nitingupta//Downloads//chromedriver-mac-x64//chromedriver");
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		System.out.println(driver.getPageSource());
	}
}
