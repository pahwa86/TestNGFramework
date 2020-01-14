package pages;

import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VideoPlayPage {
	
    FirefoxDriver driver;
    Properties pr;
	
    public VideoPlayPage (FirefoxDriver driver, Properties prop)
	{
		
		this.driver = driver;
		this.pr=prop;
	}

	public void LikeVideos()
	{
	
		// Like Video played
		WebElement like = driver.findElementByXPath(pr.getProperty("LikeVideos"));
		like.click();
	}
	
	public void SubscribeVideos()
	{
		// Subscribe the video played
		WebElement subscribe = driver.findElementByXPath(pr.getProperty("//*[@class='style-scope ytd-subscribe-button-renderer' and @role='button']"));
		subscribe.click();
		
	}
}
