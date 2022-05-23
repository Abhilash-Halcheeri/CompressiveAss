package test;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import helper.HelperClass;
import pages.Base;
import pages.KidsRoom;

public class Kids extends Base {
	@Test
	public void test() throws InterruptedException, IOException {
		driver.get(URL);
		KidsRoom kds=new KidsRoom(driver);
		kds.button();
	
		String actual=kds.txt();
		System.out.println("actual result :"+ actual);
		String expected= "Kids Bookshelves";
		System.out.println("expected result "+expected);
		Assert.assertEquals(expected, actual);
		log.info("expected result is equal to actual result");
		HelperClass.CaptureScreenshots(driver);
		
	}
	

}
