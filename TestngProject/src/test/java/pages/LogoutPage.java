package pages;

import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogoutPage {
	
	  FirefoxDriver driver;
	  Properties pr;

	public LogoutPage(FirefoxDriver driver,Properties prop)
	{
		this.driver=driver;
		this.pr=prop;
	}

	public  void avatarlink() throws InterruptedException
	{	
		// Click 'avatar' link
		WebElement avatar = driver.findElementByCssSelector(pr.getProperty("Avatar"));
		avatar.click();
		Thread.sleep(4000);
	}
	
	public String emailaddresstext()
	{
		WebElement emailaddress = driver.findElementByCssSelector(pr.getProperty("EmailAddress"));
		String loginemailaddress = emailaddress.getText();
		return loginemailaddress;
	}
	public void signout() 
	{	
		// Click 'Sign Out'
		WebElement signout = driver.findElementByXPath(pr.getProperty("SignOut"));
		signout.click();
		
	}
}
