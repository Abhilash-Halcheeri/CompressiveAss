package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Collections {

	public WebDriver Ldriver;
	public Collections(WebDriver driver)
	{
		Ldriver=driver;
		
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Collections')]")
	WebElement Coll;
	
	@FindBy(xpath="//li[@class='subnav_item 1349']")
	WebElement Bedroom;
	
	
	public WebElement coll1() 
	{
		return Coll;
		
}
	public WebElement bdrm() 
	{
		return Bedroom;
		
}}
	

