package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchClass {
	
	WebDriver ldriver;
	public SearchClass(WebDriver driver)
	{
	ldriver=driver;
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//input[@id='search']")
	@CacheLookup
	WebElement search;
	
	@FindBy(xpath="//button[@id='search_button']")
	WebElement button;
	@FindBy(xpath="//a[@class='close-reveal-modal hide-mobile']")
	WebElement closebutton;
	//a[@class='close-reveal-modal hide-mobile']
	public WebElement searchbar()
	{
		return search;
	}
	public WebElement button()
	{
		return button;
	}
	public WebElement button2()
	
	{
		return closebutton;
	}

}
