package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class registrationPage {
	
	public WebDriver driver;
	
	
	public registrationPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_name")
	
	WebElement nameField;
	
	
	@FindBy (id="user_email")
	
	WebElement emailField;

	@FindBy (id="user_password")
	
	WebElement passwordField;
	
	@FindBy (id="user_password_confirmation")
	
	WebElement confPasswordField;
	
	
	@FindBy (xpath="//input[@type='checkbox']")
	
	WebElement checkradioField1;
	
	@FindBy (xpath="//input[@id='user_agreed_to_terms']")
	
	WebElement checkradioField2;
	
	@FindBy (xpath = "//input[@type='submit']")
	
	WebElement submitField;
	
	
	
	public WebElement getName() {
		
		return nameField;
	}
	
	public WebElement getEmail() {
		
		return emailField;
	}
	
	
	public WebElement getPassword() {
		
		return passwordField;
	}
	
	public WebElement getConfPassword() {
		
		return confPasswordField;
	}
	
	public WebElement getCheckRadio1() {
		
		  return checkradioField1;
	}
	
	public WebElement getCheckRadio2() {
		
		return checkradioField2;
	}
	
	public WebElement getClickButton() {
		
		return submitField;
	}
	


}
