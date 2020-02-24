package testscript;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NewTest {

@BeforeSuite
	public void befores()
	{
		System.out.println("Before new test Suite");
	}
	
	@Test
	public void beforet()
	{
		System.out.println("new test Test");
		
	}
	@AfterSuite
	public void afters()
	{
		System.out.println("After new test Suite");
	}

	@AfterClass
	public void Afterc()
	{
		System.out.println("After new test Class");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void Beforem()
	{
		System.out.println("Before new test Method");
	}

	@AfterMethod
	public void Afterm()
	{
		System.out.println("After new test Method");
	}

}
