package com.Ds_Algo_Portal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Queue {
	WebDriver driver = null;

	public Queue(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@href = 'queue']")
	 WebElement queueGetStartedButton;
	 
	 public void clickQueueGetStartedButton() {
		 queueGetStartedButton.click();
	 }
	 
	 @FindBy(xpath = "//a[contains(text(),\"Implementation of Queue in Python\")]")
	 WebElement implementationOfQueueInPython;
	 
	 public void clickImplementationOfQueuePythonButton() {
		 implementationOfQueueInPython.click();
	 }
	 
	 @FindBy(xpath = "//a[@href = '/tryEditor']")
	 WebElement implementationOfQueueInPythonTryHere;
	 
	 public void clickImplementationOfQueueInPythonTryHereButton() {
		 implementationOfQueueInPythonTryHere.click();
	 }
	 
	 @FindBy(xpath = "//a[@href = 'implementation-collections']")
	 WebElement implementationCollections;
	 
	 public void clickImplimentationCollectionsButton() {
		 implementationCollections.click();
	 }
	 
	 @FindBy(xpath = "//a[@href = '/tryEditor']")
	 WebElement implementationCollectionsTryHere;
	 
	 public void clickImplementationCollectionsTryHereButton() {
		 implementationCollectionsTryHere.click();
	 }
	 
	 @FindBy(xpath = "//a[contains(text(), 'Implementation using array' )]")
	 WebElement implementationUsingArray;
	 
	 public void clickImplimentationUsingArayButton() {
		 implementationUsingArray.click();
	 }
	 
	 @FindBy(xpath = "//a[contains(text(), 'Try here>>>' )]")
	 WebElement implementationUsingArrayTryHere;
	 
	 public void clickImplementationArrayTryHereButton() {
		 implementationUsingArrayTryHere.click();
	 }
	 
	 @FindBy(xpath = "//a[contains(text(), 'Queue Operations' )]")
	 WebElement queueOperationsButton;
	 
	 public void clickQueueOperationsButton() {
		 queueOperationsButton.click();
	 }
	 
	 @FindBy(xpath = "//a[@href = '/tryEditor']")
	 WebElement queueOperationsTryHere;
	 
	 public void clickQueueOperationsTryHereButton() {
		 queueOperationsTryHere.click();
	 }
	 
	 @FindBy(xpath = "//a[contains(text(), 'Practice Questions' )]")
	 WebElement queuePracticeQuestion;
	 
	 public void clickpracticeQuestionButton() {
		 queuePracticeQuestion.click();
	 }
}