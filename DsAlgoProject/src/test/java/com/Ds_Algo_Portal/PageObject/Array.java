package com.Ds_Algo_Portal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Array {

	WebDriver driver = null;

	public Array(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href = 'array']")
	WebElement array_getStarted;

	public void click_array_getStared() {
		array_getStarted.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Arrays in Python')]")
	WebElement arraysInPythonButton;

	public void click_arraysInPythonButton() {
		arraysInPythonButton.click();

	}

	@FindBy(xpath = "//a[@href = '/tryEditor']")
	WebElement arraysInPythonTryHere;

	public void click_arraysInPythonTryHere() {
		arraysInPythonTryHere.click();
	}

	@FindBy(xpath = "//a[@href = 'arrays-using-list']")
	WebElement arraysUsingList;

	public void click_arraysUsingList() {
		arraysUsingList.click();
	}

	@FindBy(xpath = "//a[@href = '/tryEditor']")
	WebElement arraysUsingListTryHere;

	public void click_arraysUsingListTryHere() {
		arraysUsingListTryHere.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Basic Operations in Lists')]")
	WebElement basicOperationInListButton;

	public void click_basicOperationInListButton() {
		basicOperationInListButton.click();

	}

	@FindBy(xpath = "//a[@href = '/tryEditor']")
	WebElement basicOperationInListpageTryHere;

	public void click_basicOperationInlIstTryHere() {
		basicOperationInListpageTryHere.click();
	}

	@FindBy(xpath = "//a[@href = 'applications-of-array']")
	WebElement applicationOfArrayButton;

	public void click_applicationOfArrayButton() {
		applicationOfArrayButton.click();
	}

	@FindBy(xpath = "//a[contains(text(),'Practice Questions')]")
	WebElement arrayPagePracticeQuestionButton;

	public void click_arrayPagePracticeQuestion() {
		arrayPagePracticeQuestionButton.click();
	}
}
