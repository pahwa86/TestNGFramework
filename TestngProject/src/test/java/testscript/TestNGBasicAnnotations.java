package testpackage;

import org.testng.annotations.*;

public class TestNGBasicAnnotations {
	
	@BeforeSuite
	public void befores()
	{
		System.out.println("Before Suite");
	}
	
	@BeforeClass
	public void beforec()
	{
		System.out.println("Before Class");
	}

	@Test
	public void beforet()
	{
		System.out.println("Test");
		
	}
	@AfterSuite
	public void afters()
	{
		System.out.println("After Suite");
	}

	@AfterClass
	public void Afterc()
	{
		System.out.println("After Class");
	}
	
	@BeforeMethod
	public void Beforem()
	{
		System.out.println("Before Method");
	}

	@AfterMethod
	public void Afterm()
	{
		System.out.println("After Method");
	}

}
