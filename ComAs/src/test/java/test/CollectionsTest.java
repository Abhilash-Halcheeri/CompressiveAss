package test;

import java.io.IOException;



import org.junit.Assert;
import org.testng.annotations.Test;

import helper.HelperClass;
import pages.Base;
import pages.Collections;

public class CollectionsTest extends Base {
	
	
	
   @Test
	public void Test() throws InterruptedException, IOException
	{
		driver.get(URL);
		Collections cl=new Collections(driver);
		
		cl.Coll();
		log.info("Navigated to Bedroom page");
		HelperClass.CaptureScreenshots(driver);
	}
}
