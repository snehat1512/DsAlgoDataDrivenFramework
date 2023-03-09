package com.Ds_Algo_Portal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Data_Structure_Introduction {
	WebDriver driver = null;

	public Data_Structure_Introduction(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href='data-structures-introduction']")
	WebElement datastructure_intro_getstarted;

	public void click_datastructure_getstarted() {
		datastructure_intro_getstarted.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Time Complexity')]")
	WebElement dataStructureTimeComplexcity;

	public void clickTimeComplexity() {
		dataStructureTimeComplexcity.click();
	}
	
	@FindBy(xpath = "//a[contains(text(),'Try here>>>')]")
	WebElement dataStructureTimeComplexityTryHere;

	public void clickTryHereButton() {
		dataStructureTimeComplexityTryHere.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Practice Questions')]")
	WebElement dataStructurePracticeQuestions;

	public void clickPracticeQuestion() {
		dataStructurePracticeQuestions.click();
	}

}
