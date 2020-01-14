package testpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
	
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
	public static void trending() throws InterruptedException
	{
		// Selection of 'Sign In' button
		WebElement signin = driver.findElement(By.cssSelector("paper-button[aria-label='Sign in']"));
		signin.click();
		
		// Selection and provide value in Email or phone text field
		WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
		email.sendKeys("dtjavatraining.2019@gmail.com");
		Thread.sleep(3000);
		
		// Click 'Next' button
		WebElement next = driver.findElementByClassName("CwaK9");
		next.click();
		Thread.sleep(3000);

		
		// Selection and provide value in password field
		WebElement password = driver.findElementByName("password");
		password.sendKeys("Javatraining@2019");
		Thread.sleep(3000);

		
		// Click 'Next' button
		WebElement next1 = driver.findElementByClassName("CwaK9");
		next1.click();
		Thread.sleep(5000);
		
		// Click 'Trending' link
		WebElement trending = driver.findElementByXPath("//*[text() ='Trending']");
		trending.click();
		Thread.sleep(3000);
		
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
