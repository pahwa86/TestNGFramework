package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {
	
	public static void dropdownbyvalue(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public static void dropdownbyindex (WebElement element, int index)
	{
		Select s= new Select(element);
		s.selectByIndex(index);
	}

	public static void dropdownbytext(WebElement element, String text) 
	{
	   Select s2 = new Select(element);
	   s2.selectByVisibleText(text);  
	}
}
