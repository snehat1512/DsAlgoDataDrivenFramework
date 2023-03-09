package com.Ds_Algo_Portal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Linked_List {
	WebDriver driver = null;

	public Linked_List(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@href = 'linked-list']")
	WebElement linkedListGetStarted;

	public void clickLinkedListGetStared() {
		linkedListGetStarted.click();
	}

	@FindBy(xpath = "//a[@href = 'introduction']")
	WebElement introductionButton;

	public void clickIntroductionbutton() {
		introductionButton.click();
	}

	@FindBy(xpath = "//a[@href = '/tryEditor']")
	WebElement linkedListIntroductionTryHereButton;

	public void clicklinkedListTryHereButton() {
		linkedListIntroductionTryHereButton.click();

	}

	@FindBy(xpath = "//a[@href = 'creating-linked-list']")
	WebElement creatLinkedListButton;

	public void clickCreatLinkedListButton() {
		creatLinkedListButton.click();
	}

	@FindBy(xpath = "//a[@href = '/tryEditor']")
	WebElement linkedListCreatingLinkedListTryHereButton;

	public void clickLinkedListCreatingLinkedListTryHereButton() {
		linkedListCreatingLinkedListTryHereButton.click();

	}

	@FindBy(xpath = "//a[@href = 'types-of-linked-list']")
	WebElement typesOfLinkedList;

	public void clickTypesOfLinkedListButton() {
		typesOfLinkedList.click();
	}

	@FindBy(xpath = "//a[@href = '/tryEditor']")
	WebElement typesOfLinkedListTryHereButton;

	public void clickTypeOfLinkedListTryHereButton() {
		typesOfLinkedListTryHereButton.click();

	}

	@FindBy(xpath = "//a[@href = 'implement-linked-list-in-python']")
	WebElement implimentLinkedListInPython;

	public void clickImplimentLinkesListInPythonButton() {
		implimentLinkedListInPython.click();
	}

	@FindBy(xpath = "//a[@href = '/tryEditor']")
	WebElement implimentLinkedListInPythonTryHereButton;

	public void clickImplimentLinkedListInPythonTryHereButton() {
		implimentLinkedListInPythonTryHereButton.click();

	}

	@FindBy(xpath = "//a[@href = 'traversal']")
	WebElement traversal;

	public void clickTraversalButton() {
		traversal.click();
	}

	@FindBy(xpath = "//a[@href = '/tryEditor']")
	WebElement traversalTryHereButton;

	public void clickTraversalTryHereButton() {
		implimentLinkedListInPythonTryHereButton.click();

	}

	@FindBy(xpath = "//a[@href = 'insertion-in-linked-list']")
	WebElement insertionButton;

	public void clickInsertionButton() {
		insertionButton.click();
	}

	@FindBy(xpath = "//a[@href = '/tryEditor']")
	WebElement insertionTryHereButton;

	public void clickInsertionTryHereButton() {
		insertionTryHereButton.click();

	}

	@FindBy(xpath = "//a[@href = 'deletion-in-linked-list']")
	WebElement deletionButton;

	public void clickDeletionButton() {
		deletionButton.click();
	}

	@FindBy(xpath = "//a[@href = '/tryEditor']")
	WebElement deletionTryHereButton;

	public void clickdeletionTryHereButton() {
		deletionTryHereButton.click();

	}

	@FindBy(xpath = "//*[@id=\"content\"]/a")
	WebElement linkedlistPagePracticeQuestionButton;

	public void click_linkedlistPracticeQuestion() {
		linkedlistPagePracticeQuestionButton.click();
	}
}
