package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kids {
	
	public WebDriver ldriver;
	public kids (WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),'Kids Room')]") 
	WebElement button;
	
	@FindBy(xpath="//span[contains(text(),'Kids Bookshelves')] ")
	WebElement  kds;
	@FindBy(xpath="//h1[contains(text(),'kids Bookshelves')]")
	WebElement  txt;
	
	
	public WebElement button() throws InterruptedException
	{
		return button;
		
	}
	public WebElement button2() throws InterruptedException
	{
		return kds;
		
		
	}
		

}
