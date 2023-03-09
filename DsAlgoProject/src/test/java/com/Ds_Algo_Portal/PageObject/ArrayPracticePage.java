package com.Ds_Algo_Portal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArrayPracticePage {
	WebDriver driver = null;

	public ArrayPracticePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Search the array')]")
	WebElement searchTheArrayLink;

	public void click_SearchTheArrayLink() {
		searchTheArrayLink.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Max Consecutive Ones')]")
	WebElement maxConsequtiveOnesLink;

	public void click_maxConswquativeOnesLink() {
		maxConsequtiveOnesLink.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Find Numbers with Even Number of Digits')]")
	WebElement findNumbWithEvnNumbOfDigtLink;

	public void click_findNumbWithEvnNumbOfDigtLink() {
		findNumbWithEvnNumbOfDigtLink.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Squares of  a Sorted Array')]")
	WebElement sequencesOfASortedArray;

	public void click_sequencesOfASortedArray() {
		sequencesOfASortedArray.click();
	}
}
