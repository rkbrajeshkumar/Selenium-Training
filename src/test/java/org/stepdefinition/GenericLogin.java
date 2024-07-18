package org.stepdefinition;

import org.bas.BaseClass;
import org.bas.GenericLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenericLogin extends BaseClass {
	
	GenericLoginPojo g;
	
	@Given("launch the chrome browser and maximize window")
	public void launch_the_chrome_browser_and_maximize_window() {
	  launchBrowser();
	  windowMaximize();
	}

	@When("launch the url of the bharat generic application")
	public void launch_the_url_of_the_bharat_generic_application() {
	    launchUrl("https://www.bharatgeneric.com/Login");
	}

	@When("provide the valid username in the email field")
	public void provide_the_valid_username_in_the_email_field() {
		g = new GenericLoginPojo();
	    passText("rkbrajeshkumar", g.getEmail());
	}

	@When("provide the invalid password in the password field")
	public void provide_the_invalid_password_in_the_password_field() {
		g = new GenericLoginPojo();
		passText("abc@12345", g.getPassword());
	}

	@When("to click the login button")
	public void to_click_the_login_button() {
		g = new GenericLoginPojo();
		clickBtn(g.getLoginbtn());
	}

	@When("Check whether it has navigate to home page or not")
	public void check_whether_it_has_navigate_to_home_page_or_not() {
		System.out.println("CHECK YOUR LOGIN CREDENTIAL");
	}

	@Then("close the browser")
	public void close_the_browser() {
		closeEntireBrowser();
	}
	
	

}
