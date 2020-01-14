package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public static  FirefoxDriver driver;
	public static Properties pr;
	
	@BeforeMethod
	public void browseropen() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https:\\youtube.com");
		driver.manage().window().maximize();
		
		File f = new File("../TestngProject/locator.properties");
		FileInputStream fi = new FileInputStream(f);
		pr = new Properties();
		pr.load(fi);
	}
	
	@AfterMethod
	public static void browserclose() throws InterruptedException
	{
		// Click 'avatar' link
		WebElement avatar = driver.findElementByCssSelector(pr.getProperty("Avatar"));
		avatar.click();
		Thread.sleep(3000);
		
		// Click 'Sign Out'
		WebElement signout = driver.findElementByXPath(pr.getProperty("SignOut"));
		signout.click();
		driver.quit();
	}

}

