package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Living{
	
	
	public WebDriver ldriver;
	public Living (WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//div//li[@class='topnav_item livingunit']") 
	WebElement button;
	
	@FindBy(xpath="//li[@class='subnav_item 1543'] ")
	WebElement  Wooden;
	//@FindBy(xpath="//h1[contains(text(),'Sofas')]")
	//WebElement pr;
	
	
	public WebElement button() throws InterruptedException
	{
		return button;
		
	}
	public WebElement Wooden()
	{
		return Wooden;
	}

	}
	
	

