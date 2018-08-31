package Package1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Login extends ReadWriteExcel_test {

	WebDriver driver;
	ReadWriteExcel_test rwexcel;
	
	@BeforeMethod
	public void pre()  {
		System.setProperty("webdriver.chrome.driver", "D:\\PratianAutomationProject\\AutomationProject\\AutomationProject\\src\\test\\resources\\chromedriver1.exe");
		driver=new ChromeDriver();
		//Maximize the window	
		driver.manage().window().maximize();
		
		//Delete all cookies
		driver.manage().deleteAllCookies();
		
		//navigate to url
		 driver.get("https://uatint-adjudication-ultimate.mirrahealthcare.com");
		
	}
	
	@Test	
	public void login() throws IOException {
		ReadWriteExcel_test rwexcel=new ReadWriteExcel_test();
		readexcel();
		driver.findElement(By.id("userNameInput")).sendKeys("rwexcel.username");
		driver.findElement(By.id("passwordInput")).sendKeys("rwexcel.pwd");
		driver.findElement(By.id("submitButton")).click();
		//driver.findElement(By.id("")).click();
		}
	
	@AfterMethod()
	public void quit() {
		driver.quit();
	}
}

