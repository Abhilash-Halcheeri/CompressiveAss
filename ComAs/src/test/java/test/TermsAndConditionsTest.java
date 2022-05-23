package test;

import java.io.IOException;

import helper.HelperClass;
import pages.Base;
import pages.Terms_And_Conditions;

public class TermsAndConditionsTest extends Base {
	
	public void test() throws InterruptedException, IOException
	{
		driver.get(URL);
		Terms_And_Conditions tc=new Terms_And_Conditions(driver);
		tc.TC();
		log.info("Navigated to Terms and conditions page");
		HelperClass.CaptureScreenshots(driver);
	}

}
