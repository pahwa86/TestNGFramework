package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;
import pages.HomePage;
import pages.LoginPage;

public class TC6 extends Base{

	@Test
	public static void likedvideos() throws InterruptedException
	{
		// Object Creation and click 'Sign In' button
			LoginPage login = new LoginPage(driver, pr);
			login.SignInButtonClick();
				
		// Input Username and Password
			login.UsernameAndPassworInput("dtjavatraining.2019@gmail.com", "Javatraining@2019");
			String login_expectedurl="https://www.youtube.com/";
	        Assert.assertEquals(driver.getCurrentUrl(), login_expectedurl);
			
		// Click 'Liked Videos' link
			HomePage home = new HomePage(driver, pr);
			home.LikedVideosclick();
			Assert.assertTrue(driver.getCurrentUrl().contains("https://www.youtube.com/playlist"));
			
		
	}
}
