package com.Ds_Algo_Portal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stack {
	WebDriver driver = null;

	public Stack(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy( xpath = "//a[@href = 'stack']")
	WebElement stack_getStarted;

	public void click_stack_getStared() {
		stack_getStarted.click();
	}
	
	@FindBy( xpath = "//a[@href = 'operations-in-stack']")
	WebElement operationInStack;

	public void click_operationInStackButton() {
		operationInStack.click();
	}
	@FindBy( xpath = "//a[@href = '/tryEditor']")
	WebElement operationsInStackTryHere;

	public void click_operationInStackTryHereButton() {
		operationsInStackTryHere.click();
	}
	
	@FindBy(xpath = "//a[@href = 'implementation']")
	WebElement implementation;
	
	public void click_implementationButton() {
		implementation.click();
	
}
	
	@FindBy(xpath = "//a[@href = 'stack-applications']")
	WebElement stackApplicationButton;
	
	public void click_stackApplicationButton() {
		stackApplicationButton.click();
	}
	@FindBy( xpath = "//a[@href = '/tryEditor']")
	WebElement implementationTryHere;

	public void click_implementationTryHereButton() {
		implementationTryHere.click();
	}
	
	@FindBy( xpath = "//a[@href = '/tryEditor']")
	WebElement applicationsTryHere;

	public void click_applicationsTryHereButton() {
		applicationsTryHere.click();
	}
	@FindBy (xpath = "//a[contains(text(), 'Practice Questions')]")
	WebElement stackpagePracticeQuestions;
	
	public void click_stackPagePracticeQuestion() {
		stackpagePracticeQuestions.click();
	}
}