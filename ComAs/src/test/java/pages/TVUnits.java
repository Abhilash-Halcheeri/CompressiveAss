package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TVUnits extends Base {
	
	
public WebDriver ldriver;
	public TVUnits(WebDriver driver)
	{
		ldriver=driver;
		PageFactory.initElements(driver, this);
		Logg=report.createTest("TVUnits page");
	}
	
	@FindBy(xpath="//li[@class='topnav_item topdealsunit']") 
	WebElement Key;
	
	@FindBy(xpath="//li[@class='subnav_item 15183']")
	WebElement Key2; 
	@FindBy(xpath="//h1[contains(text(),'TV Units')]")
	WebElement txt;
	
	
	public void BR() throws InterruptedException
	{
		Key.click();
		System.out.println(Key.getText());
		Thread.sleep(2000);
		Logg.info("Succussfully Clicked on TV Unit Option");
		Key2.click();
		System.out.println(Key2.getText());
		Logg.pass("navigated to TV Unit Page");
	}
	//public void BR2()
	//{
		
		
	//}
	public String txt()
	{
		//System.out.println(txt.getText());
		return txt.getText();
	}

}
