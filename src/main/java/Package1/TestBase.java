package Package1;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	public static WebDriver driver;
			
	public void intialization() throws IOException {
				
				

	System.setProperty("webdriver.chrome.driver", "D:\\PratianAutomationProject\\AutomationProject\\AutomationProject\\src\\test\\resources\\chromedriver1.exe");
	driver=new ChromeDriver();

		
	//Maximize the window	
	driver.manage().window().maximize();
	
	//Delete all cookies
	driver.manage().deleteAllCookies();
	
	//navigate to url
	 driver.get("https://uatint-adjudication-ultimate.mirrahealthcare.com");
	
	
}
	
}

