package com.Ds_Algo_Portal.PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver = null;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(className = "col")
	public List<WebElement> panes;

	@FindBy(xpath = "//*[@id='navbarCollapse']/div//a")
	WebElement datastructure_dropdown;

	public void click_dataStructure_dropdown() {
		datastructure_dropdown.click();
	}

	@FindBy(xpath = "//a[@href='data-structures-introduction']")
	WebElement datastructure_intro_getstarted;

	public void click_datastructure_getstarted() {
		datastructure_intro_getstarted.click();
	}

	@FindBy(className = "alert-primary")
	WebElement alert_primary;

	public String alert_primary_msg() {
		return alert_primary.getText();

	}

	@FindBy(className = "dropdown-item")
	WebElement firstdropdown_option;

	public void click_firstdropdown_option() {
		datastructure_dropdown.click();
		firstdropdown_option.click();

	}

	@FindBy(linkText = "Sign in")
	WebElement signin_tab;

	public void click_signin_tab() {
		signin_tab.click();
	}

	@FindBy(xpath = "//*[@id='navbarCollapse']//div/ul/a[2]")
	WebElement register_tab;

	public void click_register_tab() {
		register_tab.click();
	}

	@FindBy(xpath = "//a[@href = '/logout']")
	WebElement signout_tab;

	public void click_signout_tab() {
		signout_tab.click();
	}

	/*
	 * public static void main(String[] args) {
	 * System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	 * WebDriver driver = new ChromeDriver(); HomePage wp = new HomePage(driver);
	 * driver.get("http://dsportalapp.herokuapp.com/home"); wp.click_signin_tab(); }
	 */

}
