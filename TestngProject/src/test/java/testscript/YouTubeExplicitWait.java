package testscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class YouTubeExplicitWait {
static FirefoxDriver driver;
static WebDriver driver1;
	
	
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
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver1, 15);	
		
		 // Selection of 'Sign In' button
		WebElement signin = driver.findElement(By.cssSelector("paper-button[aria-label='Sign in']"));
		wait.until(ExpectedConditions.elementToBeClickable(signin));
		signin.click();
	
		
		// Selection and provide value in Email or phone text field
		WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
		email.sendKeys("dtjavatraining.2019@gmail.com");
		
		// Click 'Next' button
		WebElement next = driver.findElementByClassName("CwaK9");
		wait.until(ExpectedConditions.elementToBeClickable(next));
		next.click();
		
		// Selection and provide value in password field
		WebElement password = driver.findElementByCssSelector("input[aria-label='Enter your password']");
		wait.until(ExpectedConditions.elementToBeSelected(password));
		password.sendKeys("Javatraining@2019");

		
		// Click 'Next' button
		WebElement next1 = driver.findElementByClassName("CwaK9");
		wait.until(ExpectedConditions.elementToBeClickable(next1));
		next1.click();
		
		// Click 'Trending' link
		WebElement trending = driver.findElementByXPath("//*[text() ='Trending']");
		wait.until(ExpectedConditions.textToBePresentInElement(trending, "Trending"));
		trending.click();
				
		// Check Liked Videos
	//	WebElement likedvideos = driver.findElementByXPath("//*[text()='Liked videos']");
		//likedvideos.click();
		
	}
	@AfterMethod
	public static void browserclose() throws InterruptedException
	{
		// Click 'avatar' link
		WebElement avatar = driver.findElementByCssSelector("button#avatar-btn");
		avatar.click();
		Thread.sleep(3000);
		
		WebElement signout = driver.findElementByXPath("//*[text()='Sign out']");
		signout.click();
		
		driver.quit();
	}
}
