package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;
import assertions.CompareAssert;
import base.Base;
import pages.HomePage;
import pages.LoginPage;
import pages.LogoutPage;

public class TC2 extends Base{

	@Test
	public static void subscriptions() throws InterruptedException
	{
		// Object Creation and click 'Sign In' button
		LoginPage login = new LoginPage(driver, pr);
		login.SignInButtonClick();
				
		// Input Username and Password
		login.UsernameAndPassworInput("dtjavatraining.2019@gmail.com", "Javatraining@2019");
		
		String login_expectedurl="https://www.youtube.com/";
		
		// Comparing login url with expected url using soft assertion
		CompareAssert.stringcompare(driver.getCurrentUrl(), login_expectedurl);
        		
		// Click 'Subscriptions' link
		HomePage home = new HomePage(driver, pr);
		home.Subscriptionsclick();
		String Subscriptions_url="https://www.youtube.com/feed/subscriptions";
		Assert.assertEquals(driver.getCurrentUrl(), Subscriptions_url);
		
		// Logout
		LogoutPage logout = new LogoutPage(driver, pr);
		logout.avatarlink();
		logout.signout();
		
	}
}
	

