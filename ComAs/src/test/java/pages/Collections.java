package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Collections extends Base {

	public WebDriver Ldriver;
	public Collections(WebDriver driver)
	{
		Ldriver=driver;
		
		PageFactory.initElements(driver,this);
		Logg=report.createTest("Booking Page");
	}
	
	@FindBy(xpath="//span[contains(text(),'Collections')]")
	WebElement Coll;
	
	@FindBy(xpath="//li[@class='subnav_item 1349']")
	WebElement Bedroom;
	
	
	public void Coll() throws InterruptedException
	{
		Coll.click();
		Thread.sleep(2000);
		Logg.info("Clicked on Collection option");
		Bedroom.click();
		Logg.info("Successfully navigated to Bedroom page");
		
	}
}
