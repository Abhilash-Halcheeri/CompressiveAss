package test;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import helper.HelperClass;
import pages.Base;
import pages.Login;
import pages.aboutPage;

public class Logintest extends Base {


	@Test
	public void test1() throws InterruptedException, IOException
	{
		driver.get(URL);
		Login lg=new Login(driver);
		lg.sign2(Email, PassWord);
		
		Thread.sleep(2000);
		String sr=lg.com();
		System.out.println(sr);
		HelperClass.CaptureScreenshots(driver);
		//rprt.pass("login Successfull");
		log.info("Login Successfully");

	}

}
