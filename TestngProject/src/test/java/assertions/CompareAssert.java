package assertions;

public class CompareAssert {
	
	public static void stringcompare(String actualresult, String expectedresult) 
	{
	 if (actualresult.equals(expectedresult))
	 {
		 System.out.println("Assertion Passed");
	 }
	 else
		 System.out.println("Assertion Failed");
	}

	public static void intcompare (int actualnumber, int expectednumber)
	{
		if (actualnumber == expectednumber)
		{
			System.out.println("Number matched");
		}
		else
		{
			System.out.println("Number does not matched");
		}
	}
}
