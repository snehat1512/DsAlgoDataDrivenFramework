package com.Ds_Algo_Portal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_in_page {

	WebDriver driver = null;

	public Sign_in_page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "alert-primary")
	WebElement alert_primary;

	public String alert_primary_msg() {
		return alert_primary.getText();

	}

	@FindBy(id = "id_username")
	WebElement userName;

	public void setUserName(String userNameInput) {
		userName.sendKeys(userNameInput);
	}

	public String userNameValidationMsg() {
		return userName.getAttribute("validationMessage");
	}

	@FindBy(id = "id_password")
	WebElement password;

	public void setPassword(String passwordInput) {
		password.sendKeys(passwordInput);
	}

	public String passwordValidationMsg() {
		return password.getAttribute("validationMessage");

	}

	@FindBy(xpath = "//input[@value = 'Login']")
	WebElement loginButton;

	public void clickLoginButton() {
		loginButton.click();
	}

	@FindBy(xpath = "//*[@id='navbarCollapse']/div[2]/ul/a[2]")
	WebElement loggedinUserName;

	public String loggedinUserNamemsg() {
		return loggedinUserName.getText();
	}

}
