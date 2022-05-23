package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass {
	WebDriver ldriver;
	public LoginClass(WebDriver driver)
	{
	ldriver=driver;
	PageFactory.initElements(driver,this);
	
	
	}
	@FindBy(xpath="//span[@class='header-icon-link user-profile-icon']")
	@CacheLookup
	WebElement sign;

	@FindBy(xpath="//a[contains(text(),'Log In')]")
	@CacheLookup
	WebElement sign2;

	@FindBy(xpath="//div[@id='password-credentials']//input[@id='spree_user_email']")
	@CacheLookup
	WebElement email;

	@FindBy(xpath="//div[@class='password']//input[@class='required input_authentication']")
	@CacheLookup
	WebElement pass;
	@FindBy(xpath="//input[@id='ul_site_login']")
	@CacheLookup
	WebElement login;
	
	public WebElement sign1()
	{
		return sign;
	}
	public WebElement sign2()
	{
		return sign2;
	}
	public WebElement email()
	{
		return email;
	}
	public WebElement password()
	{
		return pass;
	}
	public WebElement loginButton()
	{
		return login;
	}
}
