package pages;

import java.util.List;
import java.util.Properties;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VideoPlayPage {
	
    FirefoxDriver driver;
    Properties pr;
    int count = 0;
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
	
	public void SubscribeVideos() throws InterruptedException 
	{
		// Subscribe the video played
		WebElement subscribe = driver.findElementByXPath(pr.getProperty("Subscribe"));
		String text = subscribe.getText();
		System.out.println("*******" + "Text found is " + text + "************");
		Thread.sleep(10000);	
		if (text.equals("SUBSCRIBE"))
		{
			System.out.println("Please Subscribe the Video");
			subscribe.click();
		}
		else
		{
			System.out.println("This video is alreay subscribed. Please unsubscribe then subscribe again");
		    subscribe.click();
			WebElement unsubscribe = driver.findElementByXPath(pr.getProperty("UnSubscribeButton"));
			unsubscribe.click();
		    subscribe.click();
		}
	}
	
	public void SubscribeAllVideos() throws InterruptedException
	{
	   List<WebElement> wb = driver.findElementsByXPath(pr.getProperty("VideoPlay"));   
	   for (WebElement element : wb)
	   {  
		   Thread.sleep(4000);
		   element.click();
		   Thread.sleep(5000);
		    WebElement subscribe = driver.findElementByXPath(pr.getProperty("Subscribe"));
			String text = subscribe.getText();
			System.out.println("*******" + "Text found is " + text + "************");
		   if (text.equalsIgnoreCase("Subscribed"))
		   {
			   System.out.println("Video is already Subscribed");
			   driver.navigate().back();  
		   }
		   else
		   {
			   System.out.println("Please subscribe the video");
			   subscribe.click();
			   break;
		   }
	   }
	}
	
}
