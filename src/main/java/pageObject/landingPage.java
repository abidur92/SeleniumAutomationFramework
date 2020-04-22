package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class landingPage {
	
	
	public WebDriver driver;
	
	
	public landingPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(linkText="Login")
				
		WebElement LoginButton;
		
		@FindBy(xpath="//span[text()='Register']")
		
		WebElement RegisterButton;
		
		
		
		public WebElement clickLogin() {
			
			return LoginButton;
			
		}
		
		public WebElement clickRegister() {
			
			return RegisterButton;
			
		}
		
		
		
		
		
		
	
	}
	
	
	
	
	
	
	
	


