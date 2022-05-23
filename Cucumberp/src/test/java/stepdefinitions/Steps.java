package stepdefinitions;



import io.cucumber.java.en.*;
import pages.Collections;
import pages.Living;
import pages.LoginClass;
import pages.ReferAndEarn;
import pages.SearchClass;
import pages.Seating;
import pages.Terms_And_Conditions;
import pages.about;
import pages.kids;
import utilities.Read;
import utilities.Screenshot;

//import java.util.logging.Logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Steps {

	//Logger log=Logger.getLogger("cucumber");
	public Logger log=Logger.getLogger("Steps");
	
	Read rd=new Read();
	WebDriver driver;
	LoginClass lg=new LoginClass(driver);
	SearchClass sr;
	kids kd;
	about ab;
	Collections cl;
	Terms_And_Conditions TC;
	Living lv;
	ReferAndEarn re;
	Seating st;
	//Screenshot sc=new Screenshot();
	//Logger =Logger.getLogger("cucumber");
	
	

	@Given("^User launch the chrome browser$")
	public void user_launch_the_chrome_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver=new ChromeDriver();
		
		System.out.println("Chrome browser started successfully ");
		PropertyConfigurator.configure("Log4j.properties");
		
	//log.debug("Zd");
	}

	@When("^user opens URL \"([^\"]*)\"$")
	public void user_opens_url_something(String strArg1) throws Throwable {
		lg=new LoginClass(driver);
		driver.get(strArg1);
		driver.manage().window().maximize();
		Thread.sleep(2000);

	}
	@Then("^Close the browser$") 
	public void close_the_browser()throws Throwable{
		driver.quit();

	}
	@And("^click on profile$")
	public void click_on_profile() throws Throwable {

		lg.sign1().click();
		Thread.sleep(2000);

	}

	@And("^click on sign in$")
	public void click_on_sign_in() throws Throwable {
		lg.sign2().click();
		Thread.sleep(5000);


	}

	@And("^user enter  Email as\"([^\"]*)\" password as \"([^\"]*)\"$")
	public void user_enter_email_assomething_password_as_something(String strArg1, String strArg2) throws Throwable {
		lg.email().sendKeys(strArg1);
		lg.password().sendKeys(strArg2);
		Thread.sleep(2000);

	}

	@And("^click on signup$")
	public void click_on_signup() throws Throwable {
		lg.loginButton().click();
		Screenshot.Screenshot(driver, "LoginPage");
log.info(" login");
System.out.println("Login Successfully ");
	}


	//---------------------------Search---2------------------------------ ------       

	@And("^Click on the search box and send text as \"([^\"]*)\"$")
	public void click_on_the_search_box_and_send_text_as_something(String strArg1) throws Throwable {
		sr=new SearchClass(driver);
		sr.searchbar().sendKeys(strArg1);
		Thread.sleep(1000);
	}

	@And("^click on search button$")
	public void click_on_search_button() throws Throwable {
		sr.button().click();
		Thread.sleep(3000);
		Screenshot.Screenshot(driver, "searchPage");
	}
	@And("^close the button$")
	public void close_the_button() throws Throwable {

		sr.button2().click();
		System.out.println("Searched items");
	}
	@Then("^close the browsers$")
	public void close_the_browsers() throws Throwable {
		driver.close();

	} 

	//-----------------------------------    

	//@And("^navigate back to the page$")
	//public void navigate_back_to_the_page() throws Throwable {
	//driver.navigate().back();
	//





	@Then("^close the browser4$")
	public void close_the_browser4() throws Throwable {
		driver.close();
	}

	//--------------------------kids----3----------------   
	@And("^click on kids option$")
	public void click_on_kids_option() throws Throwable {
		kd=new kids(driver);
		kd.button().click();
		Thread.sleep(2000);
		

	}

	@And("^click on option$")
	public void click_on_option() throws Throwable {
		kd.button2().click();
		Thread.sleep(2000);
		Screenshot.Screenshot(driver, "Kids Page");
		System.out.println("navigated to kids page ");
	}
	// -----------aboutpage------4-----

	@And("^click on the about option$")
	public void click_on_the_about_option() throws Throwable {
		ab=new about(driver);

		ab.aboutpage().click();
		Screenshot.Screenshot(driver, "about Page");
		Thread.sleep(2000);
		System.out.println("Successfully navigated to about page");

	}
	//--------------------------5-----------------------
	//COLLECTIONS */


	@And("^click on collection option $")
	public void click_on_collection_option() throws Throwable {
		cl=new Collections(driver);
		cl.coll1().click();
		Thread.sleep(2000);

	}

	@And("^ click on bedroom option$")
	public void click_on_bedroom_option() throws Throwable {
		cl.bdrm().click();
		Screenshot.Screenshot(driver, "Bedroom page");
		System.out.println("navigated to Bedroom page");

	}



	@Then("^close the browser5$")
	public void close_the_browser5() throws Throwable {
		driver.close();
	}
	//--------------------tc----6-------
	@And("^click on the TandC option$")
	public void click_on_the_tandc_option() throws Throwable {
		TC=new Terms_And_Conditions(driver);
		TC.TC().click();
		Screenshot.Screenshot(driver, "terms and conditions Page");
		System.out.println("This is Terms and conditions  page");
	}

	//---------- living---------------------7---------------

	@And("^click on the living option$")
	public void click_on_the_living_option() throws Throwable {
		lv=new Living(driver);
		lv.button().click();
		Thread.sleep(2000);

	}

	@And("^click on Wooden Sofa Set$")
	public void click_on_wooden_sofa_set() throws Throwable {
		lv.Wooden().click();
		Screenshot.Screenshot(driver, "wooden sofa Page");
		System.out.println("This is Wooden sofa Page");
	}

	//-------------------RE  -----------------8------------------

	@And("^click on the Refer and Earn option$")
	public void click_on_the_refer_and_earn_option() throws Throwable {
		re=new ReferAndEarn(driver);
		re.Refer().click();
		Screenshot.Screenshot(driver, "Refer and Earn Page");
	System.out.println("this is Refer and Earn page");
	}
	//-------------------------seating----9---
	
	  @And("^click on the Seating  option$")
	    public void click_on_the_seating_option() throws Throwable {
		  st=new Seating(driver);
		  st.seating().click();
		  
	       
	    }





}

