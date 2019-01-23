package org.cucumber.stepdefinition;

import org.cucumber.baseclass.BaseClass;
import org.cucumber.pom.CreateAccount;
import org.cucumber.pom.Homepage;
import org.cucumber.pom.Register;
import org.cucumber.runner.TestRunner;
import org.openqa.selenium.WebDriver;

import com.fasterxml.jackson.databind.deser.ValueInstantiator.Gettable;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass {

	public WebDriver driver = TestRunner.driver;
	public static Register register;
	
	@Given("^User hit the Automation Practise Application$")
	public void user_hit_the_Automation_Practise_Application() throws Throwable {
		getUrl("http://automationpractice.com/index.php");

	}

	@Given("^User wait for page load$")
	public void user_wait_for_page_load() throws Throwable {
		Thread.sleep(5000);
	}

	@When("^User click sign in button in the header$")
	public void user_click_sign_in_button_in_the_header() throws Throwable {
		Homepage hp = new Homepage(driver);
		clicktext(hp.getsignin());
	}

	@When("^User enter the email address$")
	public void user_enter_the_email_address() throws Throwable {
		CreateAccount c = new CreateAccount(driver);
		sendText(c.getemailid(), "ak@gmailj.com");
	}



@When("^User click on create account button$")
public void user_click_on_create_account_button() throws Throwable {
 CreateAccount c= new CreateAccount(driver);
 clicktext(c.tocreate());

}

@Then("^User validate the user email id$")
public void user_validate_the_user_email_id() throws Throwable {
  Thread.sleep(5000);
  }

@Given("^User click on mr button$")
public void user_click_on_mr_button() throws Throwable {
    clicktext(register.getMr());
    
}

@Given("^User enter first name$")
public void user_enter_first_name() throws Throwable {
    sendText(register.getcustomername(), "abc");
    
}

@Given("^User enter last name$")
public void user_enter_last_name() throws Throwable {
    sendText(register.getcustomerlastname(), "");
    
}

@Given("^User enter the password$")
public void user_enter_the_password() throws Throwable {
    
    
}

@Given("^User Dropdown and click on days by value$")
public void user_Dropdown_and_click_on_days_by_value() throws Throwable {
    
    
}

@Given("^user Dropdown and click on months by value$")
public void user_Dropdown_and_click_on_months_by_value() throws Throwable {
    
    
}

@Given("^user Dropdown and click on years by value$")
public void user_Dropdown_and_click_on_years_by_value() throws Throwable {
    
    
}

@Given("^user click on newsletter to suscribe button$")
public void user_click_on_newsletter_to_suscribe_button() throws Throwable {
    
    
}

@Given("^user enter the first name$")
public void user_enter_the_first_name() throws Throwable {
    
    
}

@Given("^user enter the last name$")
public void user_enter_the_last_name() throws Throwable {
    
    
}

@Given("^user enter the Company name$")
public void user_enter_the_Company_name() throws Throwable {
    
    
}

@Given("^user enter the first Address$")
public void user_enter_the_first_Address() throws Throwable {
    
    
}

@Given("^user enter the Second Address$")
public void user_enter_the_Second_Address() throws Throwable {
    
    
}

@Given("^user enter the city$")
public void user_enter_the_city() throws Throwable {
    
    
}

@Given("^user enter the postcode number$")
public void user_enter_the_postcode_number() throws Throwable {
    
    
}

@Given("^user Dropdown and click state by value$")
public void user_Dropdown_and_click_state_by_value() throws Throwable {
    
    
}

@Given("^user enter the country$")
public void user_enter_the_country() throws Throwable {
    
    
}

@Given("^user enter the Additional information$")
public void user_enter_the_Additional_information() throws Throwable {
    
    
}

@Given("^user enter the home phone number$")
public void user_enter_the_home_phone_number() throws Throwable {
    
    
}

@Given("^user enter the mobile number$")
public void user_enter_the_mobile_number() throws Throwable {
    
    
}

@Given("^user enter the reference email address$")
public void user_enter_the_reference_email_address() throws Throwable {
    
    
}

@Given("^User click register button to complete register$")
public void user_click_register_button_to_complete_register() throws Throwable {
    
    
}

@Then("^user valid and register$")
public void user_valid_and_register() throws Throwable {
Thread.sleep(5000);
}

@When("^User enter the email address \"([^\"]*)\"$")
public void user_enter_the_email_address(String value) throws Throwable {
   CreateAccount ca = new CreateAccount(driver);
   sendText(ca.getemailid(), value);
   
   
}

@When("^User enter the password \"([^\"]*)\"$")
public void user_enter_the_password(String arg1) throws Throwable {
   
}



}
