package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	public WebDriver driver;
	
	
	public loginPage(WebDriver driver) {
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="user_email")
	
	WebElement emailButton;
	
	@FindBy(id="user_password")
	
	WebElement passwordButton;
	
	@FindBy(name="commit")
	
	WebElement clickButton;
	
	
	public WebElement getEmail() {
		
		return emailButton;
	}
	
	
	public WebElement getPassword() {
		
		 return passwordButton;
	}
	
	
	public WebElement getclick() {
		
		return clickButton;
	}
	
	
}
