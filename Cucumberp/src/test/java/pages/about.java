package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class about {
	
	public WebDriver ldriver;
	public about(WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
		
		@FindBy(xpath="//ul[@class='col-md-6 no-padding bodytext']")
		@CacheLookup
		 WebElement about;

		public WebElement aboutpage()
		{
			return about;
		}
}
