package utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogCapture {
	
	public static void takelog(String classname,String message)
	{
		DOMConfigurator.configure("../TestngProject/layout.xml");
		Logger l = Logger.getLogger(classname);
		l.info(message);
		
	}

}
