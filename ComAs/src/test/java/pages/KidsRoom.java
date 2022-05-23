package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KidsRoom extends Base {
	
	public WebDriver ldriver;
	public KidsRoom (WebDriver driver) {
		ldriver=driver;
		PageFactory.initElements(driver,this);
		Logg=report.createTest("KidsRoom");
	}
	
	@FindBy(xpath="//span[contains(text(),'Kids Room')]") 
	WebElement button;
	
	@FindBy(xpath="//span[contains(text(),'Kids Bookshelves')] ")
	WebElement  kds;
	@FindBy(xpath="//h1[contains(text(),'kids Bookshelves')]")
	WebElement  txt;
	
	
	public void button() throws InterruptedException
	{
		button.click();
		Logg.info("clicked on kidsRoom option");
		Thread.sleep(2000);
		kds.click();
		Thread.sleep(2000);
		Logg.pass("Navigated to kidsRoom Page");
	}
	public String txt()
	{
	return txt.getText();
	
	
	
	}


}
