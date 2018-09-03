package Package2;

import java.io.IOException;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Util.TestUtil;

public class Login_DP extends TestBase {
	
	public Login_DP() throws IOException {
		super();

		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void pre() throws IOException {
		intialization();

	}
	
	
	@DataProvider(name = "getdata")
	public Object[][] getdata() throws IOException

	{

		Object data[][] = TestUtil.getTestData("Login");
			
		return data;
		
	}
	


	@Test(dataProvider="getdata")

	public void test(String sno, String role,String Username, String password,String Remarks) throws IOException, InterruptedException {
		
		driver.findElement(By.id(prop.getProperty("unid"))).sendKeys("");
		driver.findElement(By.id(prop.getProperty("pwid"))).sendKeys("");
		
		driver.findElement(By.id(prop.getProperty("unid"))).sendKeys(Username);
		
		driver.findElement(By.id(prop.getProperty("pwid"))).sendKeys(password);
		driver.findElement(By.id(prop.getProperty("loginid"))).click();
		
		
		/*try 
	    {
			WebElement we= wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(prop.getProperty("errormsg"))));
	        
	    }      
	    catch (Exception e) 
	    {
	        assert.fail(e.printstackTrace)
	    }*/
		
			
		Float rno1 = Float.valueOf(sno);
		int rno = (int) Math.round(rno1);
				
		
		System.out.println(driver.findElements(By.id(prop.getProperty("errormsg"))).size());
			
		if (driver.findElements(By.id(prop.getProperty("errormsg"))).size()==0) {

			TestUtil.writeData("Login", rno, 4, "Pass","Remarks");
			
			driver.findElement(By.xpath("//li/a/i")).click();
						
			}

		else {
			
			
			//driver.get(prop.getProperty("url")).refres
			//driver.get(prop.getProperty("url"));
			TestUtil.writeData("Login", rno, 4, "False","Remarks");
			}	
		
		//driver.findElement(By.id(prop.getProperty("logout"))).click();
		
		//driver.findElement(By.xpath("//a//i[@class='fa fa-power-off  btn btn-danger btn-xs text-red logOff_btn']")).click();
		
	}
		

	@AfterTest
	public void tearDown() {
	
		driver.quit();

	}

}
