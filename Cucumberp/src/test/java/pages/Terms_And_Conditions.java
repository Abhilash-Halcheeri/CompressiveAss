package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Terms_And_Conditions  {
	
	
	public WebDriver ldriver;
	public Terms_And_Conditions (WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver,this);
		//Logg=report.createTest("Terms_And_Conditions");
	}
	
	@FindBy(xpath="//div[@class='col-md-4 links']//li//a[contains(text(),'Terms and Conditions')]") 
	WebElement TNC;

	public WebElement TC() 
	{
		return TNC;
		
		
		
		
	}
}

