package com.Ds_Algo_Portal.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuestionPage {

	WebDriver driver = null;

	public QuestionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@id = 'questionText']")
	WebElement question;

	public boolean checkQuestion() {
		return !(question.getText().isBlank());

	}

	@FindBy(xpath = "//*[@id='answer_form']/button")
	WebElement runButton;

	public boolean checkQuestionRunButton() {
		return runButton.getText().equals("Run");
	}

	public void clickRunBtn() {
		runButton.click();
	}

	@FindBy(xpath = "//*[@id=\"answer_form\"]/input[@type = 'submit']")
	WebElement questionSubmitButton;

	public boolean checkQuestioSubmitButton() {
		return questionSubmitButton.getAttribute("value").equals("Submit");
	}

	@FindBy(xpath = "//*[@id='answer_form']/div/div/div[1]/textarea")
	WebElement textBox;

	public void setCode(String codeInput) {
		textBox.sendKeys(codeInput);
	}

	public void clearTextBox() {
//		textBox.clear();
		textBox.sendKeys(Keys.CONTROL + "a");
		textBox.sendKeys(Keys.DELETE);
	}

}
