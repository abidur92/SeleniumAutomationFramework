package TestCases;


import org.testng.annotations.Test;

import ProjectResources.Base;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObject.landingPage;
import pageObject.registrationPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegistrationPageTest extends  Base {
	
	public Logger log = LogManager.getLogger(RegistrationPageTest.class);
	
	
	@BeforeTest
	
		public void initial() throws IOException {
		
		log.info("************* RegistratioPage TestCase **************** ");
			
			driver = initialization();
			
			log.info("WebDriver will launched");
					
			driver.get(prop.getProperty("url"));
			
			log.debug("Driver will invoke website");

			
			}
	
	
	@Test
	
		
		public void navigateToRegistrationPage() throws IOException, InterruptedException {
	
		
		landingPage lp = new landingPage(driver);
		
		lp.clickRegister().click();
		
		log.info("Clicking Register Button");
		
		Thread.sleep(3000);
		
		registrationPage rp = new registrationPage(driver);
		
		rp.getName().sendKeys("Mr.Snoop");
		
		log.info("Entering Fullname");
		
		rp.getEmail().sendKeys("abidurrahmannt@gmail.com");
		
		log.info("Entering email");
		
		rp.getPassword().sendKeys("Fahad0358#");
		
		log.info("Entering password");
		
		rp.getConfPassword().sendKeys("Fahad0358#");
		
		log.info("Confirming password");
		
		rp.getCheckRadio1().click();
		
		log.info("Clicking first radio button");
		
		rp.getCheckRadio2().click();
		
		log.info("Clicking second radio button");
		
		rp.getClickButton().click();
		
		log.info("Clicking submit button");
		
	
	}
	
	
	@AfterTest
	
	public void tearDown() {
		
		driver.quit();
		
		driver=null;
		
		
		log.debug("************* Closing RegistratioPage TestCase **************** ");
	}
}