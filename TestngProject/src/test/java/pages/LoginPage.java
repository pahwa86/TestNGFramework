package pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
	public FirefoxDriver driver;
	public Properties pr;

	public LoginPage (FirefoxDriver driver, Properties prop)
	{
		this.driver = driver;
		this.pr=prop;
	}

	public void SignInButtonClick() {
		WebElement signup =driver.findElement(By.cssSelector(pr.getProperty("SignIn")));
		signup.click();
	}
		
	public void UsernameAndPassworInput (String username, String password) throws InterruptedException
	{
		// Selection and provide value in Email or phone text field
				WebElement email = driver.findElement(By.cssSelector(pr.getProperty("Email&PhoneNumber")));
				email.sendKeys(username);
				Thread.sleep(3000);
				
				// Click 'Next' button
				WebElement next = driver.findElementByClassName(pr.getProperty("NextButton"));
		        next.click();
				Thread.sleep(3000);

				// Selection and provide value in password field
				WebElement pass = driver.findElementByName(pr.getProperty("PasswordField"));
				pass.sendKeys(password);
			    Thread.sleep(3000);
				
				// Click 'Next' button
				WebElement next1 = driver.findElementByClassName(pr.getProperty("NextButton"));
		        next1.click();
				Thread.sleep(5000);
	}
}
