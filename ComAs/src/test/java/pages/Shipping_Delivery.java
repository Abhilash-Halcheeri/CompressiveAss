package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Delivery extends Base {
	
	public WebDriver ldriver;
	public Shipping_Delivery (WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver,this);
		Logg=report.createTest("ShippingAndDelivery");
	}
	
	@FindBy(xpath="//a[text()='Shipping & Delivery']") 
	WebElement SD;

	public void SD() throws InterruptedException
	{
		SD.click();
		Logg.info("Clicked on Shipping And Delivery option");
		
		Thread.sleep(2000);
		Logg.pass("Navigated to Shipping And Delivery Page");
	}
}
