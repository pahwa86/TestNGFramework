package testscript;

import org.testng.annotations.*;

public class TestNGBasicAnnotations {

	
	@BeforeSuite
	public void befores()
	{
		System.out.println("Before test script Suite");
	}
	
	@BeforeClass
	public void beforec()
	{
		System.out.println("Before test script Class");
	}

	@Test
	public void beforet()
	{
		System.out.println("test script Test");
		
	}
	@AfterSuite
	public void afters()
	{
		System.out.println("After test script Suite");
	}

	@AfterClass
	public void Afterc()
	{
		System.out.println("After test script Class");
	}
	
	@BeforeMethod
	public void Beforem()
	{
		System.out.println("Before test script Method");
	}

	@AfterMethod
	public void Afterm()
	{
		System.out.println("After test script Method");
	}

}
