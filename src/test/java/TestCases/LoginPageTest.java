package TestCases;


import org.testng.annotations.Test;
import ProjectResources.Base;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import pageObject.landingPage;
import pageObject.loginPage;


public class LoginPageTest extends Base {
	
	public Logger log = LogManager.getLogger(LoginPageTest.class);

	
	
	@BeforeTest
	
	public void initial() throws IOException {
		
		log.info("************* LoginPage TestCase **************** ");

		driver = initialization();
		
		log.info("WebDriver will launched");

		

		
		}
	
	@Test(dataProvider="testData")
	
	public void navigateToHomePage(String username, String password) throws IOException {
		
		driver.get(prop.getProperty("url"));
		
		log.debug("Driver will invoke website");
		
		landingPage lp = new landingPage(driver);
		
		lp.clickLogin().click();
		
		log.info("Clicking Login Button");
		
		loginPage logp = new loginPage(driver);
		
		logp.getEmail().sendKeys(username);
		
		log.info("Username has entered");
		
		logp.getPassword().sendKeys(password);
		
		log.info("Password has entered");
		
		logp.getclick().click();
		
		log.info("Clicked the signin button");
		
		
		}
	
	
	@DataProvider(name="testData")
	
	public Object[][] getData() {
		
		Object [][] data = new Object [2][2];
		
		data [0][0]="abidurrahmannt@gmail.com";
		data [0][1]="Fahad0358#";
		data [1][0]="abidur_92@yahoo.com";
		data [1][1]="Fahad0358#";
		
		return data;
		
		}
	
	@AfterTest
	
	public void tearDown() {
		
		driver.quit();
		
		driver=null;
		
		log.debug("************* Closing LoginPage TestCase **************** ");
	}
	
}
