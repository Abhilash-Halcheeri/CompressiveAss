package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReferAndEarn {
	
	
	public WebDriver ldriver;
	public ReferAndEarn(WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
		
		@FindBy(xpath="//div[@class='col-md-2 links no-padding']//li[@class='footer-link-font']")
		@CacheLookup
		 WebElement RU;

		public WebElement Refer()
		{
			return RU;
		}

}
