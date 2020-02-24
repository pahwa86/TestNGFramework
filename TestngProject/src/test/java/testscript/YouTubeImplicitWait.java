package testscript;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YouTubeImplicitWait {
	
	static FirefoxDriver driver;
	
	
	@BeforeMethod
	public static void browseropen()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
		 driver = new FirefoxDriver();
		driver.get("https://youtube.com");
		driver.manage().window().maximize();		

	}

	@Test
	public static void implicitwait() throws InterruptedException
	{
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(3, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		// Selection of 'Sign In' button
		WebElement signin = driver.findElement(By.cssSelector("paper-button[aria-label='Sign in']"));
		signin.click();
	
		// Selection and provide value in Email or phone text field
		WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
		email.sendKeys("dtjavatraining.2019@gmail.com");
		
		// Click 'Next' button
		WebElement next = driver.findElement(By.className("CwaK9"));
	//	WebElement next = driver.findElementByClassName("CwaK9");
		next.click();
		
		Thread.sleep(4000);
		// Selection and provide value in password field
	//	WebElement password = driver.findElementByName("password");
		
		WebElement password = driver.findElement(By.cssSelector("input[aria-label='Enter your password']"));
	//	wait.until(ExpectedConditions.elementToBeSelected(password));
		password.sendKeys("Javatraining@2019");
	
		// Click 'Next' button
		WebElement next1 = driver.findElement(By.className("CwaK9"));
		next1.click();
		
		// Check Liked Videos
		WebElement likedvideos = driver.findElementByXPath("//*[text()='Liked videos']");
		likedvideos.click();
		
	}
	
}
