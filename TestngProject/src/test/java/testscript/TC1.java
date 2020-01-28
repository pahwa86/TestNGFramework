package testscript;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;
import utilities.LogCapture;
import utilities.ScreenShotCapture;

public class TC1 extends Base
{
	
	@Test
	public static void trending() throws InterruptedException, IOException
	{
				
		// Object Creation and click 'Sign In' button
		LoginPage login = new LoginPage(driver, pr);
		login.SignInButtonClick();
		
		// Screenshot Capture
		ScreenShotCapture.takeScreenShot(driver, "D://EclipseScreenshot//Login.jpeg");
		
		// Input Username and Password
		login.UsernameAndPassworInput("dtjavatraining.2019@gmail.com", "Javatraining@2019");
		
		// Screenshot Capture
		ScreenShotCapture.takeScreenShot(driver, "D://EclipseScreenshot//Credentials.jpeg");
		
		// Comparing the actual url with expected url after login
		String login_expectedurl="https://www.youtube.com/";
        Assert.assertEquals(driver.getCurrentUrl(), login_expectedurl);
        
		
		// Click 'Trending' link
		HomePage home = new HomePage(driver, pr);
		home.trendingclick();
		
		// Comparing the actual url with expected url after clicking the trending link 
		String trending_url="https://www.youtube.com/feed/trending";
		Assert.assertEquals(driver.getCurrentUrl(),trending_url);
		
		// Screenshot capture after trending link click
		ScreenShotCapture.takeScreenShot(driver, "D://EclipseScreenshot//TrendingLink.jpeg");
		
		// Logout
		LogoutPage logout = new LogoutPage(driver, pr);
		logout.avatarlink();
		
		// Compare the login and email address displayed.
		String loginemail = "dtjavatraining.2019@gmail.com"; 
		Assert.assertEquals(loginemail,logout.emailaddresstext());
		
		// Click 'Logout' link
		logout.signout();
		
		// Logs print after completion of test case
		LogCapture.takelog("TC1", "Test Case Passed");
		
	}
}
