package org.stepdefinition;
//Code for scenario outline in fblogin.feature

import org.bas.BaseClass;
import org.bas.FBLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbloginscenariooutline extends BaseClass{
	
	FBLoginPojo f;
	@Given("User has to launch the chrome browser and maximize the window")
	public void user_has_to_launch_the_chrome_browser_and_maximize_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("User has to launch the url of facebook application")
	public void user_has_to_launch_the_url_of_facebook_application() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("User has to pass data {string} in email field")
	public void user_has_to_pass_data_in_email_field(String em) {
	    f = new FBLoginPojo();
	    passText(em, f.getEmail());
	}

	@When("User has to pass data {string} in password field")
	public void user_has_to_pass_data_in_password_field(String pass) {
	    f = new FBLoginPojo();
	    passText(pass, f.getPassword());
	}

	@When("User has to click the login button")
	public void user_has_to_click_the_login_button() {
	    f = new FBLoginPojo();
	    clickBtn(f.getLoginBtn());
	}

	@Then("User has to close the browser")
	public void user_has_to_close_the_browser() {
	    closeEntireBrowser();
	}


}
