package test;

import java.io.IOException;

import org.testng.annotations.Test;

import helper.HelperClass;
import pages.Base;
import pages.TVUnits;

public class TvUnitTest extends Base {
	
	
@Test
	public void Test() throws InterruptedException, IOException
	{
		driver.get(URL);
		TVUnits bd=new TVUnits(driver);
	
		bd.BR();
		String name=bd.txt();
		System.out.println("top deal Product name is :"+name);
		HelperClass.CaptureScreenshots(driver);
		
	}

}
