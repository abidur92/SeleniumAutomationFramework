package TestCases;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ProjectResources.Base;


public class ValidateTitle extends Base {
	
	public Logger log = LogManager.getLogger(ValidateTitle.class);
	
	
	@BeforeTest
	
	public void initial() throws IOException {
		
		log.info("*************Validating Title TestCase **************** ");
		
		driver = initialization();
		
		log.info("WebDriver will launched");
				
		driver.get(prop.getProperty("url"));
		
		log.debug("Driver will invoke website");
		
		}
	
	@Test
	
	public void valTitle() throws IOException {
		
	
		String title = driver.getTitle();
		
		System.out.println(title);
		
		log.info("This will print out the page title");
		
		Assert.assertEquals(title, "QA Click Academy,Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy");
		
		log.debug("If the assertion pass the testcase will pass");
		
	}
	
	@AfterTest
	
	public void tearDown() {
		
		driver.close();
		
		driver=null;
		
		
		log.info("*************Validating Title TestCase Closing **************** ");
	}
	
}
