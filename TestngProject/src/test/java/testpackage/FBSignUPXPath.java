package testpackage;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBSignUPXPath {

	static FirefoxDriver driver;
	
	@BeforeMethod
	public static void browseropen()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		
	}
	
	@Test
	public static void webelements ()
	{
		driver.
	}
	
}
