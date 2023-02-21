package steps;


import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase {
	
	LoginPage  loginPage;
	
	@Before
    public void init() {
    	initDriver();
    	loginPage = PageFactory.initElements(driver, LoginPage.class);
    	
    }
	@Given("^Set SkyBlue Background button exists$")
	public void set_SkyBlue_Background_button_exists() {
	   
	}

	@When("^I click on the button$")
	public void i_click_on_the_button() {
		loginPage.clickSkyBlueButton();
	   
	}

	@Then("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue()  {
		loginPage.validateSkyblueBackgroundColor();
	   
	}
	
	@Given("Set SkyWhite Background button exists")
	public void set_SkyWhite_Background_button_exists() {
	   
	}

	@When("I click on the white button")
	public void i_click_on_the_white_button() {
		loginPage.clickWhiteBackgroundButton();
	   
	}

	@Then("the background color will change to white")
	public void the_background_color_will_change_to_white() {
		loginPage.validateWhiteBackgroundColor();
	    
	}


	@After
	public void tearDown() {
		driver.close();
		driver.quit();
		
	}

}
