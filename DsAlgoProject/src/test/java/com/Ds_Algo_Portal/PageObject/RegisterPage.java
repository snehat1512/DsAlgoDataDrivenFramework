package com.Ds_Algo_Portal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	WebDriver driver = null;

	public RegisterPage(WebDriver driver) {
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

	@FindBy(id = "id_password1")
	WebElement password;

	public void setPassword(String passwordInput) {
		password.sendKeys(passwordInput);
	}

	public String passwordValidationMsg() {
		return password.getAttribute("validationMessage");

	}

	@FindBy(id = "id_password2")
	WebElement confirmationPassword;

	public void setConfirmationPasword(String confirmationPasswordInput) {
		confirmationPassword.sendKeys(confirmationPasswordInput);
	}

	public String passwordConfirmationValidationMsg() {
		return confirmationPassword.getAttribute("validationMessage");
	}

	@FindBy(xpath = "//input[@type = 'submit']")
	WebElement register_button;

	public void click_register_button() {
		register_button.click();
	}

}
