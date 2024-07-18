package org.stepdefinition;

import org.bas.BaseClass;
import org.bas.GenericLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GenericScenarioOutline extends BaseClass {
	
	GenericLoginPojo g;
	
	@Given("user has to launch the chrome browser and maximize the window")
	public void user_has_to_launch_the_chrome_browser_and_maximize_the_window() {
	    launchBrowser();
	    windowMaximize();
	}

	@When("user has to launch the url of generic web application")
	public void user_has_to_launch_the_url_of_generic_web_application() {
		launchUrl("https://www.bharatgeneric.com/Login");
	}

	@When("user has to enter the data {string} in email field")
	public void user_has_to_enter_the_data_in_email_field(String mail) {
		g = new GenericLoginPojo();
		passText(mail, g.getEmail());
	}

	@When("user has to enter the data {string}in password field")
	public void user_has_to_enter_the_data_in_password_field(String paswrd) {
		g = new GenericLoginPojo();
		passText(paswrd, g.getPassword());		
	}

	@When("click the login button")
	public void click_the_login_button() {
		g = new GenericLoginPojo();
		clickBtn(g.getLoginbtn());
	}

	@Then("browser need to be closed")
	public void browser_need_to_be_closed() {
		closeEntireBrowser();
	}

	
	}
