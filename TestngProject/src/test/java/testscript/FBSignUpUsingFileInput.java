package testscript;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import utilities.ScreenShotCapture;

	
public class FBSignUpUsingFileInput 
{

	 FirefoxDriver driver;

	@BeforeMethod
	public  void browseropen()
	{
		System.setProperty("webdriver.gecko.driver","D:\\Automation\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
	}

	@Test (dataProvider ="FacebookInputFile")
	public void webelements (String inputemail, String pass, String user, String fname,String lname, String ph, String newpass) throws InterruptedException, IOException
	{
      // Enter value in email or phone field
		WebElement email =driver.findElement(By.xpath("//input[@id='email']"));
      email.sendKeys(inputemail);
      
      // Enter value in password field
      WebElement password = driver.findElementByXPath("//input[@id='pass']");
      password.sendKeys(pass);
      
      //Enter value in Firstname field
       WebElement firstname = driver.findElementByXPath("//input[@type ='text' and @name='firstname']");
       firstname.sendKeys(fname);
       
       // Enter value in last name field
       WebElement lastname = driver.findElementByXPath("//*[@aria-label='Surname']");
       lastname.sendKeys(lname);
       
       // Enter value in Mobile Number and Email Address field
       WebElement mobile = driver.findElementByXPath("//input[@name='reg_email__']");
       mobile.sendKeys(ph);
       
       // Enter value in New Password field
       WebElement newpassword = driver.findElementByXPath("//*[@* ='new-password']");
       newpassword.sendKeys(newpass);
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
       ScreenShotCapture.takeScreenShot(driver, "D://Automation/FBScreenshot.jpeg");
       Thread.sleep(10000);
       
       // Click Sign Up button
       WebElement submit = driver.findElementByXPath("//button[@name='websubmit']");
       submit.click();
       
	}  
	
	
	@DataProvider (name ="FacebookInputFile")
	public Object [][] FacebookInputfile() throws BiffException, IOException
	{
		File f = new File("../TestngProject/FacebookInputData.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r =ws.getRows();
	System.out.println("No of rows is" + r);
		int c = ws.getColumns();
		System.out.println("No of columns is" + c);
		
		Object [][] ob = new Object[r][c];
		
		for (int i=1; i<r;i++)
		{
			System.out.println("Value of i " + i + " Rows details " + r);
			for (int j=0;j<c;j++)
			{
				System.out.println("Value of j " + j + " Column details " + c);

			 Cell c1 = ws.getCell(j, i);
			 ob[i][j] =  c1.getContents();
			 System.out.println(ob[i][j]);
			}
		}
		return ob;
	}
	
	 public void dropdownselection(int index, WebElement string)
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
