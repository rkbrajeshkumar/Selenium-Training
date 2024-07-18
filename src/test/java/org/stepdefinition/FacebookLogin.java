package org.stepdefinition;
//Code for scenario in fblogin.feature

import org.bas.BaseClass;
import org.bas.FBLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLogin extends BaseClass{
	
	FBLoginPojo f;
	
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("To launch the url of facebook application")
	public void to_launch_the_url_of_facebook_application() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("To pass valid username in email field")
	public void to_pass_valid_username_in_email_field() {
	    f = new FBLoginPojo();
	    passText("rkbrajeshkumar", f.getEmail());
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field() {
	    f = new FBLoginPojo();
	    passText("12345", f.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
	    f = new FBLoginPojo();
	    clickBtn(f.getLoginBtn());
	}

	@When("To check whether navigate to home page or not")
	public void to_check_whether_navigate_to_home_page_or_not() {
	    System.out.println("Check your login Credential");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	    //closeEntireBrowser();
	}



}
