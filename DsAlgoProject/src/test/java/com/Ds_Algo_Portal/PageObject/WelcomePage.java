package com.Ds_Algo_Portal.PageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {

	WebDriver driver = null;

	public WelcomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(className = "btn")
	WebElement wpGetStarted;

	public void clickGetStarted() {
		wpGetStarted.click();
	}

}
