package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotCapture {
	
	public static void takeScreenShot( FirefoxDriver driver, String pathname) throws IOException
	{
	  File f = driver.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f, new File(pathname));
	}

}
