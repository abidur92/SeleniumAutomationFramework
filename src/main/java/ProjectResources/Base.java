package ProjectResources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;


public class Base {
	
	public static WebDriver driver;
	
	public Properties prop;
		
	
	public WebDriver initialization() throws IOException {
	
	
	prop = new Properties();
	FileInputStream fis = new FileInputStream("/Users/Adilmarjana2011/Desktop/WorkSpace/TestingFramework/src/main/java/ProjectResources/data.properties");
	prop.load(fis);
	
	String browserName = prop.getProperty("browser");
	
	if (browserName.equals("Chrome")) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/Adilmarjana2011/Desktop/SeleniumFolder/chromedriver");
		
		driver = new ChromeDriver();
		
		
	} else if (browserName.equals("Firefox"))
	{
	
		System.setProperty("webdriver.gecko.driver","/Users/Adilmarjana2011/Desktop/SeleniumFolder/geckodriver");
	
		driver = new FirefoxDriver();
		
	} else if (browserName.equals("Safari"))
		
	{
		
		driver = new SafariDriver();
	}
	
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.manage().deleteAllCookies();
	
	driver.manage().window().maximize();
	
	return driver;
	
	
	}
	
	public static void getScreenshot(String result) throws IOException {
		
		File scrFile =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrFile, new File("/Users/Adilmarjana2011/Desktop/ScreenshotFolder/"+result+"Screenshot.png"));
		
		
	}
	
}