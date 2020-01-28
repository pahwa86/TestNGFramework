package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;
import pages.HomePage;
import pages.LoginPage;

public class TC5 extends Base {	
	
	@Test
	public static void history() throws InterruptedException
	{
		
		// Object Creation and click 'Sign In' button
		LoginPage login = new LoginPage(driver, pr);
		login.SignInButtonClick();
		
		// Input Username and Password
		login.UsernameAndPassworInput("dtjavatraining.2019@gmail.com", "Javatraining@2019");
		String login_expectedurl="https://www.youtube.com/";
        Assert.assertEquals(driver.getCurrentUrl(), login_expectedurl);
        
		//  Click 'History' link
		HomePage home = new HomePage(driver, pr);
		home.Historyclick();
		String history_url="https://www.youtube.com/feed/history";
		Assert.assertEquals(driver.getCurrentUrl(), history_url);
	}
	
}
