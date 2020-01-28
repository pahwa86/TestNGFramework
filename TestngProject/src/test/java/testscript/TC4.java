package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.Base;
import pages.HomePage;
import pages.LoginPage;
import pages.VideoPlayPage;

public class TC4 extends Base{
	

	@Test
	public static void playvideoandsubscribe() throws InterruptedException
	{
	
		  // Object Creation and click 'Sign In' button
			LoginPage login = new LoginPage(driver, pr);
			login.SignInButtonClick();
						
		// Input Username and Password
			login.UsernameAndPassworInput("dtjavatraining.2019@gmail.com", "Javatraining@2019");
			String expected_url="https://www.youtube.com/";
	        Assert.assertEquals(driver.getCurrentUrl(), expected_url);
	 /*      
		// Play Video on Home Page
			HomePage home = new HomePage(driver, pr);
			home.PlayVideoHomePage();
		*/
		// Subscribe the  Video played
			VideoPlayPage playvideo = new VideoPlayPage(driver, pr);
			//playvideo.SubscribeVideos();
			
			playvideo.SubscribeAllVideos();
		
	}

}
