package org.bas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GenericLoginPojo extends BaseClass {

	public GenericLoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "input-text")
	private WebElement email;
	
	@FindBy(xpath = "(//input[@class='login-user-input-password login-user-input'])[5]")
	private WebElement passwrd;

	@FindBy(xpath = "//input[@value='Login']")
	private WebElement loginbtn;

		
	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return passwrd;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	
}
