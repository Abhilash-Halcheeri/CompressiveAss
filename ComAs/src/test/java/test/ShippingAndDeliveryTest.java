package test;

import java.io.IOException;

import org.testng.annotations.Test;

import helper.HelperClass;
import pages.Base;
import pages.Shipping_Delivery;

public class ShippingAndDeliveryTest extends Base {
	@Test
	public void test() throws InterruptedException, IOException
	{
		driver.get(URL);
		Shipping_Delivery Sd=new Shipping_Delivery(driver);
		Sd.SD();
		HelperClass.CaptureScreenshots(driver);
		
	}

}
