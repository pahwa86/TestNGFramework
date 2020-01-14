package pages;

import java.util.List;
import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	
	FirefoxDriver driver;
	Properties pr;
	public HomePage (FirefoxDriver driver, Properties prop)
	{
	this.driver = driver;
	this.pr=prop;
	}
		
	
	public void trendingclick() throws InterruptedException
	{
		// Click 'Trending' link
		WebElement Trending = driver.findElementByXPath(pr.getProperty("Trending"));
		Trending.click();
		Thread.sleep(3000);
	}
	
	public void Subscriptionsclick() throws InterruptedException
	{
		// Click 'Subscriptions' link
		WebElement Subscriptions = driver.findElementByXPath(pr.getProperty("Subscriptions"));
		Subscriptions.click();
		Thread.sleep(3000);	
	}
	
	public void Historyclick() throws InterruptedException
	{
		// Click 'History' link
		WebElement history = driver.findElementByXPath(pr.getProperty("History"));
		history.click();
		Thread.sleep(3000);
    }
	
	public void LikedVideosclick() throws InterruptedException
	{
			// Check Liked Videos
			WebElement likedvideos = driver.findElementByXPath(pr.getProperty("ViewLikedVideos"));
			likedvideos.click();
			Thread.sleep(3000);
	}
	
	public void PlayVideoHomePage() throws InterruptedException
	{
	// Play 1st video
		List <WebElement> videoplay = driver.findElementsByXPath(pr.getProperty("VideoPlay"));
		videoplay.get(0).click();
		Thread.sleep(3000);
	}
}
