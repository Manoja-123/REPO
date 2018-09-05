package Package2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {

	public WebDriver driver;
	public Properties prop;

	public TestBase() throws IOException {

		FileInputStream fis = new FileInputStream("D:\\Automation_Training\\Userlogin\\src\\test\\java\\TestData\\Config.properties");

		prop = new Properties();

		prop.load(fis);

		
	}

	public void intialization() throws IOException {

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\PratianAutomationProject\\AutomationProject\\AutomationProject\\src\\test\\resources\\chromedriver1.exe");
			driver = new ChromeDriver();
		}

		/*
		 * else if(browserName.equals("FF")){
		 * System.setProperty("webdriver.gecko.driver",
		 * "D:\\PratianAutomationProject\\AutomationProject\\AutomationProject\\src\\test\\resources\\geckodriver-v0.21.0-arm7hf.tar.gz"
		 * ); driver = new FirefoxDriver(); }
		 */

		// Maximize the window
		driver.manage().window().maximize();

		// Delete all cookies
		driver.manage().deleteAllCookies();

		// navigate to url
		driver.get(prop.getProperty("url"));
		
		//xgsfgsdgsasdasdDsad
//sadasdasd
		//asdas
	}

}
