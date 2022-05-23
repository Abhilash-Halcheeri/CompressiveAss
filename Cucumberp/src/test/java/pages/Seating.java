package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seating {
	
	public WebDriver ldriver;
	public Seating  (WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver,this);
	
	}
	
	@FindBy(xpath="//a[@class='category']/h4[contains(text(),'Seating')]") 
	WebElement seating;

	public WebElement seating() 
	{
		return seating;
		
					
	}

}
