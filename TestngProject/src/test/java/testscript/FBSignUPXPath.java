package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	
public class FBSignUPXPath 
{

	static FirefoxDriver driver;
	
	@BeforeMethod
	public static void browseropen()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public static void webelements () throws InterruptedException
	{
      // Enter value in email or phone field
		WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
      email.sendKeys("email@email.com");
      
      // Enter value in password field
      WebElement password = driver.findElementByXPath("//input[@id='pass']");
      password.sendKeys("password");
      
      //Enter value in Firstname field
       WebElement firstname = driver.findElementByXPath("//input[@type ='text' and @name='firstname']");
       firstname.sendKeys("first name");
       
       // Enter value in last name field
       WebElement lastname = driver.findElementByXPath("//*[@aria-label='Surname']");
       lastname.sendKeys("last name of user");
       
       // Enter value in Mobile Number and Email Address field
       WebElement mobile = driver.findElementByXPath("//input[@name='reg_email__']");
       mobile.sendKeys("9875649874");
       
       // Enter value in New Password field
       WebElement newpass = driver.findElementByXPath("//*[@* ='new-password']");
       newpass.sendKeys("password");
       Thread.sleep(5000);
       
       // Select Day value from drop down list
       WebElement day = driver.findElementByXPath("//select[@id='day']");
       dropdownselection(1, day);
       Thread.sleep(5000);

       
       // Select Month value from drop down list
       WebElement month = driver.findElementByXPath("//select[contains(@id,'month')]");
       dropdownselection(10, month);
       Thread.sleep(5000);

       
       // Select year value from drop down list
       WebElement year = driver.findElementByXPath("//select[@id='year']");
       dropdownselection(40, year);
       Thread.sleep(5000);

       
       // Select gender radio button
       WebElement gender = driver.findElementByXPath("//input[@type='radio' and @value='-1']");
       gender.click();
       
       // Click Sign Up button
       WebElement submit = driver.findElementByXPath("//button[@name='websubmit']");
       submit.click();
       
	}  
	
	 public static void dropdownselection(int index, WebElement string)
	 {
		Select s = new Select(string);
		s.selectByIndex(index);
	 }
	
	
      @AfterMethod
      public void browserclose()
      {
    	  driver.quit();
      }
      	
}
