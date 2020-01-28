package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;
import pages.HomePage;
import pages.LoginPage;
import pages.VideoPlayPage;

public class TC3 extends Base{

	@Test
	public static void playvideoandlike() throws InterruptedException
	{
		
		// Object Creation and click 'Sign In' button
			LoginPage login = new LoginPage(driver, pr);
			login.SignInButtonClick();
				
		// Input Username and Password
			login.UsernameAndPassworInput("dtjavatraining.2019@gmail.com", "Javatraining@2019");
			String login_expectedurl="https://www.youtube.com/";
	        Assert.assertEquals(driver.getCurrentUrl(), login_expectedurl);
	        
		// Play Video on Home Page
			HomePage home = new HomePage(driver, pr);
			home.PlayVideoHomePage();
			
		// Like the played Videos
			VideoPlayPage like = new VideoPlayPage(driver, pr);
			like.LikeVideos();	
	}
}
