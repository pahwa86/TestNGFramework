package trigger;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Runner {
	
	@Test
	public static void createtestng () throws BiffException, IOException {
		
		XmlSuite xs= new XmlSuite();
		xs.setName("Suite");
			
		XmlTest xt = new XmlTest(xs);
	    File f = new File("../TestngProject/InputTestExecution.xls");
		Workbook wk = Workbook.getWorkbook(f);
		
		Sheet ws = wk.getSheet(0);
		int rows = ws.getRows();
		
		ArrayList<XmlClass> al = new ArrayList<XmlClass>();
		for (int i=1; i<rows; i++)
		{
			Cell c = ws.getCell(4,i);
			if (c.getContents().equalsIgnoreCase("Y"))
					{
				       Cell pkg = ws.getCell(2,i);
				       Cell classname = ws.getCell(3, i);
				       String pkg_classname =pkg.getContents() + "." + classname.getContents();
				       XmlClass xc = new XmlClass(pkg_classname);
				       al.add(xc);
					}
		}
		System.out.println(al.size());
		xt.setClasses(al);
		
		ArrayList<XmlTest> al2 = new ArrayList<XmlTest>();
		al2.add(xt);
		
		xs.setTests(al2);

		ArrayList<XmlSuite> al3 = new ArrayList<XmlSuite>();
		al3.add(xs);
		
		TestNG t = new TestNG();
		t.setXmlSuites(al3);
		t.run();
	}

}
